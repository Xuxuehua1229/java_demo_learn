package com.testssm.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.testssm.crud.bean.Department;
import com.testssm.crud.bean.Msg;
import com.testssm.crud.service.DepartmentService;

@Controller
public class DepartmentController {
	@Autowired
	DepartmentService departmentService;
	
	@RequestMapping("/getAllDeptInfo")
	@ResponseBody
	public Msg getAllDeptInfo() {
		List<Department> departments = departmentService.getDepts();
		return Msg.success().add("departments", departments);
	}
	
	@RequestMapping("/getDeptById")
	@ResponseBody
	public Department getDeptById(@RequestParam("dId") Integer dId) {
		Department department = departmentService.getDeptById(dId);
		return department;
	}
	
	
}
