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
	//����
	List<Employee>  employees  = Arrays.asList(
			new Employee("����",28,19999.99,Status.BUSY),
			new Employee("����",36,20000.00,Status.VOCATION),
			new Employee("����",21,8000.00,Status.FREE),
			new Employee("����",18,4000.00,Status.BUSY),
			new Employee("����",22,9500.00,Status.BUSY),
			new Employee("�����",23,9500.00,Status.FREE),
			new Employee("ɳ��",51,9500.00,Status.BUSY)
			);
	/*
	        һ��������ƥ��
	     allMatch ���� ����Ƿ�ƥ������Ԫ��
	     anyMatch ���� ����Ƿ�����ƥ��һ��Ԫ��
	     noneMatch ���� ����Ƿ�û��ƥ������Ԫ��
	     findFirst ���� ���ص�һ��Ԫ��
	     findAny ���� ���ص�ǰ���е��κ�Ԫ��
	     count ���� ��������Ԫ�ص��ܸ���
	     max ���� �����������ֵ
	     min ���� ����������Сֵ
	    
	          ������Լ
	     reduce(T identity,BinaryOperator) / reduce(BinaryOperator)
	     ���� ���Խ�����Ԫ�ط�������������õ�һ��ֵ
	          �����ռ�
	     collect ���� ����ת��Ϊ������ʽ�����յ�һ��Collector�ӿڵ�ʵ�֣����ڸ�Stream��Ԫ�������ܵķ���
	          �ġ�����
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
       
       //findFirst ��ȡ������͵�Ա����Ϣ
       Optional<Employee> op1 = employees.stream()
    		   .sorted((e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
    		   .findFirst();
       System.out.println(op1.get());
       
       //findAny
       // parallelStream():����  ����߳���ɽ���  Stream(): �����߳̽���
       Optional<Employee> op2 = employees.parallelStream()
        .filter((e) -> e.getStatus().equals(Status.FREE))
        .findAny();
       System.out.println(op2);
	}
	
	@Test
	public void test2() {
		Long count = employees.stream().count();
		System.out.println(count);
		
		//��ȡ���ֵ
		Optional<Employee> op1 =employees.stream()
				.max((e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
				System.out.println(op1.get());
				
	    //��ȡ���ֵ
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
		 //�ܺ�
		 Long count = employees.stream().collect(Collectors.counting());
		 System.out.println(count);
		 
		 System.out.println("-------------------------------------");
		 
		 //ƽ��ֵ
		 Double avgSalary = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		 System.out.println(avgSalary);
		 
		 System.out.println("-------------------------------------");
		 
		 //�ܺ�
		 Double sumSalary = employees.stream().collect(Collectors.summingDouble(Employee::getSalary));
		 System.out.println(sumSalary);
		 
		 System.out.println("---------------------------------------");
		 //���ֵ
		 Optional<Employee> maxSalary = employees.stream()
		    .collect(Collectors.maxBy((e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary())));
		 System.out.println(maxSalary.get());
		 
		 System.out.println("------------------------------------------");
		 //���ֵ
		 Optional<Double> minSalary = employees.stream().map(Employee::getSalary)
		 .collect(Collectors.minBy(Double::compare));
		 System.out.println(minSalary.get());
		 
		 System.out.println("---------------------------------------------");
	}
	
	//����
	@Test
	public void test6() {
		Map<Status, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getStatus));
		System.out.println(map);
	}
	
	//�༶����
	@Test
	public void test7() {
		Map<Status, Map<String, List<Employee>>> map = employees.stream().collect(Collectors.groupingBy(Employee::getStatus,Collectors.groupingBy((e) ->
		      {
		    	  if(((Employee) e).getAge() <= 35) {
		    	      return "����";
		    	  }else if(e.getAge() < 50) {
		    		  return "����";
		    	  }else {
		    		  return "����";
		    	  }
		      })));
		System.out.println(map);
	}
	
	//���� Collectors.partitioningBy()   �ֳɷ���������Ϊtrue  ������������Ϊfalse
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
