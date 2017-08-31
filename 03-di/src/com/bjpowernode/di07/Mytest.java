package com.bjpowernode.di07;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
	/**
	 * 使用内部 Bean 注入
	 */
	@Test
	public void test02() {
		// 创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bjpowernode/di07/applicationContext.xml");
		System.out.println(ac.getBean("myStudent"));
	}

}
