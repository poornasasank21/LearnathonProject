package com.klef.ep.services;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

import com.klef.ep.models.JobOffer;
import com.klef.ep.models.Student;


@Stateless
@TransactionManagement(value = TransactionManagementType.BEAN)
public class Functions 
{
	private EntityManager em;
	private EntityManagerFactory emf;
	public Functions() 
	{
	    emf = Persistence.createEntityManagerFactory("jpa");
	    em = this.emf.createEntityManager();
	  
	}
	  
	public List<JobOffer> getJobs()
	    
	{
	    	em.getTransaction().begin();

	    	Query q1 = em.createQuery("SELECT c FROM JobOffer c");
	    	List<JobOffer> L = q1.getResultList();
	    	return L;
	    	
	}
	public Student searchStudents(String s)
    
	{
	    	em.getTransaction().begin();
	    	Query q1 = em.createQuery("SELECT c FROM Student c WHERE c.id="+s);
			
			List<Student> a=q1.getResultList();
			if(a.size()==1)
			{
				System.out.println("seach present");
				
			}
			return a.get(0);

	    	
	    	
	}
	public String checkelg(String o,String s)
	{
		em.getTransaction().begin();
		Query q1 = em.createQuery("SELECT c FROM Student c WHERE c.id="+s);
		
		List<Student> a=q1.getResultList();
		Query q2 = em.createQuery("SELECT a FROM JobOffer a WHERE a.offerid= "+o);
		
		List<JobOffer> b=q2.getResultList();
		double x=Double.parseDouble(a.get(0).getCgpa());
		double y=Double.parseDouble(b.get(0).getReqCGPA() );
		double c=Double.parseDouble(a.get(0).getNoofbacklogs());
		double d=Double.parseDouble(b.get(0).getReqminnoofbacklogs());
		if(x>=y   && c<d )
		{
			String hmm="true";
			
			return hmm;
		}
		else
		{
			String hmm="false";
			return hmm;
		
		}

		
		
	}

}
