package com.bjpowernode.ba05;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
	/**
	 * bean后处理器
	 */
	@Test
	public void test02() {
		// 创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bjpowernode/ba05/applicationContext.xml");
		IsomeService service = (IsomeService) ac.getBean("myService");
		System.out.println("myService " + service.doSome());
		System.out.println("myService " + service.doOther());

		System.out.println("=====================");
		IsomeService service2 = (IsomeService) ac.getBean("myService2");
		System.out.println("myService2 " + service2.doSome());
		System.out.println("myService2 " + service2.doOther());
	}

}
