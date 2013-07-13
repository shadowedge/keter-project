<%@ include file="/WEB-INF/views/framework/base/base.jsp" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<link rel="stylesheet" href="${path}/static/stylesheets/default_theme/login.css" type="text/css" />
	<title>XXX平台登录</title>
</head>
<body class="bg_body fs">
	<%--
	用户登录
	<c:if test="${not empty param.error}">
		<section id="flash">
			<p class="error">
			  用户名或密码错误 - <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}" />.
			</p>
		</section>
	</c:if>
		<form action="<%=request.getContextPath()%>/authenticate" method="post" >
			<p >
				<label for="j_username">用户名</label> 
				<input type="text" name="j_username" id="j_username" />
			</p>
			<p >
				<label for="j_password">密码</label> 
					<input type="password" name="j_password" id="j_password" />
			</p>
			<p>
				<label class="padding"></label> 
				<input type="submit" value="登录" />
			</p>
		</form>
		--%>
	<!-- start login content -->
	<div id="login_content" class="auto login_content">
		<!-- start login logo -->
		<div id="login_logo" class="login_logo">
			<a href="#"><img src="${path}/public/images/default_theme/shared/logo.png" width="156" height="40" /></a>
		</div>
		<!-- end login logo -->
		<!-- start login box -->
		<div id="login_box" class="f12 lh12 login_box">
			<!-- start login inner -->
			<div id="login_inner" class="auto login_inner">
				<!-- start form 提交并验证 -->
				<form action="<%=request.getContextPath()%>/authenticate" method="post" >
				<table class="f13 fw b">
					<tr>
						<!-- 用户名 -->
						<th class="th">用户名</th>
						<td class="td"><input type="text" name="j_username" id="j_username" class="wh f16 login_inp" /></td>
					</tr>
					<tr>
						<!-- 密码 -->
						<th class="th">密&nbsp;&nbsp;&nbsp;&nbsp;码</th>
						<td class="td"><input type="password" name="j_password" id="j_password" class="wh login_inp" onfocus="this.value=''"/></td>
					</tr>
					<tr>
						<th class="th"></th>
						<td class="td">
							<input type="checkbox" id="login_check" class="login_check">
							<label for="login-check">下次自动登陆</label>
						</td>
					</tr>
					<tr>
						<!-- 提交按钮 -->
						<th class="th"></th>
						<td class="td"><input type="submit" class="login_submit"/></td>
					</tr>
				</table>
				</form>
				<!-- end form -->
			</div>
			<!-- end login inner -->
		</div>
		<!-- end login box -->
	</div>
	<!-- end login content -->
</body>
</html>
