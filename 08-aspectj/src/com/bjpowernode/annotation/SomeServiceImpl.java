package com.bjpowernode.annotation;

public class SomeServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		System.out.println("执行doFirst");
	}

	@Override
	public String doSecond() {
		System.out.println("执行doSecond");
		return "abcd";
	}

	@Override
	public void doThird() {
		System.out.println("执行doThird" + 3 / 0);
	}

}
