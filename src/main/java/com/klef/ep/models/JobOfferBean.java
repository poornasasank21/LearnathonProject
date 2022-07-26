package com.klef.ep.models;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.klef.ep.services.JobOfferService;
import com.klef.ep.services.RecuriterService;

@ManagedBean(name = "jBean",eager = true)
public class JobOfferBean 
{
	@EJB(lookup = "java:global/JPAWebServicesCRUDOperationsProject/JobOfferServiceImpl!com.klef.ep.services.JobOfferService")
	JobOfferService jobOfferService;
	public void insertjoboffer(JobOffer j)
	{
		String response;
		try
		{
			
			response=jobOfferService.insertjoboffer(j);
						
		}
		catch(Exception e)
		{
			System.out.println(e);
			
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	private String offerid;
	private String offername;
	private String role;
	private String reqCGPA;
	private String salary;
	private String specilization;
	public String getSpecilization() {
		return specilization;
	}
	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}
	private String reqminnoofbacklogs;
	private String reqnoofinternships;
	private String reqinterpercentage;
	private String reqtenthpercentage;
	
	public String getOfferid() {
		return offerid;
	}
	public void setOfferid(String offerid) {
		this.offerid = offerid;
	}
	public String getOffername() {
		return offername;
	}
	public void setOffername(String offername) {
		this.offername = offername;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getReqCGPA() {
		return reqCGPA;
	}
	public void setReqCGPA(String reqCGPA) {
		this.reqCGPA = reqCGPA;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getReqminnoofbacklogs() {
		return reqminnoofbacklogs;
	}
	public void setReqminnoofbacklogs(String reqminnoofbacklogs) {
		this.reqminnoofbacklogs = reqminnoofbacklogs;
	}
	public String getReqnoofinternships() {
		return reqnoofinternships;
	}
	public void setReqnoofinternships(String reqnoofinternships) {
		this.reqnoofinternships = reqnoofinternships;
	}
	public String getReqinterpercentage() {
		return reqinterpercentage;
	}
	public void setReqinterpercentage(String reqinterpercentage) {
		this.reqinterpercentage = reqinterpercentage;
	}
	public String getReqtenthpercentage() {
		return reqtenthpercentage;
	}
	public void setReqtenthpercentage(String reqtenthpercentage) {
		this.reqtenthpercentage = reqtenthpercentage;
	}
	

}
