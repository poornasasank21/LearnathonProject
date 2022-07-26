package com.klef.ep.services;
import javax.ejb.Remote;
import java.util.List;

import com.klef.ep.models.Admin;
import com.klef.ep.models.Employee;
import com.klef.ep.models.Recuriter;

@Remote
public interface RecuriterService 
{
	public Recuriter userLogin(String uname,String pwd);
	 public String inserteRecuriter(Recuriter r);

}
