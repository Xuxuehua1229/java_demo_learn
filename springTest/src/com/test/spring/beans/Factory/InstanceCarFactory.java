package com.test.spring.beans.Factory;

import java.util.HashMap;
import java.util.Map;

/*
 *  ʵ���������� : ʵ�������ķ��� �� ������Ҫ�������������ٵ��ù�����ʵ������������bean��ʵ��
 */
public class InstanceCarFactory {
   private Map<String, Car> cars = null;
   
   public InstanceCarFactory() {
	   cars = new HashMap<>();
	   cars.put("Audi", new Car("Audi",300000));
	   cars.put("Ford", new Car("Ford",400000));
   }
   
   public Car getCar(String brand) {
	   return cars.get(brand);
   }
}
