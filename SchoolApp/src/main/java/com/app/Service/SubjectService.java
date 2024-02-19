package com.app.Service;

import java.util.List;

import com.app.dto.SubjectDto;
import com.app.pojo.Subject;

public interface SubjectService 
{
SubjectDto getSubjectByid(long id);
SubjectDto addSubject(SubjectDto subjectdto);
String delteSubjectByid(long id);
SubjectDto updateStudent(SubjectDto subjectdto,long id);
List<Subject> getAllListSubject();
}
