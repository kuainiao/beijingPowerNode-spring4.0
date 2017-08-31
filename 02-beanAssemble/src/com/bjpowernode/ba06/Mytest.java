package com.bjpowernode.ba06;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {

	@Test
	public void test02() {
		// 创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bjpowernode/ba06/applicationContext.xml");
		IsomeService service = (IsomeService) ac.getBean("myService");
		service.doSome();
		// 对于执行销毁方法，有两个条件
		// 1、初始化的bean必须是singleton
		// 2、必须手动关闭容器
		((ClassPathXmlApplicationContext) ac).close();

	}

}
