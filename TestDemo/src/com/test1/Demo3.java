package com.test1;

import java.util.ResourceBundle;

import org.junit.Test;

public class Demo3 {
	// ��ȡ�ⲿ�ļ���ͨ��key��ȡֵ��
	// ע�⣺�� ����ļ�ֱ�ӷ�����Ŀ��src�getBundle(baseName) ���beasNameֱ��д�ļ�������
	// �� ����� *.properties baseName ��ֱ��д *   ���� shdb.properties ==> ResourceBundle resource = ResourceBundle.getBundle("shdb");
	@Test
	public void test1() {
		ResourceBundle resource = ResourceBundle.getBundle("shdb");
		System.out.println(resource.getString("jdbc.user") + ",initPoolSize:" + resource.getString("jdbc.initPoolSize"));
	}
}
