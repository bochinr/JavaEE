<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/lishengzhi_mvc_war/save11" method="get">
    <h2>用户一：</h2>
    id：<input type="text" name="list[0].id"/><br/>
    姓名：<input type="text" name="list[0].username"/><br/>
    年龄：<input type="text" name="list[0].age"/><br/>
    班级：<input type="text" name="list[0].classroom"/><br/>
    学号：<input type="text" name="list[0].number"/><br/>
    <h2>用户二：</h2>
    id：<input type="text" name="list[1].id"/><br/>
    姓名：<input type="text" name="list[1].username"/><br/>
    年龄：<input type="text" name="list[1].age"/><br/>
    班级：<input type="text" name="list[1].classroom"/><br/>
    学号：<input type="text" name="list[1].number"/><br/>

    <input type="submit" value="提交"/>
</form>
</body>
</html>
