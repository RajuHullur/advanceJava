package com.xworkz.dummyServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1, urlPatterns = "/tom")
public class Series extends HttpServlet {
	
	
	public Series() {
		System.out.println("Constructor");
	}

	
	@Override
	public void init() throws ServletException {
		System.out.println("Inside init");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("WebSeries Running succsecsfully");
		String name = req.getParameter("webSeries_Name");
		String language = req.getParameter("webSeries_Language");
		String episodes = req.getParameter("webSeries_Episodes");
		String OTT = req.getParameter("webSeries_ott");
		String budget = req.getParameter("webSeries_Budget");

		System.out.println("Name" + name + "Lang" + language + "Episode" + episodes + "ott" + OTT + "Budget" + budget);

		PrintWriter printwriter = resp.getWriter();
		printwriter.print("<html>");
		printwriter.print("<body>");
		printwriter.print("span");
		
		printwriter.print("Web Series Name" + name + "is saved succesfully");
		
		printwriter.print("</span>");
		printwriter.print("</body>");
		printwriter.print("</html>");
		
		resp.setContentType("text/html");
	}
}
