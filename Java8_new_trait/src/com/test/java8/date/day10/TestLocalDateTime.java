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
    	
    	//��ԭ�е����ڼ�����
    	LocalDateTime addDays = ldt.plusDays(2);
    	System.out.println(addDays);
    	
    	//��ԭ�е����ڼ�����
    	LocalDateTime addYears = ldt.plusYears(2);
    	System.out.println(addYears);
    	
    	//��ԭ�е����ڼ�����Сʱ
    	LocalDateTime addHours = ldt.plusHours(2);
    	System.out.println(addHours);
    	
    	//��ԭ�е����ڼ�������
    	LocalDateTime addMonths = ldt.plusMonths(2);
    	System.out.println(addMonths);
    	
    	//��ԭ�е����ڼ�������
    	LocalDateTime updateMonths = ldt.minusMonths(2);
    	System.out.println(updateMonths);
    	
    	//��ԭ�е����ڼ�����
    	LocalDateTime updateDays = ldt.minusDays(2);
    	System.out.println(updateDays);
    	
    	//��ȡ��ǰʱ���꣬�£��ա����������ڣ�Сʱ�����ӣ���
    	System.out.println(ldt.getYear());
    	System.out.println(ldt.getMonthValue() + "====" + ldt.getMonth().getValue());
    	System.out.println(ldt.getDayOfMonth() + "====" + ldt.getDayOfYear() + "====" + ldt.getDayOfWeek());
    	System.out.println(ldt.getHour());
    	System.out.println(ldt.getMinute());
    	System.out.println(ldt.getSecond());
    }
	
	//Instant: ʱ�������Unix Ԫ�꣺ 1970��1��1�� 00:00:00 ��ĳ��ʱ��֮��ĺ���ֵ��
	@Test
	public void test2() {
		//��ȡϵͳʱ�䣨Ĭ�ϻ�ȡ UTC ʱ����
		Instant ins1 = Instant.now();
		System.out.println(ins1);
		
		//��ȡ��ǰʵ��ʱ�䣨����ʱ��ת����
		OffsetDateTime zdt = ins1.atOffset(ZoneOffset.ofHours(8));
		System.out.println(zdt);
		
		//��ȡ����ֵ
		System.out.println(ins1.toEpochMilli());
		
		//��Ԫ���ʱ���ϼ�60��
		Instant ins2 = Instant.ofEpochSecond(60);
		System.out.println(ins2);
		
		//��Ԫ���ʱ���ϼ�1000����
		Instant ins3 = Instant.ofEpochMilli(1000);
		System.out.println(ins3);
	}
	
	// Duration : ��������ʱ��֮��ļ��
	// Period : �������������ڡ�֮��ļ��
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
	
	//TemporalAdjuster : ʱ��У����
	@Test
	public void test5() {
		LocalDateTime ldt1 = LocalDateTime.now();
		System.out.println(ldt1);
		
		//�޸���
		LocalDateTime updateMonth = ldt1.withDayOfMonth(16);
		System.out.println(updateMonth);
		
		//�޸���
		LocalDateTime updateYear = ldt1.withDayOfYear(8);
		System.out.println(updateYear);
		
		//��ȡ��ʱ��֮���ĳ�����ڵ�����
		LocalDateTime ldt2 = ldt1.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println(ldt2);
		System.out.println("-------------------------------------------");
		
		//WEDNESDAY  ��ǰ������ֵ  2018-12-05T14:33:32.499
		//2018-12-06T14:33:32.499   ��������֮�������
		//�Զ��� ��һ��������
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
	
	//DateTimeFormatter :  ��ʽ������ / ʱ��
	@Test
	public void test6(){
		//������ת�����Զ���ʽ
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter dtf1 = DateTimeFormatter.ISO_DATE_TIME;
		String date_time = dateTime.format(dtf1);
		System.out.println(date_time);
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ISO_DATE;
		String date = dateTime.format(dtf2);
		System.out.println(date);
		
		System.out.println("-----------------------------------");
		
		//�Զ����ʽ
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy��MM��dd�� HHʱmm��ss��");
		String dateStr = dtf3.format(dateTime);
		System.out.println(dateStr);
		
		//���ַ�������ת����  LocalDateTime ���͵�����
		LocalDateTime newDate = dateTime.parse(dateStr,dtf3);
		System.out.println(newDate);
	}
	
	//ZonedDate �� ZonedTime ��ZonedDateTime
	@Test
	public void test7() {
		//��ȡȫ����ʱ��
		Set<String> set = ZoneId.getAvailableZoneIds();
		set.forEach(System.out::println);
	}
	
	@Test
	public void test8() {
		//��ȡʱ��
		LocalDateTime ldt1 = LocalDateTime.now(ZoneId.of("Europe/Tallinn"));
		System.out.println(ldt1);
		
		//�й�ʱ��
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
