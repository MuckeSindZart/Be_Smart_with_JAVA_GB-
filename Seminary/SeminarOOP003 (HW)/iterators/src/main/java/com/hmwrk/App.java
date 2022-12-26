package com.hmwrk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Hello world!
 *
 */

public class App {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Alex Kom", 3.2f));
        list.add(new Student("Felix The Cat", 2f));
        list.add(new Student("mr.Bean", 5f));
        list.add(new Student("Kira Knightley", 4.9f));
        list.add(new Student("Max Giesinger", 0.8f));

        StudentGroup studentGroup = new StudentGroup(list);

        System.out.println("\ngroupIterator: ");

        Iterator<Student> iterator = studentGroup.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nlistIterator UP: ");

        ListIterator<Student> listIterator = studentGroup.listIterator(1);
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println("\nlistIterator DOWN: ");

        ListIterator<Student> listIterator1 = studentGroup.listIterator(1);

        while (listIterator1.hasNext()) {
            System.out.println(listIterator1.next());
        }

        System.out.println("\nreversIterator: ");

        Iterator<Student> reverseIterator = studentGroup.reverseIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
