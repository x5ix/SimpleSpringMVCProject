<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
<link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">
<title>Home</title>
</head>
<body>
Hello, ${user.name}<br>
<p>Password: ${user.pwd}</p>
<p>administrator: ${user.admin}</p>
</body>
</html>