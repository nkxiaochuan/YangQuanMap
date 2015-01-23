<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<style type="text/css">  
html{height:100%}  
body{height:100%;margin:0px;padding:0px}  
#initMapDiv{height:100%}  
</style>
<body>
<div id="initMapDiv" class="navTab-panel tabsPageContent layoutBox"></div> 
<input id="comCode" type="hidden" value="${comCode}">
</body>
<script type="text/javascript"> 
initDiv();
var map = new BMap.Map("initMapDiv");
map.enableScrollWheelZoom();
map.enableContinuousZoom();
map.addControl(new BMap.NavigationControl());
map.addControl(new BMap.NavigationControl());    
map.addControl(new BMap.ScaleControl());    
map.addControl(new BMap.OverviewMapControl());    
map.addControl(new BMap.MapTypeControl());
var point = new BMap.Point(112.552291,37.882973);
map.centerAndZoom(point, 15);
function init(){
	getXYdata();
}
function addClickHandler(head,content,marker){
	 marker.addEventListener("click",function(e){
			openInfo(head,content,e)}
		);
}
function openInfo(head,content,e){
	 var p = e.target;
		var point = new BMap.Point(p.getPosition().lng, p.getPosition().lat);
		var searchInfoWindow = new BMapLib.SearchInfoWindow(map, content, {
			title: head, //标题
			width: 220, //宽度
			height: 0, //高度
			panel : "panel", //检索结果面板
			enableAutoPan : true, //自动平移
			offset :new BMap.Size(-30,22),
			enableSendToPhone: false, //是否显示发送到手机按钮
			searchTypes :[
			]
		});
		searchInfoWindow.open(point); //开启信息窗口
}
function initDiv(){
	document.getElementById("initMapDiv").style.height = document.getElementById("initMapDiv").parentNode.parentNode.style.height;
	}
function getXYdata(){
	var n=0;
	var comCode = document.getElementById("comCode").value;
	$.ajax({
		   type: "POST",
		   url: "${ctx}/sinoMapAction/getXYdata.do",
		   dataType:"json",
		   data:"comCode="+comCode,
		   success: function(res){
			   if(res.data.length ==0){
				   //
			   }else{
				   var point = new BMap.Point(res.data[0].lngX,res.data[0].latY);
				  // setTimeout(function(){
						map.panTo(point);   //两秒后移动
					//}, 2000);
				 for(var i = 0;i< res.data.length;i++){
					var pt = new BMap.Point(res.data[i].lngX,res.data[i].latY);
				    var msg = "名称：" + res.data[i].name + "<br/> 类别：" + res.data[i].category + "<br/>简介： " + res.data[i].information;
				    var marker = new BMap.Marker(pt);
					map.addOverlay(marker);

					var content = '<div style="margin:0;line-height:20px;padding:2px;">' +
                    '类别：'+res.data[i].category+'<br/>简介：'+ res.data[i].information +
                  '</div>';
					addClickHandler(res.data[i].name,content,marker);
				 }
				
			   }
		   },
		   failure: function(res){
			   alert("失败");
		   },
		   statusCode: {302: function() {
			    alert("登录超时，请重新登录！");
			    location.href="/sinoMap";
			  }
		   }
		   
		});
}
window.load = init();

</script>  
</html>