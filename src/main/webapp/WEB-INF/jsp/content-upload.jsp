<%--
  Created by IntelliJ IDEA.
  User: Huan
  Date: 2019/9/14
  Time: 20:08
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
    <link rel="icon" href="../../static/images/favicon.ico">
    <title>西南石油大数据挖掘</title>
    <link rel="stylesheet" href="../../static/css/jquery.paginate.css">
    <link rel="stylesheet" href="../../static/css/jquery.yhhDataTable.css">
    <link rel="stylesheet" href="../../static/assets/vendor_components/bootstrap/dist/css/bootstrap.css">
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
                        <li class="active"><a href="/contentupload"><i class="ti-more"></i>数据导入</a></li>

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
                        <li class="active"><a href="/contenthistogram"><i class="ti-more"></i>柱状图</a></li>
                        <li class="active"><a href="/contentbar"><i class="ti-more"></i>饼图</a></li>
                        <%--<li class="active"><a href="/contentgrid"><i class="ti-more"></i>图表</a></li>--%>
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
    <div class="content-wrapper">
        <div class="container-full">
            <!-- 面板-->
            <div class="content-header">
                <div class="d-flex align-items-center">
                    <div class="mr-auto">
                        <h3 class="page-title"  style="color: #1f1f1e">文件上传</h3>
                        <div class="d-inline-block align-items-center">
                            <nav>
                            </nav>
                        </div>
                    </div>
                    <div class="right-title w-170">
                    </div>
                </div>
            </div>

            <!-- 主要的展示界面 表格分页的内容-->
            <section class="content">
                <div class="row">
                    <div class="col-xl-7 col-12" >
                        <div class="box" style="width: 1200px;">
                            <div class="layui-upload" style="margin-left: 35px;">
                                <button type="button" class="layui-btn layui-btn-normal" id="testList" style="margin-left: 20px;margin-top: 55px">选择多文件</button>
                                <button type="button" class="layui-btn" id="testListAction" style="margin-left: 5px; margin-top: 55px">开始上传</button>
                                <div class="layui-upload-list" id="content1">
                                    <table class="layui-table" style=" width:93% ;;margin-left: 20px;margin-bottom: 55px">
                                        <thead>
                                        <tr><th class="change_tr">文件名</th>
                                            <th class="change_tr">大小</th>
                                            <th class="change_tr">状态</th>
                                            <th class="change_tr">操作</th>
                                        </tr></thead>
                                        <tbody id="demoList"></tbody>
                                    </table>
                                </div>
                                <!--   -->
                            </div>
                        </div>
                    </div>
                </div>
            </section>
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
<script type="text/javascript" src="../../static/js/layui.js"></script>
<script type="text/javascript" src="../../static/js/nicePage.js"></script>

<script src="../../static/layui/layui.js" charset="utf-8"></script>
<script>
    layui.use('upload', function(){
        var $ = layui.jquery
            ,upload = layui.upload;

        //多文件列表示例
        var demoListView = $('#demoList')
            ,uploadListIns = upload.render({
            elem: '#testList'
            ,url: '/file/upload'
            ,accept: 'file'
            ,multiple: true
            ,auto: false
            ,bindAction: '#testListAction'
            ,choose: function(obj){
                var files = this.files = obj.pushFile(); //将每次选择的文件追加到文件队列
                //读取本地文件
                obj.preview(function(index, file, result){
                    var tr = $(['<tr id="upload-'+ index +'">'
                        ,'<td>'+ file.name +'</td>'
                        ,'<td>'+ (file.size/1014).toFixed(1) +'kb</td>'
                        ,'<td>等待上传</td>'
                        ,'<td>'
                        ,'<button class="layui-btn layui-btn-xs demo-reload layui-hide">重传</button>'
                        ,'<button class="layui-btn layui-btn-xs layui-btn-danger demo-delete" style="background: #180000!important;">删除</button>'
                        ,'</td>'
                        ,'</tr>'].join(''));

                    //单个重传
                    tr.find('.demo-reload').on('click', function(){
                        obj.upload(index, file);
                    });

                    //删除
                    tr.find('.demo-delete').on('click', function(){
                        delete files[index]; //删除对应的文件
                        tr.remove();
                        uploadListIns.config.elem.next()[0].value = ''; //清空 input file 值，以免删除后出现同名文件不可选
                    });

                    demoListView.append(tr);
                });
            }
            ,done: function(res, index, upload){
                if(res.success === true){ //上传成功
                    var tr = demoListView.find('tr#upload-'+ index)
                        ,tds = tr.children();
                    tds.eq(2).html('<span style="color: #0e1c12;">上传成功</span>');
                    tds.eq(3).html(''); //清空操作
                    return delete this.files[index]; //删除文件队列已经上传成功的文件
                }
                this.error(index, upload);
            }
            ,error: function(index, upload){
                var tr = demoListView.find('tr#upload-'+ index)
                    ,tds = tr.children();
                /*tds.eq(2).html('<span style="color: rgba(255,87,34,0.74);">上传失败</span>');*/
                tds.eq(2).html('<span style="color: rgba(32,11,5,0.74);">上传失败</span>');
                tds.eq(3).find('.demo-reload').removeClass('layui-hide'); //显示重传
            }
        });

        //绑定原始文件域
        upload.render({
            elem: '#test20'
            ,url: '/file/upload'
            ,done: function(res){
                console.log(res)
            }
        });

    });
</script>
</html>

