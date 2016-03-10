<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Employee registration</title>
<link type="text/css" rel="stylesheet" href="../style/style-admin-main.css">
</head>
<body>
<div id="wrapper">
	<div id="header">
		<h1>Epsilon</h1>
		<div  class="welcome"><span>Welcome <a href="#" >Admin</a>!</span></div>
		<div class="bar">
		<span  class="home">home</span>
		<ul class="logout" >
			<li><a href="#">Log out</a></li>
			<li><a href="#">Reset password</a></li>
		</ul>
		</div>
	</div>
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
		<h6>Add employee</h6>
		<form>
		<div class="form-group"><span>Employee Id</span><span class="star">*</span><input name="employId" type="text"></div>
		<div class="form-group"><span>Request Id</span><span class="star">*</span><input name="requestId" type="text"></div>
		<div class="form-group"><span>Start date</span><span class="star">*</span><input name="startdate" type="text"></div>
		<div class="form-group"><span>End date</span><span class="star">*</span><input name="endDate" type="password"></div>
		<div class="form-group"><span>Manager</span><span class="star">*</span><input name="manager" type="text"></div>
		<div class="form-group"><span>Leave Days</span><span class="star">*</span><input name="days"type="text"></div>
		<div class="form-group"><span>Reason</span><input name="reason" type="text"></div>
		
		<!-- Button (Double) -->
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