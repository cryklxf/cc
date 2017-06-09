package com.test.cc.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		BuyGoods realbuy=new BuyApple();
		InvocationHandler handler=new DynamicProxy(realbuy);
		BuyGoods buy=(BuyGoods)Proxy.newProxyInstance(handler.getClass().getClassLoader(),realbuy.getClass().getInterfaces(), handler);
		buy.buy();
		
		BuyGoods realbuy1=new BuyBanana();
		InvocationHandler handler1=new DynamicProxy(realbuy1);
		BuyGoods buy1=(BuyGoods)Proxy.newProxyInstance(handler.getClass().getClassLoader(),realbuy.getClass().getInterfaces(), handler1);
		buy1.buy();
	}
}
