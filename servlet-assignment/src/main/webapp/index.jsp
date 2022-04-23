<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/home.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	
	<h1>Welcome to JAVA web application</h1>
	<!-- <a href ="<%=request.getContextPath()%>/home">click here to invoke the servlet</a> -->
	<h2>Login Page</h2>
	<form action="<%=request.getContextPath()%>/home" method="post">
		<label for="uname">Enter Username</label>
		<input type="text" name="uname" placeholder="enter username"/><br><br>
		
		<label for="pwd">Enter Password</label>
		<input type="password" name="pwd" placeholder="enter password"/><br><br>
		
		<input type="submit" value="Login Here"/>
	</form>
</body>
</html>