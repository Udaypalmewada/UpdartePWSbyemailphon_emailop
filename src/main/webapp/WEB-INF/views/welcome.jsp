<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WelcomePage</title>
</head>
<body>
	<form:form action="forget" modelAttribute="forgetPWD">

		<label class="lvl">email</label>
		<br />
		<form:input path="email" class="bx" type="text" id="email" />
		<br />
		<label class="lvl">phonNumber</label>
		<br />
		<form:input path="phonNumber" class="bx" type="phonNumber" id="phonNumber" />
		<br />
		<button id="btn1" style="align-items: center">Submit</button>
	</form:form>
</body>
</html>