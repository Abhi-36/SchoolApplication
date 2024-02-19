package com.app.Service;

import java.util.List;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.app.Exception.ExceptionHandle;
import com.app.dto.StudentDto;
import com.app.pojo.Student;
import com.app.repository.StudentRepo;

@Service
@Transactional
public class StudentServiceImpl implements StudentService
{
     
	@Autowired
	private StudentRepo studrepo;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public StudentDto getStudentByid(Long id) {
		Student student1=studrepo.findById(id).orElseThrow(()->new ExceptionHandle("id is Wrong"));
		System.out.println(student1);
		return convertIntoStudentDto(student1);
	}

	@Override
	public StudentDto addStudent(StudentDto studentdto) {
		
		Student student1=convertIntoStudent( studentdto);
		studrepo.save(student1);
		return convertIntoStudentDto(student1);
	}

	private StudentDto convertIntoStudentDto(Student student1) {
		StudentDto studentdto1=mapper.map(student1, StudentDto.class);
		return null;
	}

	private Student convertIntoStudent(StudentDto studentdto) {
		Student student2=mapper.map(studentdto, Student.class);
		return student2;
	}

	@Override
	public String deleteStudentBYid(Long id) {
		
		Student student=studrepo.findById(id).orElseThrow(()-> new ExceptionHandle("id is Wrong please enter a correct id"));
		studrepo.delete(student);
		return "Student  details is deleted";
	}

	@Override
	public StudentDto updateStduent(StudentDto studentdto, Long id) {
		Student student=studrepo.findById(id).orElseThrow(()-> new ExceptionHandle(" id is erong please enter a correct id"));
		
		student.setAddress(studentdto.getAddress());
		student.setDateOfBirth(studentdto.getDateOfBirth());
		student.setMobile(studentdto.getMobile());
		student.setName(studentdto.getName());
		//student.setSubject(studentdto.getSubject());
		
		Student student1=studrepo.save(student);
		
		return convertIntoStudentDto(student1) ;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> student=studrepo.findAll();
		return student;
	}

	

	

}
