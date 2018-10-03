package com.tanya.bank;

public class SavingAccountVer2 extends SavingsAccount implements Insurance{

	public String getInsuranceName() {
		return "Savings: Jeevan Beema";
	}
	
	public double getInsuranceAmount() {
		return 500.98;
	}
	
	public boolean isLifetime() {
		return true;
	}

}
