package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;

public class EmployeeServiceImplementation implements EmployeeService{

	@Override
	public String setInsuranceScheme(Employee emp) {
		// TODO Auto-generated method stub

		if(emp.getDesignation() =="Manager") {
			return "A+";
		}
		else if(emp.getDesignation() == "Developer")
		{
			return "B+";
		}
		else if(emp.getDesignation() == "Tester") {
			return "A++";
		}
		else {
			{
				return "O+";
			}
		}

	}

	
}
