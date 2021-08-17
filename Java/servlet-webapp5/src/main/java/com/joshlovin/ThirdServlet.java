package com.joshlovin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {
	
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("This is get method of my Servlet");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Get method called</h1>");
		
	}
	
	public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("This is the post method of my servlet");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>post method called</h1>");
	}
}
