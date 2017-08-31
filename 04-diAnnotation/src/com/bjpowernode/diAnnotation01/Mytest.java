package com.bjpowernode.diAnnotation01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
	/**
	 * 定义 Bean@Component 与@Component功能相同，意义不相同的注解还有三个
	 * 
	 * @Repository 注解在Dao实现类上
	 * @Service 注解在Service实现类上
	 * @Controller 注解在springMVC控制器上
	 * 
	 */

	@Test
	public void test02() {
		// 创建容器对象
		String resource = "com/bjpowernode/diAnnotation01/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		System.out.println(ac.getBean("myStudent"));
	}

}
