
var PageName = '首页';
var PageId = '155b9cb265f9459aba117689f366ddaf'
var PageUrl = '首页.html'
document.title = '首页';
var PageNotes = 
{
"pageName":"首页",
"showNotesNames":"False"}
var $OnLoadVariable = '';

var $AA = '';

var $BB = '';

var $CC = '';

var $CSUM;

var hasQuery = false;
var query = window.location.hash.substring(1);
if (query.length > 0) hasQuery = true;
var vars = query.split("&");
for (var i = 0; i < vars.length; i++) {
    var pair = vars[i].split("=");
    if (pair[0].length > 0) eval("$" + pair[0] + " = decodeURIComponent(pair[1]);");
} 

if (hasQuery && $CSUM != 1) {
alert('Prototype Warning: The variable values were too long to pass to this page.\nIf you are using IE, using Firefox will support more data.');
}

function GetQuerystring() {
    return '#OnLoadVariable=' + encodeURIComponent($OnLoadVariable) + '&AA=' + encodeURIComponent($AA) + '&BB=' + encodeURIComponent($BB) + '&CC=' + encodeURIComponent($CC) + '&CSUM=1';
}

function PopulateVariables(value) {
    var d = new Date();
  value = value.replace(/\[\[OnLoadVariable\]\]/g, $OnLoadVariable);
  value = value.replace(/\[\[AA\]\]/g, $AA);
  value = value.replace(/\[\[BB\]\]/g, $BB);
  value = value.replace(/\[\[CC\]\]/g, $CC);
  value = value.replace(/\[\[PageName\]\]/g, PageName);
  value = value.replace(/\[\[GenDay\]\]/g, '18');
  value = value.replace(/\[\[GenMonth\]\]/g, '8');
  value = value.replace(/\[\[GenMonthName\]\]/g, '八月');
  value = value.replace(/\[\[GenDayOfWeek\]\]/g, '星期六');
  value = value.replace(/\[\[GenYear\]\]/g, '2012');
  value = value.replace(/\[\[Day\]\]/g, d.getDate());
  value = value.replace(/\[\[Month\]\]/g, d.getMonth() + 1);
  value = value.replace(/\[\[MonthName\]\]/g, GetMonthString(d.getMonth()));
  value = value.replace(/\[\[DayOfWeek\]\]/g, GetDayString(d.getDay()));
  value = value.replace(/\[\[Year\]\]/g, d.getFullYear());
  return value;
}

function OnLoad(e) {

}

var u21 = document.getElementById('u21');

var u51 = document.getElementById('u51');
gv_vAlignTable['u51'] = 'center';
var u25 = document.getElementById('u25');
gv_vAlignTable['u25'] = 'center';
var u16 = document.getElementById('u16');
gv_vAlignTable['u16'] = 'center';
var u55 = document.getElementById('u55');

var u46 = document.getElementById('u46');
gv_vAlignTable['u46'] = 'center';
var u31 = document.getElementById('u31');
gv_vAlignTable['u31'] = 'center';
var u38 = document.getElementById('u38');
gv_vAlignTable['u38'] = 'center';
var u8 = document.getElementById('u8');

var u32 = document.getElementById('u32');

var u23 = document.getElementById('u23');

u23.style.cursor = 'pointer';
if (bIE) u23.attachEvent("onclick", Clicku23);
else u23.addEventListener("click", Clicku23, true);
function Clicku23(e)
{
windowEvent = e;


if (true) {

	self.location.href="操作日志查询.html" + GetQuerystring();

}

}

if (bIE) u23.attachEvent("onmouseout", MouseOutu23);
else u23.addEventListener("mouseout", MouseOutu23, true);
function MouseOutu23(e)
{
windowEvent = e;

if (!IsTrueMouseOut('u23',e)) return;
if (true) {

	SetPanelState('u18', 'pd0u18','none','',500,'none','',500);

}

}
gv_vAlignTable['u23'] = 'top';
var u62 = document.getElementById('u62');

var u53 = document.getElementById('u53');
gv_vAlignTable['u53'] = 'center';
var u1 = document.getElementById('u1');
gv_vAlignTable['u1'] = 'center';
var u27 = document.getElementById('u27');
gv_vAlignTable['u27'] = 'center';
var u7 = document.getElementById('u7');

var u66 = document.getElementById('u66');
gv_vAlignTable['u66'] = 'top';
var u30 = document.getElementById('u30');

var u60 = document.getElementById('u60');
gv_vAlignTable['u60'] = 'center';
var u34 = document.getElementById('u34');

u34.style.cursor = 'pointer';
if (bIE) u34.attachEvent("onclick", Clicku34);
else u34.addEventListener("click", Clicku34, true);
function Clicku34(e)
{
windowEvent = e;


if (true) {

	self.location.href="终端安全绑定.html" + GetQuerystring();

}

}

if (bIE) u34.attachEvent("onmouseout", MouseOutu34);
else u34.addEventListener("mouseout", MouseOutu34, true);
function MouseOutu34(e)
{
windowEvent = e;

if (!IsTrueMouseOut('u34',e)) return;
if (true) {

	SetPanelState('u29', 'pd0u29','none','',500,'none','',500);

}

}
gv_vAlignTable['u34'] = 'top';
var u17 = document.getElementById('u17');

if (bIE) u17.attachEvent("onmouseover", MouseOveru17);
else u17.addEventListener("mouseover", MouseOveru17, true);
function MouseOveru17(e)
{
windowEvent = e;

if (!IsTrueMouseOver('u17',e)) return;
if (true) {

	SetPanelState('u7', 'pd1u7','none','',500,'none','',500);

}

}
gv_vAlignTable['u17'] = 'top';
var u64 = document.getElementById('u64');
gv_vAlignTable['u64'] = 'top';
var u19 = document.getElementById('u19');

var u49 = document.getElementById('u49');

if (bIE) u49.attachEvent("onmouseover", MouseOveru49);
else u49.addEventListener("mouseover", MouseOveru49, true);
function MouseOveru49(e)
{
windowEvent = e;

if (!IsTrueMouseOver('u49',e)) return;
if (true) {

	SetPanelState('u40', 'pd1u40','none','',500,'none','',500);

}

}
gv_vAlignTable['u49'] = 'top';
var u11 = document.getElementById('u11');
gv_vAlignTable['u11'] = 'center';
var u41 = document.getElementById('u41');

u41.style.cursor = 'pointer';
if (bIE) u41.attachEvent("onclick", Clicku41);
else u41.addEventListener("click", Clicku41, true);
function Clicku41(e)
{
windowEvent = e;


if (true) {

	self.location.href="人员管理.html" + GetQuerystring();

}

}

if (bIE) u41.attachEvent("onmouseout", MouseOutu41);
else u41.addEventListener("mouseout", MouseOutu41, true);
function MouseOutu41(e)
{
windowEvent = e;

if (!IsTrueMouseOut('u41',e)) return;
if (true) {

	SetPanelState('u40', 'pd0u40','none','',500,'none','',500);

}

}

var u15 = document.getElementById('u15');

var u45 = document.getElementById('u45');

var u36 = document.getElementById('u36');
gv_vAlignTable['u36'] = 'center';
var u58 = document.getElementById('u58');
gv_vAlignTable['u58'] = 'center';
var u37 = document.getElementById('u37');

var u2 = document.getElementById('u2');

var u22 = document.getElementById('u22');
gv_vAlignTable['u22'] = 'center';
var u13 = document.getElementById('u13');

var u52 = document.getElementById('u52');

var u43 = document.getElementById('u43');

var u0 = document.getElementById('u0');

var u3 = document.getElementById('u3');
gv_vAlignTable['u3'] = 'center';
var u47 = document.getElementById('u47');

var u20 = document.getElementById('u20');
gv_vAlignTable['u20'] = 'center';
var u50 = document.getElementById('u50');

var u28 = document.getElementById('u28');

if (bIE) u28.attachEvent("onmouseover", MouseOveru28);
else u28.addEventListener("mouseover", MouseOveru28, true);
function MouseOveru28(e)
{
windowEvent = e;

if (!IsTrueMouseOver('u28',e)) return;
if (true) {

	SetPanelState('u18', 'pd1u18','none','',500,'none','',500);

}

}
gv_vAlignTable['u28'] = 'top';
var u24 = document.getElementById('u24');

var u54 = document.getElementById('u54');
gv_vAlignTable['u54'] = 'top';
var u39 = document.getElementById('u39');

if (bIE) u39.attachEvent("onmouseover", MouseOveru39);
else u39.addEventListener("mouseover", MouseOveru39, true);
function MouseOveru39(e)
{
windowEvent = e;

if (!IsTrueMouseOver('u39',e)) return;
if (true) {

	SetPanelState('u29', 'pd1u29','none','',500,'none','',500);

}

}
gv_vAlignTable['u39'] = 'top';
var u4 = document.getElementById('u4');

var u6 = document.getElementById('u6');
gv_vAlignTable['u6'] = 'top';
var u61 = document.getElementById('u61');

var u35 = document.getElementById('u35');

var u26 = document.getElementById('u26');

var u65 = document.getElementById('u65');

var u56 = document.getElementById('u56');
gv_vAlignTable['u56'] = 'center';
var u5 = document.getElementById('u5');
gv_vAlignTable['u5'] = 'center';
var u12 = document.getElementById('u12');

u12.style.cursor = 'pointer';
if (bIE) u12.attachEvent("onclick", Clicku12);
else u12.addEventListener("click", Clicku12, true);
function Clicku12(e)
{
windowEvent = e;


if (true) {

	self.location.href="考勤记录查询.html" + GetQuerystring();

}

}

if (bIE) u12.attachEvent("onmouseout", MouseOutu12);
else u12.addEventListener("mouseout", MouseOutu12, true);
function MouseOutu12(e)
{
windowEvent = e;

if (!IsTrueMouseOut('u12',e)) return;
if (true) {

	SetPanelState('u7', 'pd0u7','none','',500,'none','',500);

}

}
gv_vAlignTable['u12'] = 'top';
var u9 = document.getElementById('u9');
gv_vAlignTable['u9'] = 'center';
var u42 = document.getElementById('u42');
gv_vAlignTable['u42'] = 'center';
var u33 = document.getElementById('u33');
gv_vAlignTable['u33'] = 'center';
var u63 = document.getElementById('u63');
gv_vAlignTable['u63'] = 'center';
var u18 = document.getElementById('u18');

var u48 = document.getElementById('u48');
gv_vAlignTable['u48'] = 'center';
var u67 = document.getElementById('u67');
gv_vAlignTable['u67'] = 'top';
var u57 = document.getElementById('u57');

var u10 = document.getElementById('u10');

var u40 = document.getElementById('u40');

var u14 = document.getElementById('u14');
gv_vAlignTable['u14'] = 'center';
var u44 = document.getElementById('u44');
gv_vAlignTable['u44'] = 'center';
var u29 = document.getElementById('u29');

var u59 = document.getElementById('u59');

if (window.OnLoad) OnLoad();
