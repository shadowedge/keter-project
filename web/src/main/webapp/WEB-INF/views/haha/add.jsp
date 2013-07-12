<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="xx.domain.Haha"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	List list = (List)request.getAttribute("haha");
	Haha haha = (Haha)list.get(0);
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>  
<head>    
	<base href="<%=basePath%>">        
	<title>My JSP 'hello.jsp' starting page</title>     
	<meta http-equiv="pragma" content="no-cache"> 
	<meta http-equiv="cache-control" content="no-cache">
</head>    
<body>    
	你好:<%=request.getAttribute("loginUser") %>，现在时间是<%= new Date() %>
	<br>  
	haha:<%= haha.getBillName()%>
</body>
</html>