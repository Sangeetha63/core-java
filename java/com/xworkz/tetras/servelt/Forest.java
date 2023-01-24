package com.xworkz.tetras.servelt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup =3,urlPatterns ="/nan")
public class Forest extends HttpServlet {
	public Forest() {
		System.out.println("forest is green colour");
	}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("running forest " + this.getClass().getSimpleName());
		}
		
	}


