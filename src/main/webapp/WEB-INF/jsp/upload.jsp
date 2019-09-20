<%--
  Created by IntelliJ IDEA.
  User: ace-huang
  Date: 2019/8/12
  Time: 1:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件的上传</title>
</head>
<body>

<form action="/file/upload" enctype="multipart/form-data" method="post">
    <input type="file" name="file"/><br>
    <input type="submit" value="上传">
</form>
</body>
</html>
