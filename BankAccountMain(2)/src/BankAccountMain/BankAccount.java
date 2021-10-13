package BankAccountMain;

public class BankAccount {
	private String name;
	private long accountNum;
	private double balance;
	private boolean overdrawn;
	
	/**
	 * Constructs a bank account with a zero balance
	 */
	public BankAccount()
	{
		balance = 0;
		
	}
	/**
	 * Constructs a bank account with a given balance
	 * @param initialBalance the initial balance
	 */
	public BankAccount(String accountName, int acctNum, double initialBalance, boolean overdrawn)
	{
		name = accountName;
		balance = initialBalance;
		accountNum = acctNum;
		overdrawn = overdrawn;		
	}
	/**
	 * Deposits money into the bank account
	 * @param amount the amount to deposit
	 */
	public void deposit(double amount)
	{
		if (amount < 0)
		{
			System.out.println("negative amount!");			
		}	
		else { 
				balance = balance + amount;
			}
	}
	/**
	 * Withdraws money from the bank account
	 * @param amount the amount to withdraw
	 */
	public void withdraw(double amount)
	{
		if (amount> balance) 
		{
			overdrawn = true;

		}
		else {
		balance = balance - amount;
		}
	}
	
public long getAccountNum() {
		
		return accountNum;
		
	}
	
	public void setAccountNum(long accountNum) {
		
		accountNum  = 0;
	}
	
	/**
	 * Gets the current balance of the bank account
	 * @return the current balance
	 */
	public void setAccountName(String name) {
		name = " ";
		
	}
public String getAccountName() {
		
		return name;
		
	}

	public double getBalance()
	{
		return balance;
	}


	
	public void setOverdrawn(boolean status) {
		
		if ( balance < 0) {
		overdrawn = true;
		}
		
		else {
			overdrawn = false;
		}
	}
	
public boolean isOverdrawn () {
		
		return overdrawn;
	}

	/*
	 * public String getAccountNum() { return this.name+" " + this.acct+" " +
	 * this.balance; }
	 */
	public double anyAccount(BankAccount otherAccount) 
	{
		return otherAccount.getBalance();
	}
	public void transferto(double amount,BankAccount otherAccount) 
	{
		balance = balance + amount;
		otherAccount.deposit(amount);
		
	}
	
	public void transferFrom(double amount, BankAccount otherAccount) {
		balance = balance - amount;
		otherAccount.withdraw(amount);
		
	}
	
	public static void addInterest (double balance)
	//double interest, double newBal
	{
	
		double interest = 0.035;
		//double newBal = 0;
		double interestPct = 0.00;
		
		interestPct  = interest * balance;
		balance = balance + interestPct;
		
		System.out.println("Balance with interest: " + balance);
		
	}
	
	public String toString() {
		return "The account Number is: " + accountNum + " is owned by " + name + " with a Balance " 
	+ balance + " and is (not) overdrawn";
	          
	}
	
	
}
