<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<c:choose>
	<c:when test="${locationInfo.id == null}">
		<c:set var="url" value="${ctx}/location/add.do"></c:set>
	</c:when>
	<c:otherwise>
		<c:set var="url" value="${ctx}/location/update.do"></c:set>
	</c:otherwise>
</c:choose>

<h2 class="contentTitle">
	<fmt:message key="label.platform.location.manage" />
</h2>
<form action="${url}" method="post" class="required-validate pageForm"
	onsubmit="return validateCallback(this, dialogAjaxDone);">
	<%-- callbackType为回调方法入口，当callbackType="closeCurrent"时会关闭当前tab,callbackType="forward"时需要forwardUrl值   --%>
	<input type="hidden" name="callbackType" value="closeCurrent" />
	<div class="pageFormContent" layoutH="97">
		<dl>
			<dt>
				<fmt:message key="label.platform.location.id" />
			</dt>
			<dd>
				<c:choose>
					<c:when test="${locationInfo.id == null}">
						<%--<input type="text" name="prpDuser.userCode" class="required" maxlength="20" value="${prpDuser.userCode}" />
					--%></c:when>
					<c:otherwise>
							${locationInfo.id}<input type="hidden" name="locationInfo.id" value="${locationInfo.id }" />
					</c:otherwise>
				</c:choose>
			</dd>
		</dl>
		<dl>
			<dt>
				<fmt:message key="label.platform.location.name" />
			</dt>
			<dd>
				<input type="text" name="locationInfo.name" class="required" maxlength="24" value="${locationInfo.name }" />
			</dd>
		</dl>
		<div class="divider"></div>
		<dl>
			<dt>
				<fmt:message key="label.platform.location.lngX" />
			</dt>
			<dd>
				<input type="text" name="locationInfo.lngX" class="required number" maxlength="24" value="${locationInfo.lngX}" />
			</dd>
		</dl>
		<dl>
			<dt>
				<fmt:message key="label.platform.location.latY" />
			</dt>
			<dd>
				<input type="text" name="locationInfo.latY" class="required number" maxlength="24" value="${locationInfo.latY}" />
			</dd>
		</dl>
		<dl>
			<dt>
				<fmt:message key="label.platform.user.comCode" />
			</dt>
			<dd>
				<s:select list="areaInfoList" name="locationInfo.prpAreaInfo.comCode" listKey="comCode" listValue="comName"></s:select>
			</dd>
		</dl>
		<dl>
			<dt>
				<fmt:message key="label.platform.location.category" />
			</dt>
			<dd>
				<input type="text" name="locationInfo.category" class="required" maxlength="24" value="${locationInfo.category}" />
			</dd>
		</dl>
		<dl>
			<dt>
				<fmt:message key="label.platform.location.information" />
			</dt>
			<dd>
				<input type="text" name="locationInfo.information" class="required" maxlength="80" value="${locationInfo.information }" />
			</dd>
		</dl>

		<dl>
			<dt>
				<fmt:message key="label.platform.user.validstatus" />
			</dt>
			<dd>
				<select name="locationInfo.validStatus">
					<option value="1" ${'1' eq locationInfo.validStatus ? 'selected="selected"' : ''}><fmt:message key="page.valid.one"/></option>
					<option value="0" ${'0' eq locationInfo.validStatus ? 'selected="selected"' : ''}><fmt:message key="page.valid.zero"/></option>
				</select>
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