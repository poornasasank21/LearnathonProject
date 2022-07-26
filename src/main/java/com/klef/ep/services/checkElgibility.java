package com.klef.ep.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.io.*;
import java.util.List;

import javax.ejb.*;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.klef.ep.models.*;
import com.klef.ep.services.*;

@WebServlet("/checkElgibility")
public class checkElgibility extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	  {
		  
	      response.setContentType("text/html");
	      PrintWriter out=response.getWriter();
	     Functions f=new Functions();
	      String offerid=(String)request.getParameter("offerid");
	      String studentid=(String)request.getParameter("studentid");
	      String res=f.checkelg(offerid, studentid);
	      if(res=="true")
	      {
	    	  HttpSession session=request.getSession();
	    	  session.setAttribute("offerid",offerid);  
	          session.setAttribute("studentid",studentid); 
	          session.setAttribute("res", res);
	          System.out.println("hi");
	          RequestDispatcher dispatcher = request.getRequestDispatcher("student_offer.jsp");
	          dispatcher.forward(request, response);
	    	  
	      }
	      else
	      {
	    	  HttpSession session=request.getSession();
	    	  session.setAttribute("offerid",offerid);  
	          session.setAttribute("studentid",studentid); 
	          session.setAttribute("res", res);
	          RequestDispatcher dispatcher = request.getRequestDispatcher("student_offer.jsp");
	          dispatcher.forward(request, response);
	    	  
	    	  
	      }
	      
	  }
	  
	  
	
	
}
