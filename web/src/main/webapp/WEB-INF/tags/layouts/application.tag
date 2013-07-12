<jsp:directive.tag language="java" pageEncoding="UTF-8" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags/helpers/layout" prefix="helper"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@ attribute name="title" required="true" type="java.lang.String"%>
<%@ attribute name="section" required="false" type="java.lang.String"%>
<!doctype html>


<!--[if lt IE 7 ]> <html class="ie ie6 no-js" lang="en"> <![endif]-->
<!--[if IE 7 ]>    <html class="ie ie7 no-js" lang="en"> <![endif]-->
<!--[if IE 8 ]>    <html class="ie ie8 no-js" lang="en"> <![endif]-->
<!--[if IE 9 ]>    <html class="ie ie9 no-js" lang="en"> <![endif]-->
<!--[if gt IE 9]><!-->
<html class="no-js" lang="en">
<!--<![endif]-->

<head id="www-sitename-com" data-template-set="html5-reset">

<meta charset="utf-8">

<!-- Always force latest IE rendering engine (even in intranet) & Chrome Frame -->
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

<title>${title}</title>

<meta name="title" content="MEA Layout Mockup">
<meta name="description" content="">
<!-- Google will often use this as its description of your page/site. Make it good. -->

<meta name="google-site-verification" content="">
<!-- Speaking of Google, don't forget to set your site up: http://google.com/webmasters -->

<meta name="author" content="Dawid Fatyga">
<meta name="Copyright"
	content="Copyright MEA Team 2011. All Rights Reserved.">

<!--  Mobile Viewport Fix
	j.mp/mobileviewport & davidbcalhoun.com/2010/viewport-metatag
	device-width : Occupy full width of the screen in its current orientation
	initial-scale = 1.0 retains dimensions instead of zooming out if page height > device height
	maximum-scale = 1.0 retains dimensions instead of zooming in if page width < device width
	-->
<!-- Uncomment to use use thoughtfully!
	<meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0;">
	-->

<!-- <link rel="shortcut icon" href="<c:url value='/resources/images/favicon.ico' />"> -->
<link rel="stylesheet"href="<c:url value='/resources/stylesheets/reset.css' />">
<link rel="stylesheet" href="<c:url value='/resources/stylesheets/style.css' />">
<link rel="stylesheet"href="<c:url value='/resources/stylesheets/jquery.jqplot.css' />">

<!--[if !IE 7]>
	  <style type="text/css">
      /* IE fix for sticky footer */
		  body > .wrapper { display:table;height:100% }
	  </style>
  <![endif]-->

	<script src="<c:url value='/resources/javascripts/modernizr-1.7.min.js' />"></script>
	<!-- <script src="//ajax.googleapis.com/ajax/libs/jquery/1.5.1/jquery.min.js"></script> -->
	<script src="<c:url value='/resources/javascripts/jquery-1.5.1.min.js' />"></script>
	<!-- <script>
		window.jQuery || document.write("<script src='<c:url value='/resources/javascripts/jquery-1.5.1.min.js' />'>\x3C/script>")
	</script> 
	-->
<!--[if lt IE 9]><script language="javascript" type="text/javascript" src="<c:url value='/resources/javascripts/excanvas.js' />"></script><![endif]-->	
	<script src="<c:url value='/resources/javascripts/jquery.tablesorter.min.js' />"></script>
	<script src="<c:url value='/resources/javascripts/jquery.jqplot.min.js' />"></script>
	<script src="<c:url value='/resources/javascripts/application.js' />"></script>
</head>

<body>

	<div class="wrapper">
		<div id="main">
			<header>
				<div class="minor">
				<img style="padding-top: 5px;" src="<c:url value='/resources/images/logo.png'/>" alt="success"/>
					<sec:authorize access="isAuthenticated()">
						<!-- 上次登录IP <span>255.255.255.255（未实现）</span> -->
						<nav>
							<ul>
							
								<li>
								以 <span><sec:authentication property="name" /></span> 身份登录</li>
								<sec:authorize access="hasRole('TENANT')">
								<li>
								<span><label id="dns"></label></span></li>
								</sec:authorize>
							
								<li><a href="<%=request.getContextPath()%>/account">您的账号</a>
								</li>
								<li><a href="<%=request.getContextPath()%>/logout">注销 &rarr;</a>
								</li>
							</ul>
						</nav>
					</sec:authorize>

					<sec:authorize access="not isAuthenticated()">
						<nav>
							未登录
							<ul>
								<li><a href="<%=request.getContextPath()%>/login">登录</a>
								</li>
							</ul>
						</nav>
					</sec:authorize>

				</div>
				<%--
				<section class="main">
					<sec:authorize access="isAuthenticated()">
						<nav>
							<ul>
								<helper:section name="dashboard" current="${section}" />
								<sec:authorize access="hasAnyRole('ADMIN','SERVICEDEVELOPER')">
									<helper:section name="services" current="${section}" />
								</sec:authorize>
								<sec:authorize access="hasAnyRole('ADMIN','TENANT')">
									<helper:section name="enabledServices" current="${section}" />
								</sec:authorize>
								<helper:section name="payments" current="${section}" />
								<helper:section name="reports" current="${section}" />
								<sec:authorize access="hasRole('ADMIN')">
									<helper:section name="servicedevelopers" current="${section}" />
								</sec:authorize>
								<sec:authorize access="hasRole('ADMIN')">
									<helper:section name="tenants" current="${section}" />
								</sec:authorize>								
								<sec:authorize access="hasRole('TENANT')">
									<helper:section name="customers" current="${section}" />
								</sec:authorize>
								<sec:authorize access="hasAnyRole('ADMIN','TENANT')"> 
								<helper:section name="settings" current="${section}" />
								</sec:authorize>
							</ul>
						</nav>
					</sec:authorize>
					<sec:authorize access="not isAuthenticated()">
						<h1>
							<c:out value="${title}" />
						</h1>
					</sec:authorize>
				</section>
				--%>
			</header>

			<div class="content-wrapper">
				<jsp:include page="/WEB-INF/views/framework/layouts/flash.jsp"></jsp:include>
				<jsp:doBody />
			</div>

			<br class="clearfix" />
		</div>
	</div>

	<footer>
	
		<div class="main"></div>

		<div class="minor">
			<nav>
				<p>Copyright &copy; 2010 <b><a HREF="http://www.neusoft.com" title="www.saasmanager.cn">www.saasmanager.com</a></b> | Icons by <a HREF="http://www.neusoft.com">neusoft.com</a></p>
			<%-- 	<ul>
					<li><a href="/">主页</a></li>
					<li><a href="${routes.dashboard.contact}">联系我们</a></li>
				</ul> --%>
			</nav>
		</div>
	</footer>

</body>
<input type="hidden" value= "${pageContext.request.contextPath}" id="contextPath">
<input type="hidden" value= "${pageContext.request.servletPath}" id="pagePath">
<script>
	/*
	var app;
	var page;
	$(function(){
		app = $("#contextPath").val();
		page =  $("#pagePath").val();
		if(page != "/WEB-INF/views/session/new.jsp"){
			jQuery.ajax({   
			  type : 'GET',   
			  //contentType : 'application/json',   
			  url : app + '/tenants/getDns',		          
			  //dataType : 'json',   
			  //data: {"targetId":hardwareTarget},
			  success : function(data) {
			  	//alert(data);
			  	$("label#dns").text("个性化域名:"+data);  
			  	
			  	
			     
			  },   
			  error : function(data) {   
			    //alert("error");   
			  }   
			}); 
		}
	});
	*/
</script>

</html>
