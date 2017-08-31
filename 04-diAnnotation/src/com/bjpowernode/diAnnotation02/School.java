package com.bjpowernode.diAnnotation02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mySchool")
public class School {
	@Value("上海大学")
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "School [name=" + name + "]";
	}

}
