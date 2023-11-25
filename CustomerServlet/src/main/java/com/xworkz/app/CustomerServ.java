package com.xworkz.app;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/rohit",loadOnStartup = 3)
public class CustomerServ extends HttpServlet {

	
	public CustomerServ() {
	System.out.println("servelate is created..");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String slno=req.getParameter("slno");
	String fname=req.getParameter("fname");
	String	lname=req.getParameter("lname");
	String	mname=req.getParameter("mname");
	String	emali=req.getParameter("email");
	String	gender=req.getParameter("gender");
	String	cnumber=req.getParameter("cnmuber");
	String area=req.getParameter("area");
	String	distic=req.getParameter("distic");
	String	state=req.getParameter("state");
	String pincode=req.getParameter("pincode");
	
	CustomerServ customerServ=new CustomerServ();
	req.setAttribute("customerServ", customerServ);
			
	
	RequestDispatcher dispatcher=req.getRequestDispatcher("mocksucces.jsp");
	dispatcher.forward(req,resp);
	}

}