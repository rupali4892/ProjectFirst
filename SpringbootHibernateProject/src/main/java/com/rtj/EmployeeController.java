package com.rtj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@EnableTransactionManagement

public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@GetMapping("/employee")
	Employee getEmployee(){
		return employeeService.getEmployee();
		
		
	}

}
