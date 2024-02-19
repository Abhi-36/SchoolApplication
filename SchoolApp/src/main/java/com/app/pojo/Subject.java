package com.app.pojo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="subject")
public class Subject extends BaseEntity
{

    private String name;
    private String code;
    private  Boolean  isTheory;
    

	

	public Subject(String name, String code, Boolean isTheory,Student student) {
		super();
		this.name = name;
		this.code = code;
		this.isTheory = isTheory;
		this.student=student;
	}

	public Subject() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getisTheory() {
		return isTheory;
	}

	public void setTheory(Boolean isTheory) {
		this.isTheory = isTheory;
	}
	
	
    
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}



	@Override
	public String toString() {
		return "Subject [name=" + name + ", code=" + code + ", isTheory=" + isTheory + ", student=" + student + "]";
	}



	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="student_id")
	private Student student;
    
}
