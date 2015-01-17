<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<c:choose>
	<c:when test="${prpDuser.userCode == null}">
		<c:set var="url" value="${ctx}/user/add.do"></c:set>
	</c:when>
	<c:otherwise>
		<c:set var="url" value="${ctx}/user/update.do"></c:set>
	</c:otherwise>
</c:choose>

<h2 class="contentTitle">
	<fmt:message key="label.platform.user.manage" />
</h2>
<form action="${url}" method="post" class="required-validate pageForm"
	onsubmit="return validateCallback(this, dialogAjaxDone);">
	<%-- callbackType为回调方法入口，当callbackType="closeCurrent"时会关闭当前tab,callbackType="forward"时需要forwardUrl值   --%>
	<input type="hidden" name="callbackType" value="closeCurrent" />
	<div class="pageFormContent" layoutH="97">
		<dl>
			<dt>
				<fmt:message key="label.platform.user.usercode" />
			</dt>
			<dd>
				<c:choose>
					<c:when test="${prpDuser.userCode == null}">
						<%--<input type="text" name="prpDuser.userCode" class="required" maxlength="20" value="${prpDuser.userCode}" />
					--%></c:when>
					<c:otherwise>
							${prpDuser.userCode}<input type="hidden" name="prpDuser.userCode" value="${prpDuser.userCode }" />
					</c:otherwise>
				</c:choose>
			</dd>
		</dl>

		<dl>
			<dt>
				<fmt:message key="label.platform.user.username" />
			</dt>
			<dd>
				<input type="text" name="prpDuser.userName" class="required" maxlength="20" value="${prpDuser.userName }" />
			</dd>
		</dl>

		<div class="divider"></div>

		<dl>
			<dt>
				<fmt:message key="label.platform.user.comcode" />
			</dt>
			<dd>
				<%--<input type="text" name="prpDuser.prpAreaInfo.comCode" class="required" value="${prpDuser.prpAreaInfo.comCode }" />--%>
				<s:select list="areaInfoList" name="prpDuser.prpAreaInfo.comCode" listKey="comCode" listValue="comName"></s:select>
			</dd>
		</dl>

		<%--<dl>
			<dt>
				<fmt:message key="label.platform.user.comcname" />
			</dt>
			<dd>
				<input type="text" name="prpDuser.prpAreaInfo.comName" class="readonly" readonly="readonly"
					value="${prpDuser.prpAreaInfo.comName}" />
			</dd>
		</dl>
		--%><dl>
			<dt>
				<fmt:message key="label.platform.user.roleCode" />
			</dt>
			<dd>
				<s:select list="roleList" name="prpDuser.roleCode" listKey="roleCode" listValue="info"></s:select>
			</dd>
		</dl>


		<dl>
			<dt>
				<fmt:message key="label.platform.user.password" />
			</dt>
			<dd>
				<c:choose>
					<c:when test="${prpDuser.userCode == null}">
						<input type="password" name="prpDuser.password" class="required" />
					</c:when>
					<c:otherwise>
							******
					</c:otherwise>
				</c:choose>
			</dd>
		</dl>

		<%--<dl>
			<dt>
				<fmt:message key="label.platform.user.passwdsetdate" />
			</dt>
			<dd>
				<input type="text" name="prpDuser.passwdSetDate" format="yyyy-MM-dd"
					value='<fmt:formatDate pattern="yyyy-MM-dd" value="${prpDuser.passwdSetDate}"/>' class="date required"
					yearstart="-10" yearend="2" /> <a class="inputDateButton" href="#">Choose</a>
			</dd>
		</dl>

		<dl>
			<dt>
				<fmt:message key="label.platform.user.passwdexpiredate" />
			</dt>
			<dd>
				<input type="text" name="prpDuser.passwdExpireDate" format="yyyy-MM-dd"
					value='<fmt:formatDate pattern="yyyy-MM-dd" value="${prpDuser.passwdExpireDate}"/>' class="date required"
					yearstart="-10" /> <a class="inputDateButton" href="#">Choose</a>
			</dd>
		</dl>

		<dl>
			<dt>
				<fmt:message key="label.platform.user.articlecode" />
			</dt>
			<dd>
				<input type="text" name="prpDuser.articleCode" class="required" value="${prpDuser.articleCode}" />
			</dd>
		</dl>
--%>
		<dl>
			<dt>
				<fmt:message key="label.platform.user.info" />
			</dt>
			<dd>
				<input type="text" name="prpDuser.info" class="" value="${prpDuser.info }" />
			</dd>
		</dl>

		<dl>
			<dt>
				<fmt:message key="label.platform.user.validstatus" />
			</dt>
			<dd>
				<select name="prpDuser.validStatus">
					<option value="1" ${'1' eq prpDuser.validStatus ? 'selected="selected"' : ''}>有效</option>
					<option value="0" ${'0' eq prpDuser.validStatus ? 'selected="selected"' : ''}>无效</option>
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