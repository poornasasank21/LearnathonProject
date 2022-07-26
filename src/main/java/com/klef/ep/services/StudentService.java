package com.klef.ep.services;

import javax.ejb.Remote;

import com.klef.ep.models.Admin;
import com.klef.ep.models.Student;

@Remote
public interface StudentService 
{
	public String studentRegistration(Student s);
	public Student studentLogin(String uname,String pwd);

}
