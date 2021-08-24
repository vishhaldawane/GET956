/*
 * 							BankAccount
 * 							|acno,name,balance
 * 			--------------------------------------
 * 			|				|				|
 * 		SavingsAccount	CurrentAccount	CreditAccount
 * 		rate				overdraft		creditLimit
 * 		|
 * FixedDepositAccount
 * 	maturityYear
 * */

public class InheritanceTest2 {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount(101,"Jack",50000);
		ba.showBankAccount();
		
		System.out.println("---------------");
		
		SavingsAccount sa = new SavingsAccount(102,"Janet",65000,8.7f);
		sa.showBankAccount();
		
		System.out.println("---------------");
		
		FixedDepositAccount fd = new FixedDepositAccount(103,"Julie",75000,10.7f,2027);
		fd.showBankAccount();
	}
}
class BankAccount //extends Object
{
	private int accountNumber;
	private String accountHolderName;
	protected double accountBalance; //now the child can refer to it
	
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
	protected float rateOfInterest;

	public SavingsAccount(int accountNumber, String accountHolderName, double accountBalance, float rateOfInterest) {
		super(accountNumber, accountHolderName, accountBalance);
		this.rateOfInterest = rateOfInterest;
	}
	public void showBankAccount() {
		super.showBankAccount();//member method of the nearest super class
		System.out.println("Bank Account Interest: " + rateOfInterest);
		System.out.println("Bank Account SI      : " + calculateSimpleInterest());
		
	}
	private double calculateSimpleInterest() {
		double simpleInterest = (super.accountBalance * 1 *rateOfInterest )/100; 
		return simpleInterest;
	}
}
class FixedDepositAccount extends SavingsAccount {
	private int maturityYear;

	public FixedDepositAccount(int accountNumber, String accountHolderName, double accountBalance, float rateOfInterest,
			int maturityYear) {
		super(accountNumber, accountHolderName, accountBalance, rateOfInterest);
		this.maturityYear = maturityYear;
	}

	public void showBankAccount() {
		super.showBankAccount();//member method of the nearest super class
		System.out.println("Account maturity Year: " + maturityYear);
		System.out.println("Compound Interest    : " +calculateCompundInterest());
	}
	private double calculateCompundInterest() {
		double coumpundInterest =super.accountBalance * Math.pow((1+(rateOfInterest/100)),maturityYear-2021) ; 
		return coumpundInterest;
	}
	//P(1+r/100)^n
}











