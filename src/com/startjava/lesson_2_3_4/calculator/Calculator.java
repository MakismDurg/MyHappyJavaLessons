package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static double calculate(String mathExpression) {
        String[] splittedExpression = mathExpression.split(" ");
        double a = Integer.parseInt(splittedExpression[0]);
        char sign = splittedExpression[1].charAt(0);
        double b = Integer.parseInt(splittedExpression[2]);
        double result = switch (sign) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '^' -> Math.pow(a, b);
            case '%' -> a % b;
            default -> throw new IllegalStateException("Нельзя вводить " + sign);
        };
        return result;
    }
}