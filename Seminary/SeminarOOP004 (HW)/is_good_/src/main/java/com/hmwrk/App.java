package com.hmwrk;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    private static <T> List<T> filter(Iterable<T> array, IsGood<T> isGood) {
        List<T> newArray = new ArrayList<>();
        for (T val : array) {
            if (isGood.isGood(val)) {
                newArray.add(val);
            }
        }
        return newArray;
    }

    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>();

        numList.add(-13);
        numList.add(20);
        numList.add(-60);
        numList.add(-19);
        numList.add(19);
        numList.add(-3);
        numList.add(7);

        System.out.print("Было=>");
        System.out.println(numList);

        System.out.print("Стало isEven=>");
        List<Integer> afterIsEven = filter(numList, new IsEven());
        System.out.println(afterIsEven);

        System.out.print("Стало isPositive=>");
        List<Integer> afterIsPos = filter(numList, new IsPositive());
        System.out.println(afterIsPos);

        System.out.println();

        List<String> strList = new ArrayList<>();
        strList.add("Артикль");
        strList.add("ABC");
        strList.add("Vogel");
        strList.add("Auto");
        strList.add("auf");
        strList.add("Kino");
        strList.add("Best");
        strList.add("123");
        strList.add("SouthWest");
        strList.add("SevenEleven");

        System.out.print("Было=>");
        System.out.println(strList);

        System.out.print("Стало BeginWithA=>");
        List<String> afterWithA = filter(strList, new BeginsWithA());
        System.out.println(afterWithA);

        System.out.print("Стало BeginWith=>");
        List<String> afterWith = filter(strList, new BeginsWith("Sou"));
        System.out.println(afterWith);

    }

}
