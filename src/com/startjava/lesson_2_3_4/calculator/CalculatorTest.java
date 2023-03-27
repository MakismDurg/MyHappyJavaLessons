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
            calculator.calculate(mathExpression);
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            option = console.nextLine();
            if (!option.equals("yes")) {
                option = checkAnswer(option);
            }
        } while (option.equals("yes"));
        System.out.println("Расчёты завершены.");
    }

    public static String checkAnswer(String option) {
        Scanner console = new Scanner(System.in);
        while (!option.equals("no") && !option.equals("yes")) {
            System.out.print("Некорректный ответ. Хотите продолжить вычисления? [yes/no]\n");
            option = console.nextLine();
        }
        return option;
    }
}