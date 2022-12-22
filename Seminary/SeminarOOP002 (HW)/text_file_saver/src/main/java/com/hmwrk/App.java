package com.hmwrk;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<Student> listStudents = new ArrayList<>();

        listStudents.add(new Student("Some_Name", 5.8f));
        listStudents.add(new Student("Some_Name1", 4));
        listStudents.add(new Student("Some_Name2", 32));
        listStudents.add(new Student("Some_Name5", 63.12f));
        listStudents.add(new Student("Some_Name17", 13.12f));

        WriteToJson jsonList = new WriteToJson(listStudents);
        jsonList.saveFile();

        System.out.println();

        WriterToXML xmlList = new WriterToXML(listStudents);
        xmlList.saveFile();

        System.out.println();

        WriterToTXT txtList = new WriterToTXT(listStudents);
        txtList.saveFile();

    }
}
