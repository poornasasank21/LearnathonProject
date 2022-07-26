package com.klef.ep.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="employee_table")
public class Employee implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name="employeeid")
	private int empid;
    @Column(name="employeename")
	private String empname;
    @Column(name="employeedept")
	private String empdept;
	
   public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}

}
