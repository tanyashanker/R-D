package com.tanya.cust;

import com.tanya.bank.BankAccount;
import com.tanya.bank.CurrentAccount;
import com.tanya.bank.CurrentAccountVer2;
import com.tanya.bank.Insurance;
import com.tanya.bank.SavingAccountVer2;
import com.tanya.bank.SavingsAccount;

public class Customer {

	public static void main(String[] args) {
		BankAccount acc1 =null;
		acc1= new SavingsAccount();
		acc1.withdraw(5000);
		
		BankAccount acc2 = null;
		acc2=new CurrentAccount();
		acc2.withdraw(5000);
		
		
		Insurance in=null;
		in=new SavingAccountVer2();
		
		//SavingsAccount savingAcc=new SavingsAccount();
		System.out.println(in.getInsuranceName());
		System.out.println(in.getInsuranceAmount());
		System.out.println(in.isLifetime());
		
		
		in=new CurrentAccountVer2();
		System.out.println(in.getInsuranceName());
		System.out.println(in.getInsuranceAmount());
		System.out.println(in.isLifetime());
		
		
		
		/*BankAccount acc3 = acc1;
		System.out.println("Bank Account 1:" + acc1);
		System.err.println("Bank Account 2:" + acc2);
		System.out.println("Bank Account 3:" + acc3);*/
	}
}
