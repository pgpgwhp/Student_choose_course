<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>选课信息管理系统登陆</title>
    <link rel="SHORTCUT ICON" href="static/image/logo.ico">
  　　<link rel="BOOKMARK" href="static/image/logo.ico">
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
    <link href="static/css/signin.css" rel="stylesheet">

    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>

<body background="content_bg.jpg">

   <h1 style="text-align:center">选课信息管理系统登陆</h1>

   <br></br>

   <br>
    <div class="container">

    <div id="error" class="row">${errMsg}</div>
        <form class="form-signin" action="login" method="post">
            <label for="school_num" class="sr-only">Email address</label>
            <input type="text" id="school_num" class="form-control" placeholder="学号" name="school_num" required="" autofocus="">
            <br/>
            <label for="password" class="sr-only">Password</label>
            <input type="password" id="password" class="form-control" placeholder="密码" name="password" required="">
            <div class="checkbox">
                <label>
                    <input type="checkbox" value="remember-me"> 记住密码
                </label>
            </div>
            <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
            <button class="btn btn-lg btn-primary btn-block" type="submit">注册</button>
        </form>

    </div> <!-- /container -->
</>
</html>