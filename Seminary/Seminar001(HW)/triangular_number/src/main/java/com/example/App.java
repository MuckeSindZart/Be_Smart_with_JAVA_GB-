// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)

// ------------------------------------ //


package com.example;

import java.math.BigInteger;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int usrNumber = input.nextInt();
        input.close();

        System.out.println();
        System.out.println(getFactorial(usrNumber));
        System.out.println(getSumTriangularNumbers(usrNumber));
    }

    public static BigInteger getFactorial(int f) {
        BigInteger result = new BigInteger("1");

        for (int i = 1; i <= f; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }

    public static int getSumTriangularNumbers(int f) {
        int result = 1;

        for (int i = 1; i <= f; i++) {
            result = result + i;
        }

        return result;
    }
}
