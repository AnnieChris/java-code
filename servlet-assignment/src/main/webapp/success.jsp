<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/home.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body class="success">

	<div class="container successpage">
		<h1>Hello ${user.username}</h1>
		<h2>You have Successfully logged in <span style='font-size:20px;'>&#9989;</span></h2>
		<table>
		<caption>Personal Details</caption>
			<tbody>
				<tr class="text-capitalize">
					<td>Name : </td>
					<td>${user.username}</td>
				</tr>
				<tr>
					<td>Email : </td>
					<td>${user.email}</td>
				</tr>
				<tr>
					<td>Date Of Birth : </td>
					<td>${user.dateOfBirth}</td>
				</tr>
				<tr>
					<td>Contact : </td>
					<td>${user.contact}</td>
				</tr>
				<tr>
					<td>Address : </td>
					<td>${user.address}</td>
				</tr>
			</tbody>
		</table>
		
	</div>
</body>
</html>