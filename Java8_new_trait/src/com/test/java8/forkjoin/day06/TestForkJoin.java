package com.test.java8.forkjoin.day06;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.LongStream;

import org.junit.Test;

public class TestForkJoin {
	
   /*
    * ForkJoin框架 ： 一般用于大数据  （数据量越大，效果越好）
    */
   @Test
   public void test1() {
	   //java8 获取当前时分秒
	   Instant start = Instant.now();
	   
	   ForkJoinPool pool = new ForkJoinPool();
	   ForkJoinCalculate fjc = new ForkJoinCalculate(0, 10000000000L);
	   long sum = pool.invoke(fjc);
	   System.out.println(sum);
	   
	   Instant end = Instant.now();
	   
	   System.out.println("耗费时间:" + Duration.between(start, end).toMillis());//200  2361
   }
   
   /*
    * 普通for
    */
   @Test
   public void test2() {
	   Instant start = Instant.now();
	   long sum = 0L;
	   for (int i = 0; i < 10000000000L; i++) {
		  sum += i;
	   }
	   Instant end = Instant.now();
	   System.out.println(sum);
	   System.out.println("耗费时间:" + Duration.between(start, end).toMillis()); //67
   }
   
   
   /*
    * java8 并行流
    */
   @Test
   public void test3() {
	   Instant start = Instant.now();
	   LongStream.rangeClosed(0, 10000000000L)
	             .parallel()
	             .reduce(0,Long::sum);
	   Instant end = Instant.now();
	   System.out.println("耗费时间:" + Duration.between(start, end).toMillis());//2487
   }
}
