package com.test.java8.lambda.day01;

public class FilterEmployeeBySalary implements MyPredicate<Employee> {

	@Override
	public boolean test(Employee e) {
		return e.getSalary() > 10000;
	}

}
