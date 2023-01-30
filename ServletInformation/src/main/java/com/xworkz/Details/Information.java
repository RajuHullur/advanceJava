package com.xworkz.Details;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 13,urlPatterns = "/friend")
public class Information extends HttpServlet {
	
	public Information() {
		System.out.println("Created information in no-arg constructer");
		
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Created init method");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	 System.out.println("Running  dopost in servlet "); 
	 String fname =req.getParameter("fname");
	 String lname =req.getParameter("lname");
	 String gender =req.getParameter("gender");
	 String reason =req.getParameter("reason");
	 String address =req.getParameter("address");
	 
	 System.out.println("fname");
	 System.out.println("lname");
	 System.out.println("gender");
	 System.out.println("reason");
	 System.out.println("address");

	 RequestDispatcher dispatch=req.getRequestDispatcher("Display.jsp");
	 req.setAttribute("fname", fname);
	 req.setAttribute("lname", lname);
	 req.setAttribute("gender", gender);
	 req.setAttribute("reason", reason);
	 req.setAttribute("address", address);
	 dispatch.forward(req,resp);
	 
	 resp.setContentType("text/html");
	}

}
