package com.cg.eis.service;

public class AccountApp extends Account {

	 public AccountApp(long accNum, double balance, Person person) {
	        super(accNum, balance, person);
	    }

	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		{
			if(amount< (balance-500))	
			{
				balance-=amount;
				return true;
				}
			return false;
			}
	}

}
