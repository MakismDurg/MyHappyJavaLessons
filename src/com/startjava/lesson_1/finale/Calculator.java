package com.startjava.lesson_1.finale;

public class Calculator {
    public static void main(String[] args) {
        int a = 3;
        int b =  4;
        char sign = '^';
        double result = 0;
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = (double) a / b;
        } else if (sign == '^') {
            result = a;
            for (int exponent = b; exponent > 1; exponent--) {
                result *= a;
            }
        }
        if (sign == '%') {
            result = a % b;
        }
    
        System.out.printf("%d %c %d = ", a, sign, b);
        System.out.println(result % 1);
    }
}