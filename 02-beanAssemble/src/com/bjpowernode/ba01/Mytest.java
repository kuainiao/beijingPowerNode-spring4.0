package com.bjpowernode.ba01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {

	@Test
	public void test02() {
		// 创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bjpowernode/ba01/applicationContext.xml");
		IsomeService service = (IsomeService) ac.getBean("myService");
		service.doSome();
	}

}
