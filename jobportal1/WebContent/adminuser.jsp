<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="components/common_css.jsp" %></head>
<body>
<%@ include file="components/navbar.jsp" %>
<div class="contact-info-form col-md-6 offset-md-3 mt-5"> <span class="circle one"></span> <span class="circle two"></span>
            <form action="JobServlet" method="post">
                <h3 class="title">ADD JOBS </h3>
                <div class="social-input-containers"> <input type="text" name="jobid" class="input" placeholder="jobid" /> </div>
                <div class="social-input-containers"> <input type="text" name="jobname" class="input" placeholder="jobname" /> </div>
                <div class="social-input-containers"> <input type="text" name="applaydate" class="input" placeholder="applydate" /> </div>
                <div class="social-input-containers textarea"> <textarea name="jobDescription" class="input" placeholder="jobdescription"></textarea> </div>
                 <input type="submit" value="Add" class="btn" />
                 <input type="submit" value="Update" class="btn btn-success" />
                 <input type="submit" value="Delete" class="btn btn-danger" />
        
                 
            </form>    
        </div>

</body>
</html>