package com.test.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
    	/*1.����Spring��IOC��������
    	ApplicationContext ����IOC����
    	ClassPathXmlApplicationContext: ��ApplicationContext �ӿ�ʵ����,����·���¼��������ļ�  
    	FileSystemXmlApplicationContext:���ļ�ϵͳ�м��������ļ�
    	ConfigurableApplicationContext:��ApplicationContext���ӽӿڣ��Լ�FileSystemXmlApplicationContext
    	��ClassPathXmlApplicationContext��ConfigurableApplicationContextʵ���ࡣ����������������refresh()��
    	close():����������ˢ�º͹ر������ĵ�����
    	*/
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*2.��IOC�����л�ȡBeanʵ��
		  ����id��λ��IOC�����е�bean*/
		//HelloWorld helloWorld = (HelloWorld)ctx.getBean("helloWorld");
		/*�������ͷ���IOC�����е�bean����Ҫ��IOC������ֻ����һ�������͵�bean
		 HelloWorld helloWorld = ctx.getBean(HelloWorld.class);*/
		//3.����hello����
		//helloWorld.hello();
		
		Car car1 = (Car) ctx.getBean("car1");
		System.out.println(car1);
		car1 = (Car)ctx.getBean("car2");
		System.out.println(car1);
		
		Person person = (Person)ctx.getBean("person");
		System.out.println(person);
		
		Person person1 = (Person)ctx.getBean("person1");
		System.out.println(person1);
		
		
		
		
		
		
		
	}
}
