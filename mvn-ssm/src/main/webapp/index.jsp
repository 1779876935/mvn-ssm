<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- Bootstrap core CSS -->
<link href="${ctx}/script/css/bootstrap.css" rel="stylesheet">

<!-- Add custom CSS here -->
<link href="${ctx}/script/css/sb-admin.css" rel="stylesheet">
<link rel="stylesheet" href="${ctx}/script/font-awesome/css/font-awesome.min.css">
<!-- Page Specific CSS -->
<link rel="stylesheet" href="${ctx}/script/css/morris-0.4.3.min.css">
<script src="${ctx}/script/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${ctx}/script/js/jquery-1.10.2.js"></script>
<script src="${ctx}/script/js/bootstrap.js"></script>
<!-- Page Specific Plugins -->    <script src="js/raphael-min.js"></script>
<script src="${ctx}/script/js/morris-0.4.3.min.js"></script>
<script src="${ctx}/script/js/morris/chart-data-morris.js"></script>
<script src="${ctx}/script/js/tablesorter/jquery.tablesorter.js"></script>
<script src="${ctx}/script/js/tablesorter/tables.js"></script>
</head>
<body>
	<div class="container" style="margin-top: 200px;">

       <form class="col-sm-offset-4col-sm-4 col-sm-offset-4 form form-horizontal " action="#"method="post" id="login_form">

 

             <h3 class="text-center">用户登录</h3>

           <div class="form-group">

             <label for="username"class="col-sm-2 control-label">账&nbsp;号</label>

             <div class="col-sm-10">

                 <input type="text" class="form-control" id="username"name="username" placeholder="请输入用户名">

             </div>

           </div>

 

           <div class="form-group">

             <label for="password"class="col-sm-2 control-label">密&nbsp;码</label>

             <div class="col-sm-10">

                 <input type="password" class="form-control" id="password" name="password" placeholder="请输入密码">

             </div>

           </div>

           <button type="submit"class="btn btn-success center-block">登录</button>

            <div class="text-right">

                <a href="#" >注册新账号</a>

            </div>

         </form>

   </div>
</body>
</html>