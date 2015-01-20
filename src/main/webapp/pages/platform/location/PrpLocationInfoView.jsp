<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>

<h2 class="contentTitle">
	<fmt:message key="label.platform.location.manage" />
</h2>
<div class="pageFormContent" layoutH="90">
	<dl>
		<dt>
			<fmt:message key="label.platform.location.id" />
		</dt>
		<dd>${locationInfo.id}</dd>
	</dl>
	<dl>
		<dt>
			<fmt:message key="label.platform.location.name" />
		</dt>
		<dd>${locationInfo.name}</dd>
	</dl>

	<div class="divider"></div>
	<dl>
		<dt>
			<fmt:message key="label.platform.location.lngX" />
		</dt>
		<dd>${locationInfo.lngX}</dd>
	</dl>
	<dl>
		<dt>
			<fmt:message key="label.platform.location.latY" />
		</dt>
		<dd>${locationInfo.latY}</dd>
	</dl>
	<dl>
		<dt>
			<fmt:message key="label.platform.user.comCode" />
		</dt>
		<dd>${locationInfo.prpAreaInfo.comCode}</dd>
	</dl>
	<dl>
		<dt>
			<fmt:message key="label.platform.location.category" />
		</dt>
		<dd>${locationInfo.category}</dd>
	</dl>

	<dl>
		<dt>
			<fmt:message key="label.platform.location.information" />
		</dt>
		<dd>${locationInfo.information}</dd>
	</dl>
	<dl>
		<dt>
			<fmt:message key="label.platform.user.validstatus" />
		</dt>
		<dd>
			<c:choose>
				<c:when test="${plocationInfo.validStatus == '1'}">
					 <fmt:message key="page.valid.one"/> 
				</c:when>
				<c:otherwise>
					 <fmt:message key="page.valid.zero"/> 
				</c:otherwise>
			</c:choose>
		</dd>
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
