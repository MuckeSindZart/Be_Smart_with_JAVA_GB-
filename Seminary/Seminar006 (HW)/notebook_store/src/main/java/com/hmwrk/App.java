package com.hmwrk;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class App {


    public static void main(String[] args) {

        HashSet<Notebook> notebooks = new HashSet<>();
        
        notebooks.add(new Notebook(576, 1000, 32, 15, "Linux", "red"));
        notebooks.add(new Notebook(612, 751, 32, 15, "Linux", "red"));
        notebooks.add(new Notebook(100, 256, 32, 14, "Windows11", "black"));
        notebooks.add(new Notebook(101, 256, 16, 14, "Windows10", "black"));
        notebooks.add(new Notebook(201, 256, 64, 14, "Windows11", "silver"));
        notebooks.add(new Notebook(321, 520, 16, 15, "Dos", "black"));
        notebooks.add(new Notebook(712, 751, 64, 15, "Dos", "white"));
        notebooks.add(new Notebook(456, 128, 4, 13, "Basic", "blue"));
        notebooks.add(new Notebook(834, 751, 32, 15, "MacOS", "silver"));
        
        Filter(userRequest(), notebooks);

    }

    public static HashMap<String, String> userRequest() {

        HashMap<String, String> usrRequest = new HashMap<>();

        System.out.println("Введите нужные параметры для поиска или оставте строку пустой :");
        usrRequest.put("os_type", readString("ОС:"));
        usrRequest.put("color", readString("Цвет корпуса:"));
        usrRequest.put("hdd_volume", readString("Объем жесткого диска:"));
        usrRequest.put("ram_volume", readString("Объем оперативной памяти:"));
        usrRequest.put("display_size", readString("Диагональ дисплея:"));

        return usrRequest;
    }

    public static void Filter(HashMap<String, String> usrRequest, HashSet<Notebook> catalog) {

        System.out.println("Параметры поиска =>" + usrRequest);
        Boolean noResults = true;
        for (Notebook pc : catalog) {

            if (usrRequest.get("os_type").equals(pc.getOStype())
                    || usrRequest.get("os_type") == "") {
                if (usrRequest.get("display_size") == ""
                        || pc.getDisplSize() >= Integer.parseInt(usrRequest.get("display_size"))) {
                    if (usrRequest.get("color").equals(pc.getColor())
                            || usrRequest.get("color") == "") {
                        if (usrRequest.get("hdd_volume") == ""
                                || pc.getHDDvolume() >= Integer.parseInt(usrRequest.get("hdd_volume"))) {
                            if (usrRequest.get("ram_volume") == ""
                                    || pc.getRAMvolume() >= Integer.parseInt(usrRequest.get("ram_volume"))) {

                                System.out.println(pc);
                                noResults = false;

                            }
                        }
                    }
                }
            }
        }

        if (noResults) {
            System.out.println("Ничего не найдено");
        }

    }


    public static String readString(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }
    


}
