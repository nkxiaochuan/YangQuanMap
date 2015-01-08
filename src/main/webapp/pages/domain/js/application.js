//应用管理模块  begin
function editAPP(opt,id){
	if(opt == 'forbid'){
		 alertMsg.confirm("你确定要禁用此应用吗？", {
       	 okCall: function(){
	        	ajaxTodo("/mobileplat/application/forbid.do?applicationId=" + id,function callback(res){
					DWZ.ajaxDone(res);
					if(res.statusCode =="200"){
						alertMsg.correct("操作成功！");
						document.getElementById('stateId').innerText = '无效';
					}else{
						alertMsg.error("程序处理异常！");
					}
				});
			}
		});
    }
	if(opt == 'effect'){
		 alertMsg.confirm("你确定要使此应用生效吗？", {
      	 okCall: function(){
	        	ajaxTodo("/mobileplat/application/effect.do?applicationId=" + id,function callback(res){
					DWZ.ajaxDone(res);
					if(res.statusCode =="200"){
						alertMsg.correct("操作成功！");
						document.getElementById('stateId').innerText = '有效';
					}else{
						alertMsg.error("程序处理异常！");
					}
				});
			}
		});
   }
	if(opt == 'delete'){
		 alertMsg.confirm("你确定要删除此应用吗？", {
      	 okCall: function(){
	        	ajaxTodo("/mobileplat/application/delete.do?applicationId=" + id,function callback(res){
					DWZ.ajaxDone(res);
					if(res.statusCode =="200"){
						alertMsg.correct("操作成功！");
						document.getElementById('stateId').innerText = '已删除';
					}else{
						alertMsg.error("程序处理异常！");
					}
				});
			}
		});
   }
}

function editVersion(opt,appId,versionId,stateId){
	alertMsg.confirm("你确定要执行此操作吗？", {
     	 okCall: function(){
	        	ajaxTodo("/mobileplat/application/editVersion.do?editType=" + opt + "&&applicationId=" + appId +"&&versionId=" + versionId,function callback(res){
					DWZ.ajaxDone(res);
					if(res.statusCode =="200"){
						alertMsg.correct("操作成功！");
						if(opt == 'invalid'){
							document.getElementById(stateId).innerText = '无效';
						}else if(opt == 'valid'){
							document.getElementById(stateId).innerText = '有效';
						}else if(opt == 'delete'){
							document.getElementById(stateId).innerText = '已删除';
						}
					}else{
						alertMsg.error("程序处理异常！");
					}
				});
			}
		});
}

//设备绑定模块 begin

function selectUserInfo(id , name){
	var o = $("#boundUserId");
	for(var i=1;i < o.children().length;i++){
		if(o.children()[i].all[0].id == id){
			 alertMsg.error("用户     " + name + "   已经选择，请确认！");
			 return false;
		}
	}
	$("#boundUserId").append('<span><input id=' + id + ' type="checkbox" name="adsf" onclick="cancelSelect(this);" checked="checked"/>' + name + '</span>');
}

function selectAppInfo(id , name){
	var o = $("#boundAppId");
	for(var i=1;i < o.children().length;i++){
		if(o.children()[i].all[0].id == id){
			 alertMsg.error("应用     " + name + "   已经选择，请确认！");
			 return false;
		}
	}
	$("#boundAppId").append('<span><input id=' + id + ' type="checkbox" name="adsf" onclick="cancelSelect(this);" checked="checked"/>' + name + '</span>');
}
function cancelSelect(obj){
	if(!obj.checked){
		var oo = obj.parentNode;
		oo.removeNode(true);
	}
}

function saveBoundInfo(obj){
	//获取应用绑定信息
	var apps = $("#boundAppId");
	var appIds = "";
	for(var i=1;i < apps.children().length;i++){
		appIds = appIds + apps.children()[i].all[0].id + ",";
	}
	//获取用户绑定信息
	var users = $("#boundUserId");
	var userIds = "";
	for(var i=1;i < users.children().length;i++){
		userIds = userIds + users.children()[i].all[0].id + ",";
	}
	//获取当前绑定设备IMEI
	var imei = document.getElementById("deviceImeiID").value;
	ajaxTodo("/mobileplat/device/saveBoundInfo.do?deviceImei="+ imei + "&&userIds=" + userIds + "&&appIds=" + appIds,function callback(res){
		DWZ.ajaxDone(res);
		if(res.statusCode =="200"){
			alertMsg.correct("保存成功！");
		}else{
			alertMsg.error("程序处理异常！");
		}
	});
}