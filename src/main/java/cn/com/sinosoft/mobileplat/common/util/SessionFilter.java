package cn.com.sinosoft.mobileplat.common.util;

import ins.framework.cache.CacheManager;
import ins.framework.cache.CacheService;
import ins.platform.schema.model.PrpDuser;
import ins.platform.service.facade.UserService;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.servlet.http.HttpSession;

public class SessionFilter implements Filter {

//	private static Logger logger = Logger.getLogger(SessionFilter.class);
	private static CacheService sessionCache;
	private static CacheService UserManager = CacheManager.getInstance("UserManager");
	private Map<String, String> ignoreKeys;
	private UserService userService;
	public UserService getUserService() {
		return userService;
	}



	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void destroy() {
		
	}

	/** 校验SESSION是否有效，主要判断session里面是否有user */
	private boolean checkSession(HttpServletRequest request,
			HttpServletResponse response) {
		// 如果Session失效，返回null;
		HttpSession session = request.getSession(false);
		String URI = request.getRequestURI();
		
//		String SCMS_VERSION = UtilVersion.getVersion();
//		request.setAttribute("SCMS_VERSION", SCMS_VERSION);

		// 如果是在登陆，则不进行检查
		if (URI.contains("login.jsp") || URI.contains("login.do")){
			return true;
		}
		// add by gjc 支持URI忽略功能
		if (ignoreKeys.containsKey(URI.toUpperCase())) {
			return true;
		}
		if (request.getParameter("j_username") != null
				&& request.getParameter("j_username") != null) {
			return true;
		} else { // 如果不是在登陆，则需要判断是否有user
			try {
				// 如果Session失效，跳回登录页面
				if (session == null) {
					response.sendRedirect("/sinoMap");
					return false;
				} else {
					String userCode = (String) session
							.getAttribute("userCode");
					PrpDuser prpDuser = null;
//					String ZBCDComCode = (String) session.getAttribute("ZBCDComCode");//总部出单机构代码
					prpDuser = (PrpDuser) session
							.getAttribute("userMsg");
					String cacheKey = UserManager.generateCacheKey(userCode);
//					UserDt zbcdUser = (UserDt)ZBCDUserDtManager.getCache(cacheKey);
					if (null != userCode && !"".equals(userCode)
							&& prpDuser == null) {
						try {
							// 清除缓存
//							String usercode = request.getParameter("userCode");
							sessionCache = CacheManager.getInstance(userCode);
							sessionCache.clearCache();
							UserManager.clearCacheManager(cacheKey);//清除缓存
							
							PrpDuser user = userService.findUserByUserCode(userCode);
							session.setAttribute("user",
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
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
			ServletException {
		
		// 对SESSION是否有效进行校验
		/*集成单点放开此处，begin*/
		boolean flag = checkSession((HttpServletRequest) request,
				(HttpServletResponse) response);
		if (flag){
			chain.doFilter(request, response);
		}
		/*集成单点放开此处，end*/
		/*去掉单点放开此处，begin*/
//		String SCMS_VERSION = UtilVersion.getVersion();
//		request.setAttribute("SCMS_VERSION", SCMS_VERSION);
//		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
//		String requestURI = httpServletRequest.getRequestURI();
//		HttpSession session = httpServletRequest.getSession(false);
//		String servletPath = httpServletRequest.getServletPath();
//		if ((servletPath != null)) {
//			chain.doFilter(request, response);
//			return;
//		}
//		if (session == null) {
//			if (requestURI.indexOf("login.do") != -1) {
//				chain.doFilter(request, response);
//				return;
//			}
//			request.getRequestDispatcher("login.jsp").forward(request, response);
//			return;
//		}
//		if (session.getAttribute("userCode") == null) {
//			if (requestURI.indexOf("login.do") != -1) {
//				chain.doFilter(request, response);
//				return;
//			}
//
//			request.getRequestDispatcher("login.jsp").forward(request, response);
//			return;
//		}
//		chain.doFilter(request, response);
		/*去掉单点放开此处，end*/
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
		/*// 登录后加载配置文件
		try {
			String separator = java.io.File.separator;

			String sysConstConfig = (String) filterConfig.getServletContext()
					.getRealPath("/")
					+ separator
					+ "WEB-INF"
					+ separator
					+ "config"
					+ separator
					+ "appconfig" + separator + "SysConstConfig.xml";
			SysConst.init(sysConstConfig, true);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}
}