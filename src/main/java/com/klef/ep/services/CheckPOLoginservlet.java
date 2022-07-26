package com.klef.ep.services;


import java.io.*;
import javax.ejb.*;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.klef.ep.models.*;

/**
 * Servlet implementation class CheckPOLoginservlet
 */
@WebServlet("/CheckPOLoginservlet")
public class CheckPOLoginservlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@EJB(lookup = "")
	RecuriterService recuriterService;
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
	  
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
     
      String uname=request.getParameter("uname");
      String pwd=request.getParameter("psw");
      
      Recuriter u = recuriterService.userLogin(uname, pwd);
      
      if(u!=null)
      {
    	  HttpSession session=request.getSession();  
          session.setAttribute("name",uname);  
          session.setAttribute("pwd",pwd); 
          RequestDispatcher dispatcher = request.getRequestDispatcher("POLoginSucess.jsp");
          dispatcher.forward(request, response);

      }
      else
      {
    	  out.println("Login Failed");
      }
  }
  
  
}
