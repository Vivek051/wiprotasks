package com.wipro.example;

import java.util.Scanner;

public class PosStringCheck {

	    public static boolean isPositiveString(String input) {
	        input = input.toUpperCase();

	        for (int i = 1; i < input.length(); i++) {
	            if (input.charAt(i) <= input.charAt(i - 1)) {
	                return false; 
	            }
	        }
	        return true; 	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	          
	    	String test = sc.nextLine();
	  
	        System.out.println(test + " a positive string : " + isPositiveString(test));
	    }
	
}
