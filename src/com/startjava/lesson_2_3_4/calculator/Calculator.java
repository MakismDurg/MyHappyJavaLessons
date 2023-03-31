package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
    private double a;
    private double b;
    private char sign;

    private double res;

    public double calculate() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите математическое выражение: ");
        String mathExpression = console.nextLine();
        System.out.print("Результат вычислений = ");
        String[] splittedExpression = mathExpression.split(" ");
        a = Integer.parseInt(splittedExpression[0]);
        sign = splittedExpression[1].charAt(0);
        b = Integer.parseInt(splittedExpression[2]);
        switch (sign) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '^':
                return Math.pow(a, b);
            case '%':
                return a % b;
            default:
                return 0;
        }
    }
}