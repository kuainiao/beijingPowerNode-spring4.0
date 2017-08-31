package com.bjpowernode.diAnnotation02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myStudent")
public class Student {
	@Value("张三")
	private String name;
	private int age;
	@Autowired // byType方式注入
	@Qualifier("mySchool") // byName方式注入，该方式需要与@Autowired联合使用，才生效
	private School school; // 对象属性 域属性
	private String department;

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school + "]";
	}

}
