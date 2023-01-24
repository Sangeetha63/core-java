package com.xworkz.tetras.servelt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup =7,urlPatterns ="/sangu")
public class Light extends HttpServlet {
	public Light() {
		System.out.println("light is white colour");
	}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("running light " + this.getClass().getSimpleName());
		}
		
	}
}
