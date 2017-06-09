package com.test.cc.factory;

import com.test.cc.ioc.Student;

public class StudentFactory {
	public static Student createStudent(){
		Student student=new Student();
		student.setAge(3);
		student.setName("张三");
		student.setSex("男");
		return student;
		
	}
}
