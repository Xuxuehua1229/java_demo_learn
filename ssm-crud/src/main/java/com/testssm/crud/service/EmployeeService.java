package com.testssm.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testssm.crud.bean.Employee;
import com.testssm.crud.bean.EmployeeExample;
import com.testssm.crud.bean.EmployeeExample.Criteria;
import com.testssm.crud.dao.EmployeeMapper;

@Service
public class EmployeeService {
	@Autowired
	EmployeeMapper employeeMapper;

	/**
	 * 查询所有员工数据
	 * @return
	 */
	public List<Employee> getAllEmpInfos(){
		return employeeMapper.selectByExampleWithDept(null);
	}

	/**
	 * 员工信息的保存
	 */
	public void saveEmpInfo(Employee employee) {
		employeeMapper.insertSelective(employee);
	}

	/**
	 * 判断是否存在用户名
	 * @param empName
	 * return : true:用户名存在 false:用户名不存在
	 */
	public boolean checkUser(String empName) {
        EmployeeExample ee = new EmployeeExample();
        Criteria criteria = ee.createCriteria();
        criteria.andEmpNameEqualTo(empName);
        long count = employeeMapper.countByExample(ee);
        return count == 0;
	}
}
