package com.miit.demo.service;

import java.util.List;

import com.miit.demo.entity.Student;

public interface StudentServiceInterface {
	
	public Student addStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getEmpById(Long std_id);

	public void deleteEmpById(Long std_id);	
	

}
