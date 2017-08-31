package com.bjpowernode.ba04;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
	/**
	 * bean的作用域
	 */
	@Test
	public void test02() {
		// 创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bjpowernode/ba04/applicationContext.xml");
		IsomeService service1 = (IsomeService) ac.getBean("myServiceSingleton");
		IsomeService service2 = (IsomeService) ac.getBean("myServiceSingleton");
		System.out.println("service1==service2 " + (service1 == service2));

		IsomeService service3 = (IsomeService) ac.getBean("myServicePrototype");
		IsomeService service4 = (IsomeService) ac.getBean("myServicePrototype");
		System.out.println("service3 == service4 " + (service3 == service4));
	}

}
