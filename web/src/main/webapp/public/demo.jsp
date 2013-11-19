<%@ include file="/WEB-INF/views/framework/base/base.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>首页</title>
</head>
<body>
	<div   >
		请签到: <input id="sign" type="text"/>
		<a id="submit" href="javascript:" onclick="sign()">签到</a>
		<br>
		您的签到信息：<span id="afterSigh"></span>
	</div>
</body>
</html>
<script type="text/javascript">
	function sign(){
		document.getElementById("afterSigh").innerHTML = document.getElementById("sign").value;
	    //alert(document.getElementById("sign").value);
	}
</script>