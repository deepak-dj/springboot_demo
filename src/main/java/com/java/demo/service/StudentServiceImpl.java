package com.java.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.demo.model.Student;
import com.java.demo.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student createStudent(Student student) {
		Student new_student = studentRepository.save(student);
		return new_student;
	}



}
