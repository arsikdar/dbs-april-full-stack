package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside HelloServlet.doGet()!!!!!!");
		PrintWriter writer = resp.getWriter();
		
		resp.setContentType("text/html");
		
		writer.println("<html>");
		writer.println("<body>");
			writer.println("<h1>Hello to Web Servlets</h1>");
			writer.println("<h1>We learned how to handle GET request</h1>");
			writer.println("<h1>We learned how to sent HTML response</h1>");
		writer.println("</body>");
		writer.println("</html>");
	}

}
