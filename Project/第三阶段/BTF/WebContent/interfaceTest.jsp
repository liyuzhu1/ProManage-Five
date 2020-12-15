<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="/BTF/css/interfaceTest.css" type="text/css">
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
		<!-- 右侧区域内容 -->
		<div class="rightPage">
			<!-- GET/POST…… -->
			<div class="searchM">
				<!-- 下拉框 -->
				<select class="optionMethod" id="optionMethod" value="GET">
    				<option value="GET">GET</option>
    				<option value="POST">POST</option>
    				<option value="PUT">PUT</option>
    				<option value="PATCH">PATCH</option>
    				<option value="DELETE">DELETE</option>
    				<option value="COPY">COPY</option>
    				<option value="HEAD">HEAD</option>
    				<option value="OPTIONS">OPTIONS</option>
    				<option value="LINK">LINK</option>
    				<option value="UNLINK">UNLINK</option>
    				<option value="PURGE">PURGE</option>
    				<option value="LOCK">LOCK</option>
    				<option value="UNLOCK">UNLOCK</option>
    				<option value="PROPFIND">PROPFIND</option>
    				<option value="VIEW">VIEW</option>
				</select>
				<!-- input -->
				<div class="search_box">
					<input class="search_text" type="text" value="Enter request URL" name="text" />
				</div>
				<!-- 按钮 -->
				<button class="send" type="button">Send</button>
				<button class="save" type="button">Save</button>
			</div>
			<!-- Body/Headers -->
			<div class="type">
				<p class="Body">Body</p>
				<p class="Params">Params</p>
				<p class="Authorization">Authorization</p>
				<p class="Headers">Headers</p>
				<p class="Pre-request Script">Pre-request Script</p>
				<p class="Tests">Tests</p>
				<p class="Settings">Settings</p>
			</div>
			<!-- typeSpecific -->
			<div class="typeSpecific">
				<!-- 单选框 -->
				<div class="checkR">
					<input id="none" type="radio" value="none" name="none" />
					<p>none</p>
					<input id="form-data" type="radio" value="form-data" name="form-data" />
					<p>form-data</p>
					<input id="x-www-form-urlencoded" type="radio" value="x-www-form-urlencoded" name="x-www-form-urlencoded"/>
					<p>x-www-form-urlencoded</p>
					<input id="raw" type="radio" value="raw" name="raw" checked="checked"/>
					<p>raw</p>
					<input id="binary" type="radio" value="binary" name="binary"/>
					<p>binary</p>
					<input id="GraphQL" type="radio" value="GraphQL" name="GraphQL"/>
					<p>GraphQL</p>
				</div>

				<!-- 下拉框 -->
				<div class="optionts">
					<select class="optionTS" value="Text">
						<option value="Text">Text</option>
						<option value="JavaScript">JavaScript</option>
						<option value="JSON">JSON</option>
						<option value="HTML">HTML</option>
						<option value="XML">XML</option>
					</select>
				</div>
				<!-- context -->
				<div class="context">
					<div class="request">
						<textarea name="request" cols="40" rows=10  style="OVERFLOW:hidden"></textarea>
					</div>
				</div>
			</div>
			<!-- response -->
			<div class="response">
				<p>Response</p>
				<div class="response_Context">
				</div>
			</div>
		</div>
		
	</div>
</body>
</html>