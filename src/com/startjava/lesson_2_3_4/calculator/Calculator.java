package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static double calculate(String mathExpression) {
        String[] elements = mathExpression.split(" ");
        double a = Integer.parseInt(elements[0]);
        char sign = elements[1].charAt(0);
        double b = Integer.parseInt(elements[2]);
        if (a <= 0 || b <= 0) {
            throw new IllegalStateException("Числа должны быть положительными");
        }

        return switch (sign) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '^' -> Math.pow(a, b);
            case '%' -> a % b;
            default -> throw new IllegalStateException("Знак вычисления введён неверно. Используй +, -, *, /, ^, %");
        };
    }
}