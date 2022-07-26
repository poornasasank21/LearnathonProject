package com.klef.ep.models;

import java.util.List;

import javax.ejb.*;
import javax.faces.bean.ManagedBean;

import com.klef.ep.services.EmployeeService;

@ManagedBean(name = "empBean",eager = true)
public class EmployeeBean 
{
	private int eid;
	private String ename;
	private String edept;
	private String response;
	
	List<Employee> emplist;
	
	@EJB(lookup = "java:global/JPAWebServicesCRUDOperationsProject/EmployeeServiceImpl!com.klef.ep.services.EmployeeService")
	EmployeeService employeeService;
	public void insertemp()
	{
		try
		{
			Employee emp = new Employee();
			emp.setEmpid(eid);
			emp.setEmpname(ename);
			emp.setEmpdept(edept);
			response=employeeService.insertemployee(emp);
		}
		catch(Exception e)
		{
			response=e.getMessage();
		}
	}
	
	

	
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEdept() {
		return edept;
	}

	public void setEdept(String edept) {
		this.edept = edept;
	}

	
	
	
	public void updateemp()
	{
		try
		{
			Employee emp = new Employee();
			emp.setEmpid(eid);
			emp.setEmpname(ename);
			emp.setEmpdept(edept);
			response=employeeService.updateemployee(emp, eid);
		}
		catch(Exception e)
		{
			response=e.getMessage();
		}
	}
	public void deleteemp()
	{
		try
		{
			response=employeeService.deleteemployee(eid);
		}
		catch(Exception e)
		{
			response=e.getMessage();
		}
	}
	public void viewallemp()
	{
		try
		{
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public List<Employee> getEmplist() 
	{
		return employeeService.viewallemployees();
	}
	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}

}
