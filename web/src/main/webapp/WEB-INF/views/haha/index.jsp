<%@ include file="/WEB-INF/views/framework/base/base.jsp" %>
<%@ page language="java" import="java.util.*"%>
<%@ page import="haha.domain.Haha"%>

<%
	List list = (List)request.getAttribute("haha");
	System.out.println(list);
	Haha haha = list==null?new Haha():(Haha)list.get(0);
	String userName = (String)request.getAttribute("userName");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<title>haha</title>
</head>
<body>
	欢迎你 : <%=userName%><br>
	haha's name is: <%=haha.getName()%>
</body>
</html>
