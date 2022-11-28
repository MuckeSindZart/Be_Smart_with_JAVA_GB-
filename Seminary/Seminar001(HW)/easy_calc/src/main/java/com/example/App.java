package com.example;

import java.util.Scanner;

// Реализовать простой калькулятор

public class App {
    public static void main(String[] args) {
        Scanner usrInput = new Scanner(System.in);
        System.out.print("Введите выражение используя (-, +, *, /)" 
                                +" с пробелами после значений, 1 + 1 => ");
        String expression = usrInput.nextLine();
        usrInput.close();

        float result = easy_calc(expression);
        System.out.println(expression + " = " + result);
    }

    public static float easy_calc(String expression) {
        Scanner scanner = new Scanner(expression);

        int num1 = scanner.nextInt();
        String operator = scanner.next();
        int num2 = scanner.nextInt();
        float answer = 0.0f;

        scanner.close();

        if (operator.equals("+"))
            answer = (float) (num1 + num2);

        else if (operator.equals("-"))
            answer = (float) (num1 - num2);

        else if (operator.equals("*"))
            answer = (float) (num1 * num2);

        else if (operator.equals("/"))
            answer = (float) num1 / (float) num2;

        return answer;
    }
}
