package com.test.java8.defaultinterface.day08;

public class TestDefaultInterface {
   public static void main(String[] args) {
	  /*
	   * 如果一个接口中定义了一个默认方法，而另一个父类中又定义了一个同名的方法时，选择父类中的方法。
	   * 但如果一个父类提供了具体的实现，那么接口中具有相同名称和参数的默认方法会被忽略
	   * 
	   * 如果两个接口中都定义了相同的默认方法，即接口冲突。那么必须要覆盖该方法来解决冲突
	   */
	  SubClass sc = new SubClass();
	  System.out.println(sc.getName());
   }
}
