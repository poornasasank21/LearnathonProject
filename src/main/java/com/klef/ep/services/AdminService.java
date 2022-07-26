package com.klef.ep.services;

import javax.ejb.Remote;
import com.klef.ep.models.Admin;

import com.klef.ep.models.Admin;

@Remote
public interface AdminService 
{
	
	public Admin userLogin(String uname,String pwd);

}
