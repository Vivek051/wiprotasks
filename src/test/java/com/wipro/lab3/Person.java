package com.wipro.lab3;

public class Person {
	private String Fname;
	private String Lname;
	private String gender;
	
	
	
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		this.Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		this.Lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	Person() {
		
	}
	public Person(String Fname, String Lname, String gender) throws  NameException {
		if(Fname == "" || Lname == "") {
			throw new NameException("Name field cannaot be empty..");
		}
		setFname(Fname);
		setLname(Lname);
		setGender(gender);
		
	}

}

 class NameException extends Exception {
	NameException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}
