package greet.message;

import java.util.regex.Pattern;

//design of an object
class Person // same like structures in C/C++
{
	int personid;
	private String name;	//u cannot access it outside of the class
	private char gender;	
	private int age;	
	private String emailAddress;
	
	Person(String nm, char g, int a, String em) {
		
		System.out.println("Begin of Person(...) constructor");
		System.out.println("Setting person details.....");
		
		String nameExpression = "^[a-zA-Z\\s]+";
		if(nm.matches(nameExpression))
			name = nm;
		else {
			System.out.println("Invalid name");
			return ;
		}
		
		if(g=='M' || g=='m' || g=='F' || g=='f') {
			gender = g;
		}
		else {
			System.out.println("Invalid gender");
			return ; 
		}
	
		
		if(a>=1 && a<=80) {
			age = a;         
		}
		else {
			System.out.println("Invalid Person Age ");
			return ;
		}
		
		String emailPattern = "^(.+)@(.+)$";
		
		if(em.matches(emailPattern))
			emailAddress = em;
		else {
			System.out.println("Invalid email");
			return ;
		}
		System.out.println("End of Person(...) constructor");
		return ;
	}

	void printPerson() { //accessor - printing it - read only 
		System.out.println("name   is : "+name);
		System.out.println("gender is : "+gender);
		System.out.println("age    is : "+age);
		System.out.println("Email  is : "+emailAddress);
		System.out.println("-----------------------");
	}

	Person() { //explicit no-arg constructor
		 System.out.println("Person constructor called...");
	}
	
	/*void Person() {
		System.out.println("SME will ask you!! is it a constructor???....");
	}*/
}


public class PersonTest2 {	//below 4 are the arguments to receive the values 
	public static void main(String[] args) {
		
		Person p1 = new Person("MARTIN king",'M', 23,"m@gc");
		p1.printPerson();
				

		Person p2 = new Person("JULIA",'F', 32,"julia@gmail.com");
		p2.printPerson();

		Person p3 = new Person("JACK",'M', 25,"jack@gmail.com");
		p3.printPerson();
		
		Person p4 = new Person();
		//p4.setPerson("RITA",'M',27,"rita@gmail.com");
		p4.printPerson();
		 
	}
}
class Tiger {
	void jump() {
		System.out.println("Tiger is jumping....");
	}
}

class Flight {
	
}


/*
class Test
{
	void fun() { }
	

}
class Tester {
	main() {
		Test t = new Test();
		t.fun();
	}
}
*/