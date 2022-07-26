package com.klef.ep.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="recruiter_table")
public class Recuriter implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="rid")
	private String rid;
	private String rname;
	private String rpass;
	private String company;
	private String role;
	private String exp;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
