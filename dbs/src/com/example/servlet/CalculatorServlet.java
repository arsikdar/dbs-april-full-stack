package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class CalculatorServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside CalculatorServlet.doGet()!!!!!!");
		
		String val1 = req.getParameter("valOne");
		String val2 = req.getParameter("valTwo");
		
		int i = Integer.parseInt(val1);
		int j = Integer.parseInt(val2);
		
		PrintWriter writer = resp.getWriter();
		
		resp.setContentType("text/html");
		
		writer.println("<html>");
		writer.println("<body>");
			writer.println("<h1>");
				writer.println("Result : "+(i+j));
			writer.println("</h1>");
		writer.println("</body>");
		writer.println("</html>");
	}

}
