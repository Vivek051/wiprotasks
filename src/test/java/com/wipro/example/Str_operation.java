package com.wipro.example;

import java.util.Scanner;

public class Str_operation {

    public static String performOperation(String input, int ch) {
	        switch (ch) {
	            case 1:
	                
	                return input + input;

	            case 2:
	                StringBuilder rep = new StringBuilder(input);
	                for (int i = 0; i < rep.length(); i++) {
	                    if (i % 2 != 0) {
	                        rep.setCharAt(i, '#');
	                    }
	                }
	                return rep.toString();
	                
			case 3:
	                StringBuilder unique = new StringBuilder();
	                for (int i = 0; i < input.length(); i++) {
	                    char c = input.charAt(i);
	                    if (unique.indexOf(String.valueOf(c)) == -1) {
	                        unique.append(c);
	                    }
	                }
	                return unique.toString();

	            case 4:
	                StringBuilder modified = new StringBuilder();
	                for (int i = 0; i < input.length(); i++) {
	                    char c = input.charAt(i);
	                    if (i % 2 != 0) {
	                        modified.append(Character.toUpperCase(c));
	                    } else {
	                        modified.append(c);
	                    }
	                }
	                return modified.toString();

	            default:
	                return "Invalid choice!";
	        }
	    }

	    public static void main(String[] args) {
	    	Scanner sc=  new Scanner(System.in);
	        String input = sc.nextLine();
	        int ch= sc.nextInt();
	        String result = performOperation(input, ch);
	        System.out.println("Result: " + result);
	    }
	}


