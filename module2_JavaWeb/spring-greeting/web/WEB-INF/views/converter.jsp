<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 06/11/2020
  Time: 9:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<form method="post" action="/result">
<label>Rate</label><br/>
<input type="text" name="rate" placeholder="Nhập tỉ giá"><br/>
<label>USD</label><br/>
<input type="text" name="usd" placeholder="Nhập USD"><br/>
<input type="submit" value="converter">
</form>
</body>
</html>
