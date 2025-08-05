package com.wipro.example;

public class currentAccount extends Lab17 {
	private double overdraft;
	public currentAccount(double bal, String acholder,double overdraft) {
		super(bal, acholder);
		this.overdraft = overdraft;
		// TODO Auto-generated constructor stub
	}
   @Override
   public boolean withdraw(double amnt) {
		double rembal = bal - amnt;
		if(rembal >= overdraft) {
			System.out.println("Withdrawn from Current: " + amnt);
		    return true;
		} else {
			
			System.out.println("overdraft limit exceded");
		    return false;
		}

   }

   
	

}
