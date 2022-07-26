package com.klef.ep.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import javax.ejb.*;
import javax.faces.bean.ManagedBean;
import com.klef.ep.services.StudentService;


@ManagedBean(name = "sBean",eager = true)
public class StudentBean 
{
	@EJB(lookup = "java:global/JPAWebServicesCRUDOperationsProject/StudentServiceImpl!com.klef.ep.services.StudentService")
	StudentService studentservice;
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
	private String response;
	
	
	public StudentService getStudentservice() {
		return studentservice;
	}


	public void setStudentservice(StudentService studentservice) {
		this.studentservice = studentservice;
	}


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


	public String getResponse() {
		return response;
	}


	public void setResponse(String response) {
		this.response = response;
	}


	public void insertemp()
	{
		try
		{
			Student s=new Student();
			s.setAboutme(aboutme);
			s.setAdress(adress);
			s.setBranch(branch);
			s.setCgpa(cgpa);
			s.setDOB(DOB);
			s.setEmail(email);
			s.setEndingdate(endingdate);
			s.setGender(gender);
			s.setId(id);
			s.setJoindate(joindate);
			s.setLinkedinurl(linkedinurl);
			s.setName(name);
			s.setNoofbacklogs(noofbacklogs);
			s.setNoofintershipscertidied(noofintershipscertidied);
			s.setPassword(password);
			s.setPnum(pnum);
			s.setTechnicalskill(technicalskill);
			s.setUniversity(University);
			System.out.println(s.getAboutme());
			System.out.println(s);
			response=studentservice.studentRegistration(s);
			
			System.out.println(response);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	private String fname;
	private String lname;
	private String qid;
	private String query;
	
	public void insertQuery(String a,String b,String c,String d)
	{
		Connection con=null;
	      
	      try
	      {
	    	  Class.forName("com.mysql.jdbc.Driver");
	    	  System.out.println("class established");
	          
	          
	          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/epproject?allowPublicKeyRetrieval=true&useSSL=False","root", "Sailu@123");
	          System.out.println("connection established");
	        
	    PreparedStatement pstmt = con.prepareStatement(" insert into contact_table values(?,?,?,?) ");
	       pstmt.setString(1,a); 
	       pstmt.setString(2,b); 
	       pstmt.setString(3,c); 
	       pstmt.setString(4,d); 
	       
	       
	       int n = pstmt.executeUpdate();
	       
	       if(n>0)
	       {
	         System.out.println("Request sent Successfully");
	       }
	       else
	       {
	         System.out.println("Fail to send  request");
	       }
	       pstmt.close();
	       con.close();
	    
	      }
	      catch(Exception e)
	      {
	        System.out.println(e);
	      }
	      
	  }
	


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getQid() {
		return qid;
	}


	public void setQid(String qid) {
		this.qid = qid;
	}


	public String getQuery() {
		return query;
	}


	public void setQuery(String query) {
		this.query = query;
	}

}
