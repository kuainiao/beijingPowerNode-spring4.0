package com.bjpowernode.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.bjpowernode.service.ISomeService;
import com.bjpowernode.service.SomeServiceImpl;
import com.bjpowernode.utils.SystemService;

public class MyTest {

	public static void main(String[] args) {
		ISomeService target = new SomeServiceImpl();
		ISomeService service = (ISomeService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), new InvocationHandler() {
					// 织入 weaving
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						SystemService.dotx();
						// 执行目标方法
						Object result = method.invoke(target, args);
						SystemService.doLog();
						return result;
					}
				});
		service.doFirst();
		service.doSecond();
	}

}
