package org.tnsif.springioc;

public class HDFCCard implements DebitCard {

	@Override
	public void deposit() {
		System.out.println("HDFC-Depositing amount of 1 Lakhs Rupees");
		
	}

	@Override
	public void withdraw() {
		System.out.println("HDFC-Withdraw amount of 20,000");
		
	}

}
