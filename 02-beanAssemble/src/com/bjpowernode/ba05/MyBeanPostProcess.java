package com.bjpowernode.ba05;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcess implements BeanPostProcessor {

	/**
	 * bean: 当前正在初始化的bean对象 beanName：当前正在初始化的bean对象的id
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("执行  Before");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("执行  after");
		if ("myService".equals(beanName)) {
			Object obj = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(),
					new InvocationHandler() {

						@Override
						public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
							Object invoke = method.invoke(bean, args);
							if (method.getName().equals("doSome")) {
								return ((String) invoke).toString().toUpperCase();
							}
							return invoke;
						}
					});
			return obj;
		}
		return bean;
	}

}
