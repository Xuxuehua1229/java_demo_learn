package com.test1;

import java.util.ResourceBundle;

import org.junit.Test;

public class Demo3 {
	// 获取外部文件（通过key获取值）
	// 注意：① 如果文件直接放在项目的src里，getBundle(baseName) 里的beasName直接写文件名即可
	// ② 如果是 *.properties baseName 里直接写 *   例： shdb.properties ==> ResourceBundle resource = ResourceBundle.getBundle("shdb");
	@Test
	public void test1() {
		ResourceBundle resource = ResourceBundle.getBundle("shdb");
		System.out.println(resource.getString("jdbc.user") + ",initPoolSize:" + resource.getString("jdbc.initPoolSize"));
	}
}
