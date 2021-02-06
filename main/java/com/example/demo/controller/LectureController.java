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

import com.example.demo.entity.Lecture;
import com.example.demo.service.ILectureService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/lecture")
public class LectureController {
	@Autowired
	ILectureService lectureService;
	
	@GetMapping("/")
	public List<Lecture> getAllLectures()
	{
		return lectureService.read();
	}
	
	@GetMapping("/{id}")
	public Lecture findLectureById(@PathVariable("id") Integer id)
	{
		Lecture lecture=null;
		try {
		lecture = lectureService.read(id);
		}catch(Exception ex)
		{
			return null;
		}
		return lecture;
	}
	
//	@GetMapping("/type/{type}")
//	public List<Lecture> findLecturesByType(@PathVariable("type") byte[] type)
//	{
//		return lectureService.findLectureByType(type);
//	}
//	
	@PostMapping("/")
	public void addLecture(@RequestBody Lecture lecture)
	{
		lectureService.create(lecture);
	}
	
	@PutMapping("/")
	public void updateLecture(@RequestBody Lecture lecture)
	{
		lectureService.update(lecture);
	}
	
	@DeleteMapping("/{id}")
	public void deleteLecture(@PathVariable("id") Integer id)
	{
		Lecture lecture=findLectureById(id);
		lectureService.delete(lecture);
	}


}
