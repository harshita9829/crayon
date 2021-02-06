package com.example.demo.entity;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "LECTURES")
public class Lecture {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	@Column(name = "name")
	private String name;
	private Byte[] type;
	@Transient
	private SimpleDateFormat sdf;
	
	public Lecture() {}
	public Lecture(Integer id, String name, Byte[] type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}
	public Lecture(String name, Byte[] type) {
		super();
		this.name = name;
		this.type = type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Byte[] getType() {
		return type;
	}
	public void setType(Byte[] type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Lecture [id=" + id + ", name=" + name + ", type=" + Arrays.toString(type) + "]";
	}
	

}
