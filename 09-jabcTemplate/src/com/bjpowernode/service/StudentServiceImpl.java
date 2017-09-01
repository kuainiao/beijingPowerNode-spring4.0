package com.bjpowernode.service;

import java.util.List;

import com.bjpowernode.beans.Student;

public class StudentServiceImpl implements IStudentService {
	private IStudentDao dao;

	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}

	@Override
	public void addStudent() {
		dao.insertStudent();
	}

	@Override
	public void removeById(int id) {
		dao.deleteById(id);

	}

	@Override
	public void modifyStudent(Student student) {
		dao.updateStudent(student);
	}

	@Override
	public List<String> findAllStudentsNames() {
		return dao.selectAllStudentsNames();
	}

	@Override
	public String findStudentNameById() {
		return dao.selectStudentNameById();
	}

	@Override
	public List<Student> findAllStudents() {
		return dao.selectAllStudents();
	}

	@Override
	public Student findStudentById(int id) {
		return dao.selectStudentById(id);
	}

}
