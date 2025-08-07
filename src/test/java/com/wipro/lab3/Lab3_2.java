package com.wipro.lab3;

public class Lab3_2 {
	public static void main(String[] args) {
		try {
			PersonLab3_2 p1 =new PersonLab3_2("Smith", 22);
			AccountLab3_2 a1 = new AccountLab3_2("Sm1234",10000, p1);
			
			PersonLab3_2 p2 =new PersonLab3_2("Kathy", 24);
			AccountLab3_2 a2 = new AccountLab3_2("Kathy1234",50000, p1);
			
			
			a1.setBal(1500);
			a2.withdraw(100);
			
			System.out.println(a1.getAccNum()+" Account has Balance : "+a1.getBalance());
			System.out.println(a2.getAccNum()+" Account has Balance : "+a2.getBalance());
			System.out.println();
			System.out.println(a1);
			System.out.println(a2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
