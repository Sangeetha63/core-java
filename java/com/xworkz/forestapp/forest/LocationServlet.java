package com.xworkz.forestapp.forest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	@WebServlet(loadOnStartup = 15,urlPatterns = "/location")
	public class LocationServlet extends HttpServlet {

		public LocationServlet() {
			System.out.println("Created" +this.getClass().getSimpleName());
		}

		@Override
		public void init() throws ServletException {
		System.out.println("init config..");
		}
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Running LocationServlet on using doGet method");
			String name = req.getParameter("LocationName");
			String email = req.getParameter("LocationEmail");
			String startpoint = req.getParameter("startPoint");
			String destination = req.getParameter("destination");
			String gender = req.getParameter("gender");
			
			PrintWriter writer = resp.getWriter();

		   
			if(name.length()>3 && email.length()>3 && startpoint.length()>3) {
				writer.print("Location saved Successfully...." +name + " "+email+" "+startpoint+" "+destination+ " "+gender);
			}else if (name.length()<=3) {
				writer.print("failed !! Name is invalid");
			}else if(startpoint.length()<=3) {
				writer.print("Failed!! startPoint is invalid");
			}else if(destination.length()<=3)	{
				writer.print("Failed!! destination is invalid");
			}
		}
	}

