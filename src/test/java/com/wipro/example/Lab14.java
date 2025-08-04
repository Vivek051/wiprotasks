package com.wipro.example;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Lab14 {
	public static void DateTimeZone(String zoneId) {
     ZoneId zn = ZoneId.of(zoneId);
     ZonedDateTime zndate = ZonedDateTime.now(zn);
     System.out.println("Current date and time in " + zoneId + " : " + zndate);
     
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter zone id : ");
		String znId = sc.nextLine();
		DateTimeZone(znId);
	}
}
