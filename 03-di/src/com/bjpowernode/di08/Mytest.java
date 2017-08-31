package com.bjpowernode.di08;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
	/**
	 * 使用同类抽象 Bean 注入
	 */
	@Test
	public void test02() {
		// 创建容器对象
		String resource = "com/bjpowernode/di08/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		System.out.println(ac.getBean("myStudent1"));
		System.out.println(ac.getBean("myStudent2"));
	}

}
