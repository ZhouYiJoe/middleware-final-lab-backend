<%@ page contentType="text/html;charset=utf-8" language="java" %>
<html lang="zh">
<head>
    <title>主页</title>
    <link rel="stylesheet" href="./static/css/bootstrap.min.css">
</head>
<body>
<div class="col-lg-5 row">
    <form class="form-horizontal"  action="/students" method="post">
        <div class="form-group">
            <label for="inputEmail3" class="col-lg-2 control-label" >学号</label>
            <div class="col-lg-5">
                <input type="text" name="id" class="form-control " id="inputEmail3" placeholder="学号">
            </div>

        </div>
        <div class="form-group">
            <label for="inputPassword3" class="control-label col-lg-2" >姓名</label>
            <div class="col-lg-5">
                <input type="text" name="name" class="form-control" id="inputPassword3" placeholder="姓名">

            </div>

        </div>
        <div class="form-group">
            <label for="inputPassword5" class="control-label col-lg-2">性别</label>
            <div class="col-lg-5">
                <select name="sex" class="form-control " id="inputPassword5" >
                    <option value="男">男</option>
                    <option value="女">女</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="inputPassword4" class="control-label col-lg-2">主修专业</label>
            <div class="col-lg-5 ">
                <input type="text" name="major" class="form-control " id="inputPassword4" placeholder="专业">

            </div>

        </div>
        <div class="col-lg-5 col-lg-offset-2">
            <button type="submit" class="btn btn-default btn-warning">提交</button>

        </div>

    </form>
</div>

<div class="row col-lg-10" style="margin: 5px">
    <a class="btn btn-default btn-primary" href="/students/xml-to-db" role="button">读取XML内容到数据库中</a>
</div>
<div class="row col-lg-10 " style="margin: 5px">
    <a class="btn btn-default btn-success" href="/students" role="button">查看所有学生</a>

</div>





<script src="./static/js/jquery-1.10.2.min.js"></script>

<script src="./static/js/bootstrap.min.js" ></script>
</body>
</html>