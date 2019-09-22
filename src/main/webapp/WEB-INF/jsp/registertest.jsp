<%--
  Created by IntelliJ IDEA.
  User: ace-huang
  Date: 2019/7/19
  Time: 7:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
    <%--<title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>

<%--<form action = "/user/register" method="post">--%>
    <%--<input type="text" name="username" />--%>
    <%--<input type="password" name="password" />--%>
    <%--<input type="text" name="verifycode" >--%>
    <%--<img src="/Kaptcha">--%>
    <%--<input type="submit" value="注册"/>--%>
<%--</form>--%>

<%--</body>--%>
<%--</html>--%>
.<%@ page language="java" contentType="text/html; charset=UTF-8"
          pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../images/favicon.ico">
    <title> Registration </title>
    <link rel="stylesheet" href="../../static/assets/vendor_components/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../static/css/bootstrap-extend.css">
    <link rel="stylesheet" href="../../static/css/master_style.css">
    <link rel="stylesheet" href="../../static/css/skins/_all-skins.css">
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
</head>

<body class="hold-transition bg-img" style="background-image: url(../../static/imges/BCG3.jpg);" data-overlay="1">

<div class="container h-p100">
    <div class="row align-items-center justify-content-md-center h-p100">

        <div class="col-12">
            <div class="row no-gutters">
                <div class="col-lg-4 col-md-5 col-12" style="margin-left: 500px;margin-top: -15px">
                    <div class="content-top-agile p-10" >
                        <h1  style="color: #191919;font-family : 宋体;font-size:30px;font-weight: 700">WEB日志挖掘系统</h1>
                    </div>
                    <div class="p-30 content-bottom rounded bg-img box-shadowed" style="background-image: url(../../static/imges/BCG3.jpg);" data-overlay="8">
                        <form  id="form_rigster" method="post" action="/user/register">
                            <div class="form-group">
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text bg-transparent bt-0 bl-0 br-0 no-radius text-white">
                                            <i class="ti-user"></i></span>
                                    </div>
                                    <input name="username" id="registerUsername" type="text" class="form-control pl-15 bg-transparent bt-0 bl-0 br-0 no-radius text-white" placeholder="用户名">
                                </div>
                            </div>
                            <%--<div class="form-group" style="width:260px;">--%>
                                <%--<div class="input-group-prepend" style="display: inline;">--%>
                                    <%--<span class="input-group-text bg-transparent bt-0 bl-0 br-0 no-radius text-white" >--%>
                                        <%--<i class="ti-eye" ></i>--%>
                                    <%--</span>--%>
                                <%--</div>--%>
                                <%--<input type="text"  id="Kaptcha" class="form-control pl-15 bg-transparent bt-0 bl-0 br-0 no-radius text-white" placeholder="请输入验证码">--%>
                            <%--</div>--%>
                            <div class="form-group" style="display: inline-block;width: 345px">
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text bg-transparent bt-0 bl-0 br-0 no-radius text-white">
                                            <i class="ti-heart"></i></span>
                                    </div>
                                    <input type="text" name="verifyCodeActual" id="verifycode" class="form-control pl-15 bg-transparent bt-0 bl-0 br-0 no-radius text-white" placeholder="请输入验证码">
                                </div>
                            </div>

                            <img src="/Kaptcha"  alt="验证码"  style="height: 30px;"/>

                            <div class="form-group">
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text bg-transparent bt-0 bl-0 br-0 no-radius text-white">
                                            <i class="ti-lock"></i></span>
                                    </div>
                                    <input type="password" id="registerPassword" name="password" class="form-control pl-15 bg-transparent bt-0 bl-0 br-0 no-radius text-white" placeholder="密码">
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text bg-transparent bt-0 bl-0 br-0 no-radius text-white"><i class="ti-lock"></i></span>
                                    </div>
                                    <input type="password" id="registerPasswordAgin" name="checkpassword" class="form-control pl-15 bg-transparent bt-0 bl-0 br-0 no-radius text-white" placeholder="确认密码">
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-12">
                                    <!-- <div class="checkbox text-white">
                                         <input type="checkbox" id="basic_checkbox_1" >
                                         <label for="basic_checkbox_1">I agree to the <a href="#" class="text-warning"><b>Terms</b></a></label>
                                     </div>-->
                                </div>
                                <!-- /.col -->
                                <div class="col-12 text-center">
                                    <button type="submit" id="register" class="btn btn-info btn-block margin-top-10">注册</button>
                                </div>
                                <!-- /.col -->
                            </div>
                        </form>


                        <div class="text-center">
                            <p class="mt-15 mb-0 text-white" >已经有一个账号了吗?<a href="login" class="text-info ml-5" s> 登录</a></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="../../static/assets/vendor_components/jquery-3.3.1/jquery-3.3.1.js"></script>
<script src="../../static/assets/vendor_components/popper/dist/popper.min.js"></script>
<script src="../../static/assets/vendor_components/bootstrap/dist/js/bootstrap.min.js"></script>
<script>

    $("#register").click(function () {
        $.ajax({
            type: "POST",
            dataType: "json",
            url: "/user/register" ,
            data: $('#form_rigster').serialize(),
            success: function (result) {
                // console.log(result);//打印服务端返回的数据(调试用)
                // if (result.resultCode == 200) {
                //     console.log("SUCCESS");
                //     $(location).attr("href", "/login");
                // }else{
                //     alert("注册失败");
                // }
                console.log(result);//打印服务端返回的数据(调试用)
                if (result.success) {
                    alert("注册成功");
                    window.location.href='/login';
                }
                ;
            },
            error : function() {
                alert("注册失败");
                window.location.href='/register';
            }
        });
    });
</script>
</body>
</html>


