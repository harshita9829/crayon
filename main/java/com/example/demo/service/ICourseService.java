package com.example.demo.service;

import com.example.demo.entity.Course;

public interface ICourseService {

	Course readCourseById(Integer id);

	void updateCourse(Course course);

	void deleteCourse(Course course);

}