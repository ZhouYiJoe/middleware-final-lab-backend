<%@ page contentType="text/html;charset=utf-8" language="java" %>
<html>
<head>
    <title>显示所有学生</title>
</head>
<body>
<%out.print(request.getAttribute("jsonString"));%><br>
<a href="/">返回</a>
</body>
</html>