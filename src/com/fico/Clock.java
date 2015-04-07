package com.fico;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Clock extends HttpServlet {
	 protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		        throws ServletException, IOException {
		 	//System.out.print("6:00:00");
		 	DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		 	 Calendar cal = Calendar.getInstance();
		 	String date1= dateFormat.format(cal.getTime());
		 	
		 	req.getParameter("data1"); // what it do
		 	String dateJsonString = "{date:" + "'" + date1 + "'" + ", name:'asia-pac'}";
		 	resp.getOutputStream().print(dateJsonString);
	  }
	 
	  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		        throws ServletException, IOException {
		    	doPost(req, resp);
	  }
	  
	 
}
