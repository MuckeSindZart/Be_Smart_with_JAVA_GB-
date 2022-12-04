package com.hmwrk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        List<Integer> list = getRandomArray(10, 0, 10);

        System.out.println(list);
        minMaxAvrg(list);

    }

    public static List<Integer> getRandomArray(int size, int from, int to) {

        Random rndm = new Random();
        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < size; i++) {
            result.add(rndm.nextInt(from, to));
        }

        return result;
    }

    public static void minMaxAvrg(List<Integer> list) {

        System.out.println("MIN = " + Collections.min(list));
        System.out.println("MAX = " + Collections.max(list));

        double sum = 0;

        for (int i : list) {
            sum += i;
        }
        double avg = sum / list.size();

        System.out.println("AVG = " + avg);

    }
}