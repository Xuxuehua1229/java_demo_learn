package com.testssm.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.testssm.crud.bean.Department;
import com.testssm.crud.bean.Employee;
import com.testssm.crud.bean.Msg;
import com.testssm.crud.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	/**
	 * ����jackson��
	 * @param pn
	 * @param model
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping("/emps")
	@ResponseBody
	public Msg getEmpsWithJson(@RequestParam(value="pn",defaultValue="1") int pn,Model model) {
		//���� PageHelper��ҳ���
		//�ڲ�ѯ֮ǰֻ��Ҫ���ã�������ҳ���Լ�ÿҳ��������
		PageHelper.startPage(pn, 5);
		//startPage ������ŵĲ�ѯ���Ǹ÷�ҳ��ѯ
		List<Employee> empList = employeeService.getAllEmpInfos();
		//ʹ�� PageInfo ��װ��ѯ��Ľ����ֻ��Ҫ�� pageInfo ����ҳ�������
		//��װ����ϸ�ķ�ҳ��Ϣ�����������ǲ�ѯ�������ݣ�����������ʾ��ҳ��
		//PageInfo<Employee> pageInfo = new PageInfo<Employee>();
		PageInfo page = new PageInfo(empList,5);
		return Msg.success().add("pageInfo", page);
	}
	
	@RequestMapping(value="/insertDeptInfo",method=RequestMethod.POST)
	@ResponseBody
	public Msg insertDeptInfo(Employee employee) {
		employeeService.saveEmpInfo(employee);
		return Msg.success();
	}
	
	@RequestMapping("/checkUser")
	@ResponseBody
	public Msg checkUser(@RequestParam("empName") String empName) {
		String regex = "(^[a-zA-Z0-9_-]{6,16}$)|(^[\\u2E80-\\u9FFF]{2,5})";
		if(!empName.matches(regex)) {
			return Msg.fail().add("validate_empName_msg", "�û�����6-16λ���ֺ�Ӣ�ĵ���Ϻ�2-5λ����");
		}
		boolean b = employeeService.checkUser(empName);
		if(b) {
			return Msg.success();
		}else {
			return Msg.fail().add("validate_empName_msg", "�û������ã�");
		}
	}
	/**
	 * ��ѯԱ�����ݣ���ҳ��ѯ��	
	 * @return
	 */
	/*@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping("/emps")
	public String getEmps(@RequestParam(value="pn",defaultValue="1") int pn,Model model) {
		System.out.println("getEmps....");
		//���� PageHelper��ҳ���
		//�ڲ�ѯ֮ǰֻ��Ҫ���ã�������ҳ���Լ�ÿҳ��������
		PageHelper.startPage(pn, 5);
		//startPage ������ŵĲ�ѯ���Ǹ÷�ҳ��ѯ
		List<Employee> empList = employeeService.getAllEmpInfos();
		//ʹ�� PageInfo ��װ��ѯ��Ľ����ֻ��Ҫ�� pageInfo ����ҳ�������
		//��װ����ϸ�ķ�ҳ��Ϣ�����������ǲ�ѯ�������ݣ�����������ʾ��ҳ��
		//PageInfo<Employee> pageInfo = new PageInfo<Employee>();
		PageInfo pageInfo = new PageInfo(empList,5);
		model.addAttribute("pageInfo",pageInfo);
		return "list";
	}*/
}
