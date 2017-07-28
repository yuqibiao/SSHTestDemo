<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="page" uri="http://com.yyyu.ssm/page/" %>
<%--
  功能:客户展示页面
  User: yu
  Date: 2017/7/18
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>客户展示页面</title>

    <%--bootstrap--%>
    <link href="<%=basePath%>plugin/bootstrap/bootstrap.min.css" rel="stylesheet">
    <link href="<%=basePath%>plugin/bootstrap/dataTables.bootstrap.css" rel="stylesheet">
    <link href="<%=basePath%>plugin/bootstrap/metisMenu.min.css" rel="stylesheet">
    <link href="<%=basePath%>plugin/bootstrap/dataTables.bootstrap.css" rel="stylesheet">
    <%--font-awesome--%>
    <link href="<%=basePath%>plugin/font-awesome/font-awesome.min.css" rel="stylesheet">
    <%--custom--%>
    <link href="<%=basePath%>statics/css/sb-admin-2.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

<div id="wrapper">

    <%--Navigation--%>
    <nav class="navbar navbar-default navbar-static-top" role="navigation">

        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">BOOT客户管理系统 v0.1</a>
        </div>

        <!-- /.navbar-header -->
        <ul class="nav navbar-top-links navbar-right">

            <%--消息下拉菜单--%>
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                    <i class="fa fa-envelope fa-fw"></i>
                    <i class="fa fa-caret-down"></i>
                    <ul class="dropdown-menu dropdown-messages">
                        <li><a href="#">
                            <div>
                                <strong>令狐冲</strong> <span class="pull-right text-muted">
									<em>昨天</em>
								</span>
                            </div>
                            <div>今天晚上向大哥找我吃饭，讨论一下去梅庄的事...</div>
                        </a></li>
                        <li class="divider"></li>
                        <li><a class="text-center" href="#"> <strong>查看全部消息</strong>
                            <i class="fa fa-angle-right"></i>
                        </a></li>
                    </ul>
                </a>
            </li>
            <%--任务下拉菜单--%>
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                    <i class="fa fa-tasks fa-fw"></i>
                    <i class="fa fa-caret-down"></i>
                    <ul class="dropdown-menu dropdown-tasks">
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>任务 1</strong> <span class="pull-right text-muted">完成40%</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-success"
                                             role="progressbar" aria-valuenow="40" aria-valuemin="0"
                                             aria-valuemax="100" style="width: 40%">
                                            <span class="sr-only">完成40%</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>任务 2</strong> <span class="pull-right text-muted">完成20%</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-info"
                                             role="progressbar" aria-valuenow="40" aria-valuemin="0"
                                             aria-valuemax="100" style="width: 20%">
                                            <span class="sr-only">完成40%</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                    </ul>
                </a>
            </li>
            <%--提醒下拉菜单--%>
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                    <i class="fa fa-bell fa-fw"></i>
                    <i class="fa fa-caret-down "></i>
                    <ul class="dropdown-menu dropdown-alerts">
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-comment fa-fw"></i> 新回复
                                    <span class="pull-right text-muted small">4分钟之前</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="#">
                            <div>
                                <i class="fa fa-envelope fa-fw"></i> 新消息 <span
                                    class="pull-right text-muted small">4分钟之前</span>
                            </div>
                        </a></li>
                        <li class="divider"></li>
                        <li><a href="#">
                            <div>
                                <i class="fa fa-tasks fa-fw"></i> 新任务 <span
                                    class="pull-right text-muted small">4分钟之前</span>
                            </div>
                        </a></li>
                        <li class="divider"></li>
                        <li><a href="#">
                            <div>
                                <i class="fa fa-upload fa-fw"></i> 服务器重启 <span
                                    class="pull-right text-muted small">4分钟之前</span>
                            </div>
                        </a></li>
                        <li class="divider"></li>
                        <li><a class="text-center" href="#"> <strong>查看所有提醒</strong>
                            <i class="fa fa-angle-right"></i>
                        </a></li>
                    </ul>
                </a>
            </li>
            <%--用户设置下拉菜单--%>
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                    <i class="fa fa-user fa-fw"></i>
                    <i class="fa fa-caret-down"></i>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="#"><i class="fa fa-user fa-fw"></i> 用户设置</a></li>
                        <li><a href="#"><i class="fa fa-gear fa-fw"></i> 系统设置</a></li>
                        <li class="divider"></li>
                        <li><a href="#"><i class="fa fa-sign-out fa-fw"></i>退出登录</a></li>
                    </ul>
                </a>
            </li>

        </ul>

        <div class="navbar-default sidebar" role="navigation">
            <div class="sidebar-nav navbar-collapse">
                <ul class="nav" id="side-menu">
                    <li class="sidebar-search">
                        <div class="input-group custom-search-form">
                            <input type="text" class="form-control" placeholder="查询内容...">
                            <span class="input-group-btn">
								<button class="btn btn-default" type="button">
									<i class="fa fa-search" style="padding: 3px 0 3px 0;"></i>
								</button>
							</span>
                        </div> <!-- /input-group -->
                    </li>
                    <li><a href="#" class="active"><i
                            class="fa fa-edit fa-fw"></i> 客户管理</a></li>
                    <li><a href="#"><i
                            class="fa fa-dashboard fa-fw"></i> 客户拜访</a></li>
                </ul>
            </div>
            <!-- /.sidebar-collapse -->
        </div>

    </nav>

    <%--客户信息操作--%>
    <div id="page-wrapper">

        <%--title--%>
        <div class="rows">
            <div class="col-lg-12">
                <h1 class="page-header">客户管理</h1>
            </div>
        </div>
        <%--搜索--%>
            <div class="panel panel-default">
                <div class="panel-body">
                    <form class="form-inline" action="${pageContext.request.contextPath }/customer/list" method="post">
                        <div class="form-group">
                            <label for="custName">客户名称</label>
                            <input type="text" class="form-control" id="custName" value="${custName }" name="custName">
                        </div>
                        <div class="form-group">
                            <label for="customerFrom">客户来源</label>
                            <select class="form-control" id="customerFrom" placeholder="客户来源" name="custSource">
                                <option value="">--请选择--</option>
                                <c:forEach items="${fromType}" var="item">
                                    <option value="${item.dictId}"<c:if test="${item.dictId == custSource}"> selected</c:if>>
                                            ${item.dictItemName }
                                    </option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="custIndustry">所属行业</label>
                            <select class="form-control" id="custIndustry" name="custIndustry">
                                <option value="">--请选择--</option>
                                <c:forEach items="${industryType}" var="item">
                                    <option value="${item.dictId}"<c:if
                                            test="${item.dictId == custIndustry}"> selected</c:if>>${item.dictItemName }</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="custLevel">客户级别</label>
                            <select class="form-control" id="custLevel" name="custLevel">
                                <option value="">--请选择--</option>
                                <c:forEach items="${levelType}" var="item">
                                    <option value="${item.dictId}"<c:if
                                            test="${item.dictId == custLevel}"> selected</c:if>>${item.dictItemName }</option>
                                </c:forEach>
                            </select>
                        </div>
                        <button type="submit" class="btn btn-primary">查询</button>
                    </form>
                </div>
            </div>
        <%--客户信息展示--%>
            <div class="rows">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">客户信息列表</div>
                        <!-- /.panel-heading -->
                        <table class="table table-bordered table-striped">
                            <thead>
                            <tr>
                                <th>ID</th>
                                <th>客户名称</th>
                                <th>客户来源</th>
                                <th>客户所属行业</th>
                                <th>客户级别</th>
                                <th>固定电话</th>
                                <th>手机</th>
                                <th>操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${page.rows}" var="rows">
                                <tr>
                                    <td>${rows.custId}</td>
                                    <td>${rows.custName}</td>
                                    <td>${rows.custSource}</td>
                                    <td>${rows.custIndustry}</td>
                                    <td>${rows.custLevel}</td>
                                    <td>${rows.custPhone}</td>
                                    <td>${rows.custMobile}</td>
                                    <td>
                                        <a href="#" class="btn btn-primary btn-xs" data-toggle="modal"
                                           data-target="#customerEditDialog" onclick="editCustomer(${rows.custId})">修改</a>
                                        <a href="#" class="btn btn-danger btn-xs" onclick="deleteCustomer(${rows.custId})">删除</a>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                        <div class="col-md-12 text-right">
                            <page:page url="${pageContext.request.contextPath }/customer/list"></page:page>
                        </div>
                    </div>
                </div>
            </div>


    </div>


</div>

<!-- 客户编辑对话框 -->
<div class="modal fade" id="customerEditDialog" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">修改客户信息</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="edit_customer_form">
                    <input type="hidden" id="edit_cust_id" name="custId"/>
                    <div class="form-group">
                        <label for="edit_customerName" class="col-sm-2 control-label">客户名称</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="edit_customerName" placeholder="客户名称"
                                   name="custName">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit_customerFrom" style="float:left;padding:7px 15px 0 27px;">客户来源</label>
                        <div class="col-sm-10">
                            <select class="form-control" id="edit_customerFrom" placeholder="客户来源" name="custSource">
                                <option value="">--请选择--</option>
                                <c:forEach items="${fromType}" var="item">
                                    <option value="${item.dictId}"<c:if
                                            test="${item.dictId == custSource}"> selected</c:if>>${item.dictItemName }</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit_custIndustry" style="float:left;padding:7px 15px 0 27px;">所属行业</label>
                        <div class="col-sm-10">
                            <select class="form-control" id="edit_custIndustry" name="custIndustry">
                                <option value="">--请选择--</option>
                                <c:forEach items="${industryType}" var="item">
                                    <option value="${item.dictId}"<c:if
                                            test="${item.dictId == custIndustry}"> selected</c:if>>${item.dictItemName }</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit_custLevel" style="float:left;padding:7px 15px 0 27px;">客户级别</label>
                        <div class="col-sm-10">
                            <select class="form-control" id="edit_custLevel" name="custLevel">
                                <option value="">--请选择--</option>
                                <c:forEach items="${levelType}" var="item">
                                    <option value="${item.dictId}"<c:if
                                            test="${item.dictId == custLevel}"> selected</c:if>>${item.dictItemName }</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit_linkMan" class="col-sm-2 control-label">联系人</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="edit_linkMan" placeholder="联系人"
                                   name="custLinkman">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit_phone" class="col-sm-2 control-label">固定电话</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="edit_phone" placeholder="固定电话"
                                   name="custPhone">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit_mobile" class="col-sm-2 control-label">移动电话</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="edit_mobile" placeholder="移动电话"
                                   name="custMobile">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit_zipcode" class="col-sm-2 control-label">邮政编码</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="edit_zipcode" placeholder="邮政编码"
                                   name="custZipcode">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit_address" class="col-sm-2 control-label">联系地址</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="edit_address" placeholder="联系地址"
                                   name="custAddress">
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="updateCustomer()">保存修改</button>
            </div>
        </div>
    </div>
</div>


<%--JQuery--%>
<script src="<%=basePath%>plugin/jquery/jquery-3.2.1.js"></script>
<script src="<%=basePath%>plugin/jquery/jquery.dataTables.min.js"></script>
<%--BootStrap--%>
<script src="<%=basePath%>plugin/bootstrap/bootstrap.min.js"></script>
<script src="<%=basePath%>plugin/bootstrap/metisMenu.min.js"></script>
<script src="<%=basePath%>plugin/bootstrap/dataTables.bootstrap.min.js"></script>
<%--Custom--%>
<script src="<%=basePath%>statics/js/sb-admin-2.js"></script>


<script type="text/javascript">
    function editCustomer(custId) {
        $.ajax({
            type: "get",
            url: "<%=basePath%>/customer/getCustomerByCustId.action",
            data: {"custId": custId},
            success: function (data) {
                $("#edit_cust_id").val(data.custId);
                $("#edit_customerName").val(data.custName);
                $("#edit_customerFrom").val(data.custSource)
                $("#edit_custIndustry").val(data.custIndustry)
                $("#edit_custLevel").val(data.custLevel)
                $("#edit_linkMan").val(data.custLinkman);
                $("#edit_phone").val(data.custPhone);
                $("#edit_mobile").val(data.custMobile);
                $("#edit_zipcode").val(data.custZipcode);
                $("#edit_address").val(data.custAddress);

            }
        });
    }
    function updateCustomer() {
        $.post("<%=basePath%>customer/modifyCustomer.action", $("#edit_customer_form").serialize(), function (data) {
            alert("客户信息更新成功！");
            window.location.reload();
        });
    }

    function deleteCustomer(custId) {
        if (confirm('确实要删除该客户吗?')) {
            $.post("<%=basePath%>customer/deleteCustomer.action", {"custId": custId}, function (data) {
                alert("客户删除更新成功！");
                window.location.reload();
            });
        }
    }
</script>

</body>
</html>
