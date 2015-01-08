/**
 * DWZ国际化
 */
(function($){
	// jQuery validate
	$.extend($.validator.messages, {
		required: "必填欄位",
		remote: "請修正該欄位",
		email: "請輸入正確格式的電子郵件",
		url: "請輸入合法的網址",
		date: "請輸入合法的日期",
		dateISO: "請輸入合法的日期 (ISO).",
		number: "請輸入合法的數位",
		digits: "只能輸入整數",
		creditcard: "請輸入合法的信用卡號",
		equalTo: "請再次輸入相同的值",
		accept: "請輸入擁有合法尾碼名的字串",
		maxlength: $.validator.format("長度最多是 {0} 的字串"),
		minlength: $.validator.format("長度最少是 {0} 的字串"),
		rangelength: $.validator.format("長度介於 {0} 和 {1} 之間的字串"),
		range: $.validator.format("請輸入一個介於 {0} 和 {1} 之間的值"),
		max: $.validator.format("請輸入一個最大為 {0} 的值"),
		min: $.validator.format("請輸入一個最小為 {0} 的值"),
		
		alphanumeric: "字母、數位、底線",
		lettersonly: "必須是字母",
		phone: "數字、空格、括弧"
	});
	
	// DWZ regional
	$.setRegional("datepicker", {
		dayNames: ['日', '壹', '二', '三', '四', '五', '六'],
		monthNames: ['壹月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月', '十月', '十一月', '十二月']
	});
	$.setRegional("alertMsg", {
		title:{error:"錯誤", info:"提示", warn:"警告", correct:"成功", confirm:"確認提示"},
		butMsg:{ok:"確定", yes:"是", no:"否", cancel:"取消"}
	});
})(jQuery);
