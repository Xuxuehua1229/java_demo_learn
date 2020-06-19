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
	 * ��ѯ����Ա������
	 * @return
	 */
	public List<Employee> getAllEmpInfos(){
		return employeeMapper.selectByExampleWithDept(null);
	}

	/**
	 * Ա����Ϣ�ı���
	 */
	public void saveEmpInfo(Employee employee) {
		employeeMapper.insertSelective(employee);
	}

	/**
	 * �ж��Ƿ�����û���
	 * @param empName
	 * return : true:�û������� false:�û���������
	 */
	public boolean checkUser(String empName) {
        EmployeeExample ee = new EmployeeExample();
        Criteria criteria = ee.createCriteria();
        criteria.andEmpNameEqualTo(empName);
        long count = employeeMapper.countByExample(ee);
        return count == 0;
	}
}
