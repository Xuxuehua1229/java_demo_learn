package com.test.java8.lambda.practice;

@FunctionalInterface
public interface MyFunctionNum<T,R> {
   public long getValue(long l1,long l2);
}
