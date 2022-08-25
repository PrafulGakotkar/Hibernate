package com.tns.service;

import com.tns.dao.StudentDao;
import com.tns.dao.StudentDaoImpl;
import com.tns.entity.student;

public class StudentServiceImpl implements StudentService{
	
	private StudentDao dao;
	public StudentServiceImpl() {
		dao = new StudentDaoImpl();
	}
	@Override
	public void addStudent(student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
	}
	@Override
	public void updateStudent(student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		
	}
	@Override
	public void removeStudent(student student) {
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
		
	}
	@Override
	public student findStudentById(int id) {
		student student = dao.getStudentById(id);
		return student;
	}

}
