package com.bjpowernode.aop04;

public class SomeServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		System.out.println("执行doFirst" + 3 / 0);
	}

	@Override
	public String doSecond() {
		System.out.println("执行doSecond");
		return "abcd";
	}

}
