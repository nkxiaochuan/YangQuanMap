<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<c:choose>
	<c:when test="${prpAreaInfo.comCode == null}">
		<c:set var="url" value="${ctx}/area/add.do"></c:set>
	</c:when>
	<c:otherwise>
		<c:set var="url" value="${ctx}/area/update.do"></c:set>
	</c:otherwise>
</c:choose>

<h2 class="contentTitle">
	<fmt:message key="label.platform.area.manage" />
</h2>
<form action="${url}" method="post" class="required-validate pageForm"
	onsubmit="return validateCallback(this, dialogAjaxDone);">
	<%-- callbackType为回调方法入口，当callbackType="closeCurrent"时会关闭当前tab,callbackType="forward"时需要forwardUrl值   --%>
	<input type="hidden" name="callbackType" value="closeCurrent" />
	<div class="pageFormContent" layoutH="97">
		<dl>
			<dt>
				<fmt:message key="label.platform.user.comCode" />
			</dt>
			<dd>
				<c:choose>
					<c:when test="${prpAreaInfo.comCode == null}">
						<%--<input type="text" name="prpDuser.userCode" class="required" maxlength="20" value="${prpDuser.userCode}" />
					--%></c:when>
					<c:otherwise>
							${prpAreaInfo.comCode}<input type="hidden" name="prpAreaInfo.comCode" value="${prpAreaInfo.comCode }" />
					</c:otherwise>
				</c:choose>
			</dd>
		</dl>

		<dl>
			<dt>
				<fmt:message key="label.platform.user.comName" />
			</dt>
			<dd>
				<input type="text" name="prpAreaInfo.comName" class="" maxlength="80" value="${prpAreaInfo.comName }" />
			</dd>
		</dl>

		<div class="divider"></div>

		<dl>
			<dt>
				<fmt:message key="action.addressName" />
			</dt>
			<dd>
				<input type="text" name="prpAreaInfo.addressName" class="" maxlength="80" value="${prpAreaInfo.addressName }" />
			</dd>
		</dl>
		<dl>
			<dt>
				<fmt:message key="action.postCode" />
			</dt>
			<dd>
				<input type="text" name="prpAreaInfo.postCode" class="number" maxlength="6" minlength="6" value="${prpAreaInfo.postCode }" />
			</dd>
		</dl>


		<dl>
			<dt>
				<fmt:message key="action.phoneNumber" />
			</dt>
			<dd>
				<input type="text" name="prpAreaInfo.phoneNumber" class="number" maxlength="16" value="${prpAreaInfo.phoneNumber }" />
			</dd>
		</dl>
		<dl>
			<dt>
				<fmt:message key="action.faxNumber" />
			</dt>
			<dd>
				<input type="text" name="prpAreaInfo.faxNumber" class="number" maxlength="16" value="${prpAreaInfo.faxNumber }" />
			</dd>
		</dl>

		<dl>
			<dt>
				<fmt:message key="label.platform.user.info" />
			</dt>
			<dd>
				<input type="text" name="prpAreaInfo.info" class="" maxlength="80" value="${prpAreaInfo.info }" />
			</dd>
		</dl>
	</div>

	<div class="formBar">
		<ul>
			<li><div class="buttonActive">
					<div class="buttonContent">
						<button type="submit">
							<fmt:message key="label.common.main.save" />
						</button>
					</div>
				</div>
			</li>
			<li><div class="button">
					<div class="buttonContent">
						<button type="reset">
							<fmt:message key="label.common.main.reset" />
						</button>
					</div>
				</div>
			</li>
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
</form>