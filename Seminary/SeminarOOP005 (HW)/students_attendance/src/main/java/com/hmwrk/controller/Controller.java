package com.hmwrk.controller;

import java.util.Scanner;

import com.hmwrk.service.AttendanceService;
import com.hmwrk.view.AttendanceView;

public class Controller {

    AttendanceService attendanceService;
    AttendanceView attendanceView;

    public Controller(AttendanceService attendanceService, AttendanceView attendanceView) {
        this.attendanceService = attendanceService;
        this.attendanceView = attendanceView;
    }

    public void buttonClick() {
        int number = getValue();
        if (number == 1) {
            attendanceView.PrintListAttendance(attendanceService);
        } else if (number == 2) {
            attendanceView.SortIncreaseListAttendance(attendanceService);
        } else
            attendanceView.ListLowAttendance(attendanceService);
    }

    Scanner usrInput = new Scanner(System.in);

    public Integer getValue() {
        System.out.println("Выберите действие:\n 1. Распечатать всех студентов и посещаемость в процентах \n " +
                "2. Распечатать студентов, отсортировав их по убыванию посещаемости \n " +
                "3. Распечатать студентов с посещаемостью ниже 25% \n");
        return Integer.parseInt(usrInput.next());
    }

}