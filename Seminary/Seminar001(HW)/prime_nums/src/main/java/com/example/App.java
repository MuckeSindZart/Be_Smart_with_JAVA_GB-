package com.example;


public class App {
    public static void main(String[] args) {

        for (int i = 2; i <= 1000; i++) {
            boolean checkPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    checkPrime = false;
                    break;
                }
            }
            if (checkPrime) {
                System.out.print(i + ", ");
            }
        }
    }
}
