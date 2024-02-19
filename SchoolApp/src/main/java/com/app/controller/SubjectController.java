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
import org.springframework.web.bind.annotation.RestController;

import com.app.Service.SubjectService;
import com.app.dto.SubjectDto;
import com.app.pojo.Subject;

@RestController
@RequestMapping("/subject")
@CrossOrigin(origins = "{*}")
public class SubjectController 
{
     @Autowired
     private SubjectService subserve;
     
     
     @PostMapping("/addSubject")
     public ResponseEntity<SubjectDto> addSubject(@RequestBody SubjectDto subjectdto)
     {
    	 return ResponseEntity.ok(subserve.addSubject(subjectdto));
     }
     
     @GetMapping("/getSubject/{id}")
     public ResponseEntity<SubjectDto> getSubject(@PathVariable long id)
     {
    	 return ResponseEntity.ok(subserve.getSubjectByid(id));
     }
     
     @DeleteMapping("/deleteSubject/{id}")
     public ResponseEntity<String> delteSubject(@PathVariable long id)
     {
    	 return ResponseEntity.ok(subserve.delteSubjectByid(id));
     }
     
     @PutMapping("/updateSubject/{id}")
     public ResponseEntity<SubjectDto> updateSubject(@RequestBody SubjectDto subjectdto,@PathVariable long id)
     {
    	 return ResponseEntity.ok(subserve.updateStudent(subjectdto, id));
     }
     
     
     @GetMapping("/getsubjectlist")
     public ResponseEntity<List<Subject>> getSubjectList()
     {
		return ResponseEntity.ok(subserve.getAllListSubject());
    	 
     }
     
     

}
