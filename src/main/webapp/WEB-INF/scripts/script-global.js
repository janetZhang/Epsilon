
$(document).ready(function(){
	/**
	 * Hide and show elements
	 */	
	$("#toggle").click(function(){
	    $(".logout").toggle();
	});
	/**
	 * Check the confirmed password
	 */
	$.validator.setDefaults({
	    submitHandler: function() {
	        $("#resetPswd").submit();
	    }
	});	
	$( "#resetPswd" ).validate({
		  rules: {
			newPswd2: {
		      equalTo: "#newPswd"
		    }
		  },
		  messages: {
			  newPswd2: {
				  equalTo: "Please enter the same password as above"
		        }
		   } 
		});
	
});

