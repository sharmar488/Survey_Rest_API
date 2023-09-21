package com.surveyapi.surveyapi.Model;

import com.surveyapi.surveyapi.entity.student;

import java.util.List;

// get call response
public class surveyResponse {
    Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    List<student> students;

    public List<student> getStudents() {
        return students;
    }

    public void setStudents(List<student> students) {
        this.students = students;
    }
}
