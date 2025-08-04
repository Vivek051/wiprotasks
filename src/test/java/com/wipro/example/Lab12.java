package com.wipro.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Date");
		String date = sc.nextLine();
		LocalDate  locdate = LocalDate.parse(date);
		
		System.out.println("Enter the Second Date");
		String date2 = sc.nextLine();
		LocalDate locdate2 = LocalDate.parse(date2);
		
        if(locdate2.isBefore(locdate2)) {
        	LocalDate temp = locdate;
        	locdate = locdate2;
        	locdate2 = temp;
        }
		Period dur = Period.between(locdate, locdate2);
		System.out.println("The Duration of " + locdate + " to " + locdate2);
		System.out.println("Duration is: " + "Year: " + dur.getYears() + " Month: " + dur.getMonths()+" Days: " + dur.getDays());


	}
}
