package com.hmwrk.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.hmwrk.model.Attendance;
import com.hmwrk.model.Student;
import com.hmwrk.service.AttendanceService;

public class AttendanceView {

    public HashMap<Student, Integer> getListStudentAttendance(AttendanceService attendanceService) {
        List<Student> studentsList = attendanceService.getList();
        HashMap<Student, Integer> stLowAttendance = new HashMap<>();
        Integer attendance;
        for (Student student : studentsList) {
            attendance = 0;
            for (Attendance att : student.getAttendance()) {
                if (att.getAttend().equals(true)) {
                    attendance++;
                }
            }
            int percent = attendance * 100 / student.getAttendance().size();
            stLowAttendance.put(student, percent);
        }
        return stLowAttendance;
    }

    public void PrintList(List<Student> data) {
        for (Student stududent : data) {
            System.out.println(stududent);
        }
    }

    public void PrintListAttendance(AttendanceService attendanceService) {
        HashMap<Student, Integer> listStudentAttendance = getListStudentAttendance(attendanceService);
        for (HashMap.Entry<Student, Integer> studEntry : listStudentAttendance.entrySet()) {
            System.out.println(studEntry.getKey() + " - Процент посещения -" + studEntry.getValue() + "%\n");
        }
    }

    public void ListLowAttendance(AttendanceService attendanceService) {
        HashMap<Student, Integer> listStudentAttendance = getListStudentAttendance(attendanceService);
        for (HashMap.Entry<Student, Integer> studEntry : listStudentAttendance.entrySet()) {
            if (studEntry.getValue() <= 25) {
                System.out.println(studEntry.getKey() + " - Процент посещения -" + studEntry.getValue() + "%\n");
            }
        }
    }

    public void SortIncreaseListAttendance(AttendanceService attendanceService) {
        Map<String, Integer> sortStudentAttendance = new TreeMap<>();
        List<Student> studList = attendanceService.getList();
        List<String> sortArrayListStudent = new ArrayList<>();
        for (Student stud : studList) {
            int attendance = 0;
            for (Attendance at : stud.getAttendance()) {
                if (at.getAttend().equals(true)) {
                    attendance++;
                }
            }
            sortStudentAttendance.put(stud.toString(), attendance);
        }
        for (String stud : sortStudentAttendance.keySet()) {
            sortArrayListStudent.add(stud);
        }
        for (int i = 0; i < sortArrayListStudent.size(); i++) {
            System.out.println(sortArrayListStudent.get(i));
        }

    }
}
