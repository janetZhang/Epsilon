<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<!--  This files has the validation for the login form -->
<!--  Revision History	: -->
<!--  Version		Created/Modified by			Date			Comments -->
<!--  1.0			Suneetha Nagendra			03/11/2015		Created -->
<!--  1.1			Suneetha Nagendra			03/11/2015		Added Revision history	 -->
<!--  1.2			Suneetha Nagendra			03/13/2015		Change file jsp	 -->
 
<html>
<head>
	<title> Epsilon Login </title>
	<c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>
	<link type="text/css" rel="stylesheet" href="${path}/style/style-login.css">
	<script src="../scripts/jquery-1.11.2.js"></script>
	<script type="text/javascript" src="../scripts/script-login.js"></script>
</head>

<body>
	<%@include file="LoginHeader.jsp" %>
<!-- 	<section class="header_section"> </section> -->
	<br> <br>
	<div>	
 	<form  class = "form_border" action="login" method="post">
		<div class = "app_name"> EPSILON </div><br>
		<div class = "field_name"> 
			Email ID &nbsp : <input type = "email" required placeholder = "Email ID" name = "email">
			<br> <br>
			Password&nbsp: <input type = "password" required placeholder = "Password" name = "password">
			<br> <br>
			<input class = "continue" type = "submit" value = "Continue" onclick = "return validate()">
		</div> <br>	
		<a class = "forgot_pwd" href = "password.jsp"> Password Help? </a>
		<div class = "error_msg" id ="error_msg"> </div>
	</form>
	</div>
	<%@include file="Footer.jsp" %>
</body>
</html>
