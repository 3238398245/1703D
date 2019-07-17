<%@page import="org.springframework.web.bind.annotation.RequestParam"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<%=request.getContextPath() %>/resource/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/resource/My97DatePicker/WdatePicker.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

	$(function(){
		$.ajax({
			url:"<%=request.getContextPath() %>/listShop.do",
			type:"post",
			dataType:"json",
			success:function(obj){
				for(var x in obj){
					$("[name='datea']").append("<input type='checkbox' name='sid' value='"+obj[x].sid+"'>"+obj[x].sname+"");
				}	
			}
		})
	})

</script>
</head>
<body>

	<form action="">
	
		店铺名称:<input type="text" name=""><br>
		店铺的创建时间:<input type="text" name="datea" onclick="WdatePicker()"><br>
		卖家的商品:<input type="checkbox" name="sid">
		<input type="button" value="添加" onclick="add()">
		
	</form>
	

</body>
</html>