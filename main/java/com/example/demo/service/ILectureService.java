package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Lecture;

public interface ILectureService {

	void create(Lecture lecture);

	List<Lecture> read();

	Lecture read(Integer id);

	void update(Lecture lecture);

	void delete(Lecture lecture);

}