package com.test.java8.annotation.day11;

import java.lang.reflect.Method;

import org.junit.Test;

/*
            重复注解与类型注解
 */
public class TestAnnotation {
   //checker framework  @NotNull 可以与这个checker framework 一起用  java8还没有内置@NotNull注解
   private /*@NotNull*/ Object obj = null;
   @Test
   public void test1() throws NoSuchMethodException, SecurityException {
	   //获取类
	   Class<TestAnnotation> ta = TestAnnotation.class;
	   //获取方法
	   Method method = ta.getMethod("show");
	   //获取多个注解
	   MyAnnotation[] as = method.getAnnotationsByType(MyAnnotation.class);
	   for (MyAnnotation ma: as) {
		   System.out.println(ma.value());
	   }
   }
   
   @MyAnnotation("Hello")
   @MyAnnotation("world")
   public void show() {
	   
   }
   
   //数据类型注解
   public void show1(@MyAnnotation("abc") String str) {
	   
   }
}
