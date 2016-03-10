<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.prelude.epsilon.domain.User" %>
<!DOCTYPE html>
<html>
<head>
<title>Employee registration</title>
<link type="text/css" rel="stylesheet" href="../style/style-admin-main.css">
</head>
<body>
<div id="wrapper">
<!-- 	<div id="header">
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
	</aside> -->
	<section id="right">
		<div class="fm">
			<!-- <script type="text/javascript" src="http://form.jotform.us/jsform/50645109762153"></script>-->
			<h6>Add employee</h6>
			<form action = "vacationReq" method = "post">
				<div><input name="employeeId" type="hidden" value ="<% User user = (User)session.getAttribute("user"); user.getUser_ID();%>"></div>
				<div class="form-group"><span>Start date</span><span class="star">*</span><input name="startdate" type="datetime"></div>
				<div class="form-group"><span>End date</span><span class="star">*</span><input name="enddate" type="datetime"></div>
				<div class="form-group"><span>Manager</span><span class="star">*</span><input name="managerId" type="number"></div>
				<div class="form-group"><span>Number of Vacation Hours</span><span class="star">*</span><input name="days"type="number" readonly></div>
				<div class="form-group"><span>Reason</span><input name="reason" type="text"></div>
				
				<!-- Button (Double) -->
				<div class="form-group">
				  <div class="button-group">
				    <button id="btn-add" name="btn-add" class="addBtn">Submit</button>
				    <button id="btn-cancel" name="btn-cancel" class="addBtn">Cancel</button>
				  </div>
				</div>
			</form>
		</div>
	</section>

</div>
<%@include file="include-footer.jsp" %>
</body>
</html>