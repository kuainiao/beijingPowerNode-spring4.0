package com.bjpowernode.di04;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
	/**
	 * 集合属性注入
	 */
	@Test
	public void test02() {
		// 创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bjpowernode/di04/applicationContext.xml");
		System.out.println(ac.getBean("myCollections"));
	}

}
