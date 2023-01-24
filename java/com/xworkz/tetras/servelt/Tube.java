package com.xworkz.tetras.servelt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup =2,urlPatterns ="/ra")
public class Tube extends HttpServlet {
	public Tube() {
		System.out.println("creating file");

	}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("running " + this.getClass().getSimpleName());
		}
	}

