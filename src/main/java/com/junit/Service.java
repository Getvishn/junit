package com.junit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Service {
	
	public Map<String,Employee> getEmployeeByDept(List<String> inputData) {
		
		Map<String,Employee> employeeByDept = new HashMap<>();
		Employee employee = new Employee();
		employee.setName(inputData.get(0));
		employeeByDept.put("deptartment_mech", employee);
		
		employee = new Employee();
		employee.setName(inputData.get(1));
		employeeByDept.put("deptartment_civil", employee);
		
		return employeeByDept;
	}

}
