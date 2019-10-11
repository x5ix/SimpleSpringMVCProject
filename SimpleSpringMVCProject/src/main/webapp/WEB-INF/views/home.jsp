<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<html>
<head>
<link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">
<title>Home</title>
</head>
<body>
<f:form action="user" method="POST" commandName="userModel" class="box login">
	<fieldset class="boxBody">
	  <label>User name</label>
	  <f:input path="name"/>
	  <f:errors path="name" cssClass="error" />
	  <label>Password</label>
	  <f:input path="pwd"/>
	  <f:errors path="pwd" cssClass="error" />
	</fieldset>
	<footer>
	  <label>administrator</label>
	  <f:checkbox path="admin"/>
	  <input type="submit" class="btnLogin" value="Login">
	</footer>
</f:form>
</body>
</html>