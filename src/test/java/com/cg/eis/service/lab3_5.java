package com.cg.eis.service;

public class lab3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1= new Person("Smith",23);
		Person p2= new Person("kathy", 22);
		Account a1= new AccountApp(1001, 2000, p1);
		Account a2 = new AccountApp(1002,3000,p2);
		
		a1.setBalance(2000);
		a2.withdraw(2000);
		
		System.out.println(a1.getAccNum()+" Account has Balance : "+a1.getBalance());
		System.out.println(a2.getAccNum()+" Account has Balance : "+a2.getBalance());
		System.out.println();
		System.out.println(a1);
		System.out.println(a2);
		

	}
}
