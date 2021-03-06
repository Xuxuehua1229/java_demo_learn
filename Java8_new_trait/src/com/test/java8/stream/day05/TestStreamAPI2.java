package com.test.java8.stream.day05;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import com.test.java8.lambda.day01.Employee;

public class TestStreamAPI2 {
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
	         一、筛选与切片
	   filter —— 接收Lambda,从流中排除某些元素
	   limit —— 截断流，使元素不超过给定的数量
	   skip(n) —— 跳过元素，返回一个扔掉了前n个元素的流，若流中元素不足n个，则返回一个空流。 与limit(n) 互补
	   distinct —— 筛选，通过流所生成元素的hashCode() 和equals() 去除重复元素   
	   
	          二、 映射
	    map —— 接收Lambda,将元素转换成其他形式或提取信息。 接收一个函数作为参数，该函数会被应用到每个元素上，
	                 并将其映射成一个新的元素
	    flatMap —— 接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有的流连接成一个流
	    
	          三、 排序
	    sorted() —— 自然排序(Comparable)
	    sorted(Comparator com) —— 定制排序(Comparator)
	 */
	//中间操作
	// 内部迭代： 迭代操作有Stream API 内部完成
	@Test
	public void test1() {
		// 中间操作 : 不会执行任何操作
		Stream<Employee> eStream = employees.stream()
				.filter((e) -> {
					System.out.println("Steam API 的中间操作");
					return e.getAge() > 25;
				});
		// 终止操作: 一次性执行全部内容，即“惰性求值”
		eStream.forEach(System.out::println);
	}
	
	// 外部迭代: 
	@Test
	public void test2() {
		Iterator<Employee> it = employees.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	// limit(n)
	@Test
	public void test3() {
		employees.stream().filter((e) -> {
			           System.out.println("短路"); // && ||
			           return e.getSalary() > 5000;
		           })
		          .limit(2).forEach(System.out::println);
		                  
	}
	
	//skip(n)
	@Test
	public void test4() {
		employees.stream().filter((e) -> e.getSalary() > 5000)
		          .skip(2).forEach(System.out::println);
	}
	
	//distinct()
	@Test
	public void test5() {
		employees.stream().filter((e) -> e.getSalary() > 5000)
		.distinct().forEach(System.out::println);
	}
	
	//映射
	@Test
	public void test6() {
		List<String> list = Arrays.asList("aaa","bbb","ccc","ddd");
		
		list.stream().map((strs) -> strs.toUpperCase())
		    .forEach(System.out::println);
		
		System.out.println("----------------------------------");
		
		employees.stream().map(Employee::getName).forEach(System.out::println);
		
		System.out.println("------------------------------------");
		Stream<Stream<Character>> sm = list.stream()
				.map(TestStreamAPI2::filterCharacter);  // {{a,a,a},{b,b,b}}
		sm.forEach((stream) -> stream.forEach(System.out::println));
		
		System.out.println("------------------------------------");
		Stream<Character> sm1 = list.stream()
				.flatMap(TestStreamAPI2::filterCharacter);// {a,a,a,b,b,b}
		sm1.forEach(System.out::println);
	}
	
	@Test
	public void test7() {
		List<String> list = Arrays.asList("aaa","bbb","ccc","ddd");
		List<Object> oList = new ArrayList<>();
		oList.add(111);
		oList.add(222);
		oList.add(list);//111 222 [aaa, bbb, ccc, ddd] 
		oList.addAll(list);//111 222 aaa bbb ccc ddd
		for (Object object : oList) {
			System.out.print(object + " ");
		}
	}
	//将字符串转换成数组 循环添加到集合中 返回 集合流
	public static Stream<Character> filterCharacter(String str){
		List<Character> list = new ArrayList<>();
		for (Character ch : str.toCharArray()) {
			list.add(ch);
		}
		return list.stream();
	}
	
	//排序
	@Test
	public void test8() {
		//自然排序
		List<String> list = Arrays.asList("ccc","aaa","bbb","ddd");
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("---------------------------------------------");
		//定制排序
		employees.stream().sorted((e1,e2) -> {
			if(e1.getAge().equals(e2.getAge())) {
				return e1.getName().compareTo(e2.getName());
			}else {
				return -e1.getAge().compareTo(e2.getAge());
			}
		}).forEach(System.out::println);
	}
}
