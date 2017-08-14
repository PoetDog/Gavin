<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="login" method="post">
	<table align="center">
		<tr>
			<td>用户名：</td>
			<td><input type="text" name="name"/></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type="password" name="pwd"/></td>
		</tr>
		<tr>
			<td>性别：</td>
			<td>
				<input type="radio" name="sex" value="男">男
				<input type="radio" name="sex" value="女">女
			</td>
		</tr>
		<tr>
			<td>年龄：</td>
			<td><input type="text" name="age"/></td>
		</tr>
		<tr>
			<td>Email：</td>
			<td><input type="text" name="email"/></td>
		</tr>
		<tr>
			<td	colspan="2" align="center">
				<input type="submit" value="注册">
				<input type="reset" value="重置">		
			</td>
		</tr>
	</table>
</form>
</body>
</html>