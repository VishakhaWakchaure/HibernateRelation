package com.jsp.hospital.branch.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vishakha");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Hospital hospital=new Hospital();
		hospital.setHname("aaryan hospital");
		hospital.setGst("aryan1234");
		
		
		Branch b=new Branch();
		b.setCity("mumbai");
		
		Branch b1=new Branch();
		b1.setCity("navi mumbai");
		
		Branch b2=new Branch();
		b2.setCity("pune");
		
		b.setHospital(hospital);
		b1.setHospital(hospital);
		b2.setHospital(hospital);
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(b);
	    entityManager.persist(b1);	
	    entityManager.persist(b2);
	    entityTransaction.commit();

		
	}

}
