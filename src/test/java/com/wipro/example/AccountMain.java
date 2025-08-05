package com.wipro.example;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        float age = sc.nextFloat();

        System.out.print("Enter initial amount: ");
        double bal = sc.nextDouble();

        AccPerson p = new AccPerson(name, age);
        Lab16 ac = new Lab16(name, bal, p);

        System.out.print("\nEnter amount to deposit: ");
        double depositAmt = sc.nextDouble();
        ac.deposit(depositAmt);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmt = sc.nextDouble();
        ac.withdraw(withdrawAmt);

        ac.display();

        
    }
}