package com.bjpowernode.aop12;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfterReturningAdvice implements AfterReturningAdvice {
	/**
	 * returnValue：目标方法的返回值 不可以修改目标方法的返回值
	 */
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("执行后置通知 returnValue=" + returnValue);
	}

}
