package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Student_Registration")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	@NotNull
	private String firstName;
	private String lastName;
	private String email;
	private String interests;
	private String password;
	private String cpassword;
	private String mobile;
public Student() {
	super();
}
public Student(Integer id, String firstName, String lastName, String email, String interests, String password,
		String cpassword, String mobile) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.interests = interests;
	this.password = password;
	this.cpassword = cpassword;
	this.mobile = mobile;
}
public Student(String firstName, String lastName, String email, String interests, String password, String cpassword,
		String mobile) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.interests = interests;
	this.password = password;
	this.cpassword = cpassword;
	this.mobile = mobile;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getInterests() {
	return interests;
}
public void setInterests(String interests) {
	this.interests = interests;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getCpassword() {
	return cpassword;
}
public void setCpassword(String cpassword) {
	this.cpassword = cpassword;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
			+ ", interests=" + interests + ", password=" + password + ", cpassword=" + cpassword + ", mobile=" + mobile
			+ "]";
}

}
