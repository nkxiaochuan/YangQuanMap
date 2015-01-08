<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
 
<%-- 注意：form的id需要设置为pagerForm，需要pageNo至orderDirection等4个参数为框架所需 --%>
<form id="pagerForm" method="post" action="${ctx }/quartz/query.do" onsubmit="return navTabSearch(this)">
	<input type="hidden" name="pageNo" value="1" />
	<input type="hidden" name="pageSize" value="${pageSize}" /> 
	<input type="hidden" name="orderField" value="${param.orderField}" />
	<input type="hidden" name="orderDirection" value="${param.orderDirection}" />
	<div class="pageHeader">
		<div class="searchBar">
			<table class="searchContent">
				<tr>
					<td>
						<label><fmt:message key="label.platform.quartz.usercode" /></label> 
						<input type="text" name="quartzConfig.userCode" value="${quartzConfig.userCode}"/> 
					</td>
					<td>	
						<label><fmt:message key="label.platform.quartz.jobcode" /></label> 
						<input type="text" name="quartzConfig.jobCode" value="${quartzConfig.jobCode}" style="margin-left: 50px"/> 
					</td>
					<td>	
						<label><fmt:message key="label.platform.quartz.jobdescription" /></label> 
						<input type="text" name="quartzConfig.jobDescription" value="${quartzConfig.jobDescription}"/> 
					</td>
					
				</tr>
			</table>			 
			<div class="subBar">
				<ul>						
					<li><div class="buttonActive"><div class="buttonContent"><button type="submit"><fmt:message key="label.common.main.query" /></button></div></div></li> 
				</ul>
			</div>
		</div>
	</div>
</form>

<div class="pageContent">

	<div class="panelBar">
		<ul class="toolBar"> 
			<li><a class="add" target="navTab" rel="quartzNav" href="${ctx}/quartz/prepareAdd.do"><span><fmt:message key="label.common.main.add" /></span></a></li>
			<li><a class="edit" target="navTab" rel="quartzNav" href="${ctx}/quartz/prepareUpdate.do?id={id}" ><span><fmt:message key="label.common.main.edit" /></span></a></li> 
			<li class="line">line</li> 
		<li><a class="delete" target="ajaxTodo" rel="id" href="${ctx}/quartz/deleteQuartzConfig.do?id={id}" title="<fmt:message key="title.common.delete" />"><span><fmt:message key="label.common.main.delete" /></span></a></li>				
		</ul>
	</div>
	
	<table class="table" layoutH="138" width="100%">
		<thead>
			<tr> 			   
				<th width="200" orderField="id" class="${param.orderField eq 'id' ? param.orderDirection : ''}"><fmt:message key="label.platform.quartz.id" /></th>
				<th width="200" orderField="jobCode" class="${param.orderField eq 'jobCode' ? param.orderDirection : ''}"><fmt:message key="label.platform.quartz.jobcode" /></th> 
				<th width="200" orderField="jobDescription" class="${param.orderField eq 'jobDescription' ? param.orderDirection : ''}"><fmt:message key="label.platform.quartz.jobdescription" /></th>	
				<th width="80" orderField="validStatus" class="${param.orderField eq 'validStatus' ? param.orderDirection : ''}"><fmt:message key="label.platform.quartz.validStatus" /></th>										
				<th width="80"><fmt:message key="label.common.main.operate" /></th>
			</tr> 
		</thead> 
		<tbody>
			<c:forEach items="${resultList}" var="obj" varStatus="status">
			<tr target="id" rel="${obj.id}">
				<td>${status.index+1}</td>				  
				<td>${obj.jobCode }</td> 
				<td>${obj.jobDescription }</td>	
				<td>
				<c:choose>
				<c:when test="${obj.validStatus == '1'}">
					<fmt:message key="label.platform.quartz.valid"/>
				</c:when>
				<c:otherwise>
					 <fmt:message key="label.platform.quartz.invalid"/> 
				</c:otherwise>
			</c:choose>
				</td>				
				<td>
					<a title="View" target="navTab" href="${ctx}/quartz/view.do?id=${obj.id}" rel="viewUser${obj.id}" class="btnView">${(quartzConfig.id)}</a> 
					<a title="Edit" target="navTab" href="${ctx}/quartz/prepareUpdate.do?id=${obj.id}" rel="editUser${obj.id}" class="btnEdit"><fmt:message key="label.common.main.edit" /></a>
					<a title="Delete" target="ajaxTodo" href="${ctx}/quartz/deleteQuartzConfig.do?id=${obj.id}" class="btnDel" title="<fmt:message key="title.common.delete" />"><fmt:message key="label.common.main.delete" /></a>
				</td>
			</tr>
			</c:forEach>		 
		</tbody>
	</table>
	
	<c:import url="/common/PaginationBar.jsp"></c:import>
	
</div>


