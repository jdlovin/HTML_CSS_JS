package com.joshlovin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstPage extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		try(PrintWriter out = response.getWriter()) {
			out.println("<!DOCTYPE html>");
			out.println("<HTML>");
			out.println("<Head>");
			out.println("<Title>Servlet State Management</Title>");
			out.println("</Head>");
			out.println("<Body>");
			
			String name = request.getParameter("name");
			out.println("<h1>Hello, " + name + " welcome to my website...</h1>");
			out.println("<h1><a href='secondpage'>Go to second page</a></h1>");
			
			//create a cookie, chocolate and peanut butter
			Cookie c = new Cookie("user_name", name);
			response.addCookie(c);
			
			out.println("</Body>");
			out.println("</Html>");
		}
	}

}
