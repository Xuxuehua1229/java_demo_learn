package com.test.java8.stream.day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

import com.test.java8.lambda.day01.Employee;

/*
 * һ �� Stream  �������������裺
 * 1. ����Stream
 * 
 * 2. �м����
 * 
 * 3. ��ֹ�������ն˲�����
 */
public class TestStreamAPI1 {
   //���� Stream 
   @Test
   public void test1() {
	   //1.  ����ͨ�� Collection ϵ�м����ṩ��stream() �� parallelStream()
	   List<String> list = new ArrayList<>();  
	   Stream<String> stream = list.stream();  //  �� list.parallelStream();
	   
	   //2.ͨ��Arrays �еľ�̬���� stream() ��ȡ������
	   Employee[] employee = new Employee[10];
	   Stream<Employee> stream2 = Arrays.stream(employee);
	   
	   //3. ͨ��stream ���еľ�̬���� of()
	   Stream<String> stream3 = Stream.of("aa","bb","cc");
	   
	   //4. ����������
	   // ����
	   Stream<Integer> stream4 = Stream.iterate(0, (x) -> x + 2);
	   stream4.limit(10).forEach(System.out::println);
	   
	   //����
	   Stream.generate(() -> Math.random())
	   .limit(5)
	   .forEach(System.out::println);
   }
}
