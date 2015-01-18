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
						<label><fmt:message key="label.platform.user.userCode" /></label> 
						<input type="text" name="prpDuser.userCode" value="${prpDuser.userCode}"/> 
					</td>
					<td>	
						<label><fmt:message key="label.platform.user.userName" /></label> 
						<input type="text" name="prpDuser.userName" value="${prpDuser.userName}"/> 
					</td>
					<td>	
						<label><fmt:message key="label.platform.user.comCode" /></label> 
						<input type="text" name="prpDuser.prpAreaInfo.comCode" value="${prpDuser.prpAreaInfo.comCode}"/> 
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
			<li><a class="add" target="dialog" width="800" rel="userNav" href="${ctx}/user/prepareAdd.do"><span><fmt:message key="label.common.main.add" /></span></a></li>
			<li><a class="edit" target="dialog" width="800" rel="userNav" href="${ctx}/user/prepareUpdate.do?userCode={userCode}" ><span><fmt:message key="label.common.main.edit" /></span></a></li> 
			<li class="line">line</li> 
			<li><a class="delete" target="ajaxTodo" rel="userCode" href="${ctx}/user/delete.do?userCode={userCode}" title="<fmt:message key="title.common.delete" />"><span><fmt:message key="label.common.main.delete" /></span></a></li>			
		</ul>
	</div>
	
	<table class="table" layoutH="138" width="100%">
		<thead>
			<tr> 			  
				<th width="50" align="right"><fmt:message key="label.common.main.serialno" /></th> 
				<th width="200" orderField="userCode"><fmt:message key="label.platform.user.userCode" /></th>
				<th width="200" orderField="userName"><fmt:message key="label.platform.user.userName" /></th>
				<th width="200" orderField="comCode"><fmt:message key="label.platform.user.comCode" /></th> 
				<th width="200" orderField="comName"><fmt:message key="label.platform.user.comName" /></th> 
				<th width="60" orderField="roleCode"><fmt:message key="label.platform.user.roleCode" /></th> 
				<th width="80"><fmt:message key="label.common.main.operate" /></th>
			</tr> 
		</thead>
		<tbody>
			<c:forEach items="${userList}" var="obj" varStatus="status">
				<tr target="userCode" rel="${obj.userCode}">
				<td>${status.index+1}</td>				  
				<td>${obj.userCode}</td> 
				<td>${obj.userName }</td>
				<td>${obj.prpAreaInfo.comCode }</td> 
				<td>${obj.prpAreaInfo.comName }</td> 
				<c:choose>
					<c:when test="${obj.roleCode == '1'}">
						<td><fmt:message key="label.platform.user.manager"/></td>
					</c:when>
					<c:otherwise>
						<td><fmt:message key="label.platform.user.operator"/></td>
					</c:otherwise>
				</c:choose>
				<td>
					<a title="View" target="dialog" width="800" href="${ctx}/user/view.do?userCode=${obj.userCode}" rel="viewUser${obj.userCode}" class="btnView">${(status.index+1)}</a> 
					<a title="Edit" target="dialog" width="800" href="${ctx}/user/prepareUpdate.do?userCode=${obj.userCode}" rel="editUser${obj.userCode}" class="btnEdit"><fmt:message key="label.common.main.edit" /></a>
					<a title="Delete" target="ajaxTodo" href="${ctx}/user/delete.do?userCode=${obj.userCode}" class="btnDel" title="<fmt:message key="title.common.delete" />"><fmt:message key="label.common.main.delete" /></a>
				</td>
			</tr>
			</c:forEach>		 
		</tbody>
	</table>
	
	<c:import url="/common/PaginationBar.jsp" charEncoding="UTF-8"></c:import>
	
</div>


