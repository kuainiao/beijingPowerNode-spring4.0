package com.bjpowernode.di10_1;

public class Student {
	private String name;
	private int age;
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
