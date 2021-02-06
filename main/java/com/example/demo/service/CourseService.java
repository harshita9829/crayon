package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;

@Component("courseService")
public class CourseService implements ICourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public void createCourse(Course course) {
		courseRepository.save(course);
	}
	
	public List<Course> readCourse(){
		return courseRepository.findAll();
	}
	
	@Override
	public Course readCourseById(Integer id){
		return courseRepository.findById(id).get();
	}
	
	@Override
	public void updateCourse(Course course)
	{
		courseRepository.save(course);
	}
	
	@Override
	public void deleteCourse(Course course)
	{
		courseRepository.delete(course);
	}
}
