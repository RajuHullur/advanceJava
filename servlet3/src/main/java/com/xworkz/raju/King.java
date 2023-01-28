package com.xworkz.raju;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 4,urlPatterns = "/queen")
public class King extends HttpServlet {
	
	public King() {
		System.out.println("Created ");
	
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Inside init method is created ");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("king Running succsecsfully");
		String name = req.getParameter("King_Name");
		String region = req.getParameter("Region");
		String noOfQueens = req.getParameter("NoOfQueens");
		String dob = req.getParameter("DOB");
		String dod = req.getParameter("DOD");

		System.out.println("Name" + name + "Region" + region + "NoOfQueens" + noOfQueens + "DOB" + dob + "DOD" + dod);

		PrintWriter printwriter = resp.getWriter();
		printwriter.print("<html>");
		printwriter.print("<body>");
		printwriter.print("span");
		
		printwriter.print("King Name" + name + "is saved succesfully");
		
		printwriter.print("</span>");
		printwriter.print("</body>");
		printwriter.print("</html>");
		
		resp.setContentType("text/html");
	
	}
}
