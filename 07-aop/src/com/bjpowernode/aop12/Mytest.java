package com.bjpowernode.aop12;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
	/**
	 * 默认 advisor 自动代理生成器
	 */
	@Test
	public void test02() {
		// 创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("/com/bjpowernode/aop12/applicationContext.xml");
		ISomeService someService = (ISomeService) ac.getBean("someService");
		someService.doFirst();
		someService.doSecond();

		ISomeService someService2 = (ISomeService) ac.getBean("someService2");
		someService2.doFirst();
		someService2.doSecond();
	}

}
