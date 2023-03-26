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
            String[] splittedExpression = mathExpression.split(" ");
            calculator.setA(Integer.parseInt(splittedExpression[0]));
            calculator.setSign(splittedExpression[1].charAt(0));
            calculator.setB(Integer.parseInt(splittedExpression[2]));
            calculator.calculate();
            System.out.print("Результат вычислений = ");
            double result = calculator.getResult();
            if (result % 1 == 0) {
                System.out.println((int) result);
            } else {
                System.out.printf("%.3f\n", result);
            }

            System.out.println("Хотите продолжить вычисления? [yes/no]");
            option = console.nextLine();
            if (!option.equals("yes")) {
                checkAnswer(option);
            }
        } while (option.equals("yes"));
        System.out.println("Расчёты завершены.");
    }

    public static void checkAnswer(String option) {
        Scanner console = new Scanner(System.in);
        while (!option.equals("no")) {
            System.out.print("Некорректный ответ. Хотите продолжить вычисления? [yes/no]\n");
            option = console.next();
        }
    }
}