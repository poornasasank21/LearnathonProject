package com.klef.ep.services;



import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.klef.ep.models.JobOffer;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class JobOfferServiceImpl implements JobOfferService
{

	@Override
	public String insertjoboffer(JobOffer j) 
	{
		try
		{
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		    EntityManager entityManager = entityManagerFactory.createEntityManager();
		    
		    
		    entityManager.getTransaction().begin();
		    entityManager.persist(j);
		    entityManager.getTransaction().commit();
		    
		    entityManager.close();
		    entityManagerFactory.close();
		    
		    return "Object Inserted Successfully";
	   
		}
		catch (Exception e)
		{
			System.out.println("in catch block");
			System.out.println(e);
			return "fail";
		}
	}

	@Override
	public List<JobOffer> getJoboffer() 
	{
		try
		{
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		    EntityManager entityManager = entityManagerFactory.createEntityManager();
		    
		    
		    entityManager.getTransaction().begin();
	
		    Query qry=entityManager.createQuery("select jb from JobOffer jb");
		    List<JobOffer> list=qry.getResultList();
		    //System.out.println(list);
		    
		    entityManager.getTransaction().commit();
		    entityManager.close();
		    entityManagerFactory.close();
			
			return list;
			
		}
		catch(Exception e)
		{
			System.out.print(e);
			return null;
		}
		
	}
	

}
