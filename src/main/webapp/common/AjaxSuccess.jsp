<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
{
	"statusCode":"${statusCode == null ? '200' : statusCode}", 
	"message":"${message == null ? '操作成功' : message}", 
	"navTabId":"${param.navTabId}", 
	"rel":"${param.rel}",
	"callbackType":"${param.callbackType}",
	"forwardUrl":"${forwardUrl}"
}