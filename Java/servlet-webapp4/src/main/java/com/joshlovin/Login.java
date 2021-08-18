package com.joshlovin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	
	public void doGet(HttpServletResponse response, HttpServletRequest request) throws IOException {
		response.setContentType("text/html");
		try(PrintWriter out = response.getWriter()) {
			out.println("<!DOCTYPE html>");
			out.println("<HTML>");
			out.println("<Head>");
			out.println("<Title>Profile page</Title>");
			out.println("</Head>");
			out.println("<Body>");
			
			String username = request.getParameter("user_name");
			String password = request.getParameter("user_password");
			out.println("<h1>Hello, " + username + " you have logged in</h1>");
			
			//create a cookie for the username
			Cookie userC = new Cookie("user_name", username);
			response.addCookie(userC);
			
			//create a cookie for the password
			Cookie passC = new Cookie("user_password", password);
			response.addCookie(passC);
			
			out.println("</Body>");
			out.println("</HTML>");
		}
	}

}
