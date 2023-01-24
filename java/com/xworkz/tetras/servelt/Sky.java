package com.xworkz.tetras.servelt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup=4,urlPatterns ="/World")
public class Sky extends HttpServlet {
public Sky() {
	System.out.println("creating sky");
	
	
	}
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("running sky" + this.getClass().getSimpleName());
	} 
}
