package com.joshlovin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Profile extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		try(PrintWriter out = response.getWriter()) {
			out.println("<!DOCTYPE html>");
			out.println("<HTML>");
			out.println("<head>");
			out.println("<title>Profile page</title>");
			out.println("</head>");
			out.println("<body>");
			
			//getCookies 
			Cookie[] cookies = request.getCookies();
			boolean flag = false;
			String password = "";
			String username = "";
			if(cookies == null) {
				out.println("<h1> You are not signed in or a new user, please go to the homepage and sign in</h1>");
				return;
			} else {
				for(Cookie userC : cookies) {
					String uName = userC.getName();
					if(uName.equals("user_name")) {
						flag = true;
						username = userC.getValue();
					}
				}
			}
			
			if(flag) {
				out.println("<h1>Hello, " + username + " welcome back to my website..</h1>");
			}
			
			out.println("</body>");
			out.println("</html");
			
		}
	}

}
