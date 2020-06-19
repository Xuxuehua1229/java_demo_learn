package com.test.java8.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

import com.test.java8.lambda.day01.Employee;

public class TestStreamAPI {
   /*
        1.给定一个数字列表，如何返回一个由每个数的平方构成的列表呢？
                              给定[1,2,3,4,5] , 应该返回[1,4,9,16,25]
    */
	
	@Test
	public void test1() {
		Integer[] nums = new Integer[]{1,2,3,4,5};
		
		Arrays.stream(nums)
		      .map((x) -> x * x )
		      .forEach(System.out::println);
	}
	
	//事例
	List<Employee>  employees  = Arrays.asList(
			new Employee("张三",28,19999.99),
			new Employee("李四",30,20000.00),
			new Employee("王五",21,8000.00),
			new Employee("赵六",18,4000.00),
			new Employee("田七",22,9500.00),
			new Employee("田七",23,9500.00),
			new Employee("田七",22,9500.00)
	);
	/*
	    2.用map和reduce方法获取流中有多少个Employee?
	 */
	@Test
	public void test2() {
		// map 和  count
		Long count = employees.stream()
		.map(Employee::getAge)
		.count();
		System.out.println(count);
		
		System.out.println("-----------------------------");
		
		//map 和 reduce
		Optional<Integer> op = employees.stream()
		.map((e) -> 1)
		.reduce(Integer::sum);
		System.out.println(op.get());
	}
}
