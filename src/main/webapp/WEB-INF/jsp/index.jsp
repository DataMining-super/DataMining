
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title></title>
</head>
<body>
<c:forEach items="${users}" var="item">
    <div>
        name="${item.id}"
    </div>
</c:forEach>
</body>
</html>