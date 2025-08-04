package com.wipro.example;

public class PersonMain {
	public static void main(String[] args) {
		Person p = new Person("Vivek", "Borgalle", Gender.M,88665544111L);
		p.display();
		p.displaynumber();
	}
}
