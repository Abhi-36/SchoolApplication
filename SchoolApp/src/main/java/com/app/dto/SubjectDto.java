package com.app.dto;

public class SubjectDto 
{
	 private long id;
	 private String name;   
	 private String code;
	 private boolean isTheory;
	// private long student_id;
	 
	 

	public SubjectDto(long id, String name, String code, boolean isTheory) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.isTheory = isTheory;
		//this.student_id=student_id;
	}



	public SubjectDto() {
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



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public boolean isTheory() {
		return isTheory;
	}



	public void setTheory(boolean isTheory) {
		this.isTheory = isTheory;
	}

	

//
//	public long getStudent_id() {
//		return student_id;
//	}



//	public void setStudent_id(long student_id) {
//		this.student_id = student_id;
//	}



	@Override
	public String toString() {
		return "SubjectDto [id=" + id + ", name=" + name + ", code=" + code + ", isTheory=" + isTheory + ", student_id="
				+ "]";
	}



	
	
	 
	 
}
