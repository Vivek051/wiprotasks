package com.wipro.example;

public class AccMainApp {
	public static void main(String[] args) {
		Lab17 ac1 = new SavingAccount(1001,"Vivek");
		Lab17 ac2 = new currentAccount(1000, "Viv", 500);
		ac1.withdraw(200);
		ac1.withdraw(100);
		ac1.withdraw(55);
		ac1.display();
		
		ac2.withdraw(111);
		ac2.withdraw(555);
		ac2.display();
		
	}
}
