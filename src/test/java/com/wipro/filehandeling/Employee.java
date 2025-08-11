package com.wipro.filehandeling;
import java.io.Serializable;
import java.lang.invoke.StringConcatFactory;
import java.util.HashMap;
import java.util.List;


	public class Employee implements Serializable {

		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public double getSalary() {
			return salary;
		}


		public void setSalary(double salary) {
			
			
			this.salary = salary;
		}


		public String getDesignation() {
			return designation;
		}


		public void setDesignation(String designation) {
			this.designation = designation;
		}


		public String getInsuranceSchemeString() {
			return insuranceSchemeString;
		}


		public void setInsuranceSchemeString(String insuranceSchemeString) {
			this.insuranceSchemeString = insuranceSchemeString;
		}


		private int id;
		 private String name;
		 private double salary;
		 private String designation;
		 private String insuranceSchemeString;
		 
		  public Employee(int id, String name, double salary, String designation) {
			  if(salary < 3000)
				{
				//throw new EmployeeSalaryException("Salary should br more than 3000");
				}
			
		        this.id = id;
		        this.name = name;
		        this.salary = salary;
		        this.designation = designation;
		       
		        
		    }
		 
		 @Override
		 public String toString()
		 {
			 
			 return "Employee ID: " + id +
		               "\nName: " + name +
		               "\nSalary: " + salary +
		               "\nDesignation: " + designation +
		               "\nInsurance Scheme: " + insuranceSchemeString;
		 }
		 
		 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			

		}

}
