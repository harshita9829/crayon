package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;



@Component("studentService")
public class StudentService implements IStudentService {
@Autowired
private StudentRepository studentRepository;
@Override
public void create(Student student)
{
	System.out.println(student);
	studentRepository.save(student);
}
@Override
public List<Student> read()
{
	return studentRepository.findAll();
}
}
