package com.bjpowernode.service;

import com.bjpowernode.utils.SystemService;

public class SomeServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		SystemService.dotx();
		System.out.println("执行doFirst");
		SystemService.doLog();
	}

	@Override
	public void doSecond() {
		SystemService.dotx();
		System.out.println("执行doSecond");
		SystemService.doLog();
	}

}
