package com.hmwrk;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        List<Integer> list = getRandomArray(10, 0, 10);

        System.out.println(list);
        removeEvenNumber(list);
        System.out.println(list);

    }

    public static List<Integer> getRandomArray(int size, int from, int to) {

        Random rndm = new Random();
        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < size; i++) {
            result.add(rndm.nextInt(from, to));
        }

        return result;
    }

    public static void removeEvenNumber(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }

        }
    }
}
