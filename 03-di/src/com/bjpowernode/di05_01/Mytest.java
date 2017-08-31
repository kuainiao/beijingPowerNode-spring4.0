package com.bjpowernode.di05_01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
	/**
	 * byName方式自动注入注入
	 */
	@Test
	public void test02() {
		// 创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bjpowernode/di05_01/applicationContext.xml");
		System.out.println(ac.getBean("myStudent"));
	}

}
