package com.test.mybatis.dao;

import java.util.List;


import com.test.mybatis.bean.Employee;

public interface EmployeeMapper {
	
   public List<Employee> getEmps();
   
}
