package com.test.cc.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler{
	private Object subObject;
	
	public DynamicProxy(Object subObject) {
		super();
		this.subObject = subObject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("--------------------------");
		method.invoke(subObject, args);
		System.out.println("--------------------------");
		return null;
	}

}
