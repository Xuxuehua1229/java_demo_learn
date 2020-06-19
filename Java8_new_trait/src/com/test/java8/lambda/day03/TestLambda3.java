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
 * Consumer<T> : �����ͽӿ�
 *     void accept(T t);
 * Supplier<T> : �����ͽӿ�
 *     T get();
 * Function<T,R> : �����ͽӿ�
 *     R apply(T t);
 * Predicate<T> : �����ͽӿ�
 *     boolean test(T t);
 */
public class TestLambda3 {
	//Consumer<T t> : �����ͽӿ�
	@Test
	public void test1(){
        happy(20000, (m) -> System.out.println("С������"+ m + "Ԫ,����һ���ֻ�"));
	};
	
	public void happy(double money,Consumer<Double> con) {
		con.accept(money);
	}
	
	//Supplier<T> : �����ͽӿ�
	@Test
	public void test2() {
		List<Integer> list = getNumList(10, () -> (int)(Math.random() * 100));
		for (Integer in : list) {
			System.out.println(in);
		}
	}
	
	//����ָ�������������������뼯����
	public List<Integer> getNumList(Integer count,Supplier<Integer> supplier){
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			Integer getNum = supplier.get();
			list.add(getNum);
		}
		return list;
	}
	
	//Function<T,R> : �����ͽӿ�
	@Test
	public void test3() {
		String strTrim = strHandle(" \t\t������������h  ", (str) -> str.trim());
		System.out.println("strTrim:"+strTrim);
		String subStr = strHandle("˵����û��磬����", (str) -> str.substring(1,5));
		System.out.println("subStr:"+subStr);
	}
	
	//�����ַ���
	public String strHandle(String str,Function<String, String> funStr) {
        return funStr.apply(str);
	}
	
	//Predicate:�����ͽӿ�
	@Test
	public void test4() {
		List<String> list = Arrays.asList("hellow","world","ok","Lambda","str");
		List<String> strList = filterStr(list, (s) -> s.length() > 3);
		for (String str : strList) {
			System.out.println(str);
		}
	}
	
	//���� �������������ַ����ŵ�������
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
