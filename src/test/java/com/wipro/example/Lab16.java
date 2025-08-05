package com.wipro.example;

public class Lab16 {
    private String accNum;
    private double bal;
    private AccPerson accHolder;
    private static final double MIN_BAL = 500.0;
    //private static int counter = 1000;


    public Lab16(String accNum, double bal, AccPerson accHolder) {
		super();
		this.accNum = accNum;
		this.bal = bal;
		this.accHolder = accHolder;
	}

	

    public void deposit(double amnt) {
        if (amnt > 0) {
            bal += amnt;
            System.out.println(amnt + " deposited successfully.");
        } else {
            System.out.println("Deposit failed. Amount must be positive.");
        }
    }

    public void withdraw(double amnt) {
        if (amnt > 0 && (bal - amnt) >= MIN_BAL) {
            bal -= amnt;
            System.out.println(amnt + " withdrawn successfully.");
        } else {
            System.out.println("Withdrawal failed. Minimum balance ₹500 must be maintained.");
        }
    }

    public double getBal() {
        return bal;
    }

    public String getAccountNumber() {
        return accNum;
    }

    public AccPerson getAccountHolder() {
        return accHolder;
    }

    public void display() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number : " + accNum);
        System.out.println("Account Holder : " + accHolder.getName());
        System.out.println("Age : " + accHolder.getAge());
        System.out.println("Balance : ₹" + bal);
    }
}