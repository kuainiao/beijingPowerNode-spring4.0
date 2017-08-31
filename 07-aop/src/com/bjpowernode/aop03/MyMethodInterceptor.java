package com.bjpowernode.aop03;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptor implements MethodInterceptor {
	// 可以改变目标方法的值
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("执行目标方法之前");
		Object result = invocation.proceed();
		System.out.println("执行目标方法之后");
		if (result != null) {
			result = ((String) result).toUpperCase();
		}
		return result;
	}

}
