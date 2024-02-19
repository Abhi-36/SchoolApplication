package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.Service.StudentService;
import com.app.dto.StudentDto;
import com.app.pojo.Student;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = {"*"})
public class StudentController 
{
     @Autowired
     private StudentService studserve;
     
     @PostMapping("/addStudent")
     public ResponseEntity<StudentDto> addStudent(@RequestBody StudentDto student)
     {
    	 System.out.println(student);
    	 
		return ResponseEntity.ok(studserve.addStudent(student));
    	 
     }
     
     @GetMapping("/getStudent/{id}")
     public ResponseEntity<StudentDto> getStudent(@PathVariable long id)
     {
	    	
    	 return ResponseEntity.ok(studserve.getStudentByid(id));
     }
     
     
     
     
     @PutMapping("/updateStudent/{id}")
     public ResponseEntity<StudentDto> updateStduent(@RequestBody StudentDto studentdto,@PathVariable long id)
     {
		return ResponseEntity.ok(studserve.updateStduent(studentdto, id));
    	 
     }
     
     @DeleteMapping("/deleteStudent/{id}")
     public ResponseEntity<String> deleteStudent(@PathVariable long id)
     {
		return ResponseEntity.ok(studserve.deleteStudentBYid(id));
    	 
     }
     @GetMapping("/getstudentlist")
     public ResponseEntity<List<Student>> getAllStudent()
     {
		return ResponseEntity.ok(studserve.getAllStudent());
    	 
     }
     
     
}
