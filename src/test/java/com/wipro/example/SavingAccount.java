package com.wipro.example;

public class SavingAccount extends Lab17{
    private static final double min_amnt = 500.00;
	public SavingAccount(double bal, String acholder) {
		super(bal, acholder);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean withdraw(double amnt) {
		double rembal = bal - amnt;
		if(rembal >= min_amnt) {
			bal -= amnt;
			System.out.println("Withdrawed from saving account : " + amnt);
			return true;
		} else {
			System.out.println("Minimum amount should be maintained");
			return false;
		}
	}
	

}
