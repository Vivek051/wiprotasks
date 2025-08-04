package com.wipro.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Date");
		
		String date = sc.nextLine();
		
		LocalDate  locdate = LocalDate.parse(date);
		LocalDate currdate = LocalDate.now();
		
		
		Period dur = Period.between(locdate, currdate);
		System.out.println("Duration is: " + "Year: " + dur.getYears() + " Month: " + dur.getMonths()+" Days: " + dur.getDays());

	}
}
