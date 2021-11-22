<%@ page contentType="text/html;charset=utf-8" language="java" %>
<html lang="zh">
<head>
    <title>主页</title>
</head>
<body>

<form action="/students" method="post">

    <table>
        <tr>
            <td><label for="id">学号</label></td>
            <td><input name="id" id="id" type="text"></td>
        </tr>
        <tr>
            <td><label for="name">姓名</label></td>
            <td><input name="name" id="name" type="text"></td>
        </tr>
        <tr>
            <td><label for="sex">性别</label></td>
            <td><input name="sex" id="sex" type="text"></td>
        </tr>
        <tr>
            <td><label for="major">主修专业</label></td>
            <td><input name="major" id="major" type="text"></td>
        </tr>
    </table>

    <input type="submit" value="提交">

</form>

<form action="/students/xml-to-db" method="get">
    <br><input type="submit" value="读取XML内容到数据库中">
</form>

<br><a href="/students">查看所有学生</a>

</body>
</html>