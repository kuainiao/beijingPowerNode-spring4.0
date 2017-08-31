package com.bjpowernode.di10_2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
	/**
	 * 以父子配置文件方式实现
	 */
	@Test
	public void test02() {
		// 创建容器对象
		String resource = "com/bjpowernode/di10_2/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		System.out.println(ac.getBean("myStudent1"));
		System.out.println(ac.getBean("myTeacher"));
	}

}
