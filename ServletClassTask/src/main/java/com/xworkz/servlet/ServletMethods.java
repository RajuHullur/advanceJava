package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/dowell", loadOnStartup = 10)
public class ServletMethods extends HttpServlet {

	public ServletMethods() {
		System.out.println("created " + getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running in doget in ServletMethods");
		String data = "Do servlet methods";
		PrintWriter writer = resp.getWriter();
		writer.print(true);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running in dopost in ServletMethods");
		PrintWriter writer = resp.getWriter();
		writer.print(true);
		resp.setContentType(getServletInfo());
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running in doput in ServletMethods");
		PrintWriter writer = resp.getWriter();
		writer.print(true);
		resp.setContentType(getServletInfo());
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running dodelete in ServletMethods");
	}

	@Override
	protected void doOptions(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Running DoOptions in Servlet methods");
	}

	@Override
	protected void doTrace(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Running dotrace in Servlets");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Running init of servlet mehods");
	}
		
}
