package com.bjpowernode.aop07;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
	/**
	 * 没有ISomeService借口时，默认使用cglib代理 有接口时，默认使用jdkProxy代理
	 */
	@Test
	public void test02() {
		// 创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("/com/bjpowernode/aop07/applicationContext.xml");
		SomeService someService = (SomeService) ac.getBean("serviceProxy");
		someService.doFirst();
		someService.doSecond();
	}

}
