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
	 * 导入jackson包
	 * @param pn
	 * @param model
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping("/emps")
	@ResponseBody
	public Msg getEmpsWithJson(@RequestParam(value="pn",defaultValue="1") int pn,Model model) {
		//引入 PageHelper分页插件
		//在查询之前只需要调用，并传入页码以及每页的数据量
		PageHelper.startPage(pn, 5);
		//startPage 后紧跟着的查询就是该分页查询
		List<Employee> empList = employeeService.getAllEmpInfos();
		//使用 PageInfo 包装查询后的结果，只需要将 pageInfo 交给页面就行了
		//封装了详细的分页信息，包括有我们查询到的数据，传入连续显示的页数
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
			return Msg.fail().add("validate_empName_msg", "用户名须6-16位数字和英文的组合和2-5位中文");
		}
		boolean b = employeeService.checkUser(empName);
		if(b) {
			return Msg.success();
		}else {
			return Msg.fail().add("validate_empName_msg", "用户不可用！");
		}
	}
	/**
	 * 查询员工数据（分页查询）	
	 * @return
	 */
	/*@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping("/emps")
	public String getEmps(@RequestParam(value="pn",defaultValue="1") int pn,Model model) {
		System.out.println("getEmps....");
		//引入 PageHelper分页插件
		//在查询之前只需要调用，并传入页码以及每页的数据量
		PageHelper.startPage(pn, 5);
		//startPage 后紧跟着的查询就是该分页查询
		List<Employee> empList = employeeService.getAllEmpInfos();
		//使用 PageInfo 包装查询后的结果，只需要将 pageInfo 交给页面就行了
		//封装了详细的分页信息，包括有我们查询到的数据，传入连续显示的页数
		//PageInfo<Employee> pageInfo = new PageInfo<Employee>();
		PageInfo pageInfo = new PageInfo(empList,5);
		model.addAttribute("pageInfo",pageInfo);
		return "list";
	}*/
}
