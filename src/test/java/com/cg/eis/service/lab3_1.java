package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import com.cg.eis.pl.EmployeeServiceImplementation;
import com.cg.eis.service.EmployeeService;

public class lab3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee= new Employee(111, "Vivek", 0, "Tester");
		
		EmployeeService es= new EmployeeServiceImplementation();
	employee.setInsuranceSchemeString(es.setInsuranceScheme(employee));
		System.out.println(employee);

	}

}