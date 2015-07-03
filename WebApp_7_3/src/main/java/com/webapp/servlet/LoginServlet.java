package com.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("I have received the request");
		
		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");
	//	out.println("username: "+username);
		//out.println("password: "+password);
		
		if(username.equals("amitk") && password.equals("admin123")){
			//out.println("<h1>Credentials matched</h1>");
			response.sendRedirect("html/home.html");
		}else{
			//out.println("<h1>Invalid Credentials. Try again.</h1>");
			response.sendRedirect("html/login.html");
		}
		out.close();
	}

}
