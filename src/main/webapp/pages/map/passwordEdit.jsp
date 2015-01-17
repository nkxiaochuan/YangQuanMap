<%@ include file="/common/taglibs.jsp"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<div class="pageContent">
	<form method="post" action="${ctx}/user/changePassword.do" class="pageForm required-validate" onsubmit="return validateCallback(this, dialogAjaxDone);">
		<input type="hidden" name="callbackType" value="closeCurrent" />
		<div class="pageFormContent" layoutH="56">
			<p>
				<label><fmt:message key="label.platform.user.userCode"/>:</label>
				<input name="userName" type="text" size="30" value="${userMsg.userName }" readonly="readonly"/>
			</p>
			<p>
				<label><fmt:message key="label.platform.user.userName"/>:</label>
				<input name="userCode" type="text" size="30" value="${userMsg.userCode}" readonly="readonly"/>
			</p>
			<p>
				<label><fmt:message key="label.platform.user.oldpassword"/>:</label>
				<input name="password" type="password" class="required alphanumeric" minlength="6" maxlength="20" size="30" alt="请输入旧密码"/>
			</p>
			<p>
				<label><fmt:message key="label.platform.user.newpassword"/>:</label>
				<input id="newPassword" name="newPassword" type="password" class="required alphanumeric" minlength="6" maxlength="20" size="30" alt="请输入新密码"/>
			</p>
			<p>
				<label><fmt:message key="label.platform.user.confirmpassword"/>:</label>
				<input id="confirmPassword" name="confirmPassword" type="password" class="required alphanumeric" minlength="6" maxlength="20" equalto="#newPassword" size="30" alt="请重新输入新密码" />
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
<script type="text/javascript">
</script>