package com.idiot.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;


@WebServlet("/InstrumentServlet")
public class InstrumentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("application/json");
		
		String instrument=request.getParameter("instrument");
		
		if(instrument==null) {
			response.getWriter().println("<h2>Please choose..</h2>");
			return;
		}
		String apiKey="meY37jfDvRIe2gB9J2L7zIfXqtoyRKxYWDT5B4cL";
		String apiUrl="https://freesound.org/apiv2/search/text/?query=\" + instrument + \"+\" + note + \"&token=\" + apiKey";
		
		URL url=new URL(apiUrl);
		HttpURLConnection conn=(HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.connect();
		
		int responseCode=conn.getResponseCode();
		
		if(responseCode!=200) {
			response.getWriter().println("{\"error\": \"API request failed\"}");
			return;
		}
		
		
		
		
}
		
				

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
