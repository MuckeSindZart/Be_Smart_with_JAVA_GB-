package com.hmwrk;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("arrayStrings.txt"));
        String line1 = sc.nextLine(); // Читаем первую строку
        sc.close();

        System.out.println(line1);
        printArrayStr(stringsConvert(line1));
    }

    public static String[] stringsConvert(String line) {

        line = line.substring(1, line.length() - 1); // убираем "[","]"
        String[] entries = line.split(", "); // разделяем на элементы
        String[] result = new String[entries.length];

        for (int i = 0; i < entries.length; i++) {
            entries[i] = entries[i].substring(1, entries[i].length() - 1); // убираем "{","}"
            String[] pairs = entries[i].split(","); // разделяем на пары

            StringBuilder student = new StringBuilder("Студент ");
            StringBuilder grade = new StringBuilder(" получил ");
            StringBuilder workClass = new StringBuilder(" по предмету ");

            for (int j = 0; j < pairs.length; j++) {
                String[] keyValue = pairs[j].split(":");

                if (keyValue[0].equals("\"фамилия\"")) {
                    student.append(keyValue[1].substring(1, keyValue[1].length() - 1));
                } else if (keyValue[0].equals("\"оценка\"")) {
                    grade.append(keyValue[1].substring(1, keyValue[1].length() - 1));
                } else if (keyValue[0].equals("\"предмет\"")) {
                    workClass.append(keyValue[1].substring(1, keyValue[1].length() - 1));
                }
            }

            result[i] = student.append(grade + " " + workClass+ ".").toString();
        }

        return result;
    }

    public static void printArrayStr(String[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length - 1; i++) {

            System.out.println(array[i] + ", ");
        }
        System.out.print(array[array.length - 1]);

        System.out.println("}");
    }
}
