package com.hmwrk;

public class Student {
    private String name;
    private float grade;

    public Student(String name, float grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name:\"" + name + '\"' + ", Grade - " + grade + '}';
    }

}