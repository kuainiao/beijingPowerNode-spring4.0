package com.bjpowernode.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

// 表示切面
public class MyAspect {

	public void before() {
		System.out.println("执行前置通知");
	}

	public void before(JoinPoint j) {
		System.out.println("执行前置通知 j=" + j);
	}

	public void myAfterReturning() {
		System.out.println("执行后置通知");
	}

	public void myAfterReturning(Object result) {
		System.out.println("执行后置通知 result=" + result);
	}

	public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("环绕通知，前");
		Object result = pjp.proceed();
		System.out.println("环绕通知，后 ");
		System.out.println(pjp.getArgs());
		return result;
	}

	public void myAfterThrowing() {
		System.out.println("执行异常");
	}

	public void myAfterThrowing(Exception ex) {
		System.out.println("执行异常 ex=" + ex);
	}

	public void myAfter() {
		System.out.println("执行最终通知");
	}

	public void myAfter(JoinPoint j) {
		System.out.println("执行最终通知 j=" + j);
	}

}
