package com.bjpowernode.aop05;

public class SomeServiceImpl implements ISomeService {

	@Override
	public void logIn(String name, String password) throws UserNameException {
		if (!"上海".equals(name)) {
			throw new UserNameException("用户名错误");
		}
	}

}
