package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.Subject;

public interface SubjectRepo extends JpaRepository<Subject, Long>
{

}
