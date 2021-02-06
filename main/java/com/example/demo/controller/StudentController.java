package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/studentRegistration")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@PostMapping("/")
	public void addStudent(@RequestBody Student student)
	{
		System.out.println(student);
		studentService.create(student);
	}
	@GetMapping("/")
	public List<Student> getAllStudents()
	{
		return studentService.read();
	}
}
