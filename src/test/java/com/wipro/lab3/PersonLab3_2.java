package com.wipro.lab3;

public class PersonLab3_2 {
	private String name;
	private float age;
	
	public PersonLab3_2(String string, int i) {
		// TODO Auto-generated constructor stub
	}
	public void Person1(String name, float age) throws AgeValidationException {
		// TODO Auto-generated constructor stub
		if(age<=15)
		{
			throw new AgeValidationException("Age of a person should be above 15");
		}
		this.name=name;
		this.age=age;
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	
}


