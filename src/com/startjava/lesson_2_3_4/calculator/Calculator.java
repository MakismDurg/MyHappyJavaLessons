package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private double a;
    private double b;
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
                result = a / b;
                break;
            case '^':
                result = Math.pow(a, b);
                break;
            case '%':
                result = a % b;
        }
        return result;
    }
}
