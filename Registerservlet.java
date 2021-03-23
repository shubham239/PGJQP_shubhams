package com.niit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registerservlet
 */
@WebServlet("/Registerservlet")
public class Registerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		          
		String n=request.getParameter("fullName");  
		String p=request.getParameter("email");  
		String e=request.getParameter("phonenumber");  
		String c=request.getParameter("jobtype");  
		String m=request.getParameter("createpassword");
		String a=request.getParameter("reapetpassword"); 
		          
		try{  
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
		Connection con=DriverManager.getConnection(  
				"jdbc:sqlserver://LAPTOP-9EDA795N;databasename=myhibernate","sa","niit@123");  
		  System.out.println(con);
		PreparedStatement ps=con.prepareStatement(  
		"insert into registeruser1 values(?,?,?,?,?,?)");  
		  
		ps.setString(1,n);  
		ps.setString(2,p);  
		ps.setString(3,e);  
		ps.setString(4,c);  
		ps.setString(5,m);  
		ps.setString(6,a);
		          
		int i=ps.executeUpdate();  
		if(i>0)  
		out.print("You are successfully registered...");  
		      
		          
		}catch (Exception e2) {System.out.println(e2);}  
		          
		out.close();  
		}  
		  
			
		
		
	}


