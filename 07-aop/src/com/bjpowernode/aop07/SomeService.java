package com.bjpowernode.aop07;

public class SomeService {

	public void doFirst() {
		System.out.println("执行doFirst");
	}

	public String doSecond() {
		System.out.println("执行doSecond");
		return "abcd";
	}

}
