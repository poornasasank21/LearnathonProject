package com.klef.ep.services;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.klef.ep.models.StudentBean;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;

@WebServlet("/contactServlet")
public class contactServlet extends HttpServlet 
{

	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	  {
	      response.setContentType("text/html");
	      PrintWriter out=response.getWriter();
	     System.out.println("ii=");
	      String fname=request.getParameter("firstname");
	      String lname=request.getParameter("lastname");
	      String id=(String)request.getParameter("id");
	      String subject=request.getParameter("subject");
	      StudentBean b=new StudentBean();
	      System.out.println("in servlet");
	      b.insertQuery(fname, lname, id, subject);
	      out.print("sent sucess");
	      request.getRequestDispatcher("contactreqsentsucessfully.jsp").forward(request, response);
	      
	  }

}
