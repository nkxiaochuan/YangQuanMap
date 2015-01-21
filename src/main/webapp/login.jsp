<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="org.springframework.security.web.WebAttributes"%>
<%@page import="org.springframework.security.core.AuthenticationException"%>
<%@ page contentType="text/html;charset=GBK" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
 

<%
//AJAX请求则流转到Timeout.jsp中
if (request != null	&& "XMLHttpRequest".equalsIgnoreCase(request.getHeader("X-Requested-With"))){
	response.sendRedirect("common/Timeout.jsp");
	return;
}
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<title>云端系统登录</title>
<link href="common/dwz/themes/default/style.css" rel="stylesheet" type="text/css" />
<link href="common/dwz/themes/azure/style.css" rel="stylesheet" type="text/css" media="screen" />
<link href="common/dwz/themes/css/core.css" rel="stylesheet" type="text/css" media="screen" />
<link href="common/dwz/themes/css/login.css" rel="stylesheet" type="text/css" />
<script src="common/dwz/js/jquery-1.7.1.js" type="text/javascript"></script>

<script type="text/javascript">

function toggleBox(boxId){
	var $box = $("#"+boxId);
	if ($box.is(":visible")) $box.slideUp();
	else $box.slideDown();
}
function validateLogin(){ 
	if($("#j_username").attr("value")==""){
		alert('请输入用户名');
		return false;
	}
	if($("#j_password").attr("value")==""){
		alert('请输入密码');
		return false;
	}
	return true;
}
</script>
</head>

<body>
	<div id="login">
		<div id="login_header">
			<h1 class="login_logo">
				<img src="common/dwz/themes/default/images/login_logo.png" />
			</h1>

			<div class="login_headerContent">
				<div class="navList">
				    <!-- 
					<ul>
						<li><a href="${ctx }/">Home</a></li>
						<li><a href="http://weibo.com/zhouxianli" target="_blank">微博</a></li>
					</ul>
					 -->
				</div>
				<h2 class="login_title">请在此登录</h2>
			</div>
		</div>
		<div id="login_content">
			<div class="loginForm">
				<form method="post" action="login.do" class="pageForm" onsubmit="return validateLogin();"> 
					<p>
						<label>用户名：</label>
						<input type="text" id="j_username" name="j_username" class="required" style="width:120px" maxlength="6"/>
					</p>
					<p>
						<label>密 &nbsp;&nbsp;码：</label>
						<input type="password" id="j_password" name="j_password" class="required password" style="width:120px"/>
					</p>
					
					<!--<p>
						<label>验证码：</label>
						<input class="code" type="text" size="5" />
						<span><img src="themes/default/images/header_bg.png" alt="" width="75" height="24" /></span>
					</p>-->
			<%
				if(null!=request.getAttribute("login")&&"0".equals(request.getAttribute("login"))){
					String errStr = (String)request.getAttribute("login_em");
			%>
				<div class="divider"></div>
				<p>
					<label><font color="red"> 
					<%=errStr%>						
					</label> 
				</p>
			<div class="divider"></div>
			<%
				}
			%>
					<div class="login_bar">
						<input class="sub" type="submit" value=""/>
					</div>
				</form>
			</div>
			<div class="login_banner"><img src="common/dwz/themes/default/images/login_banner.jpg" /></div>
			<div class="login_main">
				<ul class="helpList">
					<%--<li><a href="javascript:toggleBox('forgotPwd')">Forgot Password?</a></li>
					--%><li id="forgotPwd" style="background: none; display: none">
					<form method="post" action="" onsubmit="return validateCallback(this);">
						<p>
							<label>用户名：</label>
							<input type="text" name="userName" class="textInput required" size="20"/>
							<span class="info">请输入你的用户名来接受密码.</span>
						</p>
						<p><input type="submit" value="Submit"/></p>
					</form>
					</li>
				</ul>
			</div>
		</div>
		<!-- 
		<div id="login_footer">
			Copyright &copy; 2012 Sinosoft Inc. All Rights Reserved.
		</div>
		 -->
	</div>
</body>
</html>
