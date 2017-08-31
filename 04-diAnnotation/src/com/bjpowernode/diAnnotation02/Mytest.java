package com.bjpowernode.diAnnotation02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
	/**
	 * 
	 * 
	 */

	@Test
	public void test02() {
		// 创建容器对象
		String resource = "com/bjpowernode/diAnnotation02/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		System.out.println(ac.getBean("myStudent"));
	}

}
