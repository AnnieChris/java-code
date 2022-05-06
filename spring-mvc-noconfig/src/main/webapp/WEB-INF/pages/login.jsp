<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/validate" name="loginForm" method="post" style="width:250px">
		<h2>Login Form</h2>
		<div style="width:100%;margin-top:10px;">
			<div style="display:inline-block;width:49%;">Username : </div>
			<div style="display:inline-block;width:49%;text-align: right">
				<input type="text" name="username" style="width:80px;" id="username"/>
			</div>
		</div>
		<div style="width:100%;margin-top:10px;">
			<div style="display:inline-block;width:49%;">Password : </div>
			<div style="display:inline-block;width:49%;text-align: right;">
				<input type="password" name="password" style="width:80px;" id="password"/>
			</div>
		</div>
		<div style="width:100%;text-align: right;margin-top:10px;">
			<input type="submit" value="Login"/>
		</div>
	</form>
</body>
</html>