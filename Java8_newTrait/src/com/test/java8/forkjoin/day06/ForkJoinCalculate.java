package com.test.java8.forkjoin.day06;

import java.util.concurrent.RecursiveTask;

// RecursiveTask<> �з���ֵ    RecursiveAction:û�з���ֵ
public class ForkJoinCalculate extends RecursiveTask<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1234545345L;
	
	private long start;
	private long end;
	
	private static final long THRESHDLD = 10000;
	
    public ForkJoinCalculate(long start,long end) {
    	this.start = start;
        this.end = end;
	}
    
	@Override
	protected Long compute() {
		long length = end - start;
		
		if(length <= THRESHDLD) {
			long sum = 0;
			for (long i = start; i <= end; i++) {
				sum += i;
			}
			return sum;
		}else {
			long middle = (start+end)/2;
			
			ForkJoinCalculate fjc1 = new ForkJoinCalculate(start,middle);
			fjc1.fork();//���������ͬʱѹ�뵽�̶߳�����
			
			ForkJoinCalculate fjc2 = new ForkJoinCalculate(middle+1, end);
			fjc2.fork();
			
			return fjc1.join() + fjc2.join();
		}
	}
}
