<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>

<h2 class="contentTitle">
	<fmt:message key="label.platform.user.manage" />
</h2>
<div class="pageFormContent" layoutH="90">
	<dl>
		<dt>
			<fmt:message key="label.platform.user.userCode" />
		</dt>
		<dd>${prpDuser.userCode}</dd>
	</dl>
	<dl>
		<dt>
			<fmt:message key="label.platform.user.userName" />
		</dt>
		<dd>${prpDuser.userName}</dd>
	</dl>

	<div class="divider"></div>
	<dl>
		<dt>
			<fmt:message key="label.platform.user.comCode" />
		</dt>
		<dd>${prpDuser.prpAreaInfo.comCode}</dd>
	</dl>
	<dl>
		<dt>
			<fmt:message key="label.platform.user.comName" />
		</dt>
		<dd>${prpDuser.prpAreaInfo.comName}</dd>
	</dl>
	<%--<dl>
		<dt>
			<fmt:message key="label.platform.user.comename" />
		</dt>
		<dd>${prpDuser.prpDcompany.comEName}</dd>
	</dl>
	--%><dl>
		<dt>
			<fmt:message key="label.platform.user.password" />
		</dt>
		<dd>********</dd>
	</dl>

	<dl>
		<dt>
			<fmt:message key="label.platform.user.validstatus" />
		</dt>
		<dd>
			<c:choose>
				<c:when test="${prpDuser.validStatus == '1'}">
					 有效 
				</c:when>
				<c:otherwise>
					 无效 
				</c:otherwise>
			</c:choose>
		</dd>
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
