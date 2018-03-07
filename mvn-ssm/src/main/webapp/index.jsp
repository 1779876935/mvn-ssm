<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="${ctx}/script/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="${ctx}/script/Jquery/jquery-3.0.0.min.js"></script>
<script src="${ctx}/script/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">
 <ul class="pager">
  <li>
    <a href="#">Previous</a>
  </li>
  <li>
    <a href="#">Next</a>
  </li>
</ul>


		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">Panel With title</h3>
			</div>
			<div class="panel-body">Panel content</div>
		</div>
	</div>
	</div>
</body>
</html>