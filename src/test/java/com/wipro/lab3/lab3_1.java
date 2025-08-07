package com.wipro.lab3;

public class lab3_1 {
	public static void main(String[] args) throws NameException {
		try {
			Person p = new Person("", "", "M");
			System.out.println(p);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
