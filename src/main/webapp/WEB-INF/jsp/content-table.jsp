<%--
  Created by IntelliJ IDEA.
  User: Huan
  Date: 2019/9/9
  Time: 11:29
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
    <link rel="icon" href="images/favicon.ico">
    <title>西南石油大数据挖掘</title>
    <link rel="stylesheet" href="../../static/css/jquery.paginate.css">
    <link rel="stylesheet" href="../../static/css/jquery.yhhDataTable.css">
    <link rel="stylesheet" href="../../static/assets/vendor_components/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../static/assets/vendor_components/bootstrap-daterangepicker/daterangepicker.css">
    <link rel="stylesheet" type="text/css" href="../../static/assets/vendor_components/c3/c3.min.css">
    <link rel="stylesheet" href="../../static/css/bootstrap-extend.css">
    <link rel="stylesheet" href="../../static/css/master_style.css">
    <link rel="stylesheet" href="../../static/css/skins/_all-skins.css">
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <!-- 引入 echarts.js -->
    <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/echarts-all-3.js"></script>
    <link rel="stylesheet" type="text/css" href="http://cdn.bootcss.com/font-awesome/4.6.0/css/font-awesome.min.css">
    <link href="../../static/css/layui.css" type="text/css" rel="stylesheet">
    <!-- 搜索框-->
    <link rel="stylesheet" type="text/css" href="../../static/css/normalize.css" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="../../static/css/demo.css">
    <link rel="stylesheet" href="../../static/css/style.css">
    <style type="text/css">
        .pageLi{
            font-size: 14px;
            color: #666666;

        }
        .pageLi> span{
            line-height: 57px;
        }
        .disabled{
            font-size: 14px;
            color: #999999;
        }
    </style>
</head>

<body class="hold-transition skin-info dark-sidebar light sidebar-mini">

<div class="wrapper" style="overflow-y: hidden ">
    <!--           顶部导航栏         -->
    <header class="main-header" >
        <!-- 顶部logo -->
        <a href="/index" class="logo" style="background-color: #1f1f1e">

            <div class="logo-lg" style="background-color: #1f1f1e" >
                <span class="light-logo" ><img src="../../static/imges/logo.png" alt="logo" width="255px" height="60px"></span>
            </div>
        </a>

        <nav class="navbar navbar-static-top" style="background-color: #1f1f1e">
            <div>
                <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button" >
                    <i class="ti-align-left"></i>
                </a>
                <a id="toggle_res_search" data-toggle="collapse" data-target="#search_form"
                   class="res-only-view" href="javascript:void(0);"><i class="mdi mdi-magnify"></i>
                </a>

            </div>


            <div style="margin-right: 37px;">
               <span style="margin-right: 20px">
                   欢迎进入WEB日志挖掘系统
               </span>
                <a href="/index" class="link" data-toggle="tooltip" title="" data-original-title="Logout"><i class="fa fa-power-off"></i></a>
            </div>
        </nav>
    </header>

    <!-- 左边 -->
    <aside class="main-sidebar">
        <!-- sidebar-->
        <section class="sidebar">
            <!-- 导航栏-->
            <ul class="sidebar-menu" data-widget="tree">

                <li class="header nav-small-cap"></li>

                <li class="treeview active">
                    <a href="/contentupload">
                        <i class="ti-dashboard"></i>
                        <span>数据导入</span>
                        <span class="pull-right-container">
              <i class="fa fa-angle-right pull-right"></i>
            </span>
                    </a>
                    <ul class="treeview-menu">
                        <li class="active"><a href="/contentupload"><i class="ti-more"></i>上传文件</a></li>

                    </ul>
                </li>

                <li class="treeview active">
                    <a href=>
                        <i class="ti-dashboard"></i>
                        <span>数据分析</span>
                        <span class="pull-right-container">
              <i class="fa fa-angle-right pull-right"></i>
            </span>
                    </a>
                    <ul class="treeview-menu">
                        <%--<li class="active"><a href="/contentgrid"><i class="ti-more"></i>图表</a></li>--%>
                            <li class="active"><a href="/contenthistogram"><i class="ti-more"></i>柱状图</a></li>
                            <li class="active"><a href="/contentbar"><i class="ti-more"></i>饼图</a></li>
                    </ul>
                </li>

                <li class="treeview active">
                    <a href="/contenttable">
                        <i class="ti-dashboard"></i>
                        <span>数据展示</span>
                        <span class="pull-right-container">
                            <%--<i class="fa fa-angle-right pull-right"></i>--%>
                        </span>
                    </a>
                    <ul class="treeview-menu">
                        <li class="active"><a href="/contenttable"><i class="ti-more"></i>表格显示</a></li>
                        <%--<li><a href="index-2.html"><i class="ti-more"></i>Dashboard 2</a></li>--%>
                        <%--<li><a href="index-3.html"><i class="ti-more"></i>Dashboard 3</a></li>--%>
                        <%--<li><a href="index-4.html"><i class="ti-more"></i>Dashboard 4</a></li>--%>
                        <%--<li><a href="index-5.html"><i class="ti-more"></i>Dashboard 5</a></li>--%>
                    </ul>
                </li>
            </ul>
        </section>
    </aside>
    <!-- 右边的内容  -->
    <div class="input-wrapper">
        <!-- 主要的展示界面 表格分页的内容-->

        <div class="content-wrapper">
            <div class="container-full">
                <!-- 面板-->
                <div class="content-header">
                    <div class="d-flex align-items-center">
                        <div class="mr-auto">
                            <h3 class="page-title" style="color: #1f1f1e">数据展示</h3>
                            <div class="d-inline-block align-items-center">
                                <nav>
                                </nav>
                            </div>
                        </div>
                        <div class="right-title w-170">

                        </div>
                    </div>
                </div>
                <section class="content"style="margin-left: -5px">
                    <div class="row">
                        <div class="col-xl-7 col-12" style="" >
                            <div class="box" style="width: 1200px ">
                                <!--<div class="box-header with-border">
                                    <h4 class="box-title">
                                    </h4>
                                </div>-->
                                <div >
                                    <!--以下为两个必须div元素-->
                                    <!--  <div id="table" style="width: 1000px;margin: 0 auto"> </div>-->
                                    <div style="width: 1160px;margin-left:20px;float: bottom;margin-top: 20px">
                                        <table class="layui-table" id="table" lay-size="sm" style="margin-top: 25px" >
                                            <colgroup>
                                                <col width="150">
                                                <col width="10">
                                                <%--<col width="100">--%>
                                                <col width="10">
                                                <col width="10">
                                                <col width="10">
                                                <col width="10">
                                            </colgroup>
                                            <thead>
                                            <tr>
                                                <th>affiliation</th>
                                                <th>basicId</th>
                                                <%--<th>detail</th>--%>
                                                <th>invaMethod</th>
                                                <th>invadeLocation</th>
                                                <th>invadeTime</th>
                                                <th>vositorIp</th>
                                            </tr>
                                            </thead>
                                            <tbody id="t_table">

                                            </tbody>
                                        </table>
                                    </div>
                                    <div class="container" style="text-align: right">
                                        <ul class="pagination" id = "pageList"></ul>
                                    </div>
                                    <%--<div id = "pageList"></div>--%>

                            </div>
                        </div>
                    </div>
                </section>
            </div>


        </div>
    </div>

</div>
</body>
<script src="../../static/assets/vendor_components/jquery-3.3.1/jquery-3.3.1.js"></script>
<script src="../../static/assets/vendor_components/jquery-ui/jquery-ui.js"></script>
<script src="../../static/assets/vendor_components/popper/dist/popper.min.js"></script>
<script src="../../static/assets/vendor_components/bootstrap/dist/js/bootstrap.js"></script>
<script src="../../static/assets/vendor_components/moment/min/moment.min.js"></script>
<script src="../../static/assets/vendor_components/bootstrap-daterangepicker/daterangepicker.js"></script>
<script src="../../static/assets/vendor_components/jquery-slimscroll/jquery.slimscroll.js"></script>
<script src="../../static/assets/vendor_components/fastclick/lib/fastclick.js"></script>
<script src="../../static/assets/vendor_components/echarts/dist/echarts-en.min.js"></script>
<script src="../../static/assets/vendor_components/c3/d3.min.js"></script>
<script src="../../static/assets/vendor_components/c3/c3.min.js"></script>
<script src="../../static/js/template.js"></script>
<script src="../../static/js/pages/dashboard.js"></script>
<script src="../../static/js/pages/dashboard-chart.js"></script>
<script src="../../static/js/demo.js"></script>
<script type="text/javascript" src="../../static/js/jquery.min.js"></script>
<script type="text/javascript" src="../../static/js/layui/layui.js"></script>
<script type="text/javascript" src="../../static/js/nicePage.js"></script>
<script type="text/javascript">
    $(document).ready(function () {
        show(1, 10);
    });

    function show(pageIndex, pageSize) {
        $.ajax({
            type: "POST",
            url: "/data/querydatalist",
            data: {pageIndex: pageIndex, pageSize: pageSize},
            dataType: "json",
            success: function (data) {
                console.log(data);
                if(data.success){
                    page(data, pageIndex, pageSize);
                    $("#t_table").empty();
                    $.each(data.datalist, function (index, value){
                        var row = " <tr>\n" +
                            "<td>"+value.affiliation+"</td>\n" +
                            "<td>"+value.basicId+"</td>\n" +
                            // "<td>"+value.detail.toString() +"</td>\n" +
                            "<td>"+value.invaMethod+"</td>\n" +
                            "<td>"+value.invadeLocation+"</td>\n" +
                            "<td>"+value.invadeTime+"</td>\n" +
                            "<td>"+value.vositorIp+"</td>\n" +
                            "</tr>\n";
                        $("#t_table").append(row);
                    });
                }

            }
        });
    }

    function page(data, pageIndex, pageSize) {
        console.log(pageIndex, pageSize);
        var total = Math.ceil(data.count/pageSize);
        $("#pageList").empty();
        var firstPage = $("<li></li>").append($("<a></a>").append("首页"));
        var prePage = $("<li></li>").append($("<a></a>").append("&laquo;"));
        if (pageIndex <=1 ) {
            firstPage.addClass("disabled");
            prePage.addClass("disabled");
        } else {
            firstPage.click(function () {
                show(1, pageSize);
            });
            prePage.click(function () {
                show(pageIndex - 1, pageSize);
            });
        }
        var cur = $("<li></li>").append($("<span></span>").append("当前是第" + pageIndex +"页，总共"+total+"页"));
        cur.addClass("pageLi");
        var nextPage = $("<li></li>").append($("<a></a>").append("&raquo;"));
        nextPage.addClass("pageLi");
        var lastPage = $("<li></li>").append($("<a></a>").append("末页"));
        lastPage.addClass("pageLi");
        if (pageIndex >= total) {
            nextPage.addClass("disabled");
            lastPage.addClass("disabled");
        } else {
            nextPage.click(function () {
                show(pageIndex + 1, pageSize);
            });
            lastPage.click(function () {
                show(total, pageSize);
            });
        }
        $("#pageList").append(firstPage).append(prePage).append(cur).append(nextPage).append(lastPage);
    }

</script>

</html>

