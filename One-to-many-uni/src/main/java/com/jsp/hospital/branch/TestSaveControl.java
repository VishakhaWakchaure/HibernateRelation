package com.jsp.hospital.branch;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vishakha");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Hospital hospital=new Hospital();
		hospital.setHname("FORTIS");
		hospital.setGst("FORTIS35563");
		
		Branch branch=new Branch();
		branch.setCity("MUMBAI");
		
		Branch branch2=new Branch();
		branch2.setCity("PUNE");
		
		Branch branch3=new Branch();
		branch3.setCity("NAVI-MUMBAI");
		
		ArrayList<Branch>branches=new ArrayList<Branch>();
		branches.add(branch);
		branches.add(branch2);
		branches.add(branch3);
		hospital.setBranches(branches);
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityTransaction.commit();
			}

}
