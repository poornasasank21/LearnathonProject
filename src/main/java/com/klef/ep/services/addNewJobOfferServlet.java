package com.klef.ep.services;

import javax.servlet.annotation.WebServlet;

import java.io.*;
import javax.ejb.*;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.klef.ep.models.*;
import com.klef.ep.services.JobOfferService;

@WebServlet("/addNewJobOffer")
public class addNewJobOfferServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	
	@EJB(lookup = "")
	JobOfferService jobOfferService; 
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	  {
		  
	      response.setContentType("text/html");
	      PrintWriter out=response.getWriter();
	      JobOffer j=new JobOffer();
	      
	      String offerid=request.getParameter("offerid");
	      String offername=request.getParameter("offername");
	      String role=request.getParameter("role");
	      String reqCGPA=request.getParameter("reqCGPA");
	      String salary=request.getParameter("salary");
	      String reqminnoofbacklogs=request.getParameter("reqminnoofbacklogs");
	      String reqnoofinternships=request.getParameter("reqnoofinternships");
	      String reqinterpercentage=request.getParameter("reqinterpercentage");
	      String reqtenthpercentage=request.getParameter("reqtenthpercentage");
	      String specilization=request.getParameter("specilization");
	      j.setOfferid(offerid);
	      j.setOffername(offername);
	      j.setReqCGPA(reqCGPA);
	      j.setReqinterpercentage(reqinterpercentage);
	      j.setReqminnoofbacklogs(reqminnoofbacklogs);
	      j.setReqnoofinternships(reqnoofinternships);
	      j.setReqtenthpercentage(reqtenthpercentage);
	      j.setRole(role);
	      j.setSalary(salary);
	      j.setSpecilization(specilization);
	      String output=jobOfferService.insertjoboffer(j);
	      if(output=="Object Inserted Successfully")
	      {
	    	  out.print("Object Inserted Successfully");
	    	  
	      }
	      else
	      {
	    	  out.print("Object Not Inserted Successfully");
	    	  
	    	  
	      }
	      
	      
	      
	      
	      
	  }
	 
	
    
}
