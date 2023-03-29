package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("Давайте что-нибудь посчитаем");
        Scanner console = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String option;
        do {
            System.out.print("Введите математическое выражение: ");
            String mathExpression = console.nextLine();
            System.out.print("Результат вычислений = ");
            double result = calculator.calculate(mathExpression);
            if (result % 1 == 0) {
                System.out.println((int) result);
            } else {
                System.out.printf("%.3f\n", result);
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            option = console.nextLine();
            if (!option.equals("yes")) {
                option = checkAnswer(option);
            }
        } while (option.equals("yes"));
        System.out.println("Расчёты завершены.");
    }

    public static String checkAnswer(String option) {
        if (option.equals("no") || option.equals("yes")) {
            return option;
        } else {
            System.out.print("Некорректный ответ. Хотите продолжить вычисления? [yes/no]\n");
            Scanner console = new Scanner(System.in);
            option = console.nextLine();
            return checkAnswer(option);
        }

    }
}