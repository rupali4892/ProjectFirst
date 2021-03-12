package com.rtj;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class EmployeeService {
	@Autowired
	EmployeeDao employeeDao;
	Employee getEmployee(){
		return employeeDao.getEmployees();
		}

}
