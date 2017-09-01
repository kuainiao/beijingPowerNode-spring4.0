package com.bjpowernode.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect // 表示切面
public class MyAspect {

	@Before("execution(* *..ISomeService.doFirst(..))")
	public void before() {
		System.out.println("执行前置通知");
	}

	@Before("execution(* *..ISomeService.doFirst(..))")
	public void before(JoinPoint j) {
		System.out.println("执行前置通知 j=" + j);
	}

	@AfterReturning("execution(* *..ISomeService.doFirst(..))")
	public void myAfterReturning() {
		System.out.println("执行后置通知");
	}

	@AfterReturning(value = "execution(* *..ISomeService.doFirst(..))", returning = "result")
	public void myAfterReturning(Object result) {
		System.out.println("执行后置通知 result=" + result);
	}

	@Around("execution(* *..ISomeService.doSecond(..))")
	public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("环绕通知，前");
		Object result = pjp.proceed();
		System.out.println("环绕通知，后 result=" + result);
		return result;
	}

	@AfterThrowing("execution(* *..ISomeService.doThird(..))")
	public void myAfterThrowing() {
		System.out.println("执行异常");
	}

	@AfterThrowing(value = "execution(* *..ISomeService.doThird(..))", throwing = "ex")
	public void myAfterThrowing(Exception ex) {
		System.out.println("执行异常 ex=" + ex);
	}

	@After("doThirdPointcut()")
	public void after(JoinPoint j) {
		System.out.println("执行最终通知 j=" + j);
	}

	// 定义切入点 名称： doThirdPointcut()
	@Pointcut("execution(* *..ISomeService.doFirst(..))")
	public void doThirdPointcut() {
	}
}
