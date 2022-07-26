package com.klef.ep.models;

import java.util.List;

import javax.ejb.*;
import javax.faces.bean.ManagedBean;

import com.klef.ep.services.EmployeeService;
import com.klef.ep.services.RecuriterService;

@ManagedBean(name = "rBean",eager = true)
public class RecuriterBean 
{
	@EJB(lookup = "java:global/JPAWebServicesCRUDOperationsProject/RecuriterServiceImpl!com.klef.ep.services.RecuriterService")
	RecuriterService recuriterService;
	public void insertemp()
	{
		try
		{
			Recuriter r = new Recuriter();
			r.setCompany(company);
			r.setExp(exp);
			r.setRid(rid);
			r.setRname(rname);
			r.setRole(role);
			r.setRpass(rpass);
			
			response=recuriterService.inserteRecuriter(r);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			response=e.getMessage();
			
		}
	}
	private String rid;
	private String rname;
	private String rpass;
	private String company;
	private String role;
	private String exp;
	private String response;
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getRpass() {
		return rpass;
	}
	public void setRpass(String rpass) {
		this.rpass = rpass;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}

}
