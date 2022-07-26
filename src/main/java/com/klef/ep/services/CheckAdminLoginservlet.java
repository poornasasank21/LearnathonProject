package com.klef.ep.services;

import java.io.*;
import javax.ejb.*;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.klef.ep.models.*;

@WebServlet("/CheckAdminLoginservlet")
public class CheckAdminLoginservlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	@EJB(lookup = "")
	AdminService adminService;
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
	  
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
     
      String uname=request.getParameter("uname");
      String pwd=request.getParameter("password");
      
      Admin u = adminService.userLogin(uname, pwd);
      
      if(u!=null)
      {
    	  HttpSession session=request.getSession();  
          session.setAttribute("name",uname);  
          session.setAttribute("pwd",pwd); 
          RequestDispatcher dispatcher = request.getRequestDispatcher("AdminLoginSuccess.jsp");
          dispatcher.forward(request, response);

      }
      else
      {
    	  out.println("Login Failed");
      }
  }
  
  
}
