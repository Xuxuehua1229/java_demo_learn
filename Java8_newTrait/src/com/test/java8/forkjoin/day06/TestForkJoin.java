package com.test.java8.forkjoin.day06;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.LongStream;

import org.junit.Test;

public class TestForkJoin {
	
   /*
    * ForkJoin��� �� һ�����ڴ�����  ��������Խ��Ч��Խ�ã�
    */
   @Test
   public void test1() {
	   //java8 ��ȡ��ǰʱ����
	   Instant start = Instant.now();
	   
	   ForkJoinPool pool = new ForkJoinPool();
	   ForkJoinCalculate fjc = new ForkJoinCalculate(0, 10000000000L);
	   long sum = pool.invoke(fjc);
	   System.out.println(sum);
	   
	   Instant end = Instant.now();
	   
	   System.out.println("�ķ�ʱ��:" + Duration.between(start, end).toMillis());//200  2361
   }
   
   /*
    * ��ͨfor
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
	   System.out.println("�ķ�ʱ��:" + Duration.between(start, end).toMillis()); //67
   }
   
   
   /*
    * java8 ������
    */
   @Test
   public void test3() {
	   Instant start = Instant.now();
	   LongStream.rangeClosed(0, 10000000000L)
	             .parallel()
	             .reduce(0,Long::sum);
	   Instant end = Instant.now();
	   System.out.println("�ķ�ʱ��:" + Duration.between(start, end).toMillis());//2487
   }
}
