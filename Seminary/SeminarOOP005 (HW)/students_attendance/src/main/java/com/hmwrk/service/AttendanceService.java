package com.hmwrk.service;

import java.util.ArrayList;
import java.util.List;

import com.hmwrk.model.Student;

public class AttendanceService {

    private List<Student> studentsList = new ArrayList<>();

    public void addStudent(Student student) {
        studentsList.add(student);
    }

    public void removeStudent(Student student) {
        studentsList.remove(student);
    }

    @Override
    public String toString() {
        return "AttendanceService{" +
                "studentsList=" + studentsList.toString() +
                '}';
    }

    public List<Student> getList() {
        return studentsList;
    }

}
