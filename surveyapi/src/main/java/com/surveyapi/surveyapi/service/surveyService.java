package com.surveyapi.surveyapi.service;

import com.surveyapi.surveyapi.Model.surveyResponse;
import com.surveyapi.surveyapi.entity.student;
import com.surveyapi.surveyapi.repository.surveyRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

//Service handling the buisness logic
@Service
@Transactional
public class surveyService {
    @Autowired
    surveyRepository surveyRepository;
    String[] mostLiked = {"students", "location", "campus", "atmosphere", "dorm rooms", "sports"};
    String[] interests = {"friends", "television", "Internet", "other"};

    String[] recommendation = {"Very Likely", "Likely", "Unlikely"};

    public ResponseEntity<?> createSurvey(student studentModel) {
        if (studentModel.getMostLiked() != null && !studentModel.getMostLiked().isEmpty()
                && Arrays.stream(mostLiked).noneMatch(l -> l.equalsIgnoreCase(studentModel.getMostLiked()))) {
            return new ResponseEntity<>("Wrong value for most liked",HttpStatus.BAD_REQUEST);
        }
        if (studentModel.getInterest() != null && !studentModel.getInterest().isEmpty()
                && Arrays.stream(interests).noneMatch(l -> l.equalsIgnoreCase(studentModel.getInterest()))) {
            return new ResponseEntity<>("Wrong value for interest",HttpStatus.BAD_REQUEST);
        }
        if (studentModel.getRecommendation() != null && !studentModel.getRecommendation().isEmpty()
                && Arrays.stream(recommendation).noneMatch(l -> l.equalsIgnoreCase(studentModel.getRecommendation()))) {
            return new ResponseEntity<>("Wrong value for recommendation",HttpStatus.BAD_REQUEST);
        }
        surveyRepository.save(studentModel);
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    public ResponseEntity<?> getSurvey(String email) {
        surveyResponse surveyResponse = new surveyResponse();
        if (email != null) {
            surveyResponse = null;
        } else {
            List<student> studentList = surveyRepository.findAll();
            surveyResponse.setStudents(studentList);
            surveyResponse.setCount(studentList.size());
        }
        return new ResponseEntity<>(surveyResponse, HttpStatus.OK);
    }

}
