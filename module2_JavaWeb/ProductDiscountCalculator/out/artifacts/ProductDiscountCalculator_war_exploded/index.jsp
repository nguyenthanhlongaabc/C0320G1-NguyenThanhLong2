<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 06/08/2020
  Time: 10:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="/product">
  <label>Name Product </label><br/>
  <input type="text" name="name" placeholder="Nhập tên sản phẩm"><br/>
  <label>Price </label><br/>
  <input type="text" name="price" placeholder="Nhập giá"><br/>
  <label>Discount Percent </label><br/>
  <input type="text" name="rate" placeholder="Nhập discount"><br/>
  <input type = "submit" id = "submit" value = "Converter"/>

  </form>
  </body>
</html>
