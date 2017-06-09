package com.test.cc.ioc;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	
	
	private Student student;
	private String desc;
	private List<Student> stlist;
	private Map<String,String> stmap;
	private List list;
	
	public void setStudent(Student student) {
		this.student = student;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public void setStlist(List<Student> stlist) {
		this.stlist = stlist;
	}
	public void setStmap(Map<String, String> stmap) {
		this.stmap = stmap;
	}
	public void setList(List list) {
		this.list = list;
	}
	public static void main(String[] args) {
		ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext("classpath:com/test/cc/ioc/config/spring.xml");
		SpringTest test=(SpringTest)app.getBean("springtest");
		System.out.println(test.desc);
		System.out.println(test.student.toString());
		System.out.println(test.list.toString());
		System.out.println(test.stmap.toString());
	}
}
