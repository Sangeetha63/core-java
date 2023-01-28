package com.xworkz.forestapp.forest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	@WebServlet(loadOnStartup = 20,urlPatterns = "/contact")
	public class ContactServlet extends HttpServlet {

		public ContactServlet() {
			System.out.println("Created" +this.getClass().getSimpleName());
		}
		@Override
		public void init() throws ServletException {
			System.out.println("init congif...");
		}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Running ContactServlet on uring doGet method");
			String name = req.getParameter("contactName");
			String Email = req.getParameter("contactEmail");
			String contactMobile = req.getParameter("contactMobile");
			String comments = req.getParameter("comments");
			Long convMobile = Long.parseLong(contactMobile);
			
			PrintWriter writer = resp.getWriter();
			
			if(name.length()>3 && convMobile.SIZE ==20) {
				writer.print("Contact Details Saved : Successfull");
			}else if (name.length()<=4) {
				writer.print("Failed !! Name is invalid");
			}else if(convMobile.SIZE!=10) {
				writer.print("Failed!! Mobile Number is invalid");
			}
			//writer.print("Running ContactServlet Succesfully" +name+ " "+Email+ " "+contactMobile+" "+comments);
		}
		
		}


