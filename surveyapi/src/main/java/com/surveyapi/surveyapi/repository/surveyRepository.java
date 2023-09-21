package com.surveyapi.surveyapi.repository;

import com.surveyapi.surveyapi.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;

//repository used for reading and writing the data
public interface surveyRepository extends JpaRepository<student,Integer> {
}
