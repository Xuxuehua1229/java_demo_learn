package com.test.java8.lambda.day02;

import java.util.Comparator;
import java.util.function.Consumer;

import org.junit.Test;

/**
 * һ��Lambda ���ʽ�Ļ����﷨��java8��������һ���µĲ�������->��  �ò�����������ͷ������
 * �����Lambda������ �� ��ͷ������Lambda���ʽ��ֳ������֡�
 * �ֱ�Ϊ��
 * ��ࣺLambda���ʽ�Ĳ����б�
 * �ҲࣺLambda���������Ҫִ�еĹ��ܣ���Lambda��
 * 
 * �﷨��ʽһ���޲������޷���ֵ
 *    Runnable rb1 = () -> System.out.println("Hello World!!"+num);
	  rb1.run();
 *�﷨��ʽ������һ���������޷���ֵ
 *    Consumer<Integer> consumer = (x) -> System.out.println(x);
	  consumer.accept(11122222);
 *�﷨��ʽ������ֻ��һ�������Ļ������ſ���ʡ��
 *    Consumer<Integer> consumer = x -> System.out.println(x);
	  consumer.accept(11122222);
 *�﷨��ʽ�ģ����������ϵĲ������з���ֵ������Lambda���ʽ���ж������
 *    Comparator<Integer> comparator = (x,y) -> {
			System.out.println("����ʽ�ӿڣ�");
			return Integer.compare(x, y);
	  };
  �﷨��ʽ�壺��Lambda����ֻ��һ����䣬���ſ���ʡ��
      Comparator<Integer> comparator = (x,y) -> Integer.compare(x, y);
  �﷨��ʽ����Lambda���ʽ�Ĳ����б���������Ϳ���ʡ�Բ�д����ΪJVM����������ͨ��������
           �ƶϳ��������ͣ���"�����ƶ�"
           Comparator<Integer> comparator = (Integer x,Integer y) -> Integer.compare(x, y);
 
 *������������һ������ʡ
 *����������ƶ��ұ�ʡ
 *��������ʡ��ʡ
 *
 *����Lambda���ʽ��Ҫ"����ʽ�ӿ�"��֧��
 *����ʽ�ӿڣ��ӿ���ֻ��һ�����󷽷��Ľӿڣ���Ϊ����ʽ�ӿڣ�����ʹ��ע�⣺@FunctionalInterface ���Σ�
 *���Լ���Ƿ��Ǻ����ӿ�
 */
public class TestLambda {
	@Test
	public void test1() {
		int num = 0;//jdk1.7ǰ,������final 1.8֮����Ȼ���Բ�д������Ȼ��Ĭ�ϵģ�ֻ��û��д�϶���
		Runnable rb = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello World!!"+num);//num ���ܱ��޸�
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
			System.out.println("����ʽ�ӿڣ�");
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
	
	//���󣺶�һ������������
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
