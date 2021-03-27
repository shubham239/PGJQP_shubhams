package com.niit.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.niit.connection.ConnectionPro;
import com.niit.dao.UserDatabase;
import com.niit.model.user;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		//make user object
		user User =  new user(name, email, password);
		

		//create a database model
		UserDatabase regUser = new UserDatabase(ConnectionPro.getConnection());
		if (regUser.saveUser(User)) {
		   response.sendRedirect("login.jsp");
		} else {
		    String errorMessage = "Exception :: User not registered";
		    HttpSession regSession = request.getSession();
		    regSession.setAttribute("RegError", errorMessage);
		    response.sendRedirect("registration.jsp");
		    }
	}

}
