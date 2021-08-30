package com.mysongs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

interface Clickable {  void click();  }
interface Movable {
	String move(String from, String where);
}
class SavingsAccount {
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	public SavingsAccount(int accountNumber, String accountHolder, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "SavingsAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder
				+ ", accountBalance=" + accountBalance + "]";
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
}
interface MyConsumer { void accept(Object obj); }
class PrintAll {
	static void forEveryMember(MyConsumer consumer) {
		System.out.println("consumer : "+consumer);
	}
}
//wap to display accounts having balance more than 20000
public class LambdaTest2 {
	public static void main(String[] args) {	
		List<SavingsAccount> accountList = new ArrayList<SavingsAccount>();
		accountList.add(new SavingsAccount(101,"Jack",12000));
		accountList.add(new SavingsAccount(102,"Jane",25000));
		accountList.add(new SavingsAccount(103,"John",30000));
		accountList.add(new SavingsAccount(104,"Jackie",14000));
		accountList.add(new SavingsAccount(105,"Janet",15000));
		
		accountList.forEach( //there forEach function "callbacks" your lambda
				(savObj)-> System.out.println(savObj) 
		);
		
		MyConsumer con = (obj) -> {
			//some code here
		};
		PrintAll.forEveryMember(con);
		PrintAll.forEveryMember(  (obj) -> {
			//some diff code here
		}    );
		
		
		con.accept("string");
		con.accept(new SavingsAccount(111,"jack",999));
		
		
		
		for (SavingsAccount savingsAccount : accountList) {
			if(savingsAccount.getAccountBalance() >= 20000)
			System.out.println("savings account is : "+savingsAccount);
		}
		System.out.println("streaming....");
		Stream<SavingsAccount> filteredSavingsAccountStream = accountList.stream().filter(
					(savObj)->(savObj.getAccountBalance()>20000)
				);
				
		filteredSavingsAccountStream.forEach(
				(savObj)-> System.out.println(savObj) 
		);
		//Stream api in java - move of 800mb 1gb - you start playing
		//and suddenly u click on any minute 70th, 10th, 55th
		//|1...............................120|
		//             |        ^
		
		/*
		 * 
		 * 	|			|->
		 * 	|			|
		 * 	|			|->
		 * 	|			|==->
		 *  -------------
		 */
		Movable m1 = (from,where) -> { //This method must return a result of type String
			return "Moved from "+from+ " to "+where;
		};
		
		String movedWhere = m1.move("India","London");
		System.out.println("moved where? "+movedWhere);
		System.out.println("moved where? "+m1.move("France","Germany"));
		
		Movable m2 = (from,where) ->  //This method must return a result of type String
			("Moved from "+from+ " to "+where);
		
		System.out.println("moved where? "+m2.move("Mumbai","Chennai"));
		
		//without lambda
		Clickable click1 = new Clickable () {
			public void click() { //implemented method
				System.out.println("Clicked...click1");
			}
			public void drag() { //exclusive method
				System.out.println("Clickable...drag...");
			}
		};
		click1.click();
		//click1.drag();
		
		//with lambda - The target type of "this expression" must be a functional interface
		Clickable click2 =  () -> {
				System.out.println("Clicked...click2");
		};
		click2.click();
		
		Clickable click3 =  () -> {
			System.out.println("Clicked...click3");
		};
		click3.click();
	}
}
