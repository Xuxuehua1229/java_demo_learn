package com.test.java8.date.day10;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Set;

import org.junit.Test;

public class TestLocalDateTime {
	//LocalDate LocalTime LocalDateTime
	@Test
    public void test1() {
    	LocalDateTime ldt = LocalDateTime.now();
    	System.out.println(ldt);
    	
    	LocalDateTime ldt1 = LocalDateTime.of(2018,12,5,11,6,33);
    	System.out.println(ldt1);
    	
    	//在原有的日期加两天
    	LocalDateTime addDays = ldt.plusDays(2);
    	System.out.println(addDays);
    	
    	//在原有的日期加两年
    	LocalDateTime addYears = ldt.plusYears(2);
    	System.out.println(addYears);
    	
    	//在原有的日期加两个小时
    	LocalDateTime addHours = ldt.plusHours(2);
    	System.out.println(addHours);
    	
    	//在原有的日期加两个月
    	LocalDateTime addMonths = ldt.plusMonths(2);
    	System.out.println(addMonths);
    	
    	//在原有的日期减两个月
    	LocalDateTime updateMonths = ldt.minusMonths(2);
    	System.out.println(updateMonths);
    	
    	//在原有的日期减两天
    	LocalDateTime updateDays = ldt.minusDays(2);
    	System.out.println(updateDays);
    	
    	//获取当前时间年，月，日、天数、星期，小时，分钟，秒
    	System.out.println(ldt.getYear());
    	System.out.println(ldt.getMonthValue() + "====" + ldt.getMonth().getValue());
    	System.out.println(ldt.getDayOfMonth() + "====" + ldt.getDayOfYear() + "====" + ldt.getDayOfWeek());
    	System.out.println(ldt.getHour());
    	System.out.println(ldt.getMinute());
    	System.out.println(ldt.getSecond());
    }
	
	//Instant: 时间戳（以Unix 元年： 1970年1月1日 00:00:00 到某个时间之间的毫秒值）
	@Test
	public void test2() {
		//获取系统时间（默认获取 UTC 时区）
		Instant ins1 = Instant.now();
		System.out.println(ins1);
		
		//获取当前实际时间（进行时区转换）
		OffsetDateTime zdt = ins1.atOffset(ZoneOffset.ofHours(8));
		System.out.println(zdt);
		
		//获取毫秒值
		System.out.println(ins1.toEpochMilli());
		
		//在元年的时间上加60秒
		Instant ins2 = Instant.ofEpochSecond(60);
		System.out.println(ins2);
		
		//在元年的时间上加1000毫秒
		Instant ins3 = Instant.ofEpochMilli(1000);
		System.out.println(ins3);
	}
	
	// Duration : 计算两个时间之间的间隔
	// Period : 计算两个“日期”之间的间隔
	@Test
	public void test3() {
		Instant ins1 = Instant.now();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Instant ins2 = Instant.now();
		Duration du = Duration.between(ins1, ins2);
		System.out.println(du.toMillis());
	
		System.out.println("---------------------------------------");
		
		LocalTime lt1 = LocalTime.now();
	    try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	    LocalTime lt2 = LocalTime.now();
	    
	    System.out.println(Duration.between(lt1, lt2).toMillis());
	}
	
	@Test
	public void test4() {
		LocalDate ld1 = LocalDate.of(2016, 11, 21);
		LocalDate ld2 = LocalDate.now();
		
		Period period = Period.between(ld1, ld2);
		System.out.println(period);
		
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
	}
	
	//TemporalAdjuster : 时间校正器
	@Test
	public void test5() {
		LocalDateTime ldt1 = LocalDateTime.now();
		System.out.println(ldt1);
		
		//修改月
		LocalDateTime updateMonth = ldt1.withDayOfMonth(16);
		System.out.println(updateMonth);
		
		//修改年
		LocalDateTime updateYear = ldt1.withDayOfYear(8);
		System.out.println(updateYear);
		
		//获取该时间之后的某个星期的日期
		LocalDateTime ldt2 = ldt1.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println(ldt2);
		System.out.println("-------------------------------------------");
		
		//WEDNESDAY  当前的星期值  2018-12-05T14:33:32.499
		//2018-12-06T14:33:32.499   经过计算之后的日期
		//自定义 下一个工作日
		LocalDateTime ldt4 = ldt1.with((l) -> {
			LocalDateTime ldt3 = (LocalDateTime)l;
			DayOfWeek dow = ldt3.getDayOfWeek();
			System.out.println(dow);
			if(dow.equals(DayOfWeek.FRIDAY)) {
				return ldt3.plusDays(3);
			}else if(dow.equals(DayOfWeek.SATURDAY)) {
				return ldt3.plusDays(2);
			}else {
				return ldt3.plusDays(1);
			}
		});
		System.out.println(ldt4);
	}
	
	//DateTimeFormatter :  格式化日期 / 时间
	@Test
	public void test6(){
		//将日期转换成自动格式
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter dtf1 = DateTimeFormatter.ISO_DATE_TIME;
		String date_time = dateTime.format(dtf1);
		System.out.println(date_time);
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ISO_DATE;
		String date = dateTime.format(dtf2);
		System.out.println(date);
		
		System.out.println("-----------------------------------");
		
		//自定义格式
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
		String dateStr = dtf3.format(dateTime);
		System.out.println(dateStr);
		
		//将字符串日期转换成  LocalDateTime 类型的日期
		LocalDateTime newDate = dateTime.parse(dateStr,dtf3);
		System.out.println(newDate);
	}
	
	//ZonedDate 、 ZonedTime 、ZonedDateTime
	@Test
	public void test7() {
		//获取全国的时区
		Set<String> set = ZoneId.getAvailableZoneIds();
		set.forEach(System.out::println);
	}
	
	@Test
	public void test8() {
		//获取时区
		LocalDateTime ldt1 = LocalDateTime.now(ZoneId.of("Europe/Tallinn"));
		System.out.println(ldt1);
		
		//中国时区
		LocalDateTime ldt2 = LocalDateTime.now(ZoneId.of("Asia/Shanghai"));
		System.out.println(ldt2);
		
		LocalDateTime ldt3 = LocalDateTime.now(ZoneId.of("America/Toronto"));
		System.out.println(ldt3);
		
		System.out.println("----------------------------------------------");
		
		LocalDateTime ldt4 = LocalDateTime.now();
		ZonedDateTime zdt = ldt4.atZone(ZoneId.of("Europe/Tallinn"));
		System.out.println(zdt);
		
		System.out.println("---------------------------------------------");
		
		LocalDateTime ldt5 = LocalDateTime.now(ZoneId.of("Europe/Tallinn"));
		ZonedDateTime zdt2 = ldt5.atZone(ZoneId.of("Europe/Tallinn"));
		System.out.println(zdt2);
		
		System.out.println("-----------------------------------------------");
		LocalDateTime ldt6 = LocalDateTime.now(ZoneId.of("Asia/Shanghai"));
		ZonedDateTime zdt3 = ldt6.atZone(ZoneId.of("Asia/Shanghai"));
		System.out.println(zdt3);
		
	}
}
