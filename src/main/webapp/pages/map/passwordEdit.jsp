<%@ include file="/common/taglibs.jsp"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<div class="pageContent">
	<form method="post" action="demo/common/ajaxDone.html" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
		<div class="pageFormContent" layoutH="56">
			<p>
				<label>用户代码：</label>
				<input name="sn" type="text" size="30" value="${userMsg.userName }" readonly="readonly"/>
			</p>
			<p>
				<label>用户名称：</label>
				<input name="name" type="text" size="30" value="${userMsg.userCode}" readonly="readonly"/>
			</p>
			<p>
				<label>旧 密 码：</label>
				<input name="code" type="password" class="required alphanumeric" minlength="6" maxlength="20" size="30" alt="请输入旧密码"/>
			</p>
			<p>
				<label>新密码：</label>
				<input id="newPassword" name="newPassword" type="password" class="required alphanumeric" minlength="6" maxlength="20" size="30" alt="请输入新密码"/>
			</p>
			<p>
				<label>确认新密码：</label>
				<input id="confirmPassword" name="confirmPassword" type="password" class="required alphanumeric" minlength="6" maxlength="20" equalto="#newPassword" size="30" alt="请重新输入新密码" />
			</p>
		</div>
		<div class="formBar">
			<ul>
				<!--<li><a class="buttonActive" href="javascript:;"><span>保存</span></a></li>-->
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">保存</button></div></div></li>
				<li>
					<div class="button"><div class="buttonContent"><button type="button" class="close">取消</button></div></div>
				</li>
			</ul>
		</div>
	</form>
</div>
<script type="text/javascript">
</script>