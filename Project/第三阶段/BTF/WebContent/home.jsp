<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<base href="<%=basePath%>">
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="/BTF/css/home.css" type="text/css">
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
			<div class="nav"><a href="#">THE TEAM</a></div>
		</div>
		
		<!-- 右侧内容区域 -->
		<div class="rightPage">
			<img src="img/nav.jpg" alt="" />
			<!-- 产品介绍 -->
			<div class="introduction">
				<div class="icons">
					<img src="img/good.png" />
					<img src="img/sigh.png" />
					<img src="img/share.png" />
					<img src="img/upload.png" />
				</div>
				<div class="bigTitle-1">什么是接口测试？</div>
				<div class="description">
					接口测试是测试系统组件间接口的一种测试，主要用于测试系统与外部其他系统之间的接口，
					以及系统内部各个子模块之间的接口。测试的重点是要检查接口参数传递的正确性，
					接口功能实现的正确性，输出结果的正确性，以及对各种异常情况的容错处理的完整性和合理性。
				</div>
				<div class="bigTitle-2">我们的产品</div>
				<div class="description">
					BTFgroup测试平台是一款免费开源的测试平台，最大的特点是全纬度覆盖了接口自动化、
					WEB UI自动化、APP自动化，并且支持分布式测试，测试关键字驱动也很大程度上解决了
					测试同学代码基础弱...
				</div>
			</div>
			
			<!-- 关于我们 -->
			<div class="aboutUs">
				<div class="teamInfo">
					<div class="teamInfo-1">更多服务</div>
					<div class="teamInfo-1">在线客服</div>
					<div class="teamInfo-1">线下服务</div>
					<div class="teamInfo-1">零售查询</div>
					<div class="teamInfo-1">服务热线</div>
				</div>
				<div class="teamInfo">
					<div class="teamInfo-1">产品发布</div>
					<div class="teamInfo-1">升级维护</div>
					<div class="teamInfo-1">产品研发</div>
					<div class="teamInfo-1">最新技术</div>
					<div class="teamInfo-1">了解更多</div>
				</div>
				<div class="teamInfo">
					<div class="teamInfo-1">关于我们</div>
					<div class="teamInfo-1">团队建设</div>
					<div class="teamInfo-1">品牌logo</div>
					<div class="teamInfo-1">独家赞助</div>
					<div class="teamInfo-1">了解更多</div>
				</div>
			</div>
			
			<!-- 联系我们 -->
			<div class="connection">
				<div class="conTitle">联系我们</div>
				<div class="information">
					<div class="info">
						<img src="img/icon01.png" />
						<div class="info-1">address：河北师范大学软件学院</div>
					</div>
					<div class="info">
						<img src="img/icon02.png"/>
						<div class="info-1">cal：15232182756</div>
					</div>
					<div class="info">
						<img src="img/icon03.png"/>
						<div class="info-1">team：BTFgroup</div>
					</div>
				</div>
				<div class="images">
					<img src="img/qq.png"/>
					<img src="./img/Wechat.png"/>
					<img src="img/weibo.png"/>
				</div>
			</div>
		</div>
	</div>
</body>
</html>