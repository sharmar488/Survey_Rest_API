package com.surveyapi.surveyapi.controller;

import com.surveyapi.surveyapi.entity.student;
import com.surveyapi.surveyapi.service.surveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//Controller file container restapi's endpoints
@RestController
@CrossOrigin
public class SurveyController {


    @Autowired
    surveyService surveyService;

    @PostMapping("/createStudentSurvey")
    public ResponseEntity<?> createStudentSurvey(@RequestBody student studentModel){
        return surveyService.createSurvey(studentModel);
    }

    @GetMapping("/getStudents")
    public ResponseEntity<?> getStudents(@RequestParam(required = false) String email){
        return surveyService.getSurvey(email);
    }
}
