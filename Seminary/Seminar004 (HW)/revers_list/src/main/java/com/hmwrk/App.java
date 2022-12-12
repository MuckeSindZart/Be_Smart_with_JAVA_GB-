package com.hmwrk;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        LinkedList<Integer> lList = getRandomArray(10, 0, 10);

        System.out.println(lList);
        System.out.println(reverseLinkedList(lList));

    }

    public static LinkedList<Integer> getRandomArray(int size, int from, int to) {

        Random rndm = new Random();
        LinkedList<Integer> result = new LinkedList<Integer>();
        for (int i = 0; i < size; i++) {
            result.add(rndm.nextInt(from, to));
        }
        return result;

    }

    public static List<Integer> reverseLinkedList(LinkedList<Integer> list) {
        // Collections.reverse(list);

        List<Integer> temp = new LinkedList<Integer>(list);
        int j = 0;
        for (int i = temp.size() - 1; i >= 0; i--) {
            list.set(j, temp.get(i));
            j++;
        }
        return list;

    }
}
