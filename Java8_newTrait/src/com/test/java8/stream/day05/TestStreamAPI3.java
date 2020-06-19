package com.test.java8.stream.day05;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import com.test.java8.lambda.day01.Employee;
import com.test.java8.lambda.day01.Employee.Status;

public class TestStreamAPI3 { 
	//事例
	List<Employee>  employees  = Arrays.asList(
			new Employee("张三",28,19999.99,Status.BUSY),
			new Employee("李四",36,20000.00,Status.VOCATION),
			new Employee("王五",21,8000.00,Status.FREE),
			new Employee("赵六",18,4000.00,Status.BUSY),
			new Employee("田七",22,9500.00,Status.BUSY),
			new Employee("电风扇",23,9500.00,Status.FREE),
			new Employee("沙发",51,9500.00,Status.BUSY)
			);
	/*
	        一、查找与匹配
	     allMatch —— 检测是否匹配所有元素
	     anyMatch —— 检测是否至少匹配一个元素
	     noneMatch —— 检测是否没有匹配所有元素
	     findFirst —— 返回第一个元素
	     findAny —— 返回当前流中的任何元素
	     count —— 返回流中元素的总个数
	     max —— 返回流中最大值
	     min —— 返回流中最小值
	    
	          二、归约
	     reduce(T identity,BinaryOperator) / reduce(BinaryOperator)
	     —— 可以将流中元素反复结合起来，得到一个值
	          三、收集
	     collect —— 将流转换为其他形式，接收到一个Collector接口的实现，用于给Stream中元素做汇总的方法
	          四、分组
	 */
	@Test
	public void test1() {
	   //allMatch
       boolean b1 = employees.stream().allMatch((e) -> e.getStatus().equals(Status.BUSY));
       System.out.println(b1);
       
       //anyMatch
       boolean b2 = employees.stream().anyMatch((e) -> e.getStatus().equals(Status.BUSY));
       System.out.println(b2);
       
       //noneMatch
       boolean b3 = employees.stream().noneMatch((e) -> e.getStatus().equals(Status.VOCATION));
       System.out.println(b3);
       
       //findFirst 获取工资最低的员工信息
       Optional<Employee> op1 = employees.stream()
    		   .sorted((e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
    		   .findFirst();
       System.out.println(op1.get());
       
       //findAny
       // parallelStream():并行  多个线程完成进行  Stream(): 单个线程进行
       Optional<Employee> op2 = employees.parallelStream()
        .filter((e) -> e.getStatus().equals(Status.FREE))
        .findAny();
       System.out.println(op2);
	}
	
	@Test
	public void test2() {
		Long count = employees.stream().count();
		System.out.println(count);
		
		//获取最高值
		Optional<Employee> op1 =employees.stream()
				.max((e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
				System.out.println(op1.get());
				
	    //获取最低值
	    Optional<Double> op2 = employees.stream()
	    		.map(Employee::getSalary)
	    		.min(Double::compare);
		System.out.println(op2);
	}
	
	//reduce()
	@Test
	public void test3() {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Integer allSum = list.stream().reduce(0,(x,y) -> x + y);
		System.out.println(allSum);
		System.out.println("--------------------------------------------");
		Optional<Double> op1 = employees.stream().map(Employee::getSalary).reduce(Double::sum);
		System.out.println(op1.get());
	}
	
	//collect()
	@Test
	public void test4() {
		 employees.stream().map(Employee::getName)
		.collect(Collectors.toList()).forEach(System.out::println);
		 
		 System.out.println("-------------------------------------");
		 
		 employees.stream().map(Employee::getName)
		 .collect(Collectors.toSet()).forEach(System.out::println);
		 
		 System.out.println("-------------------------------------");
		 
		 employees.stream().map(Employee::getName).collect(Collectors.toCollection(HashSet::new))
		 .forEach(System.out::println);
	}
	
	@Test
	public void test5() {
		 //总和
		 Long count = employees.stream().collect(Collectors.counting());
		 System.out.println(count);
		 
		 System.out.println("-------------------------------------");
		 
		 //平均值
		 Double avgSalary = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		 System.out.println(avgSalary);
		 
		 System.out.println("-------------------------------------");
		 
		 //总和
		 Double sumSalary = employees.stream().collect(Collectors.summingDouble(Employee::getSalary));
		 System.out.println(sumSalary);
		 
		 System.out.println("---------------------------------------");
		 //最高值
		 Optional<Employee> maxSalary = employees.stream()
		    .collect(Collectors.maxBy((e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary())));
		 System.out.println(maxSalary.get());
		 
		 System.out.println("------------------------------------------");
		 //最低值
		 Optional<Double> minSalary = employees.stream().map(Employee::getSalary)
		 .collect(Collectors.minBy(Double::compare));
		 System.out.println(minSalary.get());
		 
		 System.out.println("---------------------------------------------");
	}
	
	//分组
	@Test
	public void test6() {
		Map<Status, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getStatus));
		System.out.println(map);
	}
	
	//多级分组
	@Test
	public void test7() {
		Map<Status, Map<String, List<Employee>>> map = employees.stream().collect(Collectors.groupingBy(Employee::getStatus,Collectors.groupingBy((e) ->
		      {
		    	  if(((Employee) e).getAge() <= 35) {
		    	      return "青年";
		    	  }else if(e.getAge() < 50) {
		    		  return "中年";
		    	  }else {
		    		  return "老人";
		    	  }
		      })));
		System.out.println(map);
	}
	
	//分区 Collectors.partitioningBy()   分成符合条件的为true  不符合条件的为false
	@Test
	public void test8() {
		Map<Boolean, List<Employee>> map = employees.stream().collect(Collectors.partitioningBy((e) -> 
		                   e.getSalary() > 8000));
		System.out.println(map);
		
	}
	
	//Collectors.summarizingDouble()
	@Test
	public void test9() {
		DoubleSummaryStatistics dss = employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println(dss.getSum());
		System.out.println(dss.getAverage());
		System.out.println(dss.getMax());
	}
	
	//Collectors.joining()
	@Test
	public void test10() {
		String str = employees.stream().map(Employee::getName)
		.collect(Collectors.joining());
		System.out.println(str);
	}
}
