<%--
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
 --%>
<%-- 分页组件，需要Action中存在totalCount及对应getter/setter方法，并在使用前赋值 --%>
<div class="panelBar">
	<div class="pages">
		<span><fmt:message key="label.common.pagination.perpage" /></span> 
		<select name="pageSize" onchange="navTabPageBreak({numPerPage:this.value})">
			<c:forEach begin="5" end="40" step="5" varStatus="s">
				<option value="${s.index}" ${pageSize eq s.index ? 'selected="selected"' : ''}>${s.index}</option>
			</c:forEach>
		</select> 
		<span><fmt:message key="label.common.pagination.records" />&nbsp;,&nbsp;</span>
		<span><fmt:message key="label.common.pagination.total" />&nbsp;${totalCount}&nbsp; </span>
		<span><fmt:message key="label.common.pagination.records" /> </span>
	</div>

	<div class="pagination" targetType="navTab" totalCount="${totalCount}" numPerPage="${pageSize}" pageNumShown="10" currentPage="${param.pageNo}"></div>
</div> 

<script type="text/javascript">
   function check(){
      if(subthisform()){
         navTabPageBreak({numPerPage:this.value});
      }
   }
</script>