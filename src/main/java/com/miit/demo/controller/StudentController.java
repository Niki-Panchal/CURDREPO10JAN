package com.miit.demo.controller;
import java.util.List;

import com.miit.demo.entity.Student;
import com.miit.demo.service.StudentServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentServiceInterface stdserviceinter;
	
	
	@PostMapping("/save")
	public ResponseEntity<?> addStudent(@RequestBody Student student){			
		
		Student studentsave = stdserviceinter.addStudent(student); 
		return new ResponseEntity<Student>(studentsave,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student){
		Student studentsave=stdserviceinter.addStudent(student);
		return new ResponseEntity<Student>(studentsave,HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> listOfAllStd = stdserviceinter.getAllStudent();
		 return new ResponseEntity<List<Student>>(listOfAllStd,HttpStatus.OK);
	}
	
	@GetMapping("/std/{std_id}")
	public ResponseEntity<?> getEmpById(@PathVariable("std_id") Long std_id){
		Student StdRetrived = stdserviceinter.getEmpById(std_id);
		return new ResponseEntity<Student>(StdRetrived,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{std_id}")
	public ResponseEntity<Void> deleteEmpById(@PathVariable("std_id") Long std_id){
		stdserviceinter.deleteEmpById(std_id);
		 return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	

}
