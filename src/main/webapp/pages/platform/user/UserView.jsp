<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>

<h2 class="contentTitle">
	<fmt:message key="label.platform.user.manage" />
</h2>
<div class="pageFormContent" layoutH="97">
	<dl>
		<dt>
			<fmt:message key="label.platform.user.usercode" />
		</dt>
		<dd>${prpDuser.userCode}</dd>
	</dl>
	<dl style="width: 700px">
		<dt>
			<fmt:message key="label.platform.user.username" />
		</dt>
		<dd>${prpDuser.userName}</dd>
	</dl>

	<div class="divider"></div>
	<dl>
		<dt>
			<fmt:message key="label.platform.user.comcode" />
		</dt>
		<dd>${prpDuser.prpAreaInfo.comCode}</dd>
	</dl>
	<dl>
		<dt>
			<fmt:message key="label.platform.user.comcname" />
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
		<dd>${prpDuser.password}</dd>
	</dl>
	<%--<dl>
		<dt>
			<fmt:message key="label.platform.user.passwdsetdate" />
		</dt>
		<dd>
			<fmt:formatDate pattern="yyyy-MM-dd" value="${prpDuser.passwdSetDate}" />
		</dd>
	</dl>
	<dl>
		<dt>
			<fmt:message key="label.platform.user.passwdsetdate" />
		</dt>
		<dd>
			<fmt:formatDate pattern="yyyy-MM-dd" value="${prpDuser.passwdExpireDate}" />
		</dd>
	</dl>
	<dl>
		<dt>
			<fmt:message key="label.platform.user.articlecode" />
		</dt>
		<dd>${prpDuser.articleCode}</dd>
	</dl>
	<dl>
		<dt>
			<fmt:message key="label.platform.user.newusercode" />
		</dt>
		<dd>${prpDuser.newUserCode}</dd>
	</dl>
	--%><dl>
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
