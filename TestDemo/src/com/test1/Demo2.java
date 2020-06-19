package com.test1;

import org.junit.Test;

public class Demo2 {
	public static String trimStr(String str) {
		int start = 0;
		int end = str.length()-1;
		while ((start <= end) && str.charAt(start) == ' ') {
			start ++;
		}
		while ((start <= end) && str.charAt(end) == ' ') {
			end --;
		}
		return str.substring(start, end+1);
	}
	//1.模拟一个trim()方法，去除字符串两端的空格
	@Test
	public void test1() {
		String str = "  aabbdfggs     ";
		System.out.println(trimStr(str));
		
		String str1 = "abcdefg";
		System.out.println(str1.substring(0,1));
	}

	
	public static String reverseStr(String str,int start,int end) {
		char[] c = str.toCharArray();
		for (int i = start,j = end; i < j; i++,j--) {
			char temp = c[j];
			c[j] = c[i];
			c[i] = temp;
		}
		return new String(c);
	}
	
	//2.将一个字符串反转。将字符串指定的部分反转。比如：“abcdefg”反转为“abfedcg”
	@Test
	public void test2() {
       String str = "abcdefg";
       System.out.println(reverseStr(str,2,5));
	}
	
	String str = new String("good");
	char[] ch = {'a','b','c'};
	char c = 'a';
	
	@Test
	public void test3() {
		Demo2 demo2 = new Demo2();
		demo2.change(demo2.str, demo2.ch,demo2.c);
		
		System.out.print(demo2.str + " and ");
		System.out.print(demo2.ch);
		System.out.println(demo2.c);
	}
	public void change(String str,char[] ch,char c) {
		str = "test ok";
		ch[0] = 'g';
		c = 'b';
	}
}
