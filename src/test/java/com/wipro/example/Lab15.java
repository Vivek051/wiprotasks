package com.wipro.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab15 {
	
	public static int calcAge(LocalDate dob) {
		LocalDate currdate = LocalDate.now();
		if(dob != null ) {
			return Period.between(dob, currdate).getYears();
		} else {
			System.out.println("Invalid input..");
			return -1;
		}
	}
	public static String getFullname(String fname, String lname) {
		return fname + " " + lname;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String fname = sc.next();

		System.out.println("Enter Last Name: ");
		String lname = sc.next();

		System.out.println("Enter Your DOB: ");
		String inputdob = sc.next();

		

		 LocalDate dob = LocalDate.parse(inputdob);


		String fullName = getFullname(fname, lname);
		int age = calcAge(dob);

		if (age >= 0) {
			System.out.println(" Person Details ---");
			System.out.println("Full Name : " + fullName);
			System.out.println("Date of Birth : " + dob);
			System.out.println("Age : " + age + " years");

		}

	}
}
