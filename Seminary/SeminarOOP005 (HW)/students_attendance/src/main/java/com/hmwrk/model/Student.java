package com.hmwrk.model;

import java.util.List;

public class Student {
    private String name;
    private int groupNumber;

    private List<Attendance> attendance;

    public Student(String name, int groupNumber, List<Attendance> attendance) {
        this.name = name;
        this.attendance = attendance;
        this.groupNumber=groupNumber;
    }

    public String getName() {
        return name;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public List<Attendance> getAttendance() {
        return attendance;
    }

    @Override
    public String toString() {
        return "Student name = '" + name + "'" +
                ", groupNumber = " + groupNumber +
                "\nAttendance = " + attendance;
    }

}