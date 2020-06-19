package com.test.java8.stream.day05;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import com.test.java8.lambda.day01.Employee;

public class TestStreamAPI2 {
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
	         һ��ɸѡ����Ƭ
	   filter ���� ����Lambda,�������ų�ĳЩԪ��
	   limit ���� �ض�����ʹԪ�ز���������������
	   skip(n) ���� ����Ԫ�أ�����һ���ӵ���ǰn��Ԫ�ص�����������Ԫ�ز���n�����򷵻�һ�������� ��limit(n) ����
	   distinct ���� ɸѡ��ͨ����������Ԫ�ص�hashCode() ��equals() ȥ���ظ�Ԫ��   
	   
	          ���� ӳ��
	    map ���� ����Lambda,��Ԫ��ת����������ʽ����ȡ��Ϣ�� ����һ��������Ϊ�������ú����ᱻӦ�õ�ÿ��Ԫ���ϣ�
	                 ������ӳ���һ���µ�Ԫ��
	    flatMap ���� ����һ��������Ϊ�����������е�ÿ��ֵ��������һ������Ȼ������е������ӳ�һ����
	    
	          ���� ����
	    sorted() ���� ��Ȼ����(Comparable)
	    sorted(Comparator com) ���� ��������(Comparator)
	 */
	//�м����
	// �ڲ������� ����������Stream API �ڲ����
	@Test
	public void test1() {
		// �м���� : ����ִ���κβ���
		Stream<Employee> eStream = employees.stream()
				.filter((e) -> {
					System.out.println("Steam API ���м����");
					return e.getAge() > 25;
				});
		// ��ֹ����: һ����ִ��ȫ�����ݣ�����������ֵ��
		eStream.forEach(System.out::println);
	}
	
	// �ⲿ����: 
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
			           System.out.println("��·"); // && ||
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
	
	//ӳ��
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
	//���ַ���ת�������� ѭ����ӵ������� ���� ������
	public static Stream<Character> filterCharacter(String str){
		List<Character> list = new ArrayList<>();
		for (Character ch : str.toCharArray()) {
			list.add(ch);
		}
		return list.stream();
	}
	
	//����
	@Test
	public void test8() {
		//��Ȼ����
		List<String> list = Arrays.asList("ccc","aaa","bbb","ddd");
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("---------------------------------------------");
		//��������
		employees.stream().sorted((e1,e2) -> {
			if(e1.getAge().equals(e2.getAge())) {
				return e1.getName().compareTo(e2.getName());
			}else {
				return -e1.getAge().compareTo(e2.getAge());
			}
		}).forEach(System.out::println);
	}
}
