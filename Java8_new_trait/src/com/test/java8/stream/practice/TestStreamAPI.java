package com.test.java8.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

import com.test.java8.lambda.day01.Employee;

public class TestStreamAPI {
   /*
        1.����һ�������б���η���һ����ÿ������ƽ�����ɵ��б��أ�
                              ����[1,2,3,4,5] , Ӧ�÷���[1,4,9,16,25]
    */
	
	@Test
	public void test1() {
		Integer[] nums = new Integer[]{1,2,3,4,5};
		
		Arrays.stream(nums)
		      .map((x) -> x * x )
		      .forEach(System.out::println);
	}
	
	//����
	List<Employee>  employees  = Arrays.asList(
			new Employee("����",28,19999.99),
			new Employee("����",30,20000.00),
			new Employee("����",21,8000.00),
			new Employee("����",18,4000.00),
			new Employee("����",22,9500.00),
			new Employee("����",23,9500.00),
			new Employee("����",22,9500.00)
	);
	/*
	    2.��map��reduce������ȡ�����ж��ٸ�Employee?
	 */
	@Test
	public void test2() {
		// map ��  count
		Long count = employees.stream()
		.map(Employee::getAge)
		.count();
		System.out.println(count);
		
		System.out.println("-----------------------------");
		
		//map �� reduce
		Optional<Integer> op = employees.stream()
		.map((e) -> 1)
		.reduce(Integer::sum);
		System.out.println(op.get());
	}
}
