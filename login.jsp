<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link href="css/loginpagecss.css" >
<%@include file="componets/common_css_js.jsp" %>
</head>
<body>

<%@include file="componets/NavBar.jsp" %>

 <div class="container login-container">
      <div class="row">

        <div class="col-md-6 offset-3 mt-5 login-form">
         
          <h3>Login</h3>
          <form>
            <div class="form-group">
              <input type="text" class="form-control" name="username" placeholder="Username">
            </div>
            <div class="form-group">
              <input type="text" class="form-control" name="password" placeholder="Password">
            </div>
            <div class="form-group">
              <button type="button" class="btn btn-primary btn-lg btn-block">Sign In</button>
            </div>
            <div class="form-group forget-password">
                <a href="#">Forget Password</a>
            </div>
          </form>
        </div>
      </div>
    </div>
 

</body>
</html>