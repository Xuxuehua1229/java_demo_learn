package com.test.java8.lambda.day02;

import java.util.Comparator;
import java.util.function.Consumer;

import org.junit.Test;

/**
 * 一、Lambda 表达式的基础语法：java8中引入了一个新的操作符“->”  该操作符叫做箭头操作符
 * 或叫做Lambda操作符 ， 箭头操作将Lambda表达式拆分成两部分。
 * 分别为：
 * 左侧：Lambda表达式的参数列表
 * 右侧：Lambda表达中所需要执行的功能，即Lambda体
 * 
 * 语法格式一：无参数，无返回值
 *    Runnable rb1 = () -> System.out.println("Hello World!!"+num);
	  rb1.run();
 *语法格式二：有一个参数，无返回值
 *    Consumer<Integer> consumer = (x) -> System.out.println(x);
	  consumer.accept(11122222);
 *语法格式三：若只有一个参数的话，括号可以省略
 *    Consumer<Integer> consumer = x -> System.out.println(x);
	  consumer.accept(11122222);
 *语法格式四：有两个以上的参数，有返回值，并且Lambda表达式里有多条语句
 *    Comparator<Integer> comparator = (x,y) -> {
			System.out.println("函数式接口：");
			return Integer.compare(x, y);
	  };
  语法格式五：若Lambda体中只有一条语句，括号可以省略
      Comparator<Integer> comparator = (x,y) -> Integer.compare(x, y);
  语法格式六：Lambda表达式的参数列表的数据类型可以省略不写，因为JVM编译器可以通过上下文
           推断出数据类型，即"类型推断"
           Comparator<Integer> comparator = (Integer x,Integer y) -> Integer.compare(x, y);
 
 *上联：左右遇一括可以省
 *下联：左侧推断右边省
 *横批：能省则省
 *
 *二、Lambda表达式需要"函数式接口"的支持
 *函数式接口：接口中只有一个抽象方法的接口，称为函数式接口，可以使用注解：@FunctionalInterface 修饰，
 *可以检测是否是函数接口
 */
public class TestLambda {
	@Test
	public void test1() {
		int num = 0;//jdk1.7前,必须是final 1.8之后，虽然可以不写，但仍然是默认的，只是没有写上而已
		Runnable rb = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello World!!"+num);//num 不能被修改
			}
		};
		rb.run();
		System.out.println("=================================");
		
		
		Runnable rb1 = () -> System.out.println("Hello World!!"+num);
		rb1.run();
	}
	
	@Test
	public void test2(){
		Consumer<Integer> consumer = x -> System.out.println(x);
		consumer.accept(11122222);
	}
	
	@Test
	public void test3(){
		Comparator<Integer> comparator = (x,y) -> {
			System.out.println("函数式接口：");
			return Integer.compare(x, y);
		};
		comparator.compare(2, 1);
	}
	
	@Test
	public void test4(){
		Comparator<Integer> comparator = (Integer x,Integer y) -> Integer.compare(x, y);
		comparator.compare(2, 1);
		
		System.out.println("===========================");
		String [] strs = {"a","b"};
	}
	
	//需求：对一个数进行运算
	@Test
	public void test5(){
		Integer ope = operation(100, (x) -> x*x);
		System.out.println(ope);
		Integer ope1 = operation(2, (x) -> x-9);
		System.out.println(ope1);
	}
	
	public Integer operation(Integer num,MyFun mf) {
		return mf.getValue(num);
	} 
}
