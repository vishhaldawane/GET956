package greet.message;

import java.time.LocalDate;

class Employee // this design is same as of the emp table in oracle.....OHHHHMGGG
{
	//EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
	int employeeNumber; //state/ field of an object
	String employeeName;
	String job;
	int managerCode;
	LocalDate hiredate;
	float salary;
	float commision;
	int departmentNumber;
	
	public Employee(int employeeNumber, String employeeName, String job, int managerCode, LocalDate hiredate,
			float salary, float commision, int departmentNumber) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.job = job;
		this.managerCode = managerCode;
		this.hiredate = hiredate;
		this.salary = salary;
		this.commision = commision;
		this.departmentNumber = departmentNumber;
	}

	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", job=" + job
				+ ", managerCode=" + managerCode + ", hiredate=" + hiredate + ", salary=" + salary + ", commision="
				+ commision + ", departmentNumber=" + departmentNumber + "]";
	}
	
	
}
public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee(7839, "KING","PRESIDENT",0,  LocalDate.of(1991, 11,17),5000,0,10);
		Employee e2 = new Employee(7698, "BLAKE","MANAGER",7839,LocalDate.of(1981,05,1),2850,0,30);
		Employee e3 = new Employee(7782, "CLARK","MANAGER",7839,LocalDate.of(1981,06,9),2450,0,10);
		
		
		System.out.println("e1 : "+e1); // + will invoke the toString()
		System.out.println("e2 : "+e2); // + will invoke the toString()
		System.out.println("e3 : "+e3); // + will invoke the toString()
		
	}
}
//hibernate JPA			layer 1 layer2  layer3


/*
------ ---------- --------- ---------- --------- ---------- ---------- ----------
7839 KING       PRESIDENT            17-NOV-81       5000                    10
7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10
7566 JONES      MANAGER         7839 02-APR-81       2975                    20
*/






