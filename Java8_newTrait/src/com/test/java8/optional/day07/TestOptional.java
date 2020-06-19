package com.test.java8.optional.day07;

import java.util.Optional;

import org.junit.Test;

import com.test.java8.lambda.day01.Employee;
import com.test.java8.lambda.day01.Employee.Status;
 
public class TestOptional {
   /*
      Optional 容器类的常用方法：
      1.Optional.of(T t): 创建一个Optional实例
      2.Optional.empty(): 创建一个空的Optional实例
      3.Optional.ofNullable(T t): 若t不为null,创建Optional实例,否则创建空实例
      4.isPresent(): 判断是否包含值
      5.orElse(T t): 如果调用对象包含值，返回该值，否则返回t
      6.orElseGet(Supplier s): 如果调用对象包含值，返回该值，否则返回s获取的值
      7.map(Function f): 如果有值对其处理，并返回处理后的Optional,否则返回Optional.empty()
      8.flatMap(Function mapper): 与map类似，要求返回值必须是Optional 
    */
	
	//Optional.of(T t)
	@Test
	public void test1() {
		//Optional<Employee> op = Optional.of(null);//会出现NullPointerException异常
		Optional<Employee> op = Optional.of(new Employee());
		Employee e = op.get();
		System.out.println(e);
	}
	
	//Optional.empty()
	@Test
	public void test2() {
		Optional<Employee> op = Optional.empty();
		Employee e = op.get();//会出现NoSuchElementException异常
		System.out.println(e);
	}
	
	//Optional.ofNullable(T t)   orElse(T t)  orElseGet(Supplier s)
	@Test
	public void test3() {
		Optional<Employee> op = Optional.ofNullable(null);
		/*if(op.isPresent()) {
			System.out.println(op.get());
		}*/
		/*Employee emp = op.orElse(new Employee("张三", 18, 4000, Status.BUSY));
		System.out.println(emp);*/
		
		Employee emp1 = op.orElseGet(() -> new Employee());
		System.out.println(emp1);
	}
	
	//map(Function f)  flatMap(Function mapper)
	@Test
	public void test4() {
		Optional<Employee> op = Optional.ofNullable(new Employee("张三", 18, 4000, Status.BUSY));
		
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
	
	//需求： 获取一个男人心中女神的名字
	public String getGoddessName(Man man) {
		if(man != null) {
			Goddess g = man.getGoddess();
			if(g != null) {
				return g.getName();
			}
		}
		return "张小姐";
	}
	
	@Test
	public void test6() {
		Optional<Goddess> g = Optional.ofNullable(new Goddess("傻逼"));
		Optional<NewMan> man = Optional.ofNullable(new NewMan(g));
		String n = getGoddnessName2(man);
		System.out.println(n);
	}
	
	public String getGoddnessName2(Optional<NewMan> man) {
		return man.orElse(new NewMan())
				  .getGoddess()
				  .orElse(new Goddess("张小姐"))
				  .getName();
	}
}
