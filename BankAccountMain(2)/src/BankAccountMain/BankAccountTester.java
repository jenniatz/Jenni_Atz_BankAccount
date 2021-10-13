package BankAccountMain;

import java.util.ArrayList;


public class BankAccountTester {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		BankAccount harrysChecking = new BankAccount ("Harry", 1234, 0.00, false);
		BankAccount harrysSavings = new BankAccount("Harry",86754, 500.00, false);
	
	  
	System.out.println(harrysChecking.toString());
	
	harrysChecking.deposit(200.00);
	System.out.println();
	System.out.println("Balance: ");
	System.out.println(harrysChecking.getBalance());
	harrysChecking.setOverdrawn(false);
	System.out.println("Overdrawn Status: ");
	System.out.print(harrysChecking.isOverdrawn());
	
	harrysChecking.withdraw(500.00);
	System.out.println();
	System.out.println("Updated Balance: ");
	System.out.println(harrysChecking.getBalance());
	harrysChecking.setOverdrawn(false);
	System.out.println("Overdrawn Status: ");
	System.out.print(harrysChecking.isOverdrawn());
	
	harrysChecking.deposit(400.00);
	System.out.println();
	System.out.println("Updated Balance: ");
	System.out.println(harrysChecking.getBalance());
	System.out.println("Overdrawn Status: ");
	System.out.print(harrysChecking.isOverdrawn());

	System.out.println();
	System.out.println(harrysSavings.toString());
	System.out.println();
	System.out.println("Harry's Savings account new balance after money transfer from other account: ");
	harrysSavings.transferto(50.00, harrysChecking);
	harrysChecking.transferFrom(50.00,harrysChecking);
	//System.out.println();
	//System.out.println("Harry's Savings updates balance: ");
	System.out.println(harrysSavings.getBalance());
	System.out.println();
	System.out.println("Harry's Checking account new balacne after transfer: ");
	System.out.println(harrysChecking.getBalance());
	System.out.println();
//	
	harrysSavings.addInterest(harrysChecking.getBalance());
	System.out.println();
	System.out.println(harrysSavings.toString());
	
	  }
		
}
	
	
	

