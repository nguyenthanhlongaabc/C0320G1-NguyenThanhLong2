<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 06/12/2020
  Time: 9:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich</title>
</head>
<body>
<form action="/sandwich-condiments" method="post">
    <input type="checkbox" name="condiment" value="lettuce">
    <label >Lettuce</label><br>
    <input type="checkbox" name="condiment" value="tomato">
    <label>Tomato</label><br>
    <input type="checkbox" name="condiment" value="mustard">
    <label>Mustard</label><br>
    <input type="checkbox" name="condiment" value="Sprouts">
    <label>Sprouts</label><br><br>
    <input type="submit" value="save">
</form>

</body>
</html>
