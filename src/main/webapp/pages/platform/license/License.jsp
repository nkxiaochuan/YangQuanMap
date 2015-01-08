<%@page import="ins.domain.common.Constants"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<c:choose>
	<c:when test="${utiLicense.id == null}">

<div class="pageContent">
	<form method="post" action="${ctx}/license/checkAndSave.do" class="required-validate pageForm"
		onsubmit="return validateCallback(this, dialogAjaxDone);">
		<%-- callbackType为回调方法入口，当callbackType="closeCurrent"时会关闭当前tab,callbackType="forward"时需要forwardUrl值   --%>
		<input type="hidden" name="callbackType" value="closeCurrent" />
		<div class="pageFormContent" layouth="57">
		<h3 class="contentTitle"><fmt:message key="label.platform.license.newtitle" /></h3>
		<dl>
			<dt>
				<fmt:message key="label.platform.license.username" />
			</dt>
			<dd>
				<input type="text" name="utiLicense.userName" class="required" maxlength="20" value="${utiLicense.userName}" />
			</dd>
		</dl>
		
		<dl>
			<dt>
				<fmt:message key="label.platform.license.cdkey" />
			</dt>
			<dd>
				<input type="text"  name="utiLicense.cdKey"  class="required" value="${utiLicense.cdKey}" />
			</dd>
		</dl>
		<div class="divider"></div>
		<dl>
			<dt>
				<fmt:message key="label.platform.license.validitystart" />
			</dt>
			<dd>
				<input type="text" name="utiLicense.validStartDate" class="required date" value="${utiLicense.validStartDate}" format="yyyy-MM-dd"  />
			</dd>
		</dl>
		<dl>
			<dt>
				<fmt:message key="label.platform.license.validityend" />
			</dt>
			<dd>
				<input type="text" name="utiLicense.validEndDate" class="required date" value="${utiLicense.validEndDate}" format="yyyy-MM-dd" />
			</dd>
		</dl>
		<div class="divider"></div>
		
			<dt>
				<fmt:message key="label.platform.license.serialno" />
			</dt>
					<%=Constants.PRODUCT_CODE+"-"+Constants.PRODUCT_VERSION%>-${serialNo}

		
			<div class="divider"></div>
		<fmt:message key="label.platform.license.tip" />
	</div>
	<div class="formBar">
		<ul>
			<li><div class="buttonActive">
					<div class="buttonContent">
						<button type="submit" >
							<fmt:message key="label.domain.leader.submit" />
						</button>
					</div>
				</div>
			</li>
			<li><div class="button">
					<div class="buttonContent">
						<button type="reset">
							<fmt:message key="label.domain.leader.reset" />
						</button>
					</div>
				</div>
			</li>
			<li>
				<div class="button">
					<div class="buttonContent">
						<button type="button" class="close">
							<fmt:message key="label.domain.leader.back" />
						</button>
					</div>
				</div>
			</li>
		</ul>
		</div>
	</form>
</div>
</c:when>



<c:otherwise>
<h2 class="contentTitle">
	<fmt:message key="label.platform.license.title" />
</h2>
<div class="pageFormContent" layoutH="97">
	<dl>
		<dt>
			<fmt:message key="label.platform.license.username" />
		</dt>
		<dd>${utiLicense.userName}</dd>
	</dl>
	<dl>
		<dt>
			<fmt:message key="label.platform.license.serialno" />
		</dt>
		<dd>
			${serialNo}
		</dd>
	</dl>
	<dl>
		<dt>
			<fmt:message key="label.platform.license.validity" />
		</dt>
		<dd>${startTime}~~${endTime}</dd>
	</dl>
</div>
<div class="formBar">
	<ul>
		<li><div class="button">
				<div class="buttonContent">
					<button type="button" class="close">
						<fmt:message key="label.common.main.close" />
					</button>
				</div>
			</div>
		</li>
	</ul>
</div>
	</c:otherwise>
</c:choose>