<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Employee reset password</title>
<link type="text/css" rel="stylesheet" href="../style/style-admin-main.css">
</head>
<body>
<div id="wrapper">
<%@include file="include-header.jsp" %>
	<aside id="left">
	<nav>
		<ul>
			<li><a href="#" class="clicked">Manage User</a></li>
			<li><a href="#" >Manage Vacation</a></li>
		</ul>
	</nav>
	</aside>
	<section id="right">
		<div class="fm">
		<!-- <script type="text/javascript" src="http://form.jotform.us/jsform/50645109762153"></script>-->
		<h6>Reset password</h6>
		<form>
		<div class="form-group"><span>Old password</span><span class="star">*</span><input name="password" type="text"></div>
		<div class="form-group"><span>New password</span><span class="star">*</span><input name="newPswd" type="text"></div>
		<div class="form-group"><span>Confirm new password</span><span class="star">*</span><input name="newPswd2" type="text"></div>
		
		<!-- Button  -->
		<div class="form-group">
		  <label class="control-label" for="button1id">Double Button</label>
		  <div class="button-group">
		    <button id="btn-add" name="btn-add" class="addBtn">Submit</button>
		    <button id="btn-cancel" name="btn-cancel" class="addBtn">Cancel</button>
		  </div>
		</div>
		</form>
		</div>
	</section>
	<footer>
	
	</footer>
</div>
</body>
</html>