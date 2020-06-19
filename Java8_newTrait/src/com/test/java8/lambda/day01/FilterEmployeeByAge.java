package com.test.java8.lambda.day01;

public class FilterEmployeeByAge implements MyPredicate<Employee> {

	@Override
	public boolean test(Employee e) {
		return e.getAge() > 20;
	}

}
