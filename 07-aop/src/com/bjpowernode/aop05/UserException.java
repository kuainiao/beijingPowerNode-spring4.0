package com.bjpowernode.aop05;

public class UserException extends Exception {
	// 异常分为两种：
	// 1、运行时异常 父类：RuntimeException，编译时可以通过
	// 2、编译时异常 父类：Exception，编译时无法通过，

	public UserException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
