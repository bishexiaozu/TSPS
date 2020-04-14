<%--
  Created by IntelliJ IDEA.
  User: liaoyongbiao
  Date: 2020/3/23
  Time: 23:18
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>查询所有的账户</h2>
    <c:forEach items="${list}" var="account">
        <p>${account.userName}</p>
    </c:forEach>
</body>
</html>
