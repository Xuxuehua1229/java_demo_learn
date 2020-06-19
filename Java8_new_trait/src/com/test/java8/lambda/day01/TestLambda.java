package com.test.java8.lambda.day01;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import org.junit.Test;


public class TestLambda {
    //原来的匿名内部类
	@Test
	public void test1() {
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1, o2);
			}
		};
		TreeSet<Integer> ts = new TreeSet<>(comparator);
	}
	
	//Lambda 表达式
	@Test
	public void test2() {
		Comparator<Integer> com = (x,y) -> Integer.compare(x, y);
		TreeSet<Integer> ts = new TreeSet<>(com);
	}
	
	//事例
	List<Employee>  employees  = Arrays.asList(
			new Employee("张三",28,19999.99),
			new Employee("李四",30,20000.00),
			new Employee("王五",21,8000.00),
			new Employee("赵六",18,4000.00),
			new Employee("田七",22,9500.00)
	);
	
	
	@Test
	public void test3() {
		List<Employee> emps = filterEmployees(employees);
		System.out.print(emps);
	}
	
	//需求：获取当前公司中员工年龄大于35的员工信息
	public List<Employee> filterEmployees(List<Employee> list){
		List<Employee> emps = new ArrayList<Employee>();
		for (Employee employee : list) {
			if(employee.getAge() > 20) {
				emps.add(employee);
			}
		}
		return emps;
	}
	
	//需求：获取当前公司中员工工资大于9000的员工信息
	public List<Employee> filterEmployees2(List<Employee> list){
		List<Employee> emps = new ArrayList<Employee>();
		for (Employee employee : emps) {
			if(employee.getSalary() > 9000) {
				emps.add(employee);
			}
		}
		return emps;
	}
	
	@Test
	public void test4() {
		List<Employee> eList = filterEmployee(employees, new FilterEmployeeByAge());
		for (Employee employee : eList) {
			System.out.println(employee);
		}
		
		System.out.println("----------------------------");
		
		List<Employee> eList2 = filterEmployee(employees, new FilterEmployeeBySalary());
		for (Employee employee : eList2) {
			System.out.println(employee);
		}
	}
	
	//优化方式一：策略设计模式
	public List<Employee> filterEmployee(List<Employee> list,MyPredicate<Employee> mp) {
		List<Employee> emps = new ArrayList<>();
		for (Employee employee : list) {
			if(mp.test(employee)) {
				emps.add(employee);
			}
		}
		return emps;
	}
	
	//优化方式二：匿名内部类
	@Test
	public void test5() {
		List<Employee> list = filterEmployee(employees, new MyPredicate<Employee>() {
			
			@Override
			public boolean test(Employee t) {
				return t.getSalary()<10000;
			}
		});
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}
	
	//优化方式三：Lambda 表达式
	@Test
	public void test6() {
		List<Employee> list = filterEmployee(employees, (e) -> e.getSalary() < 10000);
		list.forEach(System.out::println);
	}
	
	//优化方式四:Stream API
	@Test
	public void test7() {
		employees.stream()
		         .filter((e) -> e.getSalary() < 10000)
		         .forEach(System.out::println);
		
		System.out.println("------------------------------");
		employees.stream()
		         .map(Employee :: getName)
		         .forEach(System.out::println);
		System.out.println("------------------------------");
		employees.stream()
        .map(Employee :: getName)
        .limit(2)
        .forEach(System.out::println);
	}
}
