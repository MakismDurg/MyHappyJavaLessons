package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int a;
    private int b;
    private char sign;
    private double result;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public double getResult() {
        return result;
    }

    public void calculate() {
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
                result = (double) a / 100 * b;
                break;
        }
    }
}