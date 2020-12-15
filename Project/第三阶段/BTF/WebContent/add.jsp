<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<base href="<%=basePath%>">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="/BTF/css/modify.css" type="text/css">
</head>
<body>
	<!-- 上方导航栏 -->
	<div class="topNav">
		<div class="regAndSign">
			<div class="register"><a href="">Register</a></div>
			<div class="split">&nbsp;|&nbsp;</div>
			<div class="login"><a href="">Sign in</a></div>
			<div class="search">
				<div class="searchInfo">search or jump to...</div>
				<img src="img/search.png" />
			</div>
		</div>
	</div>
	
	<!-- 除导航栏外全部内容 -->
	<div class="allPage">
		<!-- 左侧导航栏 -->
		<div class="leftNav">
			<div class="logo"><img src="img/logo.png"/></div>
			<div class="nav"><a href="home.jsp">HOME</a></div>
			<div class="nav"><a href="interfaceTest.jsp">INTERFACE TEST</a></div>
			<div class="nav"><a href="list">MANAGEMENT</a></div>
			<div class="nav"><a href="">THE TEAM</a></div>
		</div>
		
		<!-- 右侧内容区域 -->
		<div class="rightPage">
			<h1>新增页面</h1>
			<form action="add" method="post">
				<div id="div0">
					<div class="div1"><input type="hidden" name="id" value="${editmanagetest.id }"></div>
	 				<div class="div1"><span>id:</span><input id="input-id" name="id" value="${editmanagetest.id }"><br> </div>
					<div class="div1"><span>name：</span><input id="input-name" name="name" value="${editmanagetest.name }"><br> </div>
					<div class="div1"><span>domain：</span><input id="input-domain" name="domain" value="${editmanagetest.domain }"><br> </div>
					<div class="div1"><span>url： </span><input id="input-url" name="url" value="${editmanagetest.url }"><br> </div>
					<div class="div1"><span>method：</span> <input id="input-method" name="method" value="${editmanagetest.method }"><br> </div>
					<div class="div1"><span>headers： </span><input id="input-headers" name="headers" value="${editmanagetest.headers }"><br></div> 
					<div class="div1"><span>cookies： </span><input id="input-cookies" name="cookies" value="${editmanagetest.cookies }"><br> </div>
					<div class="div1"><span>requestBodyType：</span> <input id="input-type" name="requestBodyType" value="${editmanagetest.requestBodyType }"><br></div> 
					<div class="div1"><span>body： </span><input name="body" id="input-body" value="${editmanagetest.body }"><br> </div>
					<div class="div1"><span>response：</span> <input id="input-response" name="response" value="${editmanagetest.response }"><br> </div>
					<input class="submit" type="submit" value="增加"> <input class="reset" type="reset">
				</div>
 				
			</form>
		</div>
	</div>
</body>
</html>