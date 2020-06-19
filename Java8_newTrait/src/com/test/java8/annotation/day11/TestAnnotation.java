package com.test.java8.annotation.day11;

import java.lang.reflect.Method;

import org.junit.Test;

/*
            �ظ�ע��������ע��
 */
public class TestAnnotation {
   //checker framework  @NotNull ���������checker framework һ����  java8��û������@NotNullע��
   private /*@NotNull*/ Object obj = null;
   @Test
   public void test1() throws NoSuchMethodException, SecurityException {
	   //��ȡ��
	   Class<TestAnnotation> ta = TestAnnotation.class;
	   //��ȡ����
	   Method method = ta.getMethod("show");
	   //��ȡ���ע��
	   MyAnnotation[] as = method.getAnnotationsByType(MyAnnotation.class);
	   for (MyAnnotation ma: as) {
		   System.out.println(ma.value());
	   }
   }
   
   @MyAnnotation("Hello")
   @MyAnnotation("world")
   public void show() {
	   
   }
   
   //��������ע��
   public void show1(@MyAnnotation("abc") String str) {
	   
   }
}
