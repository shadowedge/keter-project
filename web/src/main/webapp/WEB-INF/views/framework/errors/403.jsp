<%@ include file="/WEB-INF/views/framework/base/base.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
		<img src="<c:url value='/resources/images/403.png' />" alt="403"/>
		<section style="margin-top: 2em;">
			<h1>您没有访问该页面的权限！</h1>
			<p>权限不足.</p>
			<p>继续呆在这里太危险了，还是返回主页吧 <a href="<c:url value='/dashboard' />">首页</a>。 </p>			
		</section>
