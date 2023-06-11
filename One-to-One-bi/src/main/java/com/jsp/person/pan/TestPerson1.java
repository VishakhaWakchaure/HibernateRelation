package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestPerson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vishakha");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person1 person1=new Person1();
		person1.setName("poonam");
		person1.setEmail("poonam@12");
		
		
		Pan pan=new Pan();

		pan.setPan_no("ABDGHH256");
		
		
		pan.setPerson1(person1);
		person1.setPan(pan);
		
		entityTransaction.begin();
		entityManager.persist(pan);
		entityManager.persist(person1);
		entityTransaction.commit();
		
	}

}
