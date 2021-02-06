package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface IStudentService {
	void create(Student student);
	List<Student> read();
}