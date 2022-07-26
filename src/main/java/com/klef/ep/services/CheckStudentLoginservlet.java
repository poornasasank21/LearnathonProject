package com.klef.ep.services;

import java.io.FileWriter;
import java.io.IOException;
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

@WebServlet("/checkstudentloginservlet")
public class CheckStudentLoginservlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	@EJB(lookup = "")
	StudentService studentService;
	JobOfferService joboffer;
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
	  
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
     
      String uname=request.getParameter("uname");
      String pwd=request.getParameter("password");
      
      
      Student u = studentService.studentLogin(uname, pwd);
      
     
      
      if(u!=null)
      {
    	  HttpSession session=request.getSession();  
          session.setAttribute("uname",uname);  
          session.setAttribute("pwd",pwd); 
          RequestDispatcher dispatcher = request.getRequestDispatcher("studenthome.jsp");
          session.setAttribute("u", u);
          System.out.println(u.getDOB());
          
         
          
          
          dispatcher.forward(request, response);

      }
      else
      {
    	  out.println("Login Failed");
      }
  }
  
  
}
