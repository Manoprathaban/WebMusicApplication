package com.idiot.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UserActionServlet")
public class UserActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String instrument=request.getParameter("instrument");
		
		if(instrument==null) {
			return;
		}
		switch(instrument) {
		case "piano":
			response.sendRedirect("piano.html");
			break;
		case "guitar":
			response.sendRedirect("guitar.html");
		    break;
		case "violin":
			response.sendRedirect("violin.html");
		}
		
	}

}
