package com.wipro.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Lab13 {
public static LocalDate CalcExDt(LocalDate pdate, int wyears, int wmonth) {
	return pdate.plusYears(wyears).plusMonths(wmonth);
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your purchase date: ");
	String date = sc.nextLine();
	LocalDate pdate = LocalDate.parse(date);
	
	System.out.println("Enter warranty years:  ");
	int wyear = sc.nextInt();
	
	System.out.println("Enter warranty month:  ");
	int wmonth = sc.nextInt();
	
	LocalDate expdate = CalcExDt(pdate, wyear, wmonth);
	System.out.println("Warrenty expire date is: " + expdate);
	
	
	
}
}
