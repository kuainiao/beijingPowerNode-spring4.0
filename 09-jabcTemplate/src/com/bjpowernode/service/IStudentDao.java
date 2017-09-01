package com.bjpowernode.service;

import java.util.List;

import com.bjpowernode.beans.Student;

public interface IStudentDao {
	void insertStudent();

	void deleteById(int id);

	void updateStudent(Student student);

	List<String> selectAllStudentsNames();

	String selectStudentNameById();

	List<Student> selectAllStudents();

	Student selectStudentById(int id);

}
