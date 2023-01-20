package com.hmwrk;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.hmwrk.controller.Controller;
import com.hmwrk.model.Attendance;
import com.hmwrk.model.Student;
import com.hmwrk.service.AttendanceService;
import com.hmwrk.view.AttendanceView;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        AttendanceService as = new AttendanceService();
        AttendanceView av = new AttendanceView();

        Controller click = new Controller(as, av);

        List<Attendance> attStud1 = new ArrayList<>();
        attStud1.add(new Attendance(LocalDate.of(2023, 01, 01), false));
        attStud1.add(new Attendance(LocalDate.of(2022, 12, 21), true));
        attStud1.add(new Attendance(LocalDate.of(2021, 01, 25), false));
        attStud1.add(new Attendance(LocalDate.of(2020, 12, 20), false));
        Student student1 = new Student("Билли Боб", 1, attStud1);
        as.addStudent(student1);

        List<Attendance> attStud2 = new ArrayList<>();
        attStud2.add(new Attendance(LocalDate.of(2023, 01, 01), true));
        attStud2.add(new Attendance(LocalDate.of(2022, 12, 21), true));
        attStud2.add(new Attendance(LocalDate.of(2021, 01, 25), true));
        attStud2.add(new Attendance(LocalDate.of(2020, 12, 20), false));
        Student student2 = new Student("Келлер Меллер", 6, attStud2);
        as.addStudent(student2);

        List<Attendance> attStud3 = new ArrayList<>();
        attStud3.add(new Attendance(LocalDate.of(2023, 01, 01), false));
        attStud3.add(new Attendance(LocalDate.of(2022, 12, 21), true));
        attStud3.add(new Attendance(LocalDate.of(2021, 01, 25), true));
        attStud3.add(new Attendance(LocalDate.of(2020, 12, 20), false));
        Student student3 = new Student("Мюкке Владимир", 3, attStud3);
        as.addStudent(student3);

        click.buttonClick();

    }
}
