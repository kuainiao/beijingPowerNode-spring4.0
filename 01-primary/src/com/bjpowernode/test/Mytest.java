package com.bjpowernode.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.bjpowernode.service.IsomeService;
import com.bjpowernode.service.SomeServiceImpl;

public class Mytest {

	@Test
	public void test01() {
		SomeServiceImpl service = new SomeServiceImpl();
		service.doSome();
	}

	@Test
	public void test02() {
		// 创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IsomeService service = (IsomeService) ac.getBean("myService");
		service.doSome();
	}

	@Test
	public void test03() {
		// 创建容器对象
		ApplicationContext ac = new FileSystemXmlApplicationContext(
				"/Users/wangbin/Documents/workspace_study/studySpring/src/applicationContext.xml");
		IsomeService service = (IsomeService) ac.getBean("myService");
		service.doSome();
	}

	// ApplicationContext与BeanFactory区别
	// 这两个容器对bean创建的时间不一样
	// 1) ApplicationContext在容器初始化时，会创建所有的bean对象
	// 缺点：占用系统资源（内存，cpu） 优点：响应速度快
	// 2)BeanFactory在初始化时，不会创建所有的bean对象，而是在真正获取对象时创建
	// 缺点：相对来说，响应速度慢 优点：不多占用系统资源
	@Test
	public void test04() {
		// 创建beanfactory容器
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		IsomeService service = (IsomeService) bf.getBean("myService");
		service.doSome();
	}

}
