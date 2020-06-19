package com.test.java8.stream.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

public class TestStreamAPI2 {
	List<Transaction> transaction = new ArrayList<>();
	@Before
	public void before() {
		Trader raoul = new Trader("Raoul","Cambridge");
		Trader mario = new Trader("Mario","Mian");
		Trader alan = new Trader("Alan","Cambridge");
		Trader brian = new Trader("Brian","Cambridge");
		
		transaction = Arrays.asList(
			new Transaction(brian, 2011, 300),
			new Transaction(raoul,2012,1000),
			new Transaction(raoul,2011,400),
			new Transaction(mario,2012,710),
			new Transaction(mario,2012,700),
			new Transaction(alan,2012,950)
		);
	}
	
	//1. 找出2011年发生的所有交易，并按交易额进行排序（从低到高）
	@Test
	public void test1() {
		transaction.stream().filter((t) -> t.getYear() == 2011)
		.sorted((t1,t2) -> Integer.compare(t1.getValue(), t2.getValue()))
		.forEach(System.out::println);
	}
	//2. 交易员都在哪些不同的城市工作过？
	@Test
	public void test2() {
		transaction.stream().map((t) -> t.getTrader().getCity())
		.distinct()
		.forEach(System.out::println);
	}
	//3. 查找所有来自剑桥的交易员，并按姓名排序
	@Test
	public void test3() {
		transaction.stream()
		.filter((t) -> t.getTrader().getCity().equals("Cambridge"))
		.map(Transaction::getTrader)
		.sorted((t1,t2) -> t1.getName().compareTo(t2.getName()))
		.forEach(System.out::println);
	}
	//4. 返回所有交易员的姓名字符串，按字母顺序排序
	@Test
	public void test4() {
		//map 和 sorted 进行自然排序
		transaction.stream()
		        .map((t) -> t.getTrader().getName())
		        .sorted()
		        .forEach(System.out::println);
		
		System.out.println("----------------------------");
		
		//map 和 sorted 进行自然排序 之后用reduce("",String::concat) 将排序后的字符串进行拼接 
		// result : AlanBrianMarioMarioRaoulRaoul
		String str = transaction.stream()
		           .map((t) -> t.getTrader().getName())
		           .sorted()
		           .reduce("",String::concat);
		System.out.println(str);
		
		System.out.println("----------------------------");
		
		//将字符串进行排序  result : ABMMRRaaaaaaiiilllnnoooorrruu
		transaction.stream()
				   .map((t) -> t.getTrader().getName())
				   .flatMap(TestStreamAPI2::filterCharacter)
				   .sorted()
				   .forEach(System.out::print);
		
		System.out.println("----------------------------");
		
		//result : aaaaaAaBiiilllMMnnoooorRRrruu
		transaction.stream()
		           .map((t) -> t.getTrader().getName())
		           .flatMap(TestStreamAPI2::filterCharacter1)
		           .sorted((t1,t2) -> t1.compareToIgnoreCase(t2))
		           .forEach(System.out::print);
	}
	
	public static Stream<Character> filterCharacter(String str){
		List<Character> list = new ArrayList<>();
		for (Character ch : str.toCharArray()) {
			if(ch != null) {
				list.add(ch);
			}
		}
		return list.stream();
	}
	
	public static Stream<String> filterCharacter1(String str){
		List<String> list = new ArrayList<>();
		for (Character ch : str.toCharArray()) {
			if(ch != null) {
				list.add(ch.toString());
			}
		}
		return list.stream();
	}
	//5. 有没有交易员是在米兰工作的？
	@Test
	public void test5() {
		boolean b1 = transaction.stream()
		           .anyMatch((t) -> t.getTrader().getCity().equals("Mian"));
		     System.out.println(b1);      
		           
	}
	//6. 打印生活在剑桥的交易员的所有交易员
	@Test
	public void test6() {
		transaction.stream()
		           .filter((t) -> t.getTrader().getCity().equals("Cambridge"))
		           .map((t) -> t.getTrader().getName())
		           .distinct()
		           .forEach(System.out::println);
	}
	
	//7. 打印生活在剑桥的交易员的所有交易额
	@Test
	public void test7() {
		Optional<Integer> o = transaction.stream()
		           .filter((t) -> t.getTrader().getCity().equals("Cambridge"))
		           .map(Transaction::getValue)
		           .reduce(Integer::sum);
		System.out.println(o.get());
	}
	//8. 所有交易员中，最高的交易额是多少？
	@Test
	public void test8() {
		Optional<Integer> o1 = transaction.stream()
		           .map(Transaction::getValue)
		           .max(Integer::compare);
		           /*.max((t1,t2) -> Integer.compare(t1, t2));*/
		System.out.println(o1.get());
		           
	}
	//9. 找到交易额最少的交易
	@Test
	public void test9() {
		Optional<Transaction> tran = transaction.stream()
		     .min((t1,t2) -> Integer.compare(t1.getValue(), t2.getValue()));
		System.out.println(tran.get());
	}
}
