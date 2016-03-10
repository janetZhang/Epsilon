/*
 * This files has the validation for the login form
 *
 * Revision History	:
 * Version		Created/Modified by			Date			Comments
 * 1.0			Suneetha Nagendra			03/11/2015		Created
 * 1.1			Suneetha Nagendra			03/11/2015		Used JQuery instead of Javascript	
 */
$(document).ready(function(){
	$("#email").focus();
    $(":submit").click(function(){
    	var email = $("#email").val();
		var password = $("#password").val();
		if ((password == "") || (password == null) ||
				(email == "") || (email == null)) {
			$('#error_msg').css('color','red');
			$('#error_msg').html('Please fill all fields...!!!!!!');
			return false;
		} else {
			return true;
		}
	});
});
