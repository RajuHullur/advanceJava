package com.xworkz;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2, urlPatterns = "/Amount")
public class Bank extends HttpServlet {
	
	  public Bank() {
		  System.out.println("Atm is create"+getClass().getSimpleName());
			}
	  
	  
	  @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  System.out.println("Running Succesfully");
	  }		  
}
