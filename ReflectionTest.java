import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

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
class SavingsAccount
{
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	

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

/* user_source, user_constraints  -> constraint_name, constraint_type, search_condition,status, table_name
 * 
 * every instance of an "Object" class has a method known as getClass()
 * that returns an instance of class "Class"
 */
public class ReflectionTest {
	public static void main(String[] args) {
		SavingsAccount savObj = new SavingsAccount(101, "Julie", 10000);
		Class theMirrorOfSavObj = savObj.getClass();
		
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
		/*JFrame myFrame = new JFrame("Hello");
		myFrame.setSize(100,200);
		myFrame.setVisible(true);*/
	}
}
