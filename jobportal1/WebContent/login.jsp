<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
 <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
<%@include file="components/common_css.jsp" %>

</head>

<%@include file="components/navbar.jsp" %>
	<div class="container">
		<div class="box">
			<img class="avatar" src="img/user-avatar.jpg">
			<h1>Login Account</h1>
			<form action="LoginServlet" method="post">
				<p>Username</p>
				<input type="text" placeholder="Username" name="email" required>
				<p>Password</p>
				<input type="password" placeholder="Password" name="password"
					required> <input type="submit" value="Login"> 
				    <a href="registration.jsp">Create
					New Account</a>
			</form>
		</div>
	</div>
</body>

</html>