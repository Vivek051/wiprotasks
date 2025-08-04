package com.wipro.example;

enum Gender {
	M,F
}
public class Person {
	String Fname;
	String Lname;
	Gender gender;
	long pNum;
	

	public Person(String fname, String lname, Gender gender,long pNum) {
		super();
		Fname = fname;
		Lname = lname;
		this.gender = gender;
		this.pNum = pNum;
	}

	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	

	public long getpNum() {
		return pNum;
	}
	public void setpNum(int pNum) {
		this.pNum = pNum;
	}
	void display() {
		System.out.println("Fname: " + Fname + " " + " Lname: " + Lname +" " + " Gender :" + gender);
	}
    void displaynumber() {
    	System.out.println("The Mobile Number is: " + pNum);
    }

}
