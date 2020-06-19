package com.test.java8.date.day09;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;

public class TestSimpleDateFormat {
	//存在线程问题
	@Test
	public void test1() throws InterruptedException, ExecutionException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		Callable<Date> task = new Callable<Date>() {
			@Override
			public Date call() throws Exception {
				return sdf.parse("20181204");
			}
		};

		ExecutorService pool = Executors.newFixedThreadPool(10); 
		List<Future<Date>> results = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			results.add(pool.submit(task));
		}

		for (Future<Date> future : results) {
			System.out.println(future.get());
		}
	}

	//使用传统方式解决线程问题（锁）
	@Test
	public void test2() throws InterruptedException, ExecutionException {
		Callable<Date> task = new Callable<Date>() {
			@Override
			public Date call() throws Exception {
				return DateFormatThreadLocal.convert("20181204");
			}
		};

		ExecutorService pool = Executors.newFixedThreadPool(10); 
		List<Future<Date>> results = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			results.add(pool.submit(task));
		}

		for (Future<Date> future : results) {
			System.out.println(future.get());
		}

		pool.shutdown();
	}

	//java8  DateTimeFormatter LocalDate 解决线程问题（锁）
	@Test
	public void test3() throws InterruptedException, ExecutionException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd"); 
		Callable<LocalDate> task = new Callable<LocalDate>() {
			@Override
			public LocalDate call() throws Exception {
				return LocalDate.parse("20181208", dtf);
			}
		};

		ExecutorService pool = Executors.newFixedThreadPool(10); 
		List<Future<LocalDate>> results = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			results.add(pool.submit(task));
		}

		for (Future<LocalDate> future : results) {
			System.out.println(future.get());
		}

		pool.shutdown();
	}
}
