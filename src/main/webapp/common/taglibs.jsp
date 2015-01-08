<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.opensymphony.xwork2.interceptor.I18nInterceptor"%>
<%@page import="org.apache.struts2.components.I18n"%>
<%@page import="java.util.Locale"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<%
	Locale sessionLocale = (Locale) session
			.getAttribute(I18nInterceptor.DEFAULT_SESSION_ATTRIBUTE);
	if (sessionLocale == null) {
		
		
		sessionLocale = request.getLocale();
		session.setAttribute(I18nInterceptor.DEFAULT_SESSION_ATTRIBUTE,sessionLocale);
	}
%>
<fmt:setLocale value="<%=sessionLocale %>" />
<%
/*
	Enumeration names = session.getAttributeNames();
	while(names.hasMoreElements()){
		String name = (String)names.nextElement();
		System.out.println("session "+name+ "="+session.getAttribute(name));
	}
	System.out.println( Locale.getDefault());
*/	
%>
<fmt:setBundle basename="i18n/messages" />