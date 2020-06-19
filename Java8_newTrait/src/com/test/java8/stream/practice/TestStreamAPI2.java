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
	
	//1. �ҳ�2011�귢�������н��ף��������׶�������򣨴ӵ͵��ߣ�
	@Test
	public void test1() {
		transaction.stream().filter((t) -> t.getYear() == 2011)
		.sorted((t1,t2) -> Integer.compare(t1.getValue(), t2.getValue()))
		.forEach(System.out::println);
	}
	//2. ����Ա������Щ��ͬ�ĳ��й�������
	@Test
	public void test2() {
		transaction.stream().map((t) -> t.getTrader().getCity())
		.distinct()
		.forEach(System.out::println);
	}
	//3. �����������Խ��ŵĽ���Ա��������������
	@Test
	public void test3() {
		transaction.stream()
		.filter((t) -> t.getTrader().getCity().equals("Cambridge"))
		.map(Transaction::getTrader)
		.sorted((t1,t2) -> t1.getName().compareTo(t2.getName()))
		.forEach(System.out::println);
	}
	//4. �������н���Ա�������ַ���������ĸ˳������
	@Test
	public void test4() {
		//map �� sorted ������Ȼ����
		transaction.stream()
		        .map((t) -> t.getTrader().getName())
		        .sorted()
		        .forEach(System.out::println);
		
		System.out.println("----------------------------");
		
		//map �� sorted ������Ȼ���� ֮����reduce("",String::concat) ���������ַ�������ƴ�� 
		// result : AlanBrianMarioMarioRaoulRaoul
		String str = transaction.stream()
		           .map((t) -> t.getTrader().getName())
		           .sorted()
		           .reduce("",String::concat);
		System.out.println(str);
		
		System.out.println("----------------------------");
		
		//���ַ�����������  result : ABMMRRaaaaaaiiilllnnoooorrruu
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
	//5. ��û�н���Ա�������������ģ�
	@Test
	public void test5() {
		boolean b1 = transaction.stream()
		           .anyMatch((t) -> t.getTrader().getCity().equals("Mian"));
		     System.out.println(b1);      
		           
	}
	//6. ��ӡ�����ڽ��ŵĽ���Ա�����н���Ա
	@Test
	public void test6() {
		transaction.stream()
		           .filter((t) -> t.getTrader().getCity().equals("Cambridge"))
		           .map((t) -> t.getTrader().getName())
		           .distinct()
		           .forEach(System.out::println);
	}
	
	//7. ��ӡ�����ڽ��ŵĽ���Ա�����н��׶�
	@Test
	public void test7() {
		Optional<Integer> o = transaction.stream()
		           .filter((t) -> t.getTrader().getCity().equals("Cambridge"))
		           .map(Transaction::getValue)
		           .reduce(Integer::sum);
		System.out.println(o.get());
	}
	//8. ���н���Ա�У���ߵĽ��׶��Ƕ��٣�
	@Test
	public void test8() {
		Optional<Integer> o1 = transaction.stream()
		           .map(Transaction::getValue)
		           .max(Integer::compare);
		           /*.max((t1,t2) -> Integer.compare(t1, t2));*/
		System.out.println(o1.get());
		           
	}
	//9. �ҵ����׶����ٵĽ���
	@Test
	public void test9() {
		Optional<Transaction> tran = transaction.stream()
		     .min((t1,t2) -> Integer.compare(t1.getValue(), t2.getValue()));
		System.out.println(tran.get());
	}
}
