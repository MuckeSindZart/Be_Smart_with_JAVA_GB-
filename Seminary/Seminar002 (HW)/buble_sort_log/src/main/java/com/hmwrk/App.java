package com.hmwrk;

import java.io.IOException;
import java.util.logging.*;

public class App {

    public static void main(String[] args) {

        int[] array = { 1, 5, 4, 12, 1, 3, 4, -1 };

        System.out.print("Было: ");
        printArrayInt(array);

        bubleSort(array);

        System.out.print("Стало: ");
        printArrayInt(array);

    }

 
    public static void bubleSort(int[] array) {
        Logger logger = Logger.getLogger(App.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        FileHandler fh;
        try {
            fh = new FileHandler(System.getProperty("user.dir").concat("/bubleSort.log"));
            logger.addHandler(fh);
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        for (int i = array.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (array[j] > array[j + 1]) {
                    logger.info(
                            "Поменяли элементы: " + array[j] + "[" + j + "] и "
                                    + array[j + 1] + "[" + (j + 1) + "]");
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }

    }

    public static void printArrayInt(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length - 1; i++) {

            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1]);

        System.out.println("}");
    }

}
