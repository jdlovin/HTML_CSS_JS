package com.joshlovin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Welcome to the calc</h1>");
		
		int firstNum = Integer.parseInt(request.getParameter("first_number"));
		int secNum = Integer.parseInt(request.getParameter("second_number"));
		String operator = request.getParameter("operator");
		switch(operator) {
		case "multiply":
			out.println("Here is your output: " + (firstNum * secNum) );
			break;
		case "subtract":
			out.println("Here is your output: " + (firstNum - secNum) );
			break;
		case "add":
			out.println("Here is your output: " + (firstNum + secNum) );
			break;
		case "divide":
			out.println("Here is your output: " + (firstNum / secNum) );
			break;
		}
		
	}

}
