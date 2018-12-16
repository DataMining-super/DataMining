<%@ page isELIgnored ="false" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title></title>
</head>
<body>


<c:forEach items="${users}" var="user">
        name=${user.username}
</c:forEach>
</body>
</html>