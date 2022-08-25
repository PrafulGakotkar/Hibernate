package com.tns.jpastartLentities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {
	public static void main(String []args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create Employee
		Employee emp = new Employee();
		emp.setName("Ajinkya");
		emp.setSalary(50000);
		em.persist(emp);
		
	}

}
