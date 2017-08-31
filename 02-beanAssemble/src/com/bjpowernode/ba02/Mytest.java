package com.bjpowernode.ba02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {

	@Test
	public void test01() {
		IsomeService service = new ServiceFactory().getSomeService1();
		service.doSome();
	}

	/**
	 * 动态bean工厂，详细见配置文件操作
	 */
	@Test
	public void test02() {
		// 创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bjpowernode/ba02/applicationContext.xml");
		// IsomeService对象在配置文件中调用工厂内的方法创建成功
		IsomeService service = (IsomeService) ac.getBean("myService");
		service.doSome();
	}

}
