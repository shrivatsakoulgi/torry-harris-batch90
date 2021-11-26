<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<head>
<title> Login Form</title>
<link rel="stylesheet" href="style.css">
</link>
</head>
<body>
<h3>${message}</h3>
<h2>Enter your credentials:</h2>
<form action="login" method="post">
<center>
<table border=0>
<tr>
	<td> UserName:</td>
	<td><input type="text" name="user"></td>
</tr>
<tr>
	<td> Password:</td>
	<td><input type="password" name="password"></td>
</tr>
</table>
</center>
<br>
<input type="submit">
</form>
<br> <a href="register.html"> Click Here </a> to Register.
</body>

</html>
