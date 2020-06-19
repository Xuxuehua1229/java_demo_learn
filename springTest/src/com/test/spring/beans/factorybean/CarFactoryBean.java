package com.test.spring.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;

/*
 * �Զ����FactoryBean ��Ҫʵ��FactoryBean �ӿ�
 */
public class CarFactoryBean implements FactoryBean<Car>{
    private String brand;
    
	public void setBrand(String brand) {
		this.brand = brand;
	}

	//����bean�Ķ���
	@Override
	public Car getObject() throws Exception {
		return new Car(brand,300000);
	}

	//����bean������
	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	//�����Ƿ��ǵ���ģʽ
	@Override
	public boolean isSingleton() {
		return true;
	}
   
}
