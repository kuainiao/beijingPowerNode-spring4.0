package com.bjpowernode.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
	/**
	 * 注解 AspectJ
	 */
	@Test
	public void test02() {
		// 创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"/com/bjpowernode/annotation/applicationContext.xml");
		ISomeService someService = (ISomeService) ac.getBean("someService");
		someService.doFirst();
		someService.doSecond();
		someService.doThird();
	}

}
