package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Teacher;

public interface ITeacherService {

	void create(Teacher teacher);

	List<Teacher> read();

	Teacher read(Integer id);

	void update(Teacher teacher);

	void delete(Teacher teacher);

}