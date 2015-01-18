package cn.com.sinosoft.mobileplat.common.util;

import ins.framework.cache.CacheManager;
import ins.framework.cache.CacheService;
import ins.map.schema.model.PrpAreaInfo;
import ins.map.service.facade.PrpAreaInfoService;
import ins.platform.schema.model.PrpDuser;
import ins.platform.service.facade.UserService;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.sinosoft.sysframework.common.util.StringUtils;

import bsh.StringUtil;

public class SessionFilter implements Filter {

//	private static Logger logger = Logger.getLogger(SessionFilter.class);
	private static CacheService sessionCache;
	private static CacheService UserManager = CacheManager.getInstance("UserManager");
	private Map<String, String> ignoreKeys;
	private UserService userService;
	/** 要检查的 session 的名称 */
    private String sessionKey;
    /** 需要排除（不拦截）的URL的正则表达式 */
    private String excepUrlRegex;
     
    /** 检查不通过时，转发的URL */
    private String forwardUrl;
	public String getSessionKey() {
		return sessionKey;
	}



	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}



	public UserService getUserService() {
		return userService;
	}



	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void destroy() {
		
	}

	private boolean checkSession(HttpServletRequest request,
			HttpServletResponse response) {
		HttpSession session = request.getSession(false);
		String URI = request.getRequestURI();
		
//		String SCMS_VERSION = UtilVersion.getVersion();
//		request.setAttribute("SCMS_VERSION", SCMS_VERSION);

		if (URI.contains("login.jsp") || URI.contains("login.do")){
			return true;
		}
		if (ignoreKeys.containsKey(URI.toUpperCase())) {
			return true;
		}
		if (request.getParameter("j_username") != null
				&& request.getParameter("j_username") != null) {
			return true;
		} else { 
			try {
				if (session == null) {
					response.sendRedirect("/sinoMap");
					return false;
				} else {
					String userCode = (String) session
							.getAttribute("userCode");
					PrpDuser prpDuser = null;
					prpDuser = (PrpDuser) session
							.getAttribute("userMsg");
					String cacheKey = UserManager.generateCacheKey(userCode);
					if (null != userCode && !"".equals(userCode)
							&& prpDuser == null) {
						try {
//							String usercode = request.getParameter("userCode");
							sessionCache = CacheManager.getInstance(userCode);
							sessionCache.clearCache();
							UserManager.clearCacheManager(cacheKey);
							
							PrpDuser user = userService.findUserByUserCode(userCode);
							session.setAttribute("userMsg",
									user);
							return true;

						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							return false;
						}
					}
					if (prpDuser == null) {
						response.sendRedirect("/sinoMap");
						return false;
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}
	}
	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException,
 ServletException {

		// 如果 sessionKey 为空，则直接放行
		if (org.apache.commons.lang.StringUtils.isBlank(sessionKey)) {
			chain.doFilter(req, res);
			return;
		}
		// * 请求 http://127.0.0.1:8080/webApp/home.jsp?&a=1&b=2 时
		// * request.getRequestURL()： http://127.0.0.1:8080/webApp/home.jsp
		// * request.getContextPath()： /webApp
		// * request.getServletPath()：/home.jsp
		// * request.getRequestURI()： /webApp/home.jsp
		// * request.getQueryString()：a=1&b=2
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		String servletPath = request.getServletPath();

		// 如果请求的路径与forwardUrl相同，或请求的路径是排除的URL时，则直接放行
		if (servletPath.equals(forwardUrl)
				|| excepUrlRegex.indexOf(servletPath) >=0) {
			chain.doFilter(req, res);
			return;
		}

		Object sessionObj = request.getSession().getAttribute(sessionKey);
		// 如果Session为空，则跳转到指定页面
		if (sessionObj == null) {
			String contextPath = request.getContextPath();
//			String redirect = servletPath + "?"
//					+ org.apache.commons.lang.StringUtils.defaultString(request.getQueryString());
			/*
			 * login.jsp 的 <form> 表单中新增一个隐藏表单域： <input type="hidden"
			 * name="redirect" value="${param.redirect }">
			 * 
			 * LoginServlet.java 的 service 的方法中新增如下代码： String redirect =
			 * request.getParamter("redirect"); if(loginSuccess){ if(redirect ==
			 * null || redirect.length() == 0){ // 跳转到项目主页（home.jsp） }else{ //
			 * 跳转到登录前访问的页面（java.net.URLDecoder.decode(s, "UTF-8")） } }
			 */
			response.sendRedirect(contextPath
					+ org.apache.commons.lang.StringUtils.defaultIfEmpty(forwardUrl, "/")
//					+ "?redirect=" + URLEncoder.encode(redirect, "UTF-8")
					);
		} else {
			if(servletPath.indexOf(".jsp")>=0){
				ApplicationContext ac2 = WebApplicationContextUtils.getWebApplicationContext(request.getSession().getServletContext());
				PrpAreaInfoService prpAreaInfoService = (PrpAreaInfoService) ac2.getBean("prpAreaInfoService");
				List<PrpAreaInfo> prpAreaInfos = new ArrayList();
				PrpDuser user = (PrpDuser) sessionObj;
				if(user.getRoleCode() !=null && "0".equals(user.getRoleCode().trim())){
					prpAreaInfos.add(user.getPrpAreaInfo());
				}else{
					prpAreaInfos = prpAreaInfoService.findAreaInfos();
				}
				request.setAttribute("roleCode", user.getRoleCode());
				request.setAttribute("prpAreaInfos", prpAreaInfos);
			}
			chain.doFilter(req, res);
		}
		
		return;
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		String ignoreKey = filterConfig.getInitParameter("ignoreKey");
		ignoreKeys = new HashMap<String, String>();
		String arrIgnoreKeys[] = null;
		if (ignoreKey != null) {
			arrIgnoreKeys = ignoreKey.split(",");
			for (String string : arrIgnoreKeys) {
				ignoreKeys.put(string.toUpperCase(), string.toUpperCase());
			}
		}
		
		sessionKey = filterConfig.getInitParameter("sessionKey");
		 
        excepUrlRegex = filterConfig.getInitParameter("excepUrlRegex");
//        if (!org.apache.commons.lang.StringUtils.isBlank(excepUrlRegex)) {
//            excepUrlPattern = Pattern.compile(excepUrlRegex);
//        }
 
        forwardUrl = filterConfig.getInitParameter("forwardUrl");
	}
}