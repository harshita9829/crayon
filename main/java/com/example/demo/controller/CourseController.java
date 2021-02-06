package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/course")
public class CourseController {

	@Autowired
	CourseService courseService;
	
	@GetMapping("/")
	public List<Course> getAllCourses()
	{
		return courseService.readCourse();
	}
	
	@GetMapping("/{id}")
	public Course findCourseById(@PathVariable("id") Integer id)
	{
		System.out.println(id);
		Course course=null;
		try {
		course = courseService.readCourseById(id);
		}catch(Exception ex)
		{
			return null;
		}
		return course;
	}
	
	@PostMapping("/")
	public void addCourse(@RequestBody Course course)
	{
		courseService.createCourse(course);
	}
	
	@PutMapping("/")
	public void updateCourse(@RequestBody Course course)
	{
		courseService.updateCourse(course);
	}
	
	@DeleteMapping("/{id}")
	public void deleteVehicle(@PathVariable("id") Integer id)
	{
		Course course=findCourseById(id);
		courseService.deleteCourse(course);
	}
}
