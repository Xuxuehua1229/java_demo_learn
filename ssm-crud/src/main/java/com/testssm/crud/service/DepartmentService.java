package com.testssm.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testssm.crud.bean.Department;
import com.testssm.crud.dao.DepartmentMapper;

@Service
public class DepartmentService {
	@Autowired
    DepartmentMapper departmentMapper;
	
	public List<Department> getDepts(){
		return departmentMapper.selectByExample(null);
	};
    
	public Department getDeptById(Integer dId) {
		return departmentMapper.selectByPrimaryKey(dId);
	};
}
