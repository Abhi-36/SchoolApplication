package com.app.Service;

import java.util.List;

import com.app.dto.StudentDto;
import com.app.pojo.Student;

public interface StudentService 
{
  StudentDto getStudentByid(Long id);
  StudentDto addStudent(StudentDto studentdto);
  String deleteStudentBYid(Long id);
  StudentDto updateStduent(StudentDto studentdto,Long id);
  List<Student> getAllStudent();
  
}
