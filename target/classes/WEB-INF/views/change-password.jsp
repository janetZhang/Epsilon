<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!doctype html>
<html>
<head>
<title>Employee reset password</title>
<c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>
<link type="text/css" rel="stylesheet" href="${path}/style/style-admin-main.css">
</head>


<body>
<div id="wrapper">
<%@include file="include-header.jsp" %>
	<%@include file="include-left.jsp" %>
<script src="http://jqueryvalidation.org/files/dist/jquery.validate.min.js"></script>
<script src="http://jqueryvalidation.org/files/dist/additional-methods.min.js"></script>	
	<section id="right">
		<div class="fm"> 
		<h6>Reset password: <span class="error">${message}</span></h6>
		<form id="resetPswd" action="resetPassword.do" method="post" >
		<input type="hidden" value="${userId}" name="userId">
		<div class="form-group"><label for="password">Old password</label><span class="star">*</span><input required name="password" type="password"></div>
		<div class="form-group"><label for="newPswd">New password</label><span class="star">*</span><input required name="newPswd" id="newPswd" type="password"></div>
		<div class="form-group"><label for="newPswd2">Confirm new password</label><span class="star">*</span><input required name="newPswd2"  id="newPswd2" type="password"></div>
		
		<!-- Button  -->
		<div class="form-group">
		  <div class="button-group">
		    <button id="btn-add" type="submit" name="btn-add" class="addBtn" value="Submit">Submit</button>
		    <button type="reset" id="btn-cancel" name="btn-cancel" class="addBtn">Reset</button>
		  </div>
		</div>
		</form>
		</div>
	</section>
</div>
<%@include file="include-footer.jsp" %>
</body>
</html>