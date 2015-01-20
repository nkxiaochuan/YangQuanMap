<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>

<h2 class="contentTitle">
	<fmt:message key="label.platform.area.manage" />
</h2>
<div class="pageFormContent" layoutH="90">
	<dl>
		<dt>
			<fmt:message key="label.platform.user.comCode" />
		</dt>
		<dd>${prpAreaInfo.comCode}</dd>
	</dl>
	<dl>
		<dt>
			<fmt:message key="label.platform.user.comName" />
		</dt>
		<dd>${prpAreaInfo.comName}</dd>
	</dl>

	<div class="divider"></div>
	<dl>
		<dt>
			<fmt:message key="action.addressName" />
		</dt>
		<dd>${prpAreaInfo.addressName}</dd>
	</dl>
	<dl>
		<dt>
			<fmt:message key="action.postCode" />
		</dt>
		<dd>${prpAreaInfo.postCode}</dd>
	</dl>
	<dl>
		<dt>
			<fmt:message key="action.phoneNumber" />
		</dt>
		<dd>${prpAreaInfo.phoneNumber}</dd>
	</dl>
	<dl>
		<dt>
			<fmt:message key="action.faxNumber" />
		</dt>
		<dd>${prpAreaInfo.faxNumber}</dd>
	</dl>

	<dl>
		<dt>
			<fmt:message key="label.platform.user.info" />
		</dt>
		<dd>${prpAreaInfo.info}</dd>
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
