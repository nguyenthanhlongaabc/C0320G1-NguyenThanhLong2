<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 06/12/2020
  Time: 9:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Condiment</title>
</head>
<body>
<c:forEach items="${condiment}" var="con">
    <h2>${con}</h2>
</c:forEach>
</body>
</html>
