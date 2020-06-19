package com.test.java8.defaultinterface.day08;

public class SubClass /*extends MyClass*/ implements MyFun,MyInterface{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return MyInterface.super.getName();
	}

	/*@Override
	public String getName() {
		// TODO Auto-generated method stub
		return MyFun.super.getName();
	}*/

}
