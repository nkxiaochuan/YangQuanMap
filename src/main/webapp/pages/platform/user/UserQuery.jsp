<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
 
<%-- 注意：form的id需要设置为pagerForm，需要pageNo至orderDirection等4个参数为框架所需 --%>
<form id="pagerForm" method="post" action="${ctx }/user/query.do" onsubmit="return navTabSearch(this)">
	<input type="hidden" name="pageNo" value="1" />
	<input type="hidden" name="pageSize" value="${pageSize}" /> 
	<input type="hidden" name="orderField" value="${param.orderField}" />
	<input type="hidden" name="orderDirection" value="${param.orderDirection}" />
	<div class="pageHeader">
		<div class="searchBar">
			<table class="searchContent">
				<tr>
					<td>
						<label><fmt:message key="label.platform.user.usercode" /></label> 
						<input type="text" name="prpDuser.userCode" value="${prpDuser.userCode}"/> 
					</td>
					<td>	
						<label><fmt:message key="label.platform.user.username" /></label> 
						<input type="text" name="prpDuser.userName" value="${prpDuser.userName}"/> 
					</td>
					<td>	
						<label><fmt:message key="label.platform.user.comcode" /></label> 
						<input type="text" name="prpDuser.prpDcompany.comCode" value="${prpDuser.prpAreaInfo.comCode}"/> 
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
			<li><a class="add" target="navTab" rel="userNav" href="${ctx}/user/prepareAdd.do"><span><fmt:message key="label.common.main.add" /></span></a></li>
			<li><a class="edit" target="navTab" rel="userNav" href="${ctx}/user/prepareUpdate.do?userCode={userCode}" ><span><fmt:message key="label.common.main.edit" /></span></a></li> 
			<li class="line">line</li> 
			<li><a class="delete" target="ajaxTodo" rel="userCode" href="${ctx}/user/delete.do?userCode={userCode}" title="<fmt:message key="title.common.delete" />"><span><fmt:message key="label.common.main.delete" /></span></a></li>			
		</ul>
	</div>
	
	<table class="table" layoutH="138" width="100%">
		<thead>
			<tr> 			  
				<th width="50" align="right"><fmt:message key="label.common.main.serialno" /></th> 
				<th width="200" orderField="userCode" class="${param.orderField eq 'userCode' ? param.orderDirection : ''}"><fmt:message key="label.platform.user.usercode" /></th>
				<th width="260" orderField="userName" class="${param.orderField eq 'userName' ? param.orderDirection : ''}"><fmt:message key="label.platform.user.username" /></th>
				<th width="200" orderField="comCode" class="${param.orderField eq 'comCode' ? param.orderDirection : ''}"><fmt:message key="label.platform.user.comcode" /></th> 
				<th width="200" orderField="comCName" class="${param.orderField eq 'comCName' ? param.orderDirection : ''}"><fmt:message key="label.platform.user.comcname" /></th> 
				<th width="80"><fmt:message key="label.common.main.operate" /></th>
			</tr> 
		</thead>
		<tbody>
			<c:forEach items="${resultList}" var="obj" varStatus="status">
			<tr target="userCode" rel="${obj.userCode}">
				<td>${status.index+1}</td>				  
				<td>${obj.userCode}</td> 
				<td>${obj.userName }</td>
				<td>${obj.prpDcompany.comCode }</td> 
				<td>${obj.prpDcompany.comCName }</td> 
				<td>
					<a title="View" target="navTab" href="${ctx}/user/view.do?userCode=${obj.userCode}" rel="viewUser${obj.userCode}" class="btnView">${(status.index+1)}</a> 
					<a title="Edit" target="navTab" href="${ctx}/user/prepareUpdate.do?userCode=${obj.userCode}" rel="editUser${obj.userCode}" class="btnEdit"><fmt:message key="label.common.main.edit" /></a>
					<a title="Delete" target="ajaxTodo" href="${ctx}/user/delete.do?userCode=${obj.userCode}" class="btnDel" title="<fmt:message key="title.common.delete" />"><fmt:message key="label.common.main.delete" /></a>
				</td>
			</tr>
			</c:forEach>		 
		</tbody>
	</table>
	
	<c:import url="/common/PaginationBar.jsp"></c:import>
	
</div>


