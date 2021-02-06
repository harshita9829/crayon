package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Lecture;
import com.example.demo.repository.LectureRepository;


@Component("lectureService")
public class LectureService implements ILectureService {
	@Autowired
	private LectureRepository lectureRepository;
	
	@Override
	public void create(Lecture lecture)
	{
		lectureRepository.save(lecture);
	}
	
	@Override
	public List<Lecture> read()
	{
		return lectureRepository.findAll();
	}
	
	@Override
	public Lecture read(Integer id)
	{
		return lectureRepository.findById(id).get();
	}
	
	@Override
	public void update(Lecture lecture)
	{
		lectureRepository.save(lecture);
	}
	
	@Override
	public void delete(Lecture lecture)
	{
		lectureRepository.delete(lecture);
	}
	
	
//	public List<Lecture> findLectureByType(byte[] type)
//	{
//		return lectureRepository.findLectureByType(type);
//	}
}



