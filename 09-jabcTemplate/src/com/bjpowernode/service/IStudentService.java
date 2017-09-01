package com.bjpowernode.service;

import java.util.List;

import com.bjpowernode.beans.Student;

public interface IStudentService {
	void addStudent();

	void removeById(int id);

	void modifyStudent(Student student);

	List<String> findAllStudentsNames();

	String findStudentNameById();

	List<Student> findAllStudents();

	Student findStudentById(int id);
}
