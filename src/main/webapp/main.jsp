<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ include file="/common/taglibs.jsp"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<title>邮政地图查询系统</title>

<link href="common/dwz/themes/azure/style.css" rel="stylesheet" type="text/css" media="screen" />
<link href="common/dwz/themes/css/core.css" rel="stylesheet" type="text/css" media="screen" />
<link href="common/dwz/themes/css/print.css" rel="stylesheet" type="text/css" media="print" />
<link href="common/dwz/uploadify/css/uploadify.css" rel="stylesheet" type="text/css" media="screen" />
<link rel="stylesheet" href="http://api.map.baidu.com/library/SearchInfoWindow/1.5/src/SearchInfoWindow_min.css" />
<!--[if IE]>
<link href="common/dwz/themes/css/ieHack.css" rel="stylesheet" type="text/css" media="screen"/>
<![endif]-->
<script src="common/dwz/js/speedup.js" type="text/javascript"></script>
<script src="common/dwz/js/jquery-1.7.1.js" type="text/javascript"></script>
<script src="common/dwz/js/jquery.cookie.js" type="text/javascript"></script>
<script src="common/dwz/js/jquery.validate.js" type="text/javascript"></script>
<script src="common/dwz/js/jquery.bgiframe.js" type="text/javascript"></script>
<script src="common/dwz/xheditor/xheditor-1.1.12-zh-cn.min.js" type="text/javascript"></script>
<script src="common/dwz/uploadify/scripts/swfobject.js" type="text/javascript"></script>
<script src="common/dwz/uploadify/scripts/jquery.uploadify.v2.1.0.js" type="text/javascript"></script>
<script src="common/dwz/bin/dwz.min.js" type="text/javascript"></script>
<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=11aaaa7c886f33c506e1a65b05235518"></script>
<script type="text/javascript" src="http://developer.baidu.com/map/jsdemo/demo/convertor.js"></script>  
<script type="text/javascript" src="http://api.map.baidu.com/library/SearchInfoWindow/1.5/src/SearchInfoWindow_min.js"></script>


<%
//默认简体中文
String regionalFile = "dwz.regional.zh.js";
String dwzFile = "dwz.frag.xml";
if(Locale.TRADITIONAL_CHINESE.equals(sessionLocale)){
	regionalFile = "dwz.regional.zh_TW.js";
	dwzFile = "dwz.frag_zh_TW.xml";
}else if(Locale.SIMPLIFIED_CHINESE.equals(sessionLocale)){
	
}else{
	regionalFile = "dwz.regional.en_US.js";
	dwzFile = "dwz.frag_en_US.xml";
}

%>

<script src="common/dwz/js/<%=regionalFile %>" type="text/javascript"></script>

<script type="text/javascript">
	$(function() {
		DWZ.init("common/dwz/<%=dwzFile %>", {
			loginUrl : "login.jsp",
			loginTitle : "登录", // 弹出登录对话框
			//		loginUrl:"login.html",	// 跳到登录页面
			statusCode : {
				ok : 200,
				error : 300,
				timeout : 301
			}, //【可选】
			pageInfo : {
				pageNum : "pageNo",
				numPerPage : "pageSize",
				orderField : "orderField",
				orderDirection : "orderDirection"
			}, //【可选】
			debug : false, // 调试模式 【true|false】
			callback : function() {
				initEnv();
				$("#themeList").theme({
					themeBase : "common/dwz/themes"
				}); // themeBase 相对于index页面的主题base路径
			}
		});
	});
	//清理浏览器内存,只对IE起效,FF不需要
	if ($.browser.msie) {
		window.setInterval("CollectGarbage();", 10000);
	}
</script>
</head>

<body scroll="no">
	<div id="layout">
		<div id="header">
			<div class="headerNav">
				<a class="logo"></a>
				<ul class="nav">
					<li><a href="#">当前登陆用户：${userMsg.userCode }- ${userMsg.userName }</a></li>
					<li><a href="${ctx}/prepareChangePassword.do" target="dialog" width="600"><fmt:message key="label.common.main.changepassword" /></a></li>
					<li><a href="${ctx}/logout.do"><fmt:message key="label.common.main.exit" /></a></li>
				</ul>
				<ul class="themeList" id="themeList">
					<li theme="default"><div><fmt:message key="label.common.main.blue" /></div></li>
					<li theme="green"><div><fmt:message key="label.common.main.green" /></div></li>
					<li theme="purple"><div><fmt:message key="label.common.main.purple" /></div></li>
					<li theme="silver"><div><fmt:message key="label.common.main.silver" /></div></li>
					<li theme="azure"><div class="selected"><fmt:message key="label.common.main.skyblue" /></div></li>
				</ul>
			</div>

			<!-- navMenu -->

		</div>

		<div id="leftside">
			<div id="sidebar_s">
				<div class="collapse">
					<div class="toggleCollapse">
						<div></div>
					</div>
				</div>
			</div>
			<div id="sidebar">
				<div class="toggleCollapse">
					<h2><fmt:message key="label.common.main.mainmenu" /></h2>
					<div><fmt:message key="label.common.main.contract" /></div>
				</div>

				<div class="accordion" fillSpace="sidebar">
					<div class="accordionHeader">
						<h2>
							<span>Folder</span><fmt:message key="label.domain.main.systemfunction" />
						</h2>
					</div>
					<div class="accordionContent">
							<ul class="tree treeFolder">
								 <%--<li><a href="${ctx}/sinoMapAction/prepareMap.do?lanX=113.60747&latY=37.853347" target="navTab" rel="initMap">阳泉市邮政城区</a></li>
								 <li><a href="${ctx}/sinoMapAction/prepareMap.do" target="navTab" rel="initMap">阳泉市矿区</a></li>
								 <li><a href="${ctx}/sinoMapAction/prepareMap.do" target="navTab" rel="deviceBound">区域管理</a></li>
								 <li><a href="${ctx}/sinoMapAction/prepareMap.do" target="navTab" rel="configInfo">操作员管理</a></li>
								 <li><a href="${ctx}/sinoMapAction/prepareMap.do" target="dialog" rel="configInfo">备用</a></li>
		                  		--%>
		                  		<s:iterator value="menuList"  var="menu"><s:property value="menucode"/><s:property/>
		                  			<li><a href='${ctx}<s:property value="menu.menuUrl"/>' target="<s:property value='menu.menuType'/>"><s:property value="menu.menuName"/></a></li>
		                  		</s:iterator>
								<li>
									<a href="#">我的区域列表</a>
									<ul>
										<c:forEach var="prpAreaInfo" items="${prpAreaInfos}">
											<li>
												<a href="${ctx}/sinoMapAction/prepareMap.do?areaID=${prpAreaInfo.comCode}"
													target="navTab" rel="areaList">${prpAreaInfo.comName}</a>
											</li>
										</c:forEach>
									</ul>
								</li>
								<c:if test="${roleCode == '1'}">
									<li>
										<a href="#">数据维护</a>
										<ul>
											<li>
												<a href="${ctx}/sinoMapAction/prepareMap.do" target="navTab"
													rel="areaManage">区域管理</a>
											</li>
											<li>
												<a href="${ctx}/sinoMapAction/prepareMap.do" target="navTab"
													rel="userManage">人员管理</a>
											</li>
										</ul>
									</li>
								</c:if>
							</ul>
						</div> 
					  
					<!-- 可以添加一个权限可 --><%--
					  <div class="accordionHeader"> 
						<h2>
							<span>Folder</span><fmt:message key="label.domain.main.systemmanage" />
						</h2>
					</div>
					<div class="accordionContent">
						<ul class="tree treeFolder">
							<li><a href="${ctx}/user/query.do" target="navTab"><fmt:message key="label.domain.main.timeconfiguration" /></a></li>
						  	<li><a href="${ctx}/sinoMapAction/prepareAddLocationInfo.do" target="navTab" ><fmt:message key="label.domain.main.usermanage" /></a></li>									 
		                  	<li><a href="${ctx}/quartz/prepareQuery.do" target="navTab"><fmt:message key="label.domain.main.timeconfiguration" /></a></li>
	                   </ul>
					</div>
					
				--%></div>
			</div>
		</div>
		<div id="container">
			<div id="navTab" class="tabsPage">
				<div class="tabsPageHeader">
					<div class="tabsPageHeaderContent">
						<!-- 显示左右控制时添加 class="tabsPageHeaderMargin" -->
						<ul class="navTab-tab">
							<li tabid="main" class="main"><a href="javascript:;"><span><span class="home_icon"><fmt:message key="label.common.main.homepage" /></span> </span> </a>
							</li>
						</ul>
					</div>
					<div class="tabsLeft">left</div>
					<!-- 禁用只需要添加一个样式 class="tabsLeft tabsLeftDisabled" -->
					<div class="tabsRight">right</div>
					<!-- 禁用只需要添加一个样式 class="tabsRight tabsRightDisabled" -->
					<div class="tabsMore">more</div>
				</div>
				<ul class="tabsMoreList">
					<li><a href="javascript:;"><fmt:message key="label.common.main.homepage" /></a></li>
				</ul>
				<div class="navTab-panel tabsPageContent layoutBox">
			 
			 <div style="height:100%;width:100%;background-image:url('${ctx}/pages/domain/image/u62_original.jpg');">
						<p style="text-align: center; padding-top: 15%;">
							<span
								style="font-family: 微软雅黑; font-size: 20px; font-weight: normal; font-style: normal; text-decoration: none; color: #333333;">&nbsp;
								&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <fmt:message key="main.hello"/>&nbsp;&nbsp; <fmt:message key="main.welcome"/></span>
						</p>
						<p style="text-align: left;">
							<span
								style="font-family: 微软雅黑; font-size: 28px; font-weight: normal; font-style: normal; text-decoration: none; color: #333333;">&nbsp;</span>
						</p>
					</div>
			 
					 
					 
					 <!-- 前框 -->
					<!--<div class="accountInfo">
							<div class="alertInfo">
								<p>
								<a href="UserManual.pdf" target="_blank" style="line-height: 19px"><fmt:message key="label.domain.main.systemusermanualpdf" /></a>
								</p>
								<%-- <p>
								<a href="doc/user-guide.swf" target="_blank" style="line-height: 19px"><fmt:message key="label.common.main.demovideo" /></a>
								</p> --%>
							</div>
							<div class="right">
								<%-- <p>
									<a href="doc/user-guide.chm" target="_blank" style="line-height: 19px"><fmt:message key="label.domain.main.systemusermanualchm" /></a>
								</p> --%>
								<p>
									<a href="UserManual.doc" target="_blank" style="line-height: 19px"><fmt:message key="label.domain.main.systemusermanualdoc" /></a>
								</p>
							</div>
							<p>
								<span><fmt:message key="label.domain.main.sinosoftcodechecksystem" />
								  云端服务系统
								</span>
							</p>
							<p>
								
							</p>
						</div>
						-->
						<!-- 
						<div class="pageFormContent" layoutH="80">

							<p style="color: red">
								
							</p>

							<div class="divider"></div>
							<h2><!--<fmt:message key="label.common.main.videocourse" /></h2>
							<p></p>

							<div class="divider"></div>
							<h2><!--<fmt:message key="label.common.main.problem" /></h2>
							<pre style="margin: 5px; line-height: 1.4em">
								</a>
							</pre>

						</div>
                        -->
                        <!--  
						<div style="width: 230px; position: absolute; top: 60px; right: 0" layoutH="80">
							<iframe width="100%" height="550" class="share_self"  frameborder="0" scrolling="no" src="http://widget.weibo.com/weiboshow/index.php?language=&width=0&height=550&fansRow=2&ptype=1&speed=0&skin=1&isTitle=1&noborder=1&isWeibo=1&isFans=1&uid=2129290225&verifier=c0951e84&dpc=1"></iframe>
						</div>
						-->
				</div>
			</div>
		</div>

	</div>
    
	<div id="footer">
	<!-- 
		Copyright &copy; 2012  技术平台组团队 
		 -->
	</div>



</body>
</html>