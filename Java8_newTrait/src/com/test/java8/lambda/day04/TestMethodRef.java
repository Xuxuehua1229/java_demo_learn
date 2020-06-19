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
 * 一、方法引用：若Lambda 体中的内容已经实现了，我们就可以使用“方法引用”
 *   （可以理解为方法引用是Lambda表达式的另一种表现形式）
 * 主要有三种语法格式：
 * 格式一:
 *    对象::实例方法名
 * 格式二:
 *    类::静态方法名
 * 格式三:
 *    类::实例方法名
 *    
 *    注: 1.Lambda 体中调用方法的参数列表与返回值类型，
 *    要与函数式接口中的抽象方法的函数列表和返回值类型保持一致。
 *        2.若Lambda 参数列表中的第一参数是实例方法的调用者，而第二个参数是实例对象的参数时，可以使用: ClassName :: method
 *  二、构造器引用
 *     格式：ClassName :: new 
 *     注： 需要调用的构造器的参数列表要与函数式接口中的抽象方法的参数列表保持一致！
 *     
 *  三、数组引用
 *     
 */
public class TestMethodRef {
   //对象::实例方法名
   @Test
   public void test1() {
	   Consumer<String> consumer = (x) -> System.out.println(x);
	   
	   PrintStream ps = System.out;
	   Consumer<String> con = ps :: println;
	   
	   Consumer<String> con1 = System.out::println;
	   con1.accept("今天天气真好！！！");
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
   
   //类名::静态方法名
   @Test
   public void test3() {
	   Comparator<Integer> com = (x,y) -> Integer.compare(x, y);
	   
	   Comparator<Integer> com1 = Integer::compare;
   }
   
   //类名::实例方法名
   @Test	
   public void test4() {
	   BiPredicate<String, String> bp = (x,y) -> x.equals(y);
	   
	   BiPredicate<String, String> bp1 = String::equals;
	   
   }
   
   //构造器引用 ClassName :: new
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
	   bf.apply("张三", 29);
	   System.out.println(bf.apply("张三", 29).getName());
   }
   
   //数组引用
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
