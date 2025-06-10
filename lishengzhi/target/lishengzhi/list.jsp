<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false"%><%-- 开启el表达式 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>列表页面</title>
</head>
<body>
<h1>列表内容</h1>
<table>
    <tr><th>序号</th><th>姓名</th><th>密码</th><th>性别</th><th>邮箱</th><th>操作</th></tr>
    <c:forEach items="${userList}" var="user" varStatus="status">
        <tr><td>${status.count}</td><td>${user.username}</td><td>${user.password}</td><td>${user.gender}</td><td>${user.email}</td>
            <td><a href="#">修改</a>
                <a href="/lishengzhi_war/deleteById?id=${user.id}">删除</a></td></tr>
    </c:forEach>
</table>
</body>
</html>