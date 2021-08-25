/*
 * Person p1 = new Person('R',22,"Jack");
 *  |     |     |	|
 *  class ref   |	follows the allocator
 *  			|
 *  		allocator is used
 *  		to allocate
 *  		the Data structure
 *  		*ALLOCATOR CAN ROLLBACK THE ALLOCATION IF THE CONSTRUCTOR 
 *  		IS TERMINATED MIDWAY VI RETURN OR THROWING AN EXCEPTION
 *  		by leaving the reference to null value
 *  
 *  					gender	age		name
 *  					-------------------------
 *  					|		|		|		|
 *  					-------------------------
 *      +-------------->100
 * 		|
 *    100
 * 	   p1
 * 			
 * 
 */
public class UserDefinedExceptionTest {
	public static void main(String[] args) 
	{
		System.out.println("begin main");
		Person p1;
		
			try {
				p1 = new Person('M',220,"Jack");
				System.out.println("p1 "+p1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e); //classname + message
				//System.out.println(e.getMessage()); //only message
				//e.printStackTrace();
			}
			
		
	
		System.out.println("End  of main");
	}
}
class Person
{
	char gender;
	int age;
	String name;
	
	//throw means literally thowing it
	//throws - declaration of a method to throw a "checked exception"

	//if you are throwing unchecked exceptions, then throws clause is
	//not mandatory, and even handling try..catch is also optional
//
	public Person(char gender, int age, String name)  throws Exception
	{
		super();
		System.out.println("=>Person(...) constructor started....");
		if(gender =='M' || gender =='m' || gender =='f' || gender=='F')
			this.gender = gender;
		else {
			//System.out.println("Invalid gender");
			//RuntimeException r = new RuntimeException ("Invalid Gender");
			Exception r = new Exception ("Invalid Gender");
			throw r; //control would exit from here
		}
		
		if(age>=1 && age<=120)
			this.age = age;
		else {
			//RuntimeException r = new RuntimeException ("Invalid Age");
			Exception r = new Exception ("Invalid Age");
			throw r;
		}
		String regEx="^[a-zA-Z\\\\s]+";
		if(name.matches(regEx)) {
			this.name = name;	
		}
		else {
			//RuntimeException r = new RuntimeException ("Invalid Name");
			Exception r = new Exception ("Invalid Name");
			throw r;
		}
		
		System.out.println("=>Person(...) constructor finished....");
	}

	@Override
	public String toString() {
		return "Person [gender=" + gender + ", age=" + age + ", name=" + name + "]";
	}
	
}