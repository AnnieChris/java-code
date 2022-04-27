<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Welcome to JAVA web application</h1>
	<h2>Login Page:</h2>	
	<form action="<%=request.getContextPath()%>/test">
		<input type="text" name="uname" placeholder="enter username"/><br><br>
		<input type="password" name="pwd" placeholder="enter password"/><br><br>
		
		<hr>
		<h1>Let's do some Testing</h1>
		Put the url you want to Test : <input type="text" name="url" size="100" placeholder="enter url"/><br><br>
		<input type="submit" value="start testing"/>
		
		
	</form>

</body>
</html>