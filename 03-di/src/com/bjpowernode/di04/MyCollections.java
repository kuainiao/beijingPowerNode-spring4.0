package com.bjpowernode.di04;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MyCollections {
	private String[] strs;
	private List<Student> students;
	private Set<String> mySet;
	private Map<String, Integer> myMap;
	private Properties myPro;

	public void setStrs(String[] strs) {
		this.strs = strs;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void setMySet(Set<String> mySet) {
		this.mySet = mySet;
	}

	public void setMyMap(Map<String, Integer> myMap) {
		this.myMap = myMap;
	}

	public void setMyPro(Properties myPro) {
		this.myPro = myPro;
	}

	@Override
	public String toString() {
		return "MyCollections [strs=" + Arrays.toString(strs) + ", students=" + students + ", mySet=" + mySet
				+ ", myMap=" + myMap + ", myPro=" + myPro + "]";
	}

}
