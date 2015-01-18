<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
 
<%-- 注意：form的id需要设置为pagerForm，需要pageNo至orderDirection等4个参数为框架所需 --%>
<form id="pagerForm" method="post" action="${ctx }/area/query.do" onsubmit="return navTabSearch(this)">
	<input type="hidden" name="pageNo" value="1" />
	<input type="hidden" name="pageSize" value="${pageSize}" /> 
	<input type="hidden" name="orderField" value="${param.orderField}" />
	<input type="hidden" name="orderDirection" value="${param.orderDirection}" />
	<div class="pageHeader">
		<div class="searchBar">
			<table class="searchContent">
				<tr>
					<td>
						<label><fmt:message key="label.platform.user.comCode" /></label> 
						<input type="text" name="prpAreaInfo.comCode" value="${prpAreaInfo.comCode}"/> 
					</td>
					<td>	
						<label><fmt:message key="label.platform.user.comName" /></label> 
						<input type="text" name="prpAreaInfo.comName" value="${prpAreaInfo.comName}"/> 
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
			<li><a class="add" target="dialog" width="800" rel="areaNav" href="${ctx}/area/prepareAdd.do"><span><fmt:message key="label.common.main.add" /></span></a></li>
			<li><a class="edit" target="dialog" width="800" rel="areaNav" href="${ctx}/area/prepareUpdate.do?comCode={comCode}" ><span><fmt:message key="label.common.main.edit" /></span></a></li> 
			<li class="line">line</li> 
			<li><a class="delete" target="ajaxTodo" rel="comCode" href="${ctx}/area/delete.do?comCode={comCode}" title="<fmt:message key="title.common.delete" />"><span><fmt:message key="label.common.main.delete" /></span></a></li>			
		</ul>
	</div>
	
	<table class="table" layoutH="138" width="100%">
		<thead>
			<tr> 			  
				<th width="50" align="right"><fmt:message key="label.common.main.serialno" /></th> 
				<th width="150" orderField="comCode"><fmt:message key="label.platform.user.comCode" /></th> 
				<th width="150" orderField="comName"><fmt:message key="label.platform.user.comName" /></th> 
				<th width="150" orderField="addressName"><fmt:message key="action.addressName" /></th> 
				<th width="150" orderField="postCode"><fmt:message key="action.postCode" /></th> 
				<th width="150" orderField="info"><fmt:message key="label.platform.user.info" /></th> 
				<th width="80"><fmt:message key="label.common.main.operate" /></th>
			</tr> 
		</thead>
		<tbody>
			<c:forEach items="${prpAreaInfoList}" var="obj" varStatus="status">
				<tr target="comCode" rel="${obj.comCode}">
				<td>${status.index+1}</td>				  
				<td>${obj.comCode}</td> 
				<td>${obj.comName }</td>
				<td>${obj.addressName }</td> 
				<td>${obj.postCode }</td> 
				<td>${obj.info}</td> 
				<td>
					<a title="View" target="dialog" width="800" href="${ctx}/area/view.do?comCode=${obj.comCode}" rel="viewUser${obj.comCode}" class="btnView">${(status.index+1)}</a> 
					<a title="Edit" target="dialog" width="800" href="${ctx}/area/prepareUpdate.do?comCode=${obj.comCode}" rel="editUser${obj.comCode}" class="btnEdit"><fmt:message key="label.common.main.edit" /></a>
					<a title="Delete" target="ajaxTodo" href="${ctx}/area/delete.do?comCode=${obj.comCode}" class="btnDel" title="<fmt:message key="title.common.delete" />"><fmt:message key="label.common.main.delete" /></a>
				</td>
			</tr>
			</c:forEach>		 
		</tbody>
	</table>
	
	<c:import url="/common/PaginationBar.jsp" charEncoding="UTF-8"></c:import>
	
</div>


