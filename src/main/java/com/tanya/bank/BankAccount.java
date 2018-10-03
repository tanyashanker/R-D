package com.tanya.bank;


/** document based comment
 * 
 * @author tshanker
 * @since 03-10-2018
 *
 */

public abstract class BankAccount {
	int accountNo;
	String accountHolderName;
	double accountBalance;
	static int autoAccountNoGen;
	
	{
		accountNo=++autoAccountNoGen;
	}
	
	
	public BankAccount() {
		
		accountHolderName="Unknown";
		accountBalance=0;
	}

	public BankAccount(String accountHolderName, double accountBalance) {
		super();
		//this.accountNo=++autoAccountNoGen;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	public void withdraw(double amount) {
		accountBalance-=amount;
	}
	
	public void deposit(double amount) {
		accountBalance+=amount;
	}
	
	
	public int getAccountNo() {
		return accountNo;
	}

	
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountBalance="
				+ accountBalance + "]";
	}

	
	
	
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           