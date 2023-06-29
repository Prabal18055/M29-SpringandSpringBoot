package org.tnsif.springioc;

public class SBICard implements DebitCard{

	@Override
	public void deposit() {
		System.out.println("SBI-Depositing amount of 1 Lakhs Rupees");
		
	}

	@Override
	public void withdraw() {
		System.out.println("SBI-Withdraw amount of 20,000");
		
	}

}
