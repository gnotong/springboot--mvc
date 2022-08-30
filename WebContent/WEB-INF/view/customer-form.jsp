<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student registration form</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
		First Name: <form:input path="firstName"/>
		<form:errors path="firstName" cssClass="error"/> 
		<br /><br />
		Last Name: <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"/> 
		<br /><br />
		Course code: <form:input path="courseCode"/>
		<form:errors path="courseCode" cssClass="error"/> 
		<br /><br />
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>