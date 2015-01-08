<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<c:choose>
	<c:when test="${sccProjectLeader.id == null}">
		<c:set var="url" value="${ctx}/codecheck/addLeader.do"></c:set>
	</c:when>
	<c:otherwise>
		<c:set var="url" value="${ctx}/codecheck/updateLeader.do"></c:set>
	</c:otherwise>
</c:choose>

<h2 class="contentTitle">
	<c:choose>
	<c:when test="${sccProjectLeader.id == null}">
		<fmt:message key="label.domain.leader.addleader" />
	</c:when>
	<c:otherwise>
		<fmt:message key="label.domain.leader.alterleader" />
	</c:otherwise>
</c:choose>
	
</h2>
<form action="${url}" method="post" class="required-validate pageForm"
	onsubmit="return validateCallback(this, dialogAjaxDone);">
	<%-- callbackType为回调方法入口，当callbackType="closeCurrent"时会关闭当前tab,callbackType="forward"时需要forwardUrl值   --%>
	<input type="hidden" name="callbackType" value="closeCurrent" />
	<div class="pageFormContent" layoutH="97">
		<dl>
			<dt>
				<fmt:message key="label.domain.leader.leadername" />
			</dt>
			<dd>
				<input type="text" name="sccProjectLeader.userName" class="required" maxlength="20" value="${sccProjectLeader.userName}" />
			</dd>
		</dl>
		
		<dl>
			<dt>
				<fmt:message key="label.domain.leader.leaderemail" />
			</dt>
			<dd>
				<input type="text"  name="sccProjectLeader.userEmail"  class="required" value="${sccProjectLeader.userEmail}" />
			</dd>
		</dl>
		<div class="divider"></div>
		<dl>
			<dd>
				<input type="hidden"  name="sccProjectLeader.id"  value="${sccProjectLeader.id}" />
			</dd>
		</dl>
		<dl>
			<dd>
				<input type="hidden"  name="sccProjectLeader.sccProject.id"  value="${sccProjectLeader.sccProject.id}" />
			</dd>
		</dl>

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