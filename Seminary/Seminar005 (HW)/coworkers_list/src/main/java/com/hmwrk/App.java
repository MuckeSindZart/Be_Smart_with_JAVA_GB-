package com.hmwrk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        
        List<String> coworkers = new ArrayList<>();
        String[] names = { "Феликс", "Петр", "Ирма", "Юлия", "Анна" };
        
        Random rndm = new Random();
        for (int i = 0; i < 20; i++) {
            coworkers.add(names[rndm.nextInt(0, 5)]);
        }

        System.out.println(coworkers);
        System.out.println(popularNames(coworkers));
        System.out.println(sortByValue(popularNames(coworkers)));

    }

    public static HashMap<String, Integer> popularNames(List<String> coworkers) {

        HashMap<String, Integer> result = new HashMap<>();

        for (int i = 0; i < coworkers.size(); i++) {
            if (result.containsKey(coworkers.get(i))) {
                int temp = result.get(coworkers.get(i));
                temp++;
                result.put(coworkers.get(i), temp);
            } else {
                result.put(coworkers.get(i), 1);
            }
        }
        return result;
    }


    private static Map<String, Integer> sortByValue(HashMap<String, Integer> unsortMap) {

        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o2,
                    Map.Entry<String, Integer> o1) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

}
