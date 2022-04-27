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

	<div class="loginform">
	<div class="container loginform">
	<h1>Login Form</h1>
	<!-- <a href ="<%=request.getContextPath()%>/home">click here to invoke the servlet</a> -->
	
	<form action="<%=request.getContextPath()%>/home" method="post">
		
		<input type="text" name="uname" placeholder="enter username" class="form-control"/><br><br>
		
		
		<input type="password" name="pwd" placeholder="enter password" class="form-control"/><br><br>
		
		<input type="submit" value="Login" class="btn btn-secondary"/>
	</form>
	</div>
	</div>
</body>
</html>