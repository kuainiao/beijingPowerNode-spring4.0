package com.bjpowernode.aop05;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
	/**
	 * 异常通知
	 * 
	 * @throws UserNameException
	 */
	@Test
	public void test02() throws UserNameException {
		// 创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("/com/bjpowernode/aop05/applicationContext.xml");
		ISomeService someService = (ISomeService) ac.getBean("serviceProxy");
		someService.logIn("上", "123");

	}

}
