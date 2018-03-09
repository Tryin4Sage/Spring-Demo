<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<html>
<head>
<title>用户登录</title>
</head>
<body style="font-size: 30px;">
	<form action="hLogin.do" method="post">
		<div align="center">
			<p>请输入用户名:</p>
			<p><input type="text" name="name"/></p>
			<p>请输入密码:</p>
			<p><input type="text" name="pwd"/></p>
			
			<p>请输入验证码:</p>
			<p><input type="text" name="checkcode"/></p>
			
			<p><input type="submit" value="登录"/></p>
		</div>
	</form>
</body>
</html>
