package com.test.java8.lambda.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.test.java8.lambda.day01.Employee;

public class LambdaP1 {

	//��һ�⣺����Collections.sort()������ͨ����������Ƚ�����Employee���Ȱ�����ȣ�������ͬ�������ȣ���,ʹ��Lambda��Ϊ�������ݡ�
	//����
	List<Employee>  employees  = Arrays.asList(
		new Employee("����",28,19999.99),
		new Employee("����",30,20000.00),
		new Employee("����",21,8000.00),
		new Employee("����",18,4000.00),
		new Employee("����",22,9500.00)
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
		String trimStr = strHandle("  ������������   ", (str) -> str.trim());
		System.out.println("trimStr:"+trimStr);
		
		String upperCaseStr = strHandle("addsss", (str) -> str.toUpperCase());
		System.out.println("upperCaseStr:"+upperCaseStr);
		
		String subStr = strHandle("���ǵط��ط�����", (str) -> str.substring(2,str.indexOf("��")));
		System.out.println("subStr:"+subStr);
	}
	
	//�������ڴ����ַ��� 
	public String strHandle(String str,MyFunctionStr funStr) {
		return funStr.getValue(str);
	}
	
	@Test
	public void test3() {
		setNum(100L, 400L, (l1,l2) -> l1 + l2);
		setNum(200, 10, (l1,l2) -> l1 * l2);
	}
	//��������������֮�������
	public void setNum(long l1,long l2,MyFunctionNum<Long, Long> funNum) {
		System.out.println(funNum.getValue(l1, l2));
	}
}
