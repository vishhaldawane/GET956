import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.lti.designpatter.basedao.BaseDAOImpl;
import com.lti.onetomany.Employee;

import org.junit.jupiter.api.Test;

/*
  
  
employeeNameStartingWithLetterTest
Query query1 = entitymanager.createQuery(
"Select e " + "from Employee e " + "where e.ename LIKE 'M%'");

sortedEmployeeByEnameTest
Query query = entitymanager.createQuery( 
"Select e " + "from Employee e " + "ORDER BY e.ename ASC" );
 */

//dept emp customer ord item price 

public class JPQLTest {
	BaseDAOImpl baseDAO = new BaseDAOImpl();
	//JPQL has no connection/relation with TABLE and their FIELDS/colums
	//JPQL will search the Entity and their Fields/getter methods 
	@Test
	public void maxSalTest() {
		
		EntityManager entityManager = baseDAO.getEntityManager();
	    Query query1 = entityManager.createQuery("Select MAX(e.employeeSalary) from Employee e");
	    Double result = (Double) query1.getSingleResult();
	    System.out.println("Max Employee Salary :" + result);

	}
	
	@Test
	public void salaryRangeTest() {
		EntityManager entityManager = baseDAO.getEntityManager();
		String pojo = "Employee";
		Query query = entityManager.createQuery("Select e " + "from " + pojo + " e " + "where e.employeeSalary " + "Between 5000 and 6000" );
		List<Employee> empHavingSalaryIn5to6K =  query.getResultList();
		for (Employee theEmp : empHavingSalaryIn5to6K) {
			System.out.println("Emp Number : "+theEmp.getEmployeeNumber());
			System.out.println("Emp Name   : "+theEmp.getEmployeeName());
			System.out.println("Emp Job    : "+theEmp.getEmployeeJob());
			System.out.println("Emp SAlary : "+theEmp.getEmployeeSalary());
			System.out.println("=================ß");
		}
	}

	@Test
	public void employeeStartingWithLetter() {
		EntityManager entityManager = baseDAO.getEntityManager();
		Query query = entityManager.createQuery("Select e " + "from Employee e " + "where e.employeeName LIKE 'R%'");
		List<Employee> empStartsWithLetter =  query.getResultList();
		for (Employee theEmp : empStartsWithLetter) {
			System.out.println("Emp Number : "+theEmp.getEmployeeNumber());
			System.out.println("Emp Name   : "+theEmp.getEmployeeName());
			System.out.println("Emp Job    : "+theEmp.getEmployeeJob());
			System.out.println("Emp SAlary : "+theEmp.getEmployeeSalary());
			System.out.println("=================ß");
		}
	}
	
	@Test
	public void employeeOrderByAsc() {
		EntityManager entityManager = baseDAO.getEntityManager();
		Query query = entityManager.createQuery("Select e " + "from Employee e " + "ORDER BY e.employeeName ASC");
		List<Employee> empSorted =  query.getResultList();
		for (Employee theEmp : empSorted) {
			System.out.println("Emp Number : "+theEmp.getEmployeeNumber());
			System.out.println("Emp Name   : "+theEmp.getEmployeeName());
			System.out.println("Emp Job    : "+theEmp.getEmployeeJob());
			System.out.println("Emp SAlary : "+theEmp.getEmployeeSalary());
			System.out.println("=================ß");
		}
	}
}
