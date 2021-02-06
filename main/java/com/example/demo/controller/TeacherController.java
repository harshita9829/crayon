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

import com.example.demo.entity.Teacher;
import com.example.demo.service.ITeacherService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	ITeacherService teacherService;
	
	@GetMapping("/")
	public List<Teacher> getAllTeachers()
	{
		return teacherService.read();
	}
	
	@GetMapping("/{id}")
	public Teacher findTeacherById(@PathVariable("id") Integer id)
	{
		Teacher teacher=null;
		try {
		teacher = teacherService.read(id);
		}catch(Exception ex)
		{
			return null;
		}
		return teacher;
	}
	
//	@GetMapping("/type/{type}")
//	public List<Vehicle> findVehiclesByType(@PathVariable("type") String type)
//	{
//		return teacherService.findVehicleByType(type);
//	}
	
	@PostMapping("/")
	public void addTeacher(@RequestBody Teacher teacher)
	{
		teacherService.create(teacher);
	}
	
	@PutMapping("/")
	public void updateTeacher(@RequestBody Teacher teacher)
	{
		teacherService.update(teacher);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTeacher(@PathVariable("id") Integer id)
	{
		Teacher teacher=findTeacherById(id);
		teacherService.delete(teacher);
	}

}
