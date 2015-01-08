/**
 * DWZ国际化
 */
(function($){
	// jQuery validate
	$.extend($.validator.messages, {
		required: "Required field",
		remote: "Please correct the field",
		email: "Please enter the correct format of e-mail",
		url: "Please enter a valid URL",
		date: "Please enter a valid date",
		dateISO: "Please enter a valid date (ISO).",
		number: "Please enter valid numbers",
		digits: "Only integer is allowed",
		creditcard: "Please enter a valid credit card number",
		equalTo: "Please re-enter the same value",
		accept: "Please enter the string which has a legitimate extension",
		maxlength: $.validator.format("Up {0} string"),
		minlength: $.validator.format("A minimum length of the string {0}"),
		rangelength: $.validator.format("Length of the string between the {0} and {1}"),
		range: $.validator.format("Please enter a number whose value between {0} and {1}"),
		max: $.validator.format("Please enter a maximum of {0} value"),
		min: $.validator.format("Please enter a minimum of {0} value"),
		
		alphanumeric: "letter, numbers, underscores",
		lettersonly: "Must be a letter",
		phone: "Numbers, spaces, brackets"
	});
	
	// DWZ regional
	$.setRegional("datepicker", {
		dayNames: ['Sun.', 'Mon.', 'Tues.', 'Wed.', 'Thurs.', 'Fri.', 'Sat.'],
		monthNames: ['January ',' February ',' March ',' April ',' May ',' June ',' July ',' August ',' September ',' October ',' tenJanuary ',' December ']
	});
	$.setRegional("alertMsg", {
		title:{error:"Error", info:"Prompt", warn:"Warn", correct:"Success", confirm:"Confirm prompt"},
		butMsg:{ok:"Ok", yes:"Yes", no:"No", cancel:"Cancle"}
	});
})(jQuery);