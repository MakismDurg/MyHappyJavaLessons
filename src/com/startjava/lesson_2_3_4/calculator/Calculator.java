package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int a;
    private int b;
    private char sign;
    private double result;

    public double calculate(String expression) {
        String[] splittedExpression = expression.split(" ");
        a = Integer.parseInt(splittedExpression[0]);
        sign = splittedExpression[1].charAt(0);
        b = Integer.parseInt(splittedExpression[2]);
        switch (sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = (double) a / b;
                break;
            case '^':
                result = Math.pow(a, b);
                break;
            case '%':
                result = a % b;
                break;
        }
        if (result % 1 == 0) {
            System.out.println((int) result);
        } else {
            System.out.printf("%.3f\n", result);
        }
        return result;
    }
}
