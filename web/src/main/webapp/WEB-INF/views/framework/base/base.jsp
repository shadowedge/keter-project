<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- Jstl core tags -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!-- Custom layout tags -->
<%@ taglib tagdir="/WEB-INF/tags/layouts" prefix="layout"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	String cmpPath = request.getRequestURI(); //获取页面路径地址
	String cmpRoot = cmpPath.substring(0,cmpPath.lastIndexOf("/"))+"/";//获取组件的相对路径
%>
<c:set value="<%=path%>" var="path" />
<c:set value="<%=basePath%>" var="basePath" />
<c:set value="<%=cmpPath%>" var="cmpPath" />
<c:set value="<%=cmpRoot%>" var="cmpRoot" />
<!-- 引入全局javascript -->
<script type="text/javascript" src="${path}/public/javascripts/base.js"></script>
<script type="text/javascript" src="${path}/public/javascripts/jquery-1.9.1.min.js"></script>
<!-- 引入全局CSS -->
<link rel="stylesheet" href="${path}/public/stylesheets/reset.lib.css" type="text/css" />
<link rel="stylesheet" href="${path}/public/stylesheets/common.lib.css" type="text/css" />
