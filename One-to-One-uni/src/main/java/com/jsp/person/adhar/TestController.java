package com.jsp.person.adhar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestController {

	public static void main(String[] args) {
		
EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vishakha");
EntityManager entityManager= entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();

Person person=new Person();
person.setName("vinay");
person.setEmail("vinay@456");

Aadhar aadhar=new Aadhar();
aadhar.setAadhar_no("2637373833");
aadhar.setCity(" navi_mumbai");
aadhar.setPerson(person);

entityTransaction.begin();
entityManager.persist(aadhar);
entityManager.persist(person);
entityTransaction.commit();

	}

}
