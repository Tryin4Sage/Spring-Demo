<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<html>
<head>
<title>用户注册</title>
</head>
<body style="font-size: 30px;">
		<div align="center">
		
		<form action="hReg.do" method="post">
			<p>请输入用户名:</p>
			<p><input type="text" name="name"/></p>
			<p>请输入密码:</p>
			<p><input type="text" name="pwd"/></p>
			<p>请输入年龄:</p>
			<p><input type="text" name="age"/></p>
			<p>请输入城市:</p>
			<p><input type="text" name="from"/></p>
			<p>请输入验证码:</p>
			<p><input type="text" name="checkcode"/></p>
			
			<p><input type="submit" value="注册"/></p>
		</form>
		</div>
</body>
</html>
