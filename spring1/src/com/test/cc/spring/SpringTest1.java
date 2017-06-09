package com.test.cc.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class SpringTest1 {

	private String desc;
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public void print(){
		System.out.println("打印方法");
	}
	public static void main(String[] args) {
		ClassPathXmlApplicationContext application=new ClassPathXmlApplicationContext("classpath:com/test/cc/spring/config/spring.xml");
		SpringTest1 test1=(SpringTest1)application.getBean("springtest");
		test1.print();
	}
	
}
