import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;

import javax.swing.JFrame;

/*
 * 
 * our eyes can see the whole world
 * but cannot see itself!!!!you need a mirror to see your own eyes
 * we cannot see our nose, our forehead, our chin, our lips, neck
 * 
 * lavish display of this universe - we see thru our tiny eyes
 * but we can see our own eyes - Saint Gyaneshwar
 */

/* I
 * DevelopedBy  : Vishhal
 * Version      : 3.0
 * Company      : LTI
 * Client       : BOA
 * modifiedOn   : 6-Sep-2021 
 * modifiedTime : 10:00
 */

/*
 * II
 * class DevelopedBy {
	String developer;
	double version;
	String company;
	String client;
	LocalDate modifiedOn;
	public DevelopedBy(String developer, double version, String company, String client, LocalDate modifiedOn) {
		super();
		this.developer = developer;
		this.version = version;
		this.company = company;
		this.client = client;
		this.modifiedOn = modifiedOn;
	}
}
*/
//In Angular [java's annotation] is called as DECORATOR

//can we say that below line(annotation) is a META-DATA of the Class
@DevelopedBy(developer="rakesh", version=3.0,company="LTI",client="BOA",modified="2021/8/6")
class SavingsAccount
{
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	//static DevelopedBy devInfo = new DevelopedBy("rakesh",3.0,"LTI","BOA",LocalDate.of(2021, 8, 6) );

	public SavingsAccount(int accountNumber, String accountHolderName, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	
	public SavingsAccount(int accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}


	public SavingsAccount(int accountNumber, String accountHolderName) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
	}


	public SavingsAccount(String accountHolderName) {
		super();
		this.accountHolderName = accountHolderName;
	}


	public void withdraw(float amt) {
		accountBalance -= amt;
	}
	public void deposit(float amt) {
		accountBalance += amt;
	}
	public double getBalance() {
		return accountBalance;
	}
	
}

public class ReflectionTest {
	public static void main(String[] args) {
		SavingsAccount savObj = new SavingsAccount(101, "Julie", 10000);
		Class theMirrorOfSavObj = savObj.getClass();
		Annotation annotations[] = theMirrorOfSavObj.getAnnotations(); // good news to us!!! to have this method
		
		for (Annotation annotation : annotations) {
			System.out.println("Annotation : "+annotation);
			if(annotation instanceof DevelopedBy) {
				DevelopedBy developedBy = (DevelopedBy) annotation;
				String developer = developedBy.developer();
				String client = developedBy.client();
				if(developer.equalsIgnoreCase("vishhal")) {
					if(client.equalsIgnoreCase("BOA")) {
						System.out.println("processing the business written by "+developer+ " for "+client);
					}else {
						System.out.println("Expected processing for BOA but found "+client);
						System.out.println("1 Declining the processing...");
					}
				}
				else {
					System.out.println("Expected code by vishhal "+ " but found "+developer);
					System.out.println("2 Declining the processing...");
					
				}
			}
		}
		//String developer = savObj.devInfo.developer;
		//String client = savObj.devInfo.client;
		
		/*if(developer.equalsIgnoreCase("vishhal")) {
			if(client.equalsIgnoreCase("BOA")) {
				System.out.println("processing the business written by "+developer+ " for "+client);
			}else {
				System.out.println("Expected processing for BOA but found "+client);
				System.out.println("1 Declining the processing...");
			}
		}
		else {
			System.out.println("Expected code by vishhal "+ " but found "+developer);
			System.out.println("2 Declining the processing...");
			
		}*/
		
		/*Class theMirrorOfSavObj = savObj.getClass();
		
		Constructor ctorsOfSavingsAccount[] = theMirrorOfSavObj.getConstructors();
		for (Constructor constructor : ctorsOfSavingsAccount) {
			System.out.println("Constructor : "+constructor.getName()+" with "+constructor.getParameterCount());
			Parameter parameters[] = constructor.getParameters();
			for (Parameter parameter : parameters) {
				System.out.println("Parameter : "+parameter.getType()+" "+parameter.getName());
			}
			System.out.println("--");
		}
		System.out.println("-------------");
		Method methodsOfSavObj[] =  theMirrorOfSavObj.getMethods(); //java.lang.reflect
		for (Method method : methodsOfSavObj) {
			System.out.println("Method name : "+method.getName());
		}
		*/
		
		/*JFrame myFrame = new JFrame("Hello");
		myFrame.setSize(100,200);
		myFrame.setVisible(true);*/
	}
}
/*
 user_source, user_constraints  -> constraint_name, constraint_type, search_condition,status, table_name
 * 
 * every instance of an "Object" class has a method known as getClass()
 * that returns an instance of class "Class"
 
	Boy1			Boy2
		Cap				Cap[NY]
		TShirt			TShirt [ NZ ]
		belt			belt [ WoodLand ]
		Jean			Jean [ Levis ]
		Shoes			Shoes [ Sketchers ]
		
		Kitchen1				Kitchen2
		
		Jar1 Jar2 Jar3			Jar1[salt] Jar2[SugarPowder] Jar3[allPurposeFlour]
*/
