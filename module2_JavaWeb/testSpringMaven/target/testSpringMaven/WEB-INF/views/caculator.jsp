<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 06/12/2020
  Time: 9:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caculator</title>
</head>
<body>
<h3>Caculator</h3><br/>
<form action="/caculator-result" method="post">
<input type="text" name="a" placeholder="Nhập vào số:">
<input type="text" name="b" placeholder="Nhập vào số:"><br/>
<button type="submit" name="calculate" value="addition">Addition(+)</button>
<button type="submit" name="calculate" value="subtraction">Subtraction(-)</button>
<button type="submit" name="calculate" value="multiplication">Multiplication(*)</button>
<button type="submit" name="calculate" value="division">Division(/)</button>
</form>
</body>
</html>
