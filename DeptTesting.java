package com.lti.layer3.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lti.layer2.model.Dept;
import com.lti.layer3.DeptRepository;

public class DeptTesting {
	
	@Autowired
	DeptRepository deptRepo;
	
	@Test
	void addNewDepartmentTest() {
		Dept newDept = new Dept();
		newDept.setDname("ACCOUNTS");
		newDept.setLoc("New York");
		deptRepo.insertDept(newDept);
	}

}
//1 direct insert query -> SQL > insert into detp values (10,'IT','NY');

//2. Dept d = new Dept(); d.set...(10), d.set..('IT'); d.set..('NY')
//	jdbc code to fetch d and assign it to the database via
//PreparedStatement pst ... ??? management, transaction managment

//3. JPA - EntityManagerFactory, EntityManager, 
//  Dept d = new Dept(); fill it up, 
// em.persist(d);
