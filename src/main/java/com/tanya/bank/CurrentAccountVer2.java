package com.tanya.bank;

public class CurrentAccountVer2 extends CurrentAccount implements Insurance{
	public String getInsuranceName() {
		return "Current: Max Bupa";
	}
	
	public double getInsuranceAmount() {
		return 250.76;
	}
	
	public boolean isLifetime() {
		return false;
	}
	
}
