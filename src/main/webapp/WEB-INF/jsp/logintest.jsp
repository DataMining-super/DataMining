<%--
  Created by IntelliJ IDEA.
  User: ace-huang
  Date: 2019/7/19
  Time: 7:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action = "/user/userlogin" method="get">
    <input type="text" name="username"/>
    <input type="password" name="password"/>
    <input type="text" name="verifycode">
    <img src="/Kaptcha">
    <input type="submit" value="登陆"/>
</form>

</body>
</html>
