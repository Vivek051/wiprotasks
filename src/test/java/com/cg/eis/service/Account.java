package com.cg.eis.service;

public abstract class Account {
	private long accNum;
	protected double balance=500;
	private Person accHolder;

	public Account()
	{}

	public Account(long accNum,double balance,Person person) {
		// TODO Auto-generated constructor stub
		this.accNum=accNum;
		this.balance= balance;
		this.accHolder=person;
	}

	@Override
	public String toString() {
	    return "Account Number: " + accNum +
	           "\nBalance: " + balance +
	           "\nAccount Holder: " + accHolder.getName();
	}
	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


	public void deposit(double amount)
	{
	balance+=amount;	
	}

	public abstract boolean withdraw(double amount);


	public double getBalance()
	{
		return balance;
		}
}
