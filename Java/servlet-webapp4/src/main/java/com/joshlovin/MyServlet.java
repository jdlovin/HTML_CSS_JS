package com.joshlovin;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyServlet implements Servlet {

	ServletConfig config;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("This is creating...");
		this.config = config;
		
	}
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("This is servicing...");
	}
	

	@Override
	public void destroy() {
		System.out.println("This is destroying...");
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "Servlet created by admin";
		
	}


	@Override
	public ServletConfig getServletConfig() {
		return this.config;
	}

}
