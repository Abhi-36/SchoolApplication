package com.app.dto;

import java.time.LocalDate;
import java.util.List;

import com.app.pojo.Subject;

public class StudentDto 
{
	private long id;
	private String name;
	private LocalDate dateOfBirth;
	private String address;
	private String mobile;
	//private List<Subject> subject;
	
	public StudentDto(long id, String name, LocalDate dateOfBirth, String address, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.mobile = mobile;
		//this.subject=subject;
	}

	public StudentDto() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	
//	public List<Subject> getSubject() {
//		return subject;
//	}
//
//	public void setSubject(List<Subject> subject) {
//		this.subject = subject;
//	}

	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", address=" + address
				+ ", mobile=" + mobile + "]";
	}

	
	
	
	
}
