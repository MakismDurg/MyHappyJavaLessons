package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private double a;
    private double b;
    private char sign;

    public double calculate(String expression) {
        String[] splittedExpression = expression.split(" ");
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
        }
        if (result % 1 == 0) {
            System.out.println((int) result);
        } else {
            System.out.printf("%.3f\n", result);
        }

    }
}
