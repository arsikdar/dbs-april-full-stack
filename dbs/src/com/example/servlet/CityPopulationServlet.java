package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/population")
public class CityPopulationServlet extends HttpServlet {

	Map<String, Long> cityPopulationMap = new HashMap<>();

	@Override
	public void init() throws ServletException {
		System.out.println("Inside CityPopulationServlet.init()!!!!!");
		cityPopulationMap.put("Delhi", 8000000L);
		cityPopulationMap.put("Mumbai", 999999000L);
		cityPopulationMap.put("Pune", 700000L);
		cityPopulationMap.put("Hyderabad", 7000000L);
		cityPopulationMap.put("Channai", 4000000L);
		cityPopulationMap.put("Calcutta", 4000000L);
		cityPopulationMap.put("Hyderabad", 9000000L);
	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside CalculatorServlet.doGet()!!!!!!");

		String city = req.getParameter("city");

		PrintWriter writer = resp.getWriter();

		resp.setContentType("text/html");

		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("City : " + city);
		writer.println("<br />");
		writer.println("Population : " + cityPopulationMap.get(city));
		writer.println("</h1>");
		writer.println("</body>");
		writer.println("</html>");
	}
	
	@Override
	public void destroy() {
		System.out.println("Inside CityPopulationServlet.destroy()!!!!!");
		cityPopulationMap.clear();
		cityPopulationMap = null;
	}

}
