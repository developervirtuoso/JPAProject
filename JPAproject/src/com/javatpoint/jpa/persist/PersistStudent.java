package com.javatpoint.jpa.persist;

import com.javatpoint.jpa.student.*;
import javax.persistence.*;
public class PersistStudent {

	public static void main(String args[])
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_details");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		StudentEntity s1=new StudentEntity();
		StudentEntity s2=new StudentEntity();
		StudentEntity s3=new StudentEntity();
		
		s1.setS_id(9);
		s1.setS_name("jhjbhj");
		s1.setS_age(24);
		
		s2.setS_id(11);
		s2.setS_name("jknrjgnrj");
		s2.setS_age(2);
		
		s3.setS_id(18);
		s3.setS_name("jrgjrngjrngj");
		s3.setS_age(17);
		
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		
		em.getTransaction().commit();
		
		emf.close();
		//em.close();
		
	}
}
