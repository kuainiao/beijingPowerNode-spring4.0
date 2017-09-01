package com.bjpowernode.xml;

public class SomeServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		System.out.println("执行doFirst");
	}

	@Override
	public String doSecond(String input) {
		System.out.println("执行doSecond");
		return input + "abcd";
	}

	@Override
	public void doThird() {
		// System.out.println("执行doThird" + 3 / 0);
		System.out.println("执行doThird");
	}

}
