package com.wipro.lab3;

public class AccountLab3_2 {
	private String accNum;
	private double bal;
	private PersonLab3_2 acholder;
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public PersonLab3_2 getAcholder() {
		return acholder;
	}
	public void setAcholder(PersonLab3_2 acholder) {
		this.acholder = acholder;
	}
	public AccountLab3_2(String accNum, double bal, PersonLab3_2 acholder) {
		super();
		if(acholder == null) {
			throw new NullPointerException();
		}
		this.accNum = accNum;
		this.bal = bal;
		this.acholder = acholder;
	}
    
	public void deposite(double amnt) {
		bal += amnt;
		
	}
	public boolean withdraw(double amnt) {
		if(amnt < (bal-500)) {
			bal -= amnt;
			return true;
		}
		return false;
	}
	
	public double getBalance() {
		return bal;
	}
	
	@Override
	public String toString() {
	    return "Account Number: " + accNum +
	           "\nBalance: " + bal +
	           "\nAccount Holder: " + acholder.getName();
}
}