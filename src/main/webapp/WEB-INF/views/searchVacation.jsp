<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<title>Admin search vacation</title>
<c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>
<link type="text/css" rel="stylesheet" href="${path}/style/style-admin-main.css">
</head>
<body>
<div id="wrapper">
<%@include file="include-header.jsp" %>
	<aside id="left">
	<nav >
		<ul>
			<li><a href="#" >Manage User</a></li>
			<li><a href="#" class="clicked">Manage Vacation</a></li>
		</ul>
	</nav>
	</aside>
	<section id="right">
		<div><button id="btn-add" name="btn-add" class="addBtn  add-user">Add vacation</button>  
		<button id="btn-add" name="btn-add" class="addBtn  add-user">Delete vacation</button>  
		<button id="btn-add" name="btn-add" class="addBtn  add-user">Modify vacation</button>  
		<form action="searchVacation.do" method="post">
		 <input type="text" value="" name ="emailId"  required placeholder="Find by EmailId">
		 <input type="submit"  class="search" value="">
		</form>
		 </div>
		<div class="fm result">
		<span>Search Vacation Result:</span><span class="error">${message}</span>
		<table>
		    <tr><th>RequestId</th><th>EmailId</th><th>Start date</th><th>End date</th><th>Remove</th><th>Edit</th></tr>
			<c:forEach  var="v" items="${listofVacation}">
			<tr><td>${v.getRequestID()}</td><td>${v.getUser().getEmail_ID()}</td><td>${v.getStartDate() }</td><td>${v.getEndDate() }</td><td><a href="#">Remove</a></td><td><a href="#">Edit</a></td></tr>
			</c:forEach>
		</table>
		</div>
	</section>
</div>
<%@include file="include-footer.jsp" %>
</body>
</html>