package com.klef.ep.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="student_table")
public class Student implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String name;
	private String DOB;
	private String gender;
	private String adress;
	private String pnum;
	private String email;
	private String password;
	//education details
	private String University;
	private String joindate;
	private String endingdate;
	private String cgpa;
	private String branch;
	private String aboutme;
	private String noofintershipscertidied;
	private String noofbacklogs;
	private String linkedinurl;
	private String technicalskill;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUniversity() {
		return University;
	}
	public void setUniversity(String university) {
		University = university;
	}
	public String getJoindate() {
		return joindate;
	}
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	public String getEndingdate() {
		return endingdate;
	}
	public void setEndingdate(String endingdate) {
		this.endingdate = endingdate;
	}
	public String getCgpa() {
		return cgpa;
	}
	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAboutme() {
		return aboutme;
	}
	public void setAboutme(String aboutme) {
		this.aboutme = aboutme;
	}
	public String getNoofintershipscertidied() {
		return noofintershipscertidied;
	}
	public void setNoofintershipscertidied(String noofintershipscertidied) {
		this.noofintershipscertidied = noofintershipscertidied;
	}
	public String getNoofbacklogs() {
		return noofbacklogs;
	}
	public void setNoofbacklogs(String noofbacklogs) {
		this.noofbacklogs = noofbacklogs;
	}
	public String getLinkedinurl() {
		return linkedinurl;
	}
	public void setLinkedinurl(String linkedinurl) {
		this.linkedinurl = linkedinurl;
	}
	public String getTechnicalskill() {
		return technicalskill;
	}
	public void setTechnicalskill(String technicalskill) {
		this.technicalskill = technicalskill;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}

