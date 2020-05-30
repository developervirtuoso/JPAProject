package com.javatpoint.jpa.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateStudent {
	public static void main(String args[])  
    {  
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_details");  
        EntityManager em=emf.createEntityManager();  
          
      
          
        StudentEntity s=em.find(StudentEntity.class,9);  
        System.out.println("Before Updation");  
        System.out.println("Student id = "+s.getS_id());  
        System.out.println("Student Name = "+s.getS_name());  
        System.out.println("Student Age = "+s.getS_age());  
          
        s.setS_name("neeraj"); 
          
        System.out.println("After Updation");  
        System.out.println("Student id = "+s.getS_id());  
        System.out.println("Student Name = "+s.getS_name());  
        System.out.println("Student Age = "+s.getS_age());  
          
          
    }  
}
