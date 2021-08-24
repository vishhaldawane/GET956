/*
 * 							BankAccount
 * 							|acno,name,balance
 * 			--------------------------------------
 * 			|				|				|
 * 		SavingsAccount	CurrentAccount	CreditAccount
 * 		rate				overdraft		creditLimit
 * 
 * */
public class InheritanceTest2 {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount(101,"Jack",50000);
		ba.showBankAccount();
		System.out.println("---------------");
		SavingsAccount sa = new SavingsAccount(102,"Janet",65000,8.7f);
		sa.showBankAccount();
	}
}
class BankAccount //extends Object
{
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	
	public BankAccount(int accountNumber, String accountHolderName, double accountBalance) {
		super(); //not required
		this.accountNumber = accountNumber; //this means the current class data structure
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	public  void showBankAccount() {
		System.out.println("Bank Account Number  : " + accountNumber);
		System.out.println("Bank Account Holder  : " + accountHolderName);
		System.out.println("Bank Account Balance : " + accountBalance);
	}
}
//implicit super constructor BankAccount() is undefined for default constructor. Must define an explicit constructor
class SavingsAccount extends BankAccount {
	private float rateOfInterest;

	public SavingsAccount(int accountNumber, String accountHolderName, double accountBalance, float rateOfInterest) {
		super(accountNumber, accountHolderName, accountBalance);
		this.rateOfInterest = rateOfInterest;
	}
	public void showBankAccount() {
		super.showBankAccount();//member method of the nearest super class
		System.out.println("Bank Account Interest: " + rateOfInterest);
	}
}








