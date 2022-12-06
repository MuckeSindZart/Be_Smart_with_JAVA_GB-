package com.hmwrk;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<String> queueList = new LinkedList<String>();

        enqueue(queueList, "test1");
        enqueue(queueList, "Вот");
        enqueue(queueList, "Так");
        enqueue(queueList, "Вот");
        System.out.println(queueList);

        System.out.println("Первый в очереди: " + first(queueList));

        System.out.println("Удалили Первого в очереди");
        dequeue(queueList);
        System.out.println(queueList);

        System.out.println("Первый в очереди: " + first(queueList));
        System.err.println(queueList);

    }

    public static LinkedList<String> enqueue(LinkedList<String> list, String str) {
        list.addLast(str);
        return list;
    }

    public static LinkedList<String> dequeue(LinkedList<String> list) {
        list.removeFirst();
        return list;
    }

    public static String first(LinkedList<String> list) {
        return list.getFirst();
    }
}
