package com.bjpowernode.aop06;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

	/**
	 * 当前方法在执行目标方法之前执行 Method:目标方法 arg1：目标方法参数 arg2:目标对象
	 * 
	 * 
	 */
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		// 对目标方法的增强就写到这里
		System.out.println("执行前置通知方法");
	}

}
