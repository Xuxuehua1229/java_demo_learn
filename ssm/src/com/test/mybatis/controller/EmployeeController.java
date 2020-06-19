package com.test.mybatis.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.mybatis.bean.Employee;
import com.test.mybatis.service.EmployeeService;

@Controller
public class EmployeeController {
   @Autowired
   private EmployeeService employeeService;
   
   @RequestMapping("/getEmps")
   public String emp(Map<String, Object> map) {
	   List<Employee> employees = employeeService.getEmps();
	   map.put("allEmps", employees);
	   return "list";
   }
}
