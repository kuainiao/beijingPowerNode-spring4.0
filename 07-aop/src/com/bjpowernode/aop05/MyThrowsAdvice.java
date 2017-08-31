package com.bjpowernode.aop05;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowsAdvice implements ThrowsAdvice {

	public void afterThrowing(Exception ex) {
		System.out.println("执行异常通知");
	}

	public void afterThrowing(UserNameException ex) {
		System.out.println(" 发生用户名异常" + ex.getMessage());
	}

}
