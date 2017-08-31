package com.bjpowernode.di06;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
	/**
	 * 使用 SPEL 注入
	 */
	@Test
	public void test02() {
		// 创建容器对象
		String resource = "com/bjpowernode/di06/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		Student student = (Student) ac.getBean("myStudent");
		System.out.println(student);
	}

}
