<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<div class="pageContent">
	<form method="post" action="${ctx}/user/changePassword.do" class="required-validate pageForm"
		onsubmit="return validateCallback(this, dialogAjaxDone);">
		<%-- callbackType为回调方法入口，当callbackType="closeCurrent"时会关闭当前tab,callbackType="forward"时需要forwardUrl值   --%>
		<input type="hidden" name="callbackType" value="closeCurrent" />
		<div class="pageFormContent" layouth="57">
			<p>
				<label> <s:text name="form.pwd" /><fmt:message key="label.platform.user.usercode"/></label> ${prpDuser.userCode}<input type="hidden" name="prpDuser.userCode"
					value="${prpDuser.userCode}" />
			</p>
			<p>
				<label> <s:text name="form.pwd" /> <fmt:message key="label.platform.user.oldpassword"/></label> <input type="password" name="prpDuser.password" class="required" />
			</p>
			<p>
				<label> <s:text name="form.newPwd" /><fmt:message key="label.platform.user.newpassword"/> </label> <input type="password" id="newPassword" name="newPassword"
					class="required" />
			</p>
			<p>
				<label> <s:text name="form.confirmPwd" /><fmt:message key="label.platform.user.confirmpassword"/>  </label> <input type="password" name="newPassword2" class="required"
					equalTo="#newPassword" />
			</p>
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
							<button type="button" class="close">
								<fmt:message key="label.common.main.close" />
							</button>
						</div>
					</div>
				</li>
			</ul>
		</div>
	</form>
</div>