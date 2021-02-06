package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Teacher;
import com.example.demo.repository.TeacherRepository;

@Component("teacherService")
public class TeacherService implements ITeacherService  {
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Override
	public void create(Teacher teacher)
	{
		teacherRepository.save(teacher);
	}
	@Override
	public List<Teacher> read()
	{
		return teacherRepository.findAll();
	}
	@Override
	public Teacher read(Integer id)
	{
		return teacherRepository.findById(id).get();
	}
	@Override
	public void update(Teacher teacher)
	{
		teacherRepository.save(teacher);
	}
	@Override
	public void delete(Teacher teacher)
	{
		teacherRepository.delete(teacher);
	}
	
//	public List<Vehicle> findVehicleByType(String type)
//	{
//		return vehicleRepository.findVehicleByType(type);
//	}
}
