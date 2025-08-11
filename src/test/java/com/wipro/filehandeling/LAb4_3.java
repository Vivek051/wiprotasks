package com.wipro.filehandeling;
import java.util.ArrayList;
import java.util.List;

import com.cg.eis.bean.Employee;
import com.cg.eis.pl.EmployeeServiceImplementation;
import com.cg.eis.service.*;
public class LAb4_3 {
	public static void main(String[] args) {




		Employee employee=null;

		try {
			List<Employee> employees = new ArrayList<>();
			employees.add(new Employee(1, "John", 50000,"Manager"));
			employees.add(new Employee(2, "Alice", 60000, "Tester"));

			String file = "employees.txt";
			Eservice es= new Eservice();
			es.writeEmployeesToFile(employees, file);
			es.readEmployeesFromFile(file);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}


		EmployeeService es= new EmployeeServiceImplementation();
		employee.setInsuranceSchemeString(es.setInsuranceScheme(employee));
		System.out.println(employee);

	}




}
