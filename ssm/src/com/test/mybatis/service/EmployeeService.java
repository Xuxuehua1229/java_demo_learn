package com.test.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.mybatis.bean.Employee;
import com.test.mybatis.dao.EmployeeMapper;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeMapper employeeMapper;
	
	public List<Employee> getEmps() {
		return employeeMapper.getEmps();
		//return null;
	}
}
