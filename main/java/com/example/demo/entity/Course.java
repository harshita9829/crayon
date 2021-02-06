package com.example.demo.entity;

import java.time.LocalTime;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQuery(name = "byName", query = "select c from Course c where c.name=:name")
@Entity
@Table(name = "COURSE2")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	@Column(name="Course_Name")
	private String name; 
	
	private String language;
	
	private Proficiency proficiency;
	
	private LocalTime Duration;
	
	private Double Price;
	
	private Integer Discount;
	
	private String Description;
	
	@Lob
	private byte[] logo;
	
	public Course() {}

	public Course(Integer id, String name, String language, Proficiency proficiency, LocalTime duration, Double price,
			Integer discount, String description, byte[] logo) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.proficiency = proficiency;
		Duration = duration;
		Price = price;
		Discount = discount;
		Description = description;
		this.logo = logo;
	}

	public Course(Integer id, String name, String language, Proficiency proficiency, LocalTime duration, Double price,
			Integer discount, String description) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.proficiency = proficiency;
		Duration = duration;
		Price = price;
		Discount = discount;
		Description = description;
	}

	public Course(Integer id, String name, String language, Proficiency proficiency, Double price, Integer discount,
			String description) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.proficiency = proficiency;
		Price = price;
		Discount = discount;
		Description = description;
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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Proficiency getProficiency() {
		return proficiency;
	}

	public void setProficiency(Proficiency proficiency) {
		this.proficiency = proficiency;
	}

	public LocalTime getDuration() {
		return Duration;
	}

	public void setDuration(LocalTime duration) {
		Duration = duration;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public Integer getDiscount() {
		return Discount;
	}

	public void setDiscount(Integer discount) {
		Discount = discount;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", language=" + language + ", proficiency=" + proficiency
				+ ", Duration=" + Duration + ", Price=" + Price + ", Discount=" + Discount + ", Description="
				+ Description + ", logo=" + Arrays.toString(logo) + "]";
	}
	
	
}


