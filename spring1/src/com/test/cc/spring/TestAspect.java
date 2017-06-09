package com.test.cc.spring;

import org.aspectj.lang.JoinPoint;

public class TestAspect {
	public static void doBefore(JoinPoint jp){
		System.out.println("-------before------");
	}
	
	public static void doAfter(JoinPoint jp){
		System.out.println("-------after------");
	}
	
}
