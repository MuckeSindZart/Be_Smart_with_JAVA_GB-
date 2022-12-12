package com.hmwrk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {
    private static Map<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {

        int menuSelector = 1;
        String name = "";
        String phone = "";

        while (menuSelector > 0) {
            menuSelector = menu();

            switch (menuSelector) {

                case 1:
                    name = getUsrStringInput("ФИО : ");
                    phone = getUsrStringInput("Номер : ");
                    addPhoneNumber(name, phone);
                    break;

                case 2:
                    name = getUsrStringInput("ФИО : ");
                    List<String> phones = getPhones(name);
                    if (phones.size() == 0) {
                        System.out.println("не найден");
                        System.out.println();

                    } else {
                        System.out.println(phones.toString());
                        System.out.println();
                    }
                    break;

                case 3:
                    for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
                        System.out.println("Имя : " + entry.getKey() + " Номер : " + entry.getValue());
                    }
                    break;

                // case 4:
                //     break;
            }
        }

    }

    public static int menu() {
        System.out.println("1 - Добавить");
        System.out.println("2 - Найти");
        System.out.println("3 - Печать всех");
        // System.out.println("4 - Сохранить файл");
        System.out.println("0 - Выйти");
        return getMenuIntSelector("~>");
        // меню
    }

    public static List<String> getPhones(String name) {
        List<String> result = new ArrayList<>();
        result = phoneBook.getOrDefault(name, result);
        return result;
        // Если имени нет то вернет пусой список
    }

    public static void addPhoneNumber(String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            if (!phoneBook.get(name).contains(phoneNumber)) {
                phoneBook.get(name).add(phoneNumber);
            }
        } else {
            List<String> phoneList = new ArrayList<>();
            phoneList.add(phoneNumber);
            phoneBook.put(name, phoneList);
        }
        // Добавляет Имя и Телефоны
        // Без дублей
    }

    public static int getMenuIntSelector(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        return scanner.nextInt();
        // Для выбора в меню
    }

    public static String getUsrStringInput(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        return scanner.next();
        // Получение строки от пользовател
    }

}
