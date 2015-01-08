<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<style>
.bold{
  font-weight: bold;
}
</style>
<h2 class="contentTitle">
	<fmt:message key="label.platform.quartz.manage" />
</h2>
<div class="pageFormContent" layoutH="97">
	
	<dl>
		<dt>
			<fmt:message key="label.platform.quartz.jobcode" />
		</dt>
		<dd>${quartzConfig.jobCode}</dd>
	</dl>
		<dl>
		<dt>
			<fmt:message key="label.platform.quartz.jobdescription" />
		</dt>
		<dd>${quartzConfig.jobDescription}</dd>
	</dl>
	<div class="divider"></div>

	<dl>
		<dt>
			<fmt:message key="label.platform.quartz.concurrent" />
		</dt>
		<dd>
			<c:choose>
				<c:when test="${quartzConfig.conCurrent == '1'}">
					 <fmt:message key="label.platform.quartz.permit"/>
				</c:when>
				<c:otherwise>
					<fmt:message key="label.platform.quartz.forbid"/>
				</c:otherwise>
			</c:choose>
		</dd>
	</dl>
	<dl>
		<dt>
			<fmt:message key="label.platform.quartz.validStatus" />
		</dt>
		<dd>
			<c:choose>
				<c:when test="${quartzConfig.validStatus == '1'}">
					<fmt:message key="label.platform.quartz.valid"/>
				</c:when>
				<c:otherwise>
					 <fmt:message key="label.platform.quartz.invalid"/> 
				</c:otherwise>
			</c:choose>
		</dd>
	</dl>
	<div class="divider"></div>
	<dl>
		<dt>
			<fmt:message key="label.platform.quartz.cronexpression" />
		</dt>
		<dd>${quartzConfig.cronExpression}</dd>
	</dl>
	<div class="divider"></div>
	<h3 class="contentTitle">
	         <fmt:message key="label.platform.quartz.example" />
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
	<dd>
			<input type="text" name="quartzConfig.second" class="readonly" readonly="readonly"
				value="${quartzConfig.second }" />
		</dd>
</dl>
<dl>
	<dt>0-59</dt>
</dl>
<dl>
	<dt>, - * /</dt>
</dl>

<dl>
	<dt><fmt:message key="label.platform.quartz.minute" /></dt>
	<dd>
			<input type="text" name="quartzConfig.minute" class="readonly" readonly="readonly"
				value="${quartzConfig.minute }" />
		</dd>
</dl>
<dl>
	<dt>0-59</dt>
</dl>
<dl>
	<dt>, - * /</dt>
</dl>
<dl>
	<dt><fmt:message key="label.platform.quartz.hour" /></dt>
	<dd>
			<input type="text" name="quartzConfig.hour" class="readonly" readonly="readonly"
				value="${quartzConfig.hour }" />
		</dd>
</dl>
<dl>
	<dt>0-23</dt>
</dl>
<dl>
	<dt>, - * /</dt>
</dl>
<dl>
	<dt><fmt:message key="label.platform.quartz.day" /></dt>
	<dd>
			<input type="text" name="quartzConfig.day" class="readonly" readonly="readonly"
				value="${quartzConfig.day }" />
		</dd>
</dl>
<dl>
	<dt>1-31</dt>
</dl>
<dl>
	<dt>, - * / ? L W C</dt>
</dl>
<dl>
	<dt><fmt:message key="label.platform.quartz.month" /></dt>
	<dd>
			<input type="text" name="quartzConfig.month" class="readonly" readonly="readonly"
				value="${quartzConfig.month }" />
		</dd>
</dl>
<dl>
	<dt>1-12</dt>
</dl>
<dl>
	<dt>, - * /</dt>
</dl>
<dl>
	<dt><fmt:message key="label.platform.quartz.week" /></dt>
	<dd>
			<input type="text" name="quartzConfig.week" class="readonly" readonly="readonly"
				value="${quartzConfig.week }" />
		</dd>
</dl>
<dl>
	<dt>1-7</dt>
</dl>
<dl>
	<dt>, - * / ? L C #</dt>
</dl>

<dl>
	<dt><fmt:message key="label.platform.quartz.year" /></dt>
	<dd>
			<input type="text" name="quartzConfig.year" class="readonly" readonly="readonly"
				value="${quartzConfig.year }" />
		</dd>
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
