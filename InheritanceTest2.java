/* inherited
 * overridden
 * exclusive
 * implemented
 * 					abstract BankAccount <-- super class- Generalization
 * 							|acno,name,balance
 * 							|	
							|abstract void withdraw(double amountToWithdraw); //declared - not defined
							|abstract void deposit(double amountToDeposit); //declared - not defined
							|
 * 			--------------------------------------
 * 			|				|				|
 * 		SavingsAccount	CurrentAccount	CreditAccount <-- Specialization
 * 		rate				overdraft		creditLimit
 * 		|
 * FixedDepositAccount <--<-- Specialization
 * 	maturityYear
 * 
 * Art GAllery - various paintings are displayed 
 * 
 *      one of the painting - might not have any real meaning
 *          |
 *  -------------------------
 *  |      |      |	      |
 *  tree  cloud  ghost   face
 * o1      o2     o3      o4 .....
 * 
 * abstract = incomplete class
 *   instance of abstract class cannot be created
 *   but reference to it can be created
 *   
 *   what the purpose of such class
 *   
 *   abstract meant for inheritance
 *   
 *   it will contain the common data structure + methods for the class hierarchy
 *   
 *   ABSTRACT CLASS "MAY NOT HAVE" ABSTRACT METHODS
 *   
 * */

class BankOperation
{
	static void processAllAccounts(BankAccount ref) {
		System.out.println("Name of the class : "+ref.getClass().getName());
		ref.showBankAccount();
		ref.withdraw(135000);
		ref.showBankAccount();
		System.out.println("---------------");
	}
}
public class InheritanceTest2 {
	public static void main(String[] args) {
	
		//bank account class is disguised 
		SavingsAccount sa = new SavingsAccount(102,"Janet",65000,8.7f);
		FixedDepositAccount fd = new FixedDepositAccount(103,"Julie",75000,10.7f,2027);
		CurrectAccount ca = new CurrectAccount(104,"Julia",100000,0.25f);
		CreditAccount cca = new CreditAccount(105,"John",35000,100000);
		BankOperation.processAllAccounts(sa);
		BankOperation.processAllAccounts(fd);
		BankOperation.processAllAccounts(ca);
		BankOperation.processAllAccounts(cca);
	
	}
}
abstract class BankAccount //extends Object
{
	private int accountNumber;
	private String accountHolderName;
	protected double accountBalance; //now the child can refer to it
	
	abstract void withdraw(double amountToWithdraw); //declared - not defined
	abstract void deposit(double amountToDeposit); //declared - not defined
	
	
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
	void withdraw(double amountToWithdraw) { //mandatory definition
		if(amountToWithdraw > (super.accountBalance-5000) ) {
			System.out.println("Cannot withdraw,please maintain account balance as 5000");
		}
		else {
			super.accountBalance =super.accountBalance - amountToWithdraw;
		}
	} 
	
	void deposit(double amountToDeposit) { //mandatory definition
		if(amountToDeposit >= 50000) {
			System.out.println("Please provide income proof to deposit : "+amountToDeposit);
		}
		else {
			super.accountBalance = super.accountBalance + amountToDeposit;
		}
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

class CurrectAccount extends BankAccount {
	private float overDraftLimit;

	public CurrectAccount(int accountNumber, String accountHolderName, double accountBalance, float overDraftLimit) {
		super(accountNumber, accountHolderName, accountBalance);
		this.overDraftLimit = overDraftLimit;
	}
	public void showBankAccount() {
		super.showBankAccount();//member method of the nearest super class
		System.out.println("Bank overdraftLimit  : " + overDraftLimit);
		System.out.println("Bank Account SI      : " + calculateWithdrawLimit());
		
	}
	private double calculateWithdrawLimit() {
		double withdrawLimit = super.accountBalance + super.accountBalance * overDraftLimit; 
		return withdrawLimit;
	}
	void withdraw(double amountToWithdraw) { //mandatory definition
		if(amountToWithdraw > calculateWithdrawLimit() ) {
			System.out.println("Cannot withdraw, amount to withdraw is exceeding overdraft limit.."+amountToWithdraw);
		}
		else {
			super.accountBalance =super.accountBalance - amountToWithdraw;
		}
	} 
	
	void deposit(double amountToDeposit) { //mandatory definition
		if(amountToDeposit >= 50000) {
			System.out.println("Please provide TDS certificate : "+amountToDeposit);
		}
		else {
			super.accountBalance = super.accountBalance + amountToDeposit;
		}
	}
}
class CreditAccount extends BankAccount {
	private float creditLimit; //100000

	public CreditAccount(int accountNumber, String accountHolderName, double accountBalance, float creditLimit) {
		super(accountNumber, accountHolderName, accountBalance);
		this.creditLimit = creditLimit;
	}
	public void showBankAccount() {
		super.showBankAccount();//member method of the nearest super class
		System.out.println("Bank Credit Limit    : " + creditLimit);
		System.out.println("Bank Current limit   : " + calculateCurrentCreditLimit());
		
	}
	private double calculateCurrentCreditLimit() {
		double currentLimit = creditLimit - super.accountBalance; 
		return currentLimit;
	}
	void withdraw(double amountToWithdraw) { //mandatory definition
		if(amountToWithdraw > calculateCurrentCreditLimit() ) {
			System.out.println("Cannot withdraw, credit limit exceeded : "+amountToWithdraw);
		}
		else {
			super.accountBalance =super.accountBalance - amountToWithdraw;
		}
	} 
	
	void deposit(double amountToDeposit) { //mandatory definition
			System.out.println("Tank you for the bill payment : "+amountToDeposit);
			super.accountBalance = super.accountBalance + amountToDeposit;

	}
}





