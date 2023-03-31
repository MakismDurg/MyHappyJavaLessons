package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(String mathExpression) {
        String[] splittedExpression = mathExpression.split(" ");
        double a = Integer.parseInt(splittedExpression[0]);
        char sign = splittedExpression[1].charAt(0);
        double b = Integer.parseInt(splittedExpression[2]);
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