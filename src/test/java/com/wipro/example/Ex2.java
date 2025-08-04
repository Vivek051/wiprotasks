package com.wipro.example;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num= sc.nextInt();
		if(num > 0) {
			System.out.println("The Given number is positive " + num);
		} else {
			System.out.println("The Given number is negative " + num);

		}
	}
}
