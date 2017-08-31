package com.bjpowernode.ba06;

public class SomeServiceImpl implements IsomeService {
	private int a = 5;

	// 创建有参构造器时，必须把无参构造器带上

	public SomeServiceImpl() {
	}

	public SomeServiceImpl(int a) {
		this.a = a;
	}

	@Override
	public void doSome() {
		System.out.println("do some");
	}

	public void setUp() {
		System.out.println("bean开始");
	}

	public void tearDown() {
		System.out.println("bean结束");
	}

}
