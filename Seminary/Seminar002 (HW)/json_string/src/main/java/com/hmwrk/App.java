package com.hmwrk;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("json.txt"));
        String line1 = sc.nextLine(); // Читаем первую строку
        sc.close();

        System.out.println(line1);
        System.out.println(convertJsonStringToSQL(line1));
    }

    public static String convertJsonStringToSQL(String line) {

        StringBuilder sqlReqStr = new StringBuilder("SELECT * FROM students WHERE");

        line = line.substring(1, line.length() - 1); // Убираем '{','}'
        String[] pairs = line.split(", "); // Разбиваем на пары

        boolean first = true;

        for (int i = 0; i < pairs.length; i++) {

            String[] element = pairs[i].split(":"); // разбиваем каждую пару
            String value = element[1];

            if (!value.equals("\"null\"")) { // Пропуск если null

                String key = element[0].substring(1, element[0].length() - 1);// Убираем '{','}'

                if (first) { // Первую пару соединить без AND
                    first = false;
                } else {
                    sqlReqStr.append(" AND");
                }
                
                sqlReqStr.append(" " + key + " = " + value);
            }

        }
        return sqlReqStr.toString();
    }
}
