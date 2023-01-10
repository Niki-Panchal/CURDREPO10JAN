package com.miit.demo.service;

import java.util.List;

import com.miit.demo.entity.Student;
import com.miit.demo.repository.StudentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements StudentServiceInterface{

	@Autowired
	private StudentRepo stdrepo;
	
	
	@Override
	public Student addStudent(Student student) {
		Student savestudent = stdrepo.save(student);
		return savestudent;
		
	}

	@Override
	public List<Student> getAllStudent() {	 
		List<Student> stdlist = stdrepo.findAll();
		return stdlist;
	}

	@Override
	public Student getEmpById(Long std_id) {
		
		return stdrepo.findById(std_id).get();
	}

	@Override
	public void deleteEmpById(Long std_id) {
		stdrepo.deleteById(std_id);
		
	}

}
