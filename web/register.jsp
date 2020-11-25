<%--
  Created by IntelliJ IDEA.
  User: wtqus
  Date: 2020/11/24
  Time: 23:18
  To change this template use File | Settings | File Templates.
--%>
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
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script>

        function CheckShcool_num(school_num) {
            $.ajax({
                type:"GET",
                url:"/stu/check?shcoolnum="+school_num + "&time=" + new Date().getTime(),
                success: function(data){
                    //alert("成功接收到服务器返回的数据:" + data);
                    var spanObj = document.getElementById("info");
                    // console.log("1");
                    if(data == "exited"){
                        spanObj.innerHTML = "<font color='red'>×</font>";
                        $("#btn").attr("disabled" , true);

                        // console.log("2");
                    }

                    if(data == "can be use"){
                        spanObj.innerHTML = "<font color='green'>√</font>";
                        $("#btn").attr("disabled" , false);

                        // console.log("3");


                    }
                }
            });

        }
    </script>

    <script>

        function CheckEmail(email) {
            $.ajax({
                type:"GET",
                url:"/stu/check?email="+email+ "&time=" + new Date().getTime(),
                success: function(data){
                    //alert("成功接收到服务器返回的数据:" + data);
                    var spanObj = document.getElementById("info1");
                    // console.log("1");
                    if(data == "exited"){
                        spanObj.innerHTML = "<font color='red'>×</font>";
                        $("#btn").attr("disabled" , true);

                        // console.log("2");
                    }

                    if(data == "can be use"){
                        spanObj.innerHTML = "<font color='green'>√</font>";
                        $("#btn").attr("disabled" , false);

                        // console.log("3");


                    }
                }
            });

        }
    </script>

</head>

<body background="content_bg.jpg">

<h1 style="text-align:center">选课信息管理系统注册页面</h1>



<br>
<div class="container">

    <div id="error" class="row">${errMsg}</div>
    <form class="form-signin" action="regist" method="post">

        <label for="school_num" class="sr-only">学 号</label>

        <input type="text" id="school_num" class="form-control" placeholder="学 号" name="school_num" onblur="CheckShcool_num(this.value)" required="" autofocus="">
        <span id = "info"></span>
        <br/>

        <label for="name" class="sr-only">姓 名</label>
        <input type="text" id="name" class="form-control" placeholder="姓 名" name="name" required="" autofocus="">
        <br/>

        <label for="sex" class="sr-only">性 别</label>
        <input type="text" id="sex" class="form-control" placeholder="性 别" name="sex" required="" autofocus="">
        <br/>

        <label for="grade" class="sr-only">年 级</label>
        <input type="text" id="grade" class="form-control" placeholder="年 级" name="grade" required="" autofocus="">
        <br/>

        <label for="school" class="sr-only">学 院</label>
        <input type="text" id="school" class="form-control" placeholder="学 院" name="school" required="" autofocus="">
        <br/>
        <label for="major" class="sr-only">专 业</label>
        <input type="text" id="major" class="form-control" placeholder="专 业" name="major" required="" autofocus="">
        <br/>
        <label for="class_" class="sr-only">班 级</label>
        <input type="text" id="class_" class="form-control" placeholder="班 级" name="class_" required="" autofocus="">
        <br/>
        <label for="qq" class="sr-only">qq</label>
        <input type="text" id="qq" class="form-control" placeholder="qq" name="qq" required="" autofocus="">
        <br/>
        <label for="phone" class="sr-only">手机号</label>
        <input type="text" id="phone" class="form-control" placeholder="手机号" name="phone" required="" autofocus="">
        <br/>
        <label for="email" class="sr-only">邮 箱</label>

        <input type="text" id="email" class="form-control" placeholder="邮 箱" name="email"onblur="CheckEmail(this.value)" required="" autofocus="">
        <span id = "info1"></span>
        <br/>

        <label for="password" class="sr-only">Password</label>
        <input type="password" id="password" class="form-control" placeholder="密码" name="password" required="">
        <br/>
        <label for="adress" class="sr-only">籍 贯</label>
        <input type="text" id="adress" class="form-control" placeholder="籍 贯" name="adress" required="" autofocus="">
        <br/>
        <label for="role" class="sr-only">身 份</label>
<%--        <input type="text" id="role" class="form-control" placeholder="身 份" name="role" required="" autofocus="">--%>
        <select name="role" id="role"  style="font-size:15px; width: 300px" >
            <option value="1">老 师</option>
            <option value="2">学 生</option>
        </select>
        <br/>
        <br/>
        <br/>

<%--        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>--%>
        <button class="btn btn-lg btn-primary btn-block" id="btn" type="submit">注册</button>
    </form>

</div> <!-- /container -->
</body>
</html>
