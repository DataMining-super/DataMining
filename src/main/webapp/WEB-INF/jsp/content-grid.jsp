<%--
  Created by IntelliJ IDEA.
  User: Huan
  Date: 2019/9/9
  Time: 11:22
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
    <link rel="stylesheet" href="../../static/assets/vendor_components/bootstrap/dist/css/bootstrap.css">
    <link rel="stylesheet" href="../../static/assets/vendor_components/bootstrap-daterangepicker/daterangepicker.css">
    <link rel="stylesheet" type="text/css" href="../../static/assets/vendor_components/c3/c3.min.css">
    <link rel="stylesheet" href="../../static/css/bootstrap-extend.css">
    <link rel="stylesheet" href="../../static/css/master_style.css">
    <link rel="stylesheet" href="../../static/css/skins/_all-skins.css">
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <script src="../../static/js/jquery-3.3.1.min.js"> </script>
    <!-- 引入 echarts.js -->
    <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/echarts-all-3.js"></script>
    <style type="text/css">

    </style>
    <!--  搜索框-->
    <link rel="stylesheet" type="text/css" href="../../static/css/normalize.css" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="../../static/css/demo.css">
    <link rel="stylesheet" href="../../static/css/style.css">
</head>

<body class="hold-transition skin-info dark-sidebar light sidebar-mini">
<div class="wrapper">
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
                        <li class="active"><a href="/contentupload"><i class="ti-more"></i>数据上传</a></li>

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

            <!-- 主要的展示界面 -->
            <section class="content">
                <div class="row">
                    <div class="col-xl-7 col-12" >
                        <div class="box" style="height:406px;width: 1210px">
                            <div class="box-header with-border">
                                <h4 class="box-title">前十攻击者
                                </h4>
                            </div>
                            <div id="main" style="height:410px;width: 1210px;margin: 0 auto;"></div>
                        </div>
                    </div>
                    <div class="col-xl-7 col-12">
                        <!-- Chart -->
                        <div class="box"  style="height:406px;width: 1210px">
                            <div class="box-header with-border">
                                <h4 class="box-title">获取地区信息</h4>
                            </div>
                            <div id="main3" style="height:410px;margin: 0 auto;"></div>
                            <!-- /.box-body -->
                        </div>
                        <!-- /.box -->
                    </div>

                </div>

            </section>
            <!-- /.content -->
        </div>
    </div>
    <!-- /.content-wrapper -->
    <!-- Control Sidebar -->
    <aside class="control-sidebar control-sidebar-dark">

        <div class="rpanel-title"><span class="btn pull-right"><i class="ion ion-close" data-toggle="control-sidebar"></i></span> </div>
        <!-- Create the tabs -->
        <ul class="nav nav-tabs control-sidebar-tabs">
            <li class="nav-item"><a href="#control-sidebar-home-tab" data-toggle="tab">Chat</a></li>
            <li class="nav-item"><a href="#control-sidebar-settings-tab" data-toggle="tab">Todo</a></li>
        </ul>
        <!-- Tab panes -->
        <div class="tab-content">
            <!-- Home tab content -->
            <div class="tab-pane" id="control-sidebar-home-tab">
                <div class="flexbox">
                    <a href="javascript:void(0)" class="text-grey">
                        <i class="ti-more"></i>
                    </a>
                    <p>Users</p>
                    <a href="javascript:void(0)" class="text-right text-grey"><i class="ti-plus"></i></a>
                </div>
                <div class="lookup lookup-sm lookup-right d-none d-lg-block">
                    <input type="text" name="s" placeholder="Search" class="w-p100">
                </div>
                <div class="media-list media-list-hover mt-20">
                    <div class="media py-10 px-0">
                        <a class="avatar avatar-lg status-success" href="#">
                            <img src="../images/avatar/1.jpg" alt="...">
                        </a>
                        <div class="media-body">
                            <p class="font-size-16">
                                <a class="hover-primary" href="#"><strong>Tyler</strong></a>
                            </p>
                            <p>Praesent tristique diam...</p>
                            <span>Just now</span>
                        </div>
                    </div>

                    <div class="media py-10 px-0">
                        <a class="avatar avatar-lg status-danger" href="#">
                            <img src="../images/avatar/2.jpg" alt="...">
                        </a>
                        <div class="media-body">
                            <p class="font-size-16">
                                <a class="hover-primary" href="#"><strong>Luke</strong></a>
                            </p>
                            <p>Cras tempor diam ...</p>
                            <span>33 min ago</span>
                        </div>
                    </div>

                    <div class="media py-10 px-0">
                        <a class="avatar avatar-lg status-warning" href="#">
                            <img src="../images/avatar/3.jpg" alt="...">
                        </a>
                        <div class="media-body">
                            <p class="font-size-16">
                                <a class="hover-primary" href="#"><strong>Evan</strong></a>
                            </p>
                            <p>In posuere tortor vel...</p>
                            <span>42 min ago</span>
                        </div>
                    </div>

                    <div class="media py-10 px-0">
                        <a class="avatar avatar-lg status-primary" href="#">
                            <img src="../images/avatar/4.jpg" alt="...">
                        </a>
                        <div class="media-body">
                            <p class="font-size-16">
                                <a class="hover-primary" href="#"><strong>Evan</strong></a>
                            </p>
                            <p>In posuere tortor vel...</p>
                            <span>42 min ago</span>
                        </div>
                    </div>

                    <div class="media py-10 px-0">
                        <a class="avatar avatar-lg status-success" href="#">
                            <img src="../images/avatar/1.jpg" alt="...">
                        </a>
                        <div class="media-body">
                            <p class="font-size-16">
                                <a class="hover-primary" href="#"><strong>Tyler</strong></a>
                            </p>
                            <p>Praesent tristique diam...</p>
                            <span>Just now</span>
                        </div>
                    </div>

                    <div class="media py-10 px-0">
                        <a class="avatar avatar-lg status-danger" href="#">
                            <img src="../images/avatar/2.jpg" alt="...">
                        </a>
                        <div class="media-body">
                            <p class="font-size-16">
                                <a class="hover-primary" href="#"><strong>Luke</strong></a>
                            </p>
                            <p>Cras tempor diam ...</p>
                            <span>33 min ago</span>
                        </div>
                    </div>

                    <div class="media py-10 px-0">
                        <a class="avatar avatar-lg status-warning" href="#">
                            <img src="../images/avatar/3.jpg" alt="...">
                        </a>
                        <div class="media-body">
                            <p class="font-size-16">
                                <a class="hover-primary" href="#"><strong>Evan</strong></a>
                            </p>
                            <p>In posuere tortor vel...</p>
                            <span>42 min ago</span>
                        </div>
                    </div>

                    <div class="media py-10 px-0">
                        <a class="avatar avatar-lg status-primary" href="#">
                            <img src="../images/avatar/4.jpg" alt="...">
                        </a>
                        <div class="media-body">
                            <p class="font-size-16">
                                <a class="hover-primary" href="#"><strong>Evan</strong></a>
                            </p>
                            <p>In posuere tortor vel...</p>
                            <span>42 min ago</span>
                        </div>
                    </div>

                </div>

            </div>
            <!-- /.tab-pane -->
            <!-- Settings tab content -->
            <div class="tab-pane" id="control-sidebar-settings-tab">
                <div class="flexbox">
                    <a href="javascript:void(0)" class="text-grey">
                        <i class="ti-more"></i>
                    </a>
                    <p>Todo List</p>
                    <a href="javascript:void(0)" class="text-right text-grey"><i class="ti-plus"></i></a>
                </div>
                <ul class="todo-list mt-20">
                    <li class="py-15 px-5 by-1">
                        <!-- checkbox -->
                        <input type="checkbox" id="basic_checkbox_1" class="filled-in">
                        <label for="basic_checkbox_1" class="mb-0 h-15"></label>
                        <!-- todo text -->
                        <span class="text-line">Nulla vitae purus</span>
                        <!-- Emphasis label -->
                        <small class="badge bg-danger"><i class="fa fa-clock-o"></i> 2 mins</small>
                        <!-- General tools such as edit or delete-->
                        <div class="tools">
                            <i class="fa fa-edit"></i>
                            <i class="fa fa-trash-o"></i>
                        </div>
                    </li>
                    <li class="py-15 px-5">
                        <!-- checkbox -->
                        <input type="checkbox" id="basic_checkbox_2" class="filled-in">
                        <label for="basic_checkbox_2" class="mb-0 h-15"></label>
                        <span class="text-line">Phasellus interdum</span>
                        <small class="badge bg-info"><i class="fa fa-clock-o"></i> 4 hours</small>
                        <div class="tools">
                            <i class="fa fa-edit"></i>
                            <i class="fa fa-trash-o"></i>
                        </div>
                    </li>
                    <li class="py-15 px-5 by-1">
                        <!-- checkbox -->
                        <input type="checkbox" id="basic_checkbox_3" class="filled-in">
                        <label for="basic_checkbox_3" class="mb-0 h-15"></label>
                        <span class="text-line">Quisque sodales</span>
                        <small class="badge bg-warning"><i class="fa fa-clock-o"></i> 1 day</small>
                        <div class="tools">
                            <i class="fa fa-edit"></i>
                            <i class="fa fa-trash-o"></i>
                        </div>
                    </li>
                    <li class="py-15 px-5">
                        <!-- checkbox -->
                        <input type="checkbox" id="basic_checkbox_4" class="filled-in">
                        <label for="basic_checkbox_4" class="mb-0 h-15"></label>
                        <span class="text-line">Proin nec mi porta</span>
                        <small class="badge bg-success"><i class="fa fa-clock-o"></i> 3 days</small>
                        <div class="tools">
                            <i class="fa fa-edit"></i>
                            <i class="fa fa-trash-o"></i>
                        </div>
                    </li>
                    <li class="py-15 px-5 by-1">
                        <!-- checkbox -->
                        <input type="checkbox" id="basic_checkbox_5" class="filled-in">
                        <label for="basic_checkbox_5" class="mb-0 h-15"></label>
                        <span class="text-line">Maecenas scelerisque</span>
                        <small class="badge bg-primary"><i class="fa fa-clock-o"></i> 1 week</small>
                        <div class="tools">
                            <i class="fa fa-edit"></i>
                            <i class="fa fa-trash-o"></i>
                        </div>
                    </li>
                    <li class="py-15 px-5">
                        <!-- checkbox -->
                        <input type="checkbox" id="basic_checkbox_6" class="filled-in">
                        <label for="basic_checkbox_6" class="mb-0 h-15"></label>
                        <span class="text-line">Vivamus nec orci</span>
                        <small class="badge bg-info"><i class="fa fa-clock-o"></i> 1 month</small>
                        <div class="tools">
                            <i class="fa fa-edit"></i>
                            <i class="fa fa-trash-o"></i>
                        </div>
                    </li>
                    <li class="py-15 px-5 by-1">
                        <!-- checkbox -->
                        <input type="checkbox" id="basic_checkbox_7" class="filled-in">
                        <label for="basic_checkbox_7" class="mb-0 h-15"></label>
                        <!-- todo text -->
                        <span class="text-line">Nulla vitae purus</span>
                        <!-- Emphasis label -->
                        <small class="badge bg-danger"><i class="fa fa-clock-o"></i> 2 mins</small>
                        <!-- General tools such as edit or delete-->
                        <div class="tools">
                            <i class="fa fa-edit"></i>
                            <i class="fa fa-trash-o"></i>
                        </div>
                    </li>
                    <li class="py-15 px-5">
                        <!-- checkbox -->
                        <input type="checkbox" id="basic_checkbox_8" class="filled-in">
                        <label for="basic_checkbox_8" class="mb-0 h-15"></label>
                        <span class="text-line">Phasellus interdum</span>
                        <small class="badge bg-info"><i class="fa fa-clock-o"></i> 4 hours</small>
                        <div class="tools">
                            <i class="fa fa-edit"></i>
                            <i class="fa fa-trash-o"></i>
                        </div>
                    </li>
                    <li class="py-15 px-5 by-1">
                        <!-- checkbox -->
                        <input type="checkbox" id="basic_checkbox_9" class="filled-in">
                        <label for="basic_checkbox_9" class="mb-0 h-15"></label>
                        <span class="text-line">Quisque sodales</span>
                        <small class="badge bg-warning"><i class="fa fa-clock-o"></i> 1 day</small>
                        <div class="tools">
                            <i class="fa fa-edit"></i>
                            <i class="fa fa-trash-o"></i>
                        </div>
                    </li>
                    <li class="py-15 px-5">
                        <!-- checkbox -->
                        <input type="checkbox" id="basic_checkbox_10" class="filled-in">
                        <label for="basic_checkbox_10" class="mb-0 h-15"></label>
                        <span class="text-line">Proin nec mi porta</span>
                        <small class="badge bg-success"><i class="fa fa-clock-o"></i> 3 days</small>
                        <div class="tools">
                            <i class="fa fa-edit"></i>
                            <i class="fa fa-trash-o"></i>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </aside>
    <div class="control-sidebar-bg"></div>

</div>
<!--折线图的js-->
<script >
   //  前十攻击者：  data/queryTenInvader
   //  获取地区信息  data/queryArea
   $(function() {
       getAtackData();
       getIpData();
   });
   function getAtackData(){
       var myChart = echarts.init(document.getElementById('main'));
       // 指定图表的配置项和数据
       myChart.setOption ({
           tooltip: {},
           xAxis: {
               name:'攻击者',
               data: []
           },
           yAxis: {
               name:'攻击量'
           },
           series: [{
               name: '攻击次数',
               type: 'bar',
               data: [],
               itemStyle: {
                   //通常情况下：
                   normal:{
                       //每个柱子的颜色即为colorList数组里的每一项，如果柱子数目多于colorList的长度，则柱子颜色循环使用该数组
                       color: function (params){
                           var colorList = ['rgb(164,205,238)','rgb(42,170,227)','rgb(25,46,94)','rgb(195,229,235)'];
                           return colorList[params.dataIndex];
                       }
                   },
                   //鼠标悬停时：
                   emphasis: {
                       shadowBlur: 10,
                       shadowOffsetX: 0,
                       shadowColor: 'rgba(0, 0, 0, 0.5)'
                   }
               },
           }]
       });
       var atc_datax =[1,2];
       var atc_datay =[22,33];
       // 使用刚指定的配置项和数据显示图表。

       var res ;
       // alert("进入加载");
       $.ajax({
           //几个参数需要注意一下
           type: "POST",//方法类型
           dataType: "json", //预期服务器返回的数据类型
           url: '/data/queryTenInvader' ,  //url,
           success: function (result) {
               console.log(result);
               if(result){
                   for(var i=0;i<result.visitors.length;i++){
                       atc_datax.push(result.visitors[i].visitorIp);
                       atc_datay.push(result.visitors[i].visitorId);
                   }
                   myChart.setOption({
                       xAxis: {
                           data: atc_datax
                       },
                       series : [{
                           name: '攻击次数',
                           data: atc_datay
                       }]
                   });
               }
           }
       });
       return res;
   }
 // 扇形图
   function getIpData(){
       var myChart_bar_two = echarts.init(document.getElementById('main3'));
       // 指定图表的配置项和数据
       myChart_bar_two.setOption ({
           title : {
               text: '',
               x:'center'
           },
           tooltip : {
               trigger: 'item',
               formatter: "{a} <br/>{b} : {c} ({d}%)"
           },
           legend: {
               orient : 'vertical',
               x : 'left',
              // data : []
               data:['局域网 对方和您在同一内部网']
           },
           toolbox: {
               show : true,
               feature : {
                   mark : {show: true},
                   dataView : {show: true, readOnly: false},
                   magicType : {
                       show: true,
                       type: ['pie', 'funnel'],
                       option: {
                           funnel: {
                               x: '25%',
                               width: '50%',
                               funnelAlign: 'left',
                               max: 1548
                           }
                       }
                   },
                   restore : {show: true},
                   saveAsImage : {show: true}
               }
           },
           calculable : true,
           series : [
               {
                   name:'访问来源',
                   type:'pie',
                   radius : '40%',
                   center: ['50%', '50%'],
                   // data: {}
                   data:[
                       {value:17, name:'195'},
                   ]
               }
           ]
       });
       var ip_datax =[];
       // 使用刚指定的配置项和数据显示图表。

       var res ;
       // alert("进入加载");
       $.ajax({
           //几个参数需要注意一下
           type: "POST",//方法类型
           dataType: "json", //预期服务器返回的数据类型
           url: '/data/queryArea' ,  //url,
           success: function (result) {
               if(result){
                   for(var i=0;i<result.length;i++){
                       ip_datax.push(result.visitors[i].affId);
                       ip_datay[i].value = result.visitors[i].count;
                       ip_datay[i].name = result.visitors[i].province;
                   }
                   myChart_bar_two.setOption({
                       legend: {
                           orient : 'vertical',
                           x : 'left',
                           // data : []
                            data:['1','2','3']
                       },
                       series : [
                           {
                               name:'地域信息',
                               type:'pie',
                               radius : '50%',
                               center: ['50%', '50%'],
                               // data: []
                               data:[
                                   {value:195, name:'17'},
                                   {value:310, name:'IP2'},
                                   {value:335, name:'IP8'},
                               ]
                           }
                       ]
                   });
               }
           }
       });
   }
</script>
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
</body>
</html>

