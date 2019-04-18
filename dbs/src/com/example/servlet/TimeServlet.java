package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TimeServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside TimeServlet.doGet()!!!!!!");
		PrintWriter writer = resp.getWriter();
		
		resp.setContentType("text/html");
		
		writer.println("<html>");
		writer.println("<body>");
			writer.println("<h1>");
				writer.println("Current Time : "+LocalDateTime.now());
			writer.println("</h1>");
		writer.println("</body>");
		writer.println("</html>");
	}

}
