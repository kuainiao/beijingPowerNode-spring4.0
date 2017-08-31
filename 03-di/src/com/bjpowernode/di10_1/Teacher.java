package com.bjpowernode.di10_1;

public class Teacher {
	private String name;
	private School school;
	private Integer age;

	public void setName(String name) {
		this.name = name;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", school=" + school + ", age=" + age + "]";
	}

}
