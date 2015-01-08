<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>


<%-- 注意：form的id需要设置为pagerForm，需要pageNo至orderDirection等4个参数为框架所需 --%>
<form id="pagerForm" method="post" 	action="${ctx}/codecheck/queryLeader.do" 
	onsubmit="return navTabSearch(this)">
	<input type="hidden" name="pageNo" value="1" /> 
	<input type="hidden" name="pageSize" value="${pageSize}" /> 
	<input type="hidden" name="orderField"  value="${param.orderField}" />
	<input type="hidden" name="orderDirection" value="${param.orderDirection}" />
	<div class="pageHeader">
		<div class="searchBar">
			<table class="searchContent">
				<tr>
					<td><label><fmt:message key="label.domain.leader.leadername" /></label> <input type="text"
						name="sccProjectLeader.userName" value="${sccProjectLeader.userName}" /></td>
				
					<td><label><fmt:message key="label.domain.leader.leaderemail" /></label> <input type="text"
						name="sccProjectLeader.userEmail" value="${sccProjectLeader.userEmail}" /></td>
				</tr>
			</table>
			<div class="subBar">
				<ul>
					<li>
						<div class="buttonActive">
							<div class="buttonContent">
								<button type="submit"><fmt:message key="label.common.main.query"/></button>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</div>
	</div>
</form>
 
		<div class="pageContent">

	<div class="panelBar">
		<ul class="toolBar"> 
	    	<li><a class="edit" target="navTab" rel="codeCheckNav" href="${ctx}/codecheck/prepareUpdateLeader.do?id={id}" ><span><fmt:message key="label.common.main.edit" /></span></a></li> 
			<li class="line">line</li> 
			<li><a class="delete" target="ajaxTodo" rel="codeCheckCode" href="${ctx}/codecheck/deleteLeader.do?id={id}" title="<fmt:message key="title.common.delete" />"><span><fmt:message key="label.common.main.delete" /></span></a></li>			
		</ul>
	</div>
	
	<table class="table" layoutH="138" width="100%">
		<thead>
			<tr> 			  
				<th width="50" align="right" orderField="id" class="${param.orderField eq 'id' ? param.orderDirection : ''}"><fmt:message key="label.domain.check.number" /></th> 
				<th width="100" orderField="sccProject.projectCode" class="${param.orderField eq 'sccProject.projectCode' ? param.orderDirection : ''}"><fmt:message key="label.domain.check.projectcode" /></th>
				<th width="200" orderField="userName" class="${param.orderField eq 'userName' ? param.orderDirection : ''}"><fmt:message key="label.domain.check.leader" /></th>
				<th width="260" orderField="userEmail" class="${param.orderField eq 'userEmail' ? param.orderDirection : ''}"><fmt:message key="label.domain.leader.leaderemail" /></th>
				<th width="140"><fmt:message key="label.common.main.operate" /></th>
			</tr> 
		</thead>
		<tbody>
			<c:forEach items="${resultList}" var="obj" varStatus="status">
			<tr target="id" rel="${obj.id}">
				<td>${status.index+1}</td>
				<td>${obj.sccProject.projectCode}</td>				  
				<td>${obj.userName}</td> 
				<td>${obj.userEmail}</td>
				<td>
					<a title="Edit" target="dialog" href="${ctx}/codecheck/prepareUpdateLeader.do?id=${obj.id}" rel="editSccProjectLeader${obj.id}" class="btnEdit"><fmt:message key="label.common.main.edit" /></a>
					<a title="Delete" target="ajaxTodo" href="${ctx}/codecheck/deleteLeader.do?id=${obj.id}" class="btnDel" title="<fmt:message key="title.common.delete" />"><fmt:message key="label.common.main.delete" /></a>
				</td>
			</tr>
			</c:forEach>		 
		</tbody>
	</table>
	
	<c:import url="/common/PaginationBar.jsp">
	</c:import>
	
</div>

