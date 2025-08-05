package com.wipro.example;

public class Lab17 {
	protected double bal;
	protected String acholder;
	public Lab17( double bal, String acholder) {
		super();

		this.bal = bal;
		this.acholder = acholder;
	}

	public void deposite(double amnt) {
		bal += amnt;
		System.out.println("Deposite amount is " + amnt);
	}

	public boolean withdraw(double amnt) {
			if(bal >= amnt) {
				bal -= amnt;
				return true;
			} else {
				System.out.println("Insufficient fund");
				return false;
			}
	}
	
	public void display() {
		System.out.println("Balance : " + bal);
		
	}

}
