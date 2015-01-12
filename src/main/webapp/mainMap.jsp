<%@ page contentType="text/html; charset=UTF-8"%>
<style type="text/css">  
html{height:100%}  
body{height:100%;margin:0px;padding:0px}  
#container{height:100%}  
</style>
<div id="initMapDiv" class="navTab-panel tabsPageContent layoutBox" style='height: 476px;'></div> 
<input id="lanX" type="hidden" value="${lanX}">
<input id="latY" type="hidden" value="${latY}">
<script type="text/javascript"> 
var map = new BMap.Map("initMapDiv");          // ´´½¨µØÍ¼ÊµÀý  
map.enableScrollWheelZoom();    //ÆôÓÃ¹öÂÖ·Å´óËõÐ¡£¬Ä¬ÈÏ½ûÓÃ
map.enableContinuousZoom();    //ÆôÓÃµØÍ¼¹ßÐÔÍÏ×§£¬Ä¬ÈÏ½ûÓÃ
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
			   alert("Ê§°Ü");
		   },
		   statusCode: {302: function() {
			    alert("µÇÂ¼³¬Ê±£¬ÇëÖØÐÂµÇÂ¼£¡");
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
	    label.setTitle("×îºó¶¨Î»Ê±¼ä£º" + date);
	    if(isValid=='0'){
	    	label.setStyle({backgroundColor:"#CCCCCC"});
	    }else{
	    	label.setStyle({color:"#9933FF",fontWeight:"bolder",backgroundColor:"#CCFF99"});
    	    }
	    marker.setLabel(label); //Ìí¼Ó°Ù¶Èlabel
	    
}
//¶¨Ê±Ë¢ÐÂ×ø±ê
setInterval(function(){
	map.clearOverlays();
	getXYdata();
},20000);
</script>  
