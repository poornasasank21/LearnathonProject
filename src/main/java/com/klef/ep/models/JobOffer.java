package com.klef.ep.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="offerdetails_table")
public class JobOffer implements Serializable
{
	@Id
	private String offerid;
	private String offername;
	private String role;
	private String reqCGPA;
	private String salary;
	private String reqminnoofbacklogs;
	private String reqnoofinternships;
	private String reqinterpercentage;
	private String reqtenthpercentage;
	private String specilization;
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
	public String getSpecilization() {
		return specilization;
	}
	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}
	
	
	

}
