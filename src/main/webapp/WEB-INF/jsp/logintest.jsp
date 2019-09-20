<%--
  Created by IntelliJ IDEA.
  User: Huan
  Date: 2019/9/8
  Time: 23:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="(${pageContext.request.contextPath})/images/favicon.ico">

    <title>Log in </title>
    <!-- Bootstrap 4.0-->
    <!-- <link rel="stylesheet" href="../static/assets/vendor_components/bootstrap/dist/css/bootstrap.min.css"> -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/assets/vendor_components/bootstrap/dist/css/bootstrap.min.css">
    <!-- Bootstrap extend-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap-extend.css">
    <!-- Theme style -->
    <!-- <link rel="stylesheet" href="../static/css/master_style.css"> -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/master_style.css">
    <!-- Ekan Admin skins -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/skins/_all-skins.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body class="hold-transition bg-img" style="background-image: url(../../static/imges/BCG3.jpg);" data-overlay="1">

<div class="container h-p100">
    <div class="row align-items-center justify-content-md-center h-p100">

        <div class="col-12" >
            <div class="row no-gutters">
                <div class="col-lg-4 col-md-5 col-12" style="margin-left: 500px;margin-top: -15px">
                    <div class="text-center text-white">
                        <h1  style="color: #191919;font-family : 宋体;font-size:30px;font-weight: 700">WEB日志挖掘系统</h1>
                        <!--  <p class="text-white">用户登录</p>-->
                    </div>
                    <div class="p-30 content-bottom rounded bg-img box-shadowed" style="background-image: url(../../static/imges/BCG3.jpg);" data-overlay="8">
                        <form action="" method="post" id="from1">
                            <div class="form-group">
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text bg-transparent bt-0 bl-0 br-0 no-radius text-white"><i class="ti-user"></i></span>
                                    </div>
                                    <input type="text" name="username" id="txtUserName" tabindex="1"  class="form-control pl-15 bg-transparent bt-0 bl-0 br-0 text-white" placeholder="用户名">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text  bg-transparent bt-0 bl-0 br-0 text-white"><i class="ti-lock"></i></span>
                                    </div>
                                    <input type="password" name="password"  id="TextBox2" tabindex="2" class="form-control pl-15 bg-transparent bt-0 bl-0 br-0 text-white" placeholder="密码">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-6">
                                    <div class="checkbox text-white">
                                        <input type="checkbox" id="basic_checkbox_1" >
                                        <label for="basic_checkbox_1">记住我</label>
                                    </div>
                                </div>
                                <!-- /.col -->
                                <div class="col-6">
                                    <div class="fog-pwd text-right">
                                        <a href="javascript:void(0)" class="text-white hover-info"><i class="ion ion-locked"></i>忘记密码?</a><br>
                                    </div>
                                </div>
                                <!-- /.col -->

                                <button type="button"
                                        <%--id="login" onclick="alert('shjd ');" class="btn btn-info btn-block margin-top-10"--%>
                                        id="login" class="btn btn-info btn-block margin-top-10"
                                >登录
                                </button>

                                <!-- /.col -->
                            </div>
                        </form>

                        <div class="text-center">
                            <p class="mt-15 mb-0 text-white">没账号了吗？ <a href="/register" class="text-info ml-5">注册</a></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--
<script src="../static/assets/vendor_components/jquery-3.3.1/jquery-3.3.1.js"></script>
<script src="../static/assets/vendor_components/popper/dist/popper.min.js"></script>
<script src="../static/assets/vendor_components/bootstrap/dist/js/bootstrap.min.js"></script> -->
<!--<script src="../../static/css/master_style.css"></script>-->
<script src="${pageContext.request.contextPath}/static/assets/vendor_components/jquery-3.3.1/jquery-3.3.1.js"></script>
<script src="${pageContext.request.contextPath}/static/assets/vendor_components/popper/dist/popper.min.js"></script>
<script src="${pageContext.request.contextPath}/static/assets/vendor_components/bootstrap/dist/js/bootstrap.min.js"></script>
<script>

    $("#login").click(function () {
        $.ajax({
            //几个参数需要注意一下
            type: "POST",//方法类型
            dataType: "json",//预期服务器返回的数据类型
            url: "/user/login" ,//url
            data: $('#from1').serialize(),
            success: function (result) {
                console.log(result);//打印服务端返回的数据(调试用)
                if (result.success) {
                    window.location.href='/contenttable';
                }
                ;
            },
            error : function() {
                window.location.href='/login';
            }
        });
    });
</script>
</body>
</html>
