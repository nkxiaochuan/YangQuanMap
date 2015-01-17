<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<style type="text/css">  
html{height:100%}  
body{height:100%;margin:0px;padding:0px}  
#initMapDiv{height:100%}  
</style>
<body>
<div id="initMapDiv" class="navTab-panel tabsPageContent layoutBox"></div> 
<input id="lanX" type="hidden" value="${lanX}">
<input id="latY" type="hidden" value="${latY}">
</body>
<script type="text/javascript"> 
function init(){
	initDiv();
	if (typeof(map) == "undefined"){
	var map = new BMap.Map("initMapDiv");
	}
	map.enableScrollWheelZoom();
	map.enableContinuousZoom();
	map.addControl(new BMap.NavigationControl());
	map.addControl(new BMap.NavigationControl());    
	map.addControl(new BMap.ScaleControl());    
	map.addControl(new BMap.OverviewMapControl());    
	map.addControl(new BMap.MapTypeControl());    
	var lanX = document.getElementById("lanX").value;
	var latY = document.getElementById("latY").value;
	var point = new BMap.Point(lanX,latY);
	map.centerAndZoom(point, 15);
	getXYdata();
}

function initDiv(){
	alert(document.getElementById("initMapDiv").parentNode.parentNode.style.height);
	document.getElementById("initMapDiv").style.height = document.getElementById("initMapDiv").parentNode.parentNode.style.height;
	}
function getXYdata(){
	var n=0;
	$.ajax({
		   type: "POST",
		   url: "/sinoMap/sinoMapAction/getXYdata.do",
		   dataType:"json",
		   success: function(res){
			 for(var i = 0;i< res.data.length;i++){
				 GPStranslate(res.data[i]);
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

function GPStranslate(obj){
	var pt = new BMap.Point(obj.lngX,obj.latY);
    var msg = obj.userName + " " + obj.phoneNumber;
    var date = obj.updateTimehis;
    var isValid = obj.isValid;

    var marker = new BMap.Marker(pt);
	    map.addOverlay(marker);
	    var label = new BMap.Label(msg,{offset:new BMap.Size(-30,-20)});
	    label.setTitle("最后定位时间：" + date);
	    if(isValid=='0'){
	    	label.setStyle({backgroundColor:"#CCCCCC"});
	    }else{
	    	label.setStyle({color:"#9933FF",fontWeight:"bolder",backgroundColor:"#CCFF99"});
    	    }
	    marker.setLabel(label); //添加百度label
	    
}
</script>  
</html>