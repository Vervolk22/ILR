<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf8">
	<title><spring:message code="label.title" /></title>
</head>
<body>

  
<h2>Registration</h2>

<form:form method="post" action="add" commandName="contact">

	<table>
		<tr>
			<td><form:label path="firstname">
				Login
			</form:label></td>
			<td><form:input path="firstname" />
			<form:errors path="firstname" cssclass="error"></form:errors></td>
			
		</tr>
		<tr>
			<td><form:label path="lastname">
				Password
			</form:label></td>
			<td><form:input type='password' path="lastname" />
			<form:errors path="lastname" cssclass="error"></form:errors></td>
			
		</tr>
		<tr>
			<td><form:label path="email">
				Repeat password
			</form:label></td>
			<td><form:input type='password' path="email" />
			<form:errors path="email" cssclass="error"></form:errors></td>
			
		</tr>
		<tr>
			<td colspan="2"><input type="submit"
				value="Sign up" /></td>
		</tr>
	</table>
</form:form>
</br>
<a href='http://localhost:8090/myLogin/' />login </a>

</body>
</html>