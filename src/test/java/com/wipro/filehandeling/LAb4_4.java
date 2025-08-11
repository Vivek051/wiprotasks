package com.wipro.filehandeling;
import java.util.*;
public class LAb4_4 {
	

	
		
	    public static void main(String[] args) {
	        List<String> products = new ArrayList<>();
	        products.add("Laptop");
	        products.add("Phone");
	        products.add("Tablet");
	        products.add("Monitor");

	        Collections.sort(products);

	        System.out.println("Sorted Products:");
	        for (String product : products) {
	            System.out.println(product);
	        }
	    }
	}

