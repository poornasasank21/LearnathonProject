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
import com.klef.ep.models.Student;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public  class StudentServiceImpl implements StudentService
{
	public String studentRegistration(Student s)
	{
		try
		{
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		    EntityManager entityManager = entityManagerFactory.createEntityManager();
		    
		    
		    entityManager.getTransaction().begin();
		    entityManager.persist(s);
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
	public Student studentLogin(String uname, String pwd) 
	{

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Query qry=entityManager.createQuery("select u from Student u where id=? and  password=?");
	    qry.setParameter(1, uname);
	    qry.setParameter(2, pwd);
	    
	    Student u = null;
	    
	    if (qry.getResultList().size()==1) 
	    {
	    	u = (Student) qry.getSingleResult();
	    	System.out.println(u+"\n"+u.getAboutme());
	    }
	    
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return u;
	}
		 
	

}
