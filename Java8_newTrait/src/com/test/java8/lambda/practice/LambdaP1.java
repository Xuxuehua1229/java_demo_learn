package com.test.java8.lambda.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.test.java8.lambda.day01.Employee;

public class LambdaP1 {

	//第一题：调用Collections.sort()方法，通过定制排序比较两个Employee（先按年龄比，年龄相同按姓名比，）,使用Lambda作为参数传递。
	//事例
	List<Employee>  employees  = Arrays.asList(
		new Employee("张三",28,19999.99),
		new Employee("李四",30,20000.00),
		new Employee("王五",21,8000.00),
		new Employee("赵六",18,4000.00),
		new Employee("田七",22,9500.00)
	);
	
	
	@Test	
	public void test1() {
        Collections.sort(employees, (e1,e2) -> {
        	if(e1.getAge() == e2.getAge()) {
        		return e1.getName().compareTo(e2.getName());
        	}else {
				return Integer.compare(e1.getAge(), e2.getAge());
			}
        });
        
        for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
	
	
	@Test
	public void test2() {
		String trimStr = strHandle("  哈哈啊哈哈哈   ", (str) -> str.trim());
		System.out.println("trimStr:"+trimStr);
		
		String upperCaseStr = strHandle("addsss", (str) -> str.toUpperCase());
		System.out.println("upperCaseStr:"+upperCaseStr);
		
		String subStr = strHandle("还是地方地方的是", (str) -> str.substring(2,str.indexOf("的")));
		System.out.println("subStr:"+subStr);
	}
	
	//需求：用于处理字符串 
	public String strHandle(String str,MyFunctionStr funStr) {
		return funStr.getValue(str);
	}
	
	@Test
	public void test3() {
		setNum(100L, 400L, (l1,l2) -> l1 + l2);
		setNum(200, 10, (l1,l2) -> l1 * l2);
	}
	//需求：用于两个数之间的运算
	public void setNum(long l1,long l2,MyFunctionNum<Long, Long> funNum) {
		System.out.println(funNum.getValue(l1, l2));
	}
}
