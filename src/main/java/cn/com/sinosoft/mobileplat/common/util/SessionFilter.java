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

	/** У��SESSION�Ƿ���Ч����Ҫ�ж�session�����Ƿ���user */
	private boolean checkSession(HttpServletRequest request,
			HttpServletResponse response) {
		// ���SessionʧЧ������null;
		HttpSession session = request.getSession(false);
		String URI = request.getRequestURI();
		
//		String SCMS_VERSION = UtilVersion.getVersion();
//		request.setAttribute("SCMS_VERSION", SCMS_VERSION);

		// ������ڵ�½���򲻽��м��
		if (URI.contains("login.jsp") || URI.contains("login.do")){
			return true;
		}
		// add by gjc ֧��URI���Թ���
		if (ignoreKeys.containsKey(URI.toUpperCase())) {
			return true;
		}
		if (request.getParameter("j_username") != null
				&& request.getParameter("j_username") != null) {
			return true;
		} else { // ������ڵ�½������Ҫ�ж��Ƿ���user
			try {
				// ���SessionʧЧ����ص�¼ҳ��
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
							// ����
//							String usercode = request.getParameter("userCode");
							sessionCache = CacheManager.getInstance(userCode);
							sessionCache.clearCache();
							UserManager.clearCacheManager(cacheKey);//����
							
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
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
			ServletException {
		
		// ��SESSION�Ƿ���Ч����У��
		/*���ɵ���ſ��˴���begin*/
		boolean flag = checkSession((HttpServletRequest) request,
				(HttpServletResponse) response);
		if (flag){
			chain.doFilter(request, response);
		}
		/*���ɵ���ſ��˴���end*/
		/*ȥ������ſ��˴���begin*/
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
		/*ȥ������ſ��˴���end*/
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
		/*// ��¼����������ļ�
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