package com.klef.ep.services;


import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.klef.ep.models.Admin;
import com.klef.ep.models.Employee;
import com.klef.ep.models.Recuriter;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class RecuriterServiceImpl implements RecuriterService
{
	@Override
	 public String inserteRecuriter(Recuriter r)
	{
		
	    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    entityManager.persist(r);
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return "Object Inserted Successfully";
	}

	@Override
	public Recuriter userLogin(String uname, String pwd) 
	{
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Query qry=entityManager.createQuery("select u from Recuriter u where rid=? and  rpass=?");
	    qry.setParameter(1, uname);
	    qry.setParameter(2, pwd);
	    
	    Recuriter u = null;
	    
	    if (qry.getResultList().size()==1) 
	    {
	    	u = (Recuriter) qry.getSingleResult();
	    }
	    
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return u;
		
	}

	

}
