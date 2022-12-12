package com.hmwrk;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        List<Integer> list = getRandomArray(10, 0, 100);

        System.out.println(list);
        System.out.println(sorted(list));

    }

    public static List<Integer> getRandomArray(int size, int from, int to) {
        Random rndm = new Random();
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            result.add(rndm.nextInt(from, to));
        }
        return result;
    }

    public static List<Integer> sorted(List<Integer> list) {

        if (list.size() < 2) {
            return list;
        }

        int mid = list.size() / 2;

        return merged(
                sorted(list.subList(0, mid)),
                sorted(list.subList(mid, list.size())));
    }

    private static List<Integer> merged(List<Integer> left, List<Integer> right) {

        int leftIndex = 0;
        int rightIndex = 0;
        List<Integer> merged = new ArrayList<Integer>();

        while (leftIndex < left.size() && rightIndex < right.size()) {

            if (left.get(leftIndex) < right.get(rightIndex)) {
                merged.add(left.get(leftIndex++));
            } else {
                merged.add(right.get(rightIndex++));
            }

        }

        merged.addAll(left.subList(leftIndex, left.size()));
        merged.addAll(right.subList(rightIndex, right.size()));

        return merged;
    }
}