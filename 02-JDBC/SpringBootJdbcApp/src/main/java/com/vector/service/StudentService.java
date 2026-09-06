package com.vector.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vector.model.Student;
import com.vector.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	// INSERT
	public void insertStudent(Student std) {
		studentRepository.save(std);
		System.out.println("Student Data inserted Successfully");
	}

	// UPDATE
	public void updateStudent(int sid, double cgpa) {
		studentRepository.update(sid, cgpa);
		System.out.println("Student Data updated Successfully");
	}

	// DELETE
	public void deleteStudent(int sid) {
		studentRepository.delete(sid);
		System.out.println("Student Data deleted Successfully");
	}

	// SELECT
	public void selectById(int sid) {
		studentRepository.findById(sid);
	}

	// SELECT ALL
	public void selectAll() {
		studentRepository.findAll();
	}
}
