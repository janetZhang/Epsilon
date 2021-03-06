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
	<%@include file="include-left.jsp" %>
	<section id="right">
		<div><button id="btn-add" name="btn-add" class="addBtn  add-user">Add vacation</button>  
		<button id="btn-add" name="btn-add" class="addBtn  add-user">Delete vacation</button>  
		<button id="btn-add" name="btn-add" class="addBtn  add-user">Modify vacation</button>  
		<form action="searchVacation.do" method="post" >
		 <input type="text" value="" name ="emailId"  required placeholder="Find by emailId">
		 <input type="submit"  class="search" value="">
		</form>
		</div>
		<div class="fm  result">
		<span>Vacation default page</span>
		</div>
	</section>
</div>
<%@include file="include-footer.jsp" %>
</body>
</html>