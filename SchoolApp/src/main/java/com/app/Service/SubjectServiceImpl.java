package com.app.Service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Exception.ExceptionHandle;
import com.app.dto.SubjectDto;
import com.app.pojo.Subject;
import com.app.repository.SubjectRepo;

@Service
@Transactional
public class SubjectServiceImpl implements SubjectService
{
    @Autowired
    private SubjectRepo subrepo;
    
    @Autowired
    private ModelMapper mapper;
	
	@Override
	public SubjectDto getSubjectByid(long id) {
		Subject subject=subrepo.findById(id).orElseThrow(()-> new ExceptionHandle("Is is Wrong please enter a correct id"));
		return convertIntoSubejctDto(subject);
	}

	@Override
	public SubjectDto addSubject(SubjectDto subjectdto) {
		Subject subject=convertIntoSubject(subjectdto);
		Subject subject1=subrepo.save(subject);
		
		return convertIntoSubejctDto(subject1);
	}
	
	private Subject convertIntoSubject(SubjectDto subjectdto)
	{
		Subject subject=mapper.map(subjectdto,Subject.class);
		return subject;
	}
	
	private SubjectDto convertIntoSubejctDto(Subject subject1)
	{
		SubjectDto subjectdto1=mapper.map(subject1, SubjectDto.class);
		return subjectdto1;
	}

	@Override
	public String delteSubjectByid(long id) {
		Subject subject=subrepo.findById(id).orElseThrow(()-> new ExceptionHandle("id is Wrong please enter a correct id"));
		subrepo.delete(subject);
		return "Subject is deleted";
	}

	@Override
	public SubjectDto updateStudent(SubjectDto subjectdto, long id) {
		Subject subject=subrepo.findById(id).orElseThrow(()-> new ExceptionHandle("id is wrong please enter a correct id"));
		
		subject.setCode(subjectdto.getCode());
		subject.setName(subjectdto.getName());
		subject.setTheory(subjectdto.isTheory());
		
		
		Subject subject1=subrepo.save(subject);
		return convertIntoSubejctDto(subject1);
	}

	@Override
	public List<Subject> getAllListSubject() {
	List<Subject> subject=subrepo.findAll();
		return subject;
	}

}
