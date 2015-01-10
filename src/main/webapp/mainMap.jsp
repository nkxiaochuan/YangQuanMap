<div id="initMapDiv" class="navTab-panel tabsPageContent layoutBox" style='height: 476px;'></div> 
<input id="lanX" type="hidden" value="${lanX}">
<input id="latY" type="hidden" value="${latY}">
<script type="text/javascript"> 
var map = new BMap.Map("initMapDiv");          // 创建地图实例  
map.enableScrollWheelZoom();    //启用滚轮放大缩小，默认禁用
map.enableContinuousZoom();    //启用地图惯性拖拽，默认禁用
map.addControl(new BMap.NavigationControl());
map.addControl(new BMap.NavigationControl());    
map.addControl(new BMap.ScaleControl());    
map.addControl(new BMap.OverviewMapControl());    
map.addControl(new BMap.MapTypeControl());    
//var point = new BMap.Point(116.417854,39.921988);
var lanX = document.getElementById("lanX").value;
var latY = document.getElementById("latY").value;
var point = new BMap.Point(lanX,latY);
map.centerAndZoom(point, 15);

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
			    location.href="http://localhost:8001/sinoMap";
			  }
		   }
		});
}
window.load = getXYdata();

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
//定时刷新坐标
setInterval(function(){
	map.clearOverlays();
	getXYdata();
},20000);
</script>  
