package com.wipro.lab3;

	import com.cg.eis.bean.Employee;
	import com.cg.eis.pl.EmployeeServiceImplementation;
	import com.cg.eis.service.EmployeeService;

	public class Lab3_3 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Employee employee=null;
			
			try {
				employee= new Employee(111,"Vivek", 1000, "Tester");	
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			
			EmployeeService es= new EmployeeServiceImplementation();
		employee.setInsuranceSchemeString(es.setInsuranceScheme(employee));
			System.out.println(employee);

		}

	}
