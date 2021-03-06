<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<title>Employee dashboard</title>
<c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>
<link type="text/css" rel="stylesheet" href="${path}/style/style-admin-main.css">

</head>
<body>
<div id="wrapper">
<%@include file="include-header.jsp" %>
	<%@include file="include-left.jsp" %>
	<section id="right">
		<div>
			 <button id="btn-add" name="btn-add" class="addBtn  add-user">Add user</button>
			 <form action="searchUser.do" method="post">
			 <input type="text" value="" name ="firstName"placeholder="Find by name">
			 <input type="submit"  class="search" value=" ">
			 </form>
		</div>
		<div class="fm">
		<h6>Add employee</h6>
		<form>
		<div class="form-group"><span>First Name</span><span class="star">*</span><input name="firstName" type="text"></div>
		<div class="form-group"><span>Last Name</span><span class="star">*</span><input name="lastName" type="text"></div>
		<div class="form-group"><span>Password</span><span class="star">*</span><input name="password" type="password"></div>
		<div class="form-group"><span>Confirm Password</span><span class="star">*</span><input name="password2"type="password"></div>
		<div class="form-group"><span>E-mail</span><span class="star">*</span><input name="email" type="text"></div>
		<div class="form-group"><span>Date of Joining</span><span class="star">*</span><input name="doj"type="text"></div>
		<div class="form-group"><span>Date of Birth</span><input name="dob" type="text"></div>
		<div class="form-group"><span>Contact Number</span><input name="phoneNum" type="text"></div>
		<div class="form-group"><span>Address</span><input name="address" type="text"></div>
		<div class="form-group"><span>Role</span>   
		       <select class="form-dropdown" style="width:150px" id="role" name="q16_role16">
		            <option value="">  </option>
		            <option value="1"> Assign later </option>
		            <option value="2"> Manager </option>
		            <option value="3"> Employee </option>
		          </select>
		</div>
		<div class="form-group"><span>Manager</span>   
		       <select class="form-dropdown" style="width:150px" id="manager" name="q16_role16">
		            <option value="">  </option>
		            <option value="Assign later">name1  </option>
		            <option value="Manager"> name2 </option>
		            <option value="Employee">name3 </option>
		          </select>
		</div>
		<div class="form-group"><span>Designation</span><input name="designation" type="text"></div>
		<div class="form-group">
		<span>Status</span><input  type="radio" id="activated" name="status" value="1" checked="checked"><label for="activated" > Activated </label>
		<input type="radio" id="inactivated" name="status" value="2"><label for="inactivated"> Inactivated </label>
		</div>
		
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
</div>
<%@include file="include-footer.jsp" %>
</body>
</html>