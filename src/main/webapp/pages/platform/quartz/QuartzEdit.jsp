<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<style>
.bold{
  font-weight: bold;
}
</style>
<c:choose>
	<c:when test="${quartzConfig.jobDescription == null}">
		<c:set var="url" value="${ctx}/quartz/addQuartzConfig.do"></c:set>
	</c:when>
	<c:otherwise>
		<c:set var="url" value="${ctx}/quartz/update.do"></c:set>
	</c:otherwise>
</c:choose>

<h2 class="contentTitle"><fmt:message key="label.platform.quartz.manage" />
</h2>
<form action="${url}" method="post" class="required-validate pageForm"
	onsubmit="return validateCallback(this, navTabAjaxDone);"><%-- callbackType为回调方法入口，当callbackType="closeCurrent"时会关闭当前tab,callbackType="forward"时需要forwardUrl值   --%>
<input type="hidden" name="callbackType" value="closeCurrent" />
<div class="pageFormContent" layoutH="97">

<dl>
	<dt><fmt:message key="label.platform.quartz.jobcode" /></dt>
	<dd><c:choose>
		<c:when test="${quartzConfig.jobDescription == null}">
			<input type="text" name="quartzConfig.jobCode" class="required"
				maxlength="20" value="${quartzConfig.jobCode}" />
		</c:when>
		<c:otherwise>
							${quartzConfig.jobCode}<input type="hidden"
				name="quartzConfig.jobCode" value="${quartzConfig.jobCode }" />
		</c:otherwise>
	</c:choose></dd>
</dl>

<dl>
	<dt><fmt:message key="label.platform.quartz.jobdescription" /></dt>
	<dd><c:choose>
		<c:when test="${quartzConfig.jobDescription == null}">
			<input type="text" name="quartzConfig.jobDescription"
				class="required" maxlength="20"
				value="${quartzConfig.jobDescription}" />
		</c:when>
		<c:otherwise>
							<input type="text"
				name="quartzConfig.jobDescription"
				value="${quartzConfig.jobDescription }" />
		</c:otherwise>
	</c:choose></dd>
</dl>
<div class="divider"></div>
		<dl>
			<dt>
				<fmt:message key="label.platform.quartz.tasktype"/>
			</dt>
			<dd><select  name="quartzConfig.targetObject" value="${quartzConfig.targetObject}">
				<option value="codeCheckJob" <c:if test="${quartzConfig.targetObject == codeCheck}">selected="true"</c:if>><fmt:message key="label.platform.quartz.codecheck"/></option>
				</select></dd>
		</dl>

		<dl>
			<dt>
				<fmt:message key="label.platform.quartz.taskcontent"/>
			</dt>
			<dd><select  name="quartzConfig.targetMethod" value="${quartzConfig.targetMethod}">
				<option value="codeCheckRecentChangeForLeaderAuto" ${'codeCheckRecentChangeForLeaderAuto' eq quartzConfig.targetMethod ? 'selected="selected"' : ''}><fmt:message key="label.platform.quartz.sendresulttoleader"/></option>
				<option value="codeCheckRecentChangeForUserAuto" ${'codeCheckRecentChangeForUserAuto' eq quartzConfig.targetMethod ? 'selected="selected"' : ''}><fmt:message key="label.platform.quartz.sendresulttomember"/></option>
				<option value="codeCheckAllForLeaderAuto" ${'codeCheckAllForLeaderAuto' eq quartzConfig.targetMethod ? 'selected="selected"' : ''}><fmt:message key="label.platform.quartz.sendallresulttoleader"/></option>
				</select></dd>
		</dl>


<div class="divider"></div>
<dl>
	<dt><fmt:message key="label.platform.quartz.concurrent" /></dt>
	<dd><select name="quartzConfig.conCurrent">
		<option value="1" ${'1' eq
			quartzConfig.conCurrent ? 'selected="selected"' : ''}><fmt:message key="label.platform.quartz.permit"/></option>
		<option value="0" ${'0' eq
			quartzConfig.conCurrent ? 'selected="selected"' : ''}><fmt:message key="label.platform.quartz.forbid"/></option>
	</select></dd>
</dl>
<dl>
	<dt><fmt:message key="label.platform.quartz.validStatus" /></dt>
	<dd><select name="quartzConfig.validStatus">
		<option value="1" ${'1' eq quartzConfig.validStatus ? 'selected="selected"' : ''}><fmt:message key="label.platform.quartz.valid"/></option>
		<option value="0" ${'0' eq quartzConfig.validStatus ? 'selected="selected"' : ''}><fmt:message key="label.platform.quartz.invalid"/></option>
	</select></dd>
</dl>
<div class="divider"></div>
	<input type="hidden" name="quartzConfig.id"
		maxlength="20" value="${quartzConfig.id}" />


	<input type="hidden"
		name="quartzConfig.userCode" maxlength="20"
		value="<%=session.getAttribute("UserCode")%>" />

<h3 class="contentTitle"><fmt:message key="label.platform.quartz.input" />
</h3>

<h3 class="contentTitle"><fmt:message key="label.platform.quartz.begin" />
</h3>

<dl>
	<dt class="bold"><fmt:message key="label.platform.quartz.timeregion"/></dt>
</dl>
<dl>
	<dt class="bold"><fmt:message key="label.platform.quartz.allowablevalue"/></dt>
</dl>
<dl>
	<dt class="bold"><fmt:message key="label.platform.quartz.allowablespechars"/></dt>
</dl>

<dl>
	<dt><fmt:message key="label.platform.quartz.second" /></dt>
	<dd><c:choose>
		<c:when test="${quartzConfig.jobDescription == null}">
			<input type="text" name="quartzConfig.second" maxlength="20"
				value="${quartzConfig.second}" />
		</c:when>
		<c:otherwise>
			<input type="text" name="quartzConfig.second"
				value="${quartzConfig.second }" />
		</c:otherwise>
	</c:choose></dd>
</dl>
<dl>
	<dt>0-59</dt>
</dl>
<dl>
	<dt>, - * /</dt>
</dl>

<dl>
	<dt><fmt:message key="label.platform.quartz.minute" /></dt>
	<dd><c:choose>
		<c:when test="${quartzConfig.jobDescription == null}">
			<input type="text" name="quartzConfig.minute" maxlength="20"
				value="${quartzConfig.minute}" />
		</c:when>
		<c:otherwise>
			<input type="text" name="quartzConfig.minute"
				value="${quartzConfig.minute }" />
		</c:otherwise>
	</c:choose></dd>
</dl>
<dl>
	<dt>0-59</dt>
</dl>
<dl>
	<dt>, - * /</dt>
</dl>
<dl>
	<dt><fmt:message key="label.platform.quartz.hour" /></dt>
	<dd><c:choose>
		<c:when test="${quartzConfig.jobDescription == null}">
			<input type="text" name="quartzConfig.hour" maxlength="20"
				value="${quartzConfig.hour}" />
		</c:when>
		<c:otherwise>
			<input type="text" name="quartzConfig.hour"
				value="${quartzConfig.hour }" />
		</c:otherwise>
	</c:choose></dd>
</dl>
<dl>
	<dt>0-23</dt>
</dl>
<dl>
	<dt>, - * /</dt>
</dl>
<dl>
	<dt><fmt:message key="label.platform.quartz.day" /></dt>
	<dd><c:choose>
		<c:when test="${quartzConfig.jobDescription == null}">
			<input type="text" name="quartzConfig.day" maxlength="20"
				value="${quartzConfig.day}" />
		</c:when>
		<c:otherwise>
			<input type="text" name="quartzConfig.day"
				value="${quartzConfig.day }" />
		</c:otherwise>
	</c:choose></dd>
</dl>
<dl>
	<dt>1-31</dt>
</dl>
<dl>
	<dt>, - * / ? L W C</dt>
</dl>
<dl>
	<dt><fmt:message key="label.platform.quartz.month" /></dt>
	<dd><c:choose>
		<c:when test="${quartzConfig.jobDescription == null}">
			<input type="text" name="quartzConfig.month" maxlength="20"
				value="${quartzConfig.month}" />
		</c:when>
		<c:otherwise>
			<input type="text" name="quartzConfig.month"
				value="${quartzConfig.month }" />
		</c:otherwise>
	</c:choose></dd>
</dl>
<dl>
	<dt>1-12</dt>
</dl>
<dl>
	<dt>, - * /</dt>
</dl>
<dl>
	<dt><fmt:message key="label.platform.quartz.week" /></dt>
	<dd><c:choose>
		<c:when test="${quartzConfig.jobDescription == null}">
			<input type="text" name="quartzConfig.week" maxlength="20"
				value="${quartzConfig.week}" />
		</c:when>
		<c:otherwise>
			<input type="text" name="quartzConfig.week"
				value="${quartzConfig.week }" />
		</c:otherwise>
	</c:choose></dd>
</dl>
<dl>
	<dt>1-7</dt>
</dl>
<dl>
	<dt>, - * / ? L C #</dt>
</dl>

<dl>
	<dt><fmt:message key="label.platform.quartz.year" /></dt>
	<dd><c:choose>
		<c:when test="${quartzConfig.jobDescription == null}">
			<input type="text" name="quartzConfig.year" maxlength="20"
				value="${quartzConfig.year}" />
		</c:when>
		<c:otherwise>
			<input type="text" name="quartzConfig.year"
				value="${quartzConfig.year }" />
		</c:otherwise>
	</c:choose></dd>
</dl>

<dl>
	<dt><fmt:message key="label.platform.quartz.nullvalues"/> 1970-2099</dt>
</dl>
<dl>
	<dt>, - * /</dt>
</dl>






</div>

<div class="formBar">
<ul>
	<li>
	<div class="buttonActive">
	<div class="buttonContent">
	<button type="submit"><fmt:message key="label.common.main.save" />
	</button>
	</div>
	</div>
	</li>
	<li>
	<div class="button">
	<div class="buttonContent">
	<button type="reset"><fmt:message key="label.common.main.reset" />
	</button>
	</div>
	</div>
	</li>
	<li>
	<div class="button">
	<div class="buttonContent">
	<button type="button" class="close"><fmt:message
		key="label.common.main.close" /></button>
	</div>
	</div>
	</li>
</ul>
</div>
</form>