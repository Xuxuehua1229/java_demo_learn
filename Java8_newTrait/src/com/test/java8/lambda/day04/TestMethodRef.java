package com.test.java8.lambda.day04;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.Test;

import com.test.java8.lambda.day01.Employee;

/*
 * һ���������ã���Lambda ���е������Ѿ�ʵ���ˣ����ǾͿ���ʹ�á��������á�
 *   ���������Ϊ����������Lambda���ʽ����һ�ֱ�����ʽ��
 * ��Ҫ�������﷨��ʽ��
 * ��ʽһ:
 *    ����::ʵ��������
 * ��ʽ��:
 *    ��::��̬������
 * ��ʽ��:
 *    ��::ʵ��������
 *    
 *    ע: 1.Lambda ���е��÷����Ĳ����б��뷵��ֵ���ͣ�
 *    Ҫ�뺯��ʽ�ӿ��еĳ��󷽷��ĺ����б�ͷ���ֵ���ͱ���һ�¡�
 *        2.��Lambda �����б��еĵ�һ������ʵ�������ĵ����ߣ����ڶ���������ʵ������Ĳ���ʱ������ʹ��: ClassName :: method
 *  ��������������
 *     ��ʽ��ClassName :: new 
 *     ע�� ��Ҫ���õĹ������Ĳ����б�Ҫ�뺯��ʽ�ӿ��еĳ��󷽷��Ĳ����б���һ�£�
 *     
 *  ������������
 *     
 */
public class TestMethodRef {
   //����::ʵ��������
   @Test
   public void test1() {
	   Consumer<String> consumer = (x) -> System.out.println(x);
	   
	   PrintStream ps = System.out;
	   Consumer<String> con = ps :: println;
	   
	   Consumer<String> con1 = System.out::println;
	   con1.accept("����������ã�����");
   }
   
   @Test
   public void test2() {
	   Employee employee = new Employee();
	   Supplier<String> su1 = employee::getName;
	   String name = su1.get();
	   System.out.println(name);
	   
	   Supplier<Integer> su2 = employee::getAge;	
	   Integer age = su2.get();
	   System.out.println(age);
   }
   
   //����::��̬������
   @Test
   public void test3() {
	   Comparator<Integer> com = (x,y) -> Integer.compare(x, y);
	   
	   Comparator<Integer> com1 = Integer::compare;
   }
   
   //����::ʵ��������
   @Test	
   public void test4() {
	   BiPredicate<String, String> bp = (x,y) -> x.equals(y);
	   
	   BiPredicate<String, String> bp1 = String::equals;
	   
   }
   
   //���������� ClassName :: new
   @Test
   public void test5() {
	   Supplier<Employee> su = () -> new Employee();
	   
	   Supplier<Employee> emp = Employee :: new;
	   System.out.println(emp.get());
   }
   
   @Test
   public void test6() {
	   Function<Integer, Employee> efun = (x) -> new Employee(x);
	   
	   Function<Integer, Employee> efun1 = Employee :: new;
	   Employee emp = efun1.apply(39);
	   System.out.println(emp.getAge());
	   
	   BiFunction<String, Integer, Employee> bf = Employee :: new;
	   bf.apply("����", 29);
	   System.out.println(bf.apply("����", 29).getName());
   }
   
   //��������
   @Test
   public void test7() {
	   Function<Integer, String[]> fun = (x) -> new String[x];
	   String[] strs = fun.apply(10);
	   System.out.println(strs.length);
	   
	   Function<Integer, String[]> fun1 = String[] :: new;
	   String[] str2 = fun1.apply(15);
	   System.out.println(str2.length);
   }
}
