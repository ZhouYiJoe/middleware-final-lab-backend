<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>显示所有学生</title>
    <link rel="stylesheet" href="./static/css/bootstrap.min.css">
</head>
<body>
<% out.print(request.getAttribute("jsonString")); %>
<%--<div class="container">--%>
<%--    <div class="row col-lg-12">--%>
<%--        <table class="table table-bordered table-striped">--%>
<%--            <caption style="text-align: center">学生信息</caption>--%>
<%--            <tr>--%>
<%--                <th>id</th>--%>
<%--                <th>name</th>--%>
<%--                <th>sex</th>--%>
<%--                <th>major</th>--%>
<%--            </tr>--%>
<%--            <c:forEach items="${requestScope.students}" var="item">--%>
<%--                <tr>--%>
<%--                    <td>${item.id}</td>--%>
<%--                    <td>${item.name}</td>--%>
<%--                    <td>${item.sex}</td>--%>
<%--                    <td>${item.major}</td>--%>
<%--                </tr>--%>
<%--            </c:forEach>--%>

<%--        </table>--%>
<%--    </div>--%>

<%--</div>--%>

<%--<a class="btn btn-default btn-success col-lg-offset-1" href="/" role="button">返回</a>--%>
<%--<script src="./static/js/jquery-1.10.2.min.js"></script>--%>
<%--<script src="./static/js/bootstrap.min.js" ></script>--%>
</body>
</html>