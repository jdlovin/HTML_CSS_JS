package com.joshlovin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Welcome to register servlet</h1>");
		
		String name = request.getParameter("user_name");
		String password = request.getParameter("user_password");
		String email = request.getParameter("user_email");
		String city = request.getParameter("user_city");
		String gender = request.getParameter("user_gender");
		String agreement = request.getParameter("agreement");
		if(agreement.equals("accepted")) {
			out.println("<h1>Name " + name + "</h1>");
			out.println("<h1>Email " + email + "</h1>");
			out.println("<h1>Password" + password + "</h1>");
			out.println("<h1>City " + city + "</h1>");
			out.println("<h1>Gender " + gender + "</h1>");
		} else {
			out.println("<h1>you have not agreed to the conditions and terms</h1>");
		}
		
	}

}
