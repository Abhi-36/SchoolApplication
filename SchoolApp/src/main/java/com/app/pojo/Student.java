package com.app.pojo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student extends BaseEntity
{
	    private String name;
	    private LocalDate dateOfBirth;
	    private String address;
	    private String mobile;
	   

		public Student(String name, LocalDate dateOfBirth, String address, String mobile) {
			super();
			this.name = name;
			this.dateOfBirth = dateOfBirth;
			this.address = address;
			this.mobile = mobile;
		}

		public Student() {
			super();
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", mobile="
					+ mobile + "]";
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
		
		
	    
		



//		public List<Subject> getSubject() {
//			return subject;
//		}
//
//		public void setSubject(List<Subject> subject) {
//			this.subject = subject;
//		}







		@OneToMany(cascade = CascadeType.ALL , orphanRemoval = true, mappedBy = "student",fetch = FetchType.LAZY)
		private List<Subject> subject = new ArrayList<>();
	    
}
