package com.bjpowernode.ba02;

public class ServiceFactory {
	// 动态工厂 new ServiceFactory.getSomeService1()
	public IsomeService getSomeService1() {
		return new SomeServiceImpl();
	}

	//// 静态工厂 ServiceFactory.getSomeService2()
	public static IsomeService getSomeService2() {
		return new SomeServiceImpl();
	}
}
