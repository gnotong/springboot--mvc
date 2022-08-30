<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/custom.css">
</head>

<body>

<h1>Hello dude! ${pageContext.request.contextPath}</h1>
<a href="show">Register</a> <br> <br>
<a href="student/showForm">Register Student</a> <br> <br>
<a href="customer/showForm">Register Customer</a>
</body>
</html>