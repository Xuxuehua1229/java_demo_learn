package com.test.java8.optional.day07;

import java.util.Optional;

import org.junit.Test;

import com.test.java8.lambda.day01.Employee;
import com.test.java8.lambda.day01.Employee.Status;
 
public class TestOptional {
   /*
      Optional ������ĳ��÷�����
      1.Optional.of(T t): ����һ��Optionalʵ��
      2.Optional.empty(): ����һ���յ�Optionalʵ��
      3.Optional.ofNullable(T t): ��t��Ϊnull,����Optionalʵ��,���򴴽���ʵ��
      4.isPresent(): �ж��Ƿ����ֵ
      5.orElse(T t): ������ö������ֵ�����ظ�ֵ�����򷵻�t
      6.orElseGet(Supplier s): ������ö������ֵ�����ظ�ֵ�����򷵻�s��ȡ��ֵ
      7.map(Function f): �����ֵ���䴦�������ش�����Optional,���򷵻�Optional.empty()
      8.flatMap(Function mapper): ��map���ƣ�Ҫ�󷵻�ֵ������Optional 
    */
	
	//Optional.of(T t)
	@Test
	public void test1() {
		//Optional<Employee> op = Optional.of(null);//�����NullPointerException�쳣
		Optional<Employee> op = Optional.of(new Employee());
		Employee e = op.get();
		System.out.println(e);
	}
	
	//Optional.empty()
	@Test
	public void test2() {
		Optional<Employee> op = Optional.empty();
		Employee e = op.get();//�����NoSuchElementException�쳣
		System.out.println(e);
	}
	
	//Optional.ofNullable(T t)   orElse(T t)  orElseGet(Supplier s)
	@Test
	public void test3() {
		Optional<Employee> op = Optional.ofNullable(null);
		/*if(op.isPresent()) {
			System.out.println(op.get());
		}*/
		/*Employee emp = op.orElse(new Employee("����", 18, 4000, Status.BUSY));
		System.out.println(emp);*/
		
		Employee emp1 = op.orElseGet(() -> new Employee());
		System.out.println(emp1);
	}
	
	//map(Function f)  flatMap(Function mapper)
	@Test
	public void test4() {
		Optional<Employee> op = Optional.ofNullable(new Employee("����", 18, 4000, Status.BUSY));
		
		/*Optional<String> name = op.map((e) -> e.getName());
		System.out.println(name.get());*/
		
		Optional<String>name = op.flatMap((e) -> Optional.of(e.getName()));
		System.out.println(name.get());
	}
	
	@Test
	public void test5() {
		Man man = new Man();
		String n = getGoddessName(man);
		System.out.println(n);
	}
	
	//���� ��ȡһ����������Ů�������
	public String getGoddessName(Man man) {
		if(man != null) {
			Goddess g = man.getGoddess();
			if(g != null) {
				return g.getName();
			}
		}
		return "��С��";
	}
	
	@Test
	public void test6() {
		Optional<Goddess> g = Optional.ofNullable(new Goddess("ɵ��"));
		Optional<NewMan> man = Optional.ofNullable(new NewMan(g));
		String n = getGoddnessName2(man);
		System.out.println(n);
	}
	
	public String getGoddnessName2(Optional<NewMan> man) {
		return man.orElse(new NewMan())
				  .getGoddess()
				  .orElse(new Goddess("��С��"))
				  .getName();
	}
}
