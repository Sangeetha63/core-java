package com.xworkz.moonapp.moon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/Jaga")
public class Vehicles extends HttpServlet {
	
	

		//private ServletResponse resp;
		//private PrintWriter writer;
		public Vehicles() {
			System.out.println("Creating vehicles Servlet....");
		}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Running vehicles servlet on using doGet method....");
			String data = "vehicles ";
			
			PrintWriter writer = resp.getWriter();
		    writer.print(data);
			resp.setContentType("text/plain");
		}
		
		@Override
		public void init(ServletConfig config) throws ServletException {
			System.out.println("Running vehicles servlet on using init method....");
			
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Running vehicles servlet on using doPost method....");
			
		}
		
		@Override
		protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Running vehicles servlet on using doPut method......");
			String data = "vehicles laptop ";
			PrintWriter writer = resp.getWriter();
			writer.print(data);
			resp.setContentType("text/plain");
		}
		
		@Override
		protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running vehicles servlet on  using doDelete method.....");
		
		}
		
		@Override
		protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Running vehicles servlet on using doHead method...");
			
		}
	  
		@Override
		protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running vehicles servlet on using doOptions method...");
		
		}
		@Override
		protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running vehicles servlet on using doTrace method");
		
		}
	}
		
		



