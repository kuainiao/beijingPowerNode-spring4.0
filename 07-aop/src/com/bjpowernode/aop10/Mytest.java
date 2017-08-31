package com.bjpowernode.aop10;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
	/**
	 * 正则表达式方法切入点顾问
	 */
	@Test
	public void test02() {
		// 创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("/com/bjpowernode/aop10/applicationContext.xml");
		ISomeService someService = (ISomeService) ac.getBean("serviceProxy");
		someService.doFirst();
		someService.doSecond();
	}

}
