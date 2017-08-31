package com.bjpowernode.di10_1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
	/**
	 * 以配置文件数组方式实现
	 */
	@Test
	public void test02() {
		// 创建容器对象
		String[] resource = { "com/bjpowernode/di10_1/applicationContext.xml",
				"com/bjpowernode/di10_1/spring-student.xml", "com/bjpowernode/di10_1/spring-teacher.xml" };
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		System.out.println(ac.getBean("myStudent1"));
		System.out.println(ac.getBean("myTeacher"));
	}

}
