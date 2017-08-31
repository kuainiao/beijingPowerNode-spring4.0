package com.bjpowernode.aop02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
	/**
	 * 后置通知
	 */
	@Test
	public void test02() {
		// 创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("/com/bjpowernode/aop02/applicationContext.xml");
		ISomeService someService = (ISomeService) ac.getBean("serviceProxy");
		someService.doFirst();
		someService.doSecond();
	}

}
