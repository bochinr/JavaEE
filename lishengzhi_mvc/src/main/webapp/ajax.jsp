<%--
  Created by IntelliJ IDEA.
  User: Kiahim
  Date: 2025/5/7
  Time: 9:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false"%><%-- 开启el表达式 --%>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<script>
    var userList = new Array();
    userList.push({username:"李胜志",classroom:"计算机应用工程2班",number:"2210180232"});
    userList.push({username:"lisi",classroom:"计算机应用工程2班",number:"123"});
    $.ajax({
        type:"post",
        url:"${pageContext.request.contextPath}/save12",
        data:JSON.stringify(userList),
        contentType:"application/json;charset=utf-8"
    })
</script>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
