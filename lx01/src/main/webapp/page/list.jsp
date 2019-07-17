<%@page import="org.springframework.web.bind.annotation.RequestParam"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<%=request.getContextPath() %>/resource/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/resource/js/jquery-3.2.1.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

	function qx(){
		$("[name='uid']").each(function(){
			this.checked = true;
		})
	}
	function qbx(){
		$("[name='uid']").each(function(){
			this.checked = false;
		})
	}
	function fx(){
		$("[name='uid']").each(function(){
			this.checked = !this.checked;
		})
	}
	

</script>
</head>
<body>

	<form action="">
		店铺名称<input type="text" name="hname" value="${hname }">
		<input type="submit" value="查询">
		<a href="<%=request.getContextPath() %>/page/add.jsp">
			<input type="button" value="添加">
		</a>
	</form>

	<table>
	
		<tr>
			<td>
				<input type="button" value="全选" onclick="qx()">
				<input type="button" value="全不选" onclick="qbx()">
				<input type="button" value="反选" onclick="fx()">
			</td>
			<td>编号</td>
			<td>店铺名称</td>
			<td>建铺时间</td>
			<td>店铺介绍</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="list">
			<tr>
				<td><input type="checkbox" value="${list.uid }" name="uid"></td>
				<td>${list.uid }</td>
				<td>${list.uname }</td>
				<td>${list.datea }</td>
				<td>${list.sname }</td>
				<td>
					<input type="button" value="详细">
				</td>
			</tr>
		</c:forEach>
		
	</table>

</body>
</html>