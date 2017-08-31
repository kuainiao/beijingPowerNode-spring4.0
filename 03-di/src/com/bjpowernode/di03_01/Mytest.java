package com.bjpowernode.di03_01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
	/**
	 * p命名空间设置注入
	 */
	@Test
	public void test02() {
		// 创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bjpowernode/di03_01/applicationContext.xml");
		System.out.println(ac.getBean("myStudent"));
	}

}
