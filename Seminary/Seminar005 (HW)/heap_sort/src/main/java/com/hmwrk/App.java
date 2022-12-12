package com.hmwrk;

import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        int[] checkArray = randomArray(10, -10, 10);
        System.out.println("Было : ");
        System.out.println(Arrays.toString(checkArray));
        System.out.println("Стало : ");
        System.out.println(heapSort(checkArray));

    }

    public static int[] randomArray(int size, int from, int to) {
        int[] arr = new int[size];
        Random rndm = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rndm.nextInt(from, to);
        }

        return arr;
    }

    public static String heapSort(int[] array) {
        int temp;
        int length = array.length;
        int size = length - 1;

        for (int i = (length / 2); i >= 0; i--) {
            heapify(array, i, size);
        }

        for (int i = size; i >= 0; i--) {
            temp = array[0];
            array[0] = array[size];
            array[size] = temp;
            size--;
            heapify(array, 0, size);
        }

        return Arrays.toString(array);
    }

    public static void heapify(int[] array, int top, int heapSize) {
        int left = 2 * top + 1;
        int right = 2 * top + 2;
        int largestElement;

        if (left <= heapSize && array[left] > array[top]) {
            largestElement = left;
        } else {
            largestElement = top;
        }

        if (right <= heapSize && array[right] > array[largestElement]) {
            largestElement = right;
        }

        if (largestElement != top) {
            int temp = array[top];
            array[top] = array[largestElement];
            array[largestElement] = temp;
            heapify(array, largestElement, heapSize);
        }
    }
}
