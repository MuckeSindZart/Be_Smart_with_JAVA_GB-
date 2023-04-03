package com.hmwrk;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App {

    private static final Random random = new Random();

    public static void main(String[] args) {

        System.out.println();

        int[] array = new int[30];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101) - 50;
            System.out.print(array[i] + " ");
        } // new array + print

        System.out.println();
        System.out.println();

        heapSort.sort(array); // sort

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        } // print sort array

        System.out.println();
    }


    // -----------------------------------------------------------------//

    public static class heapSort {

        public static void sort(int[] array) {
            int len = array.length;

            for (int i = len / 2 - 1; i >= 0; i--) {
                buildHeap(array, len, i);
            }

            for (int i = len - 1; i >= 0; i--) {
                swap(array, 0, i);
                buildHeap(array, i, 0);
            }
        }

        public static void buildHeap(int[] array, int heapLen, int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int max = i;

            if (left < heapLen && array[left] > array[max]) {
                max = left;
            }

            if (right < heapLen && array[right] > array[max]) {
                max = right;
            }

            if (max != i) {
                swap(array, i, max);
                buildHeap(array, heapLen, max);
            }
        }

        private static void swap(int[] array, int a, int b) {
            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }
    }
}
