<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
 
<%-- 注意：form的id需要设置为pagerForm，需要pageNo至orderDirection等4个参数为框架所需 --%>
<form id="pagerForm" method="post" action="${ctx }/location/query.do" onsubmit="return navTabSearch(this)">
	<input type="hidden" name="pageNo" value="1" />
	<input type="hidden" name="pageSize" value="${pageSize}" /> 
	<input type="hidden" name="orderField" value="${param.orderField}" />
	<input type="hidden" name="orderDirection" value="${param.orderDirection}" />
	<div class="pageHeader">
		<div class="searchBar">
			<table class="searchContent">
				<tr>
					<td>
						<label><fmt:message key="label.platform.location.id" /></label> 
						<input type="text" name="locationInfo.id" value="${locationInfo.id}"/> 
					</td>
					<td>	
						<label><fmt:message key="label.platform.location.name" /></label> 
						<input type="text" name="locationInfo.name" value="${locationInfo.name}"/> 
					</td>
					<td>	
						<label><fmt:message key="label.platform.location.category" /></label> 
						<input type="text" name="locationInfo.category" value="${locationInfo.category}"/> 
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
			<li><a class="add" target="dialog" width="800" height="350" rel="areaNav" href="${ctx}/location/prepareAdd.do"><span><fmt:message key="label.common.main.add" /></span></a></li>
			<li><a class="edit" target="dialog" width="800" height="350" rel="areaNav" href="${ctx}/location/prepareUpdate.do?id={id}" ><span><fmt:message key="label.common.main.edit" /></span></a></li> 
			<li class="line">line</li> 
			<li><a class="delete" target="ajaxTodo" rel="id" href="${ctx}/location/delete.do?id={id}" title="<fmt:message key="title.common.delete" />"><span><fmt:message key="label.common.main.delete" /></span></a></li>			
		</ul>
	</div>
	
	<table class="table" layoutH="138" width="100%">
		<thead>
			<tr> 			  
				<th width="50" align="right"><fmt:message key="label.common.main.serialno" /></th> 
				<th width="100" orderField="id"><fmt:message key="label.platform.location.id" /></th> 
				<th width="100" orderField="name"><fmt:message key="label.platform.location.name" /></th> 
				<th width="150" orderField="lngX"><fmt:message key="label.platform.location.lngX" /></th>
				<th width="150" orderField="latY"><fmt:message key="label.platform.location.latY" /></th>
				<th width="100" orderField="comCode"><fmt:message key="label.platform.user.comCode" /></th> 
				<th width="100" orderField="category"><fmt:message key="label.platform.location.category" /></th> 
				<th width="200" orderField="information"><fmt:message key="label.platform.location.information"/></th> 
				<th width="80"><fmt:message key="label.common.main.operate" /></th>
			</tr> 
		</thead>
		<tbody>
			<c:forEach items="${locationInfoList}" var="obj" varStatus="status">
				<tr target="id" rel="${obj.id}">
				<td>${status.index+1}</td>				  
				<td>${obj.id}</td> 
				<td>${obj.name}</td>
				<td>${obj.lngX}</td> 
				<td>${obj.latY}</td> 
				<td>${obj.prpAreaInfo.comCode}</td>
				<td>${obj.category}</td>
				<td>${obj.information}</td> 
				<td>
					<a title="View" target="dialog" width="800" href="${ctx}/location/view.do?id=${obj.id}" rel="viewUser${obj.id}" class="btnView">${(status.index+1)}</a> 
					<a title="Edit" target="dialog" width="800" href="${ctx}/location/prepareUpdate.do?id=${obj.id}" rel="editUser${obj.id}" class="btnEdit"><fmt:message key="label.common.main.edit" /></a>
					<a title="Delete" target="ajaxTodo" href="${ctx}/location/delete.do?id=${obj.id}" class="btnDel" title="<fmt:message key="title.common.delete" />"><fmt:message key="label.common.main.delete" /></a>
				</td>
			</tr>
			</c:forEach>		 
		</tbody>
	</table>
	
	<c:import url="/common/PaginationBar.jsp" charEncoding="UTF-8"></c:import>
	
</div>


