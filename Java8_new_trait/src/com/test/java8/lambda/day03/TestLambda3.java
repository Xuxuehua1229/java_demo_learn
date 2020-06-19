package com.test.java8.lambda.day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.Test;

/*
 * Consumer<T> : 消费型接口
 *     void accept(T t);
 * Supplier<T> : 供给型接口
 *     T get();
 * Function<T,R> : 函数型接口
 *     R apply(T t);
 * Predicate<T> : 断言型接口
 *     boolean test(T t);
 */
public class TestLambda3 {
	//Consumer<T t> : 消费型接口
	@Test
	public void test1(){
        happy(20000, (m) -> System.out.println("小明花了"+ m + "元,买了一部手机"));
	};
	
	public void happy(double money,Consumer<Double> con) {
		con.accept(money);
	}
	
	//Supplier<T> : 供给型接口
	@Test
	public void test2() {
		List<Integer> list = getNumList(10, () -> (int)(Math.random() * 100));
		for (Integer in : list) {
			System.out.println(in);
		}
	}
	
	//产生指定个数的整数，并放入集合中
	public List<Integer> getNumList(Integer count,Supplier<Integer> supplier){
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			Integer getNum = supplier.get();
			list.add(getNum);
		}
		return list;
	}
	
	//Function<T,R> : 函数型接口
	@Test
	public void test3() {
		String strTrim = strHandle(" \t\t哈哈哈哈哈哈h  ", (str) -> str.trim());
		System.out.println("strTrim:"+strTrim);
		String subStr = strHandle("说几句好话噻，嘻嘻", (str) -> str.substring(1,5));
		System.out.println("subStr:"+subStr);
	}
	
	//处理字符串
	public String strHandle(String str,Function<String, String> funStr) {
        return funStr.apply(str);
	}
	
	//Predicate:断言型接口
	@Test
	public void test4() {
		List<String> list = Arrays.asList("hellow","world","ok","Lambda","str");
		List<String> strList = filterStr(list, (s) -> s.length() > 3);
		for (String str : strList) {
			System.out.println(str);
		}
	}
	
	//需求： 将满足条件的字符串放到集合中
	public List<String> filterStr(List<String> strs,Predicate<String> preStr){
		List<String> list = new ArrayList<>();
		for (String str: strs) {
			if(preStr.test(str)) {
				list.add(str);
			}
		}
		return list;
	}
}
