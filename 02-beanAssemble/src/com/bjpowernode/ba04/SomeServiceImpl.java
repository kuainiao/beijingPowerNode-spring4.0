package com.bjpowernode.ba04;

public class SomeServiceImpl implements IsomeService {
	private int a = 5;

	// 创建有参构造器时，必须把无参构造器带上

	public SomeServiceImpl() {
		System.out.println("执行构造器");
	}

	public SomeServiceImpl(int a) {
		this.a = a;
	}

	@Override
	public void doSome() {
		System.out.println("do some");
	}

}
