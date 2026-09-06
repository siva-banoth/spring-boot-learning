package com.vector.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.vector.model.Student;
import com.vector.service.StudentService;

@Component
@Order(2)
public class ServiceRunner implements ApplicationRunner {

	@Autowired
	StudentService studentService;

	@Override
	public void run(ApplicationArguments args) {

		Student std = new Student(1155, "MILLER", 22, 8.0);

		studentService.insertStudent(std);
		System.out.println("+_+_".repeat(20));

		studentService.updateStudent(1155, 6.6);
		System.out.println("+_+_".repeat(20));

		studentService.deleteStudent(1269);
		System.out.println("+_+_".repeat(20));

		studentService.selectById(1155);
		System.out.println("+_+_".repeat(20));

		studentService.selectAll();
		System.out.println("+_+_".repeat(20));

	}
}
