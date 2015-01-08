<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %> 
<%@ include file="/common/taglibs.jsp"%>
<%
	System.out.println(request.getAttribute("exceptionStack"));
%>
{
	"statusCode":"${statusCode == null ? '300' : statusCode}", 
	"message":"<s:property escapeJavaScript="true"  value="exception.message"/>", 
	"navTabId":"${param.navTabId}", 
	"rel":"${param.rel}",
	"callbackType":"${param.callbackType}",
	"forwardUrl":"${forwardUrl}"
}