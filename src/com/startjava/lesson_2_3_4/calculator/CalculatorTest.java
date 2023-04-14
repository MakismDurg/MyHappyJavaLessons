package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Давайте что-нибудь посчитаем");
        String option = "yes";
        do {
            try {
                if (option.equals("yes")) {
                    System.out.print("Введите математическое выражение: ");
                    String mathExpression = console.nextLine();
                    double result = Calculator.calculate(mathExpression);
                    print(result);
                } else {
                    System.out.println("Вариантов ответа только два");
                }
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                option = console.nextLine();
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            } catch (RuntimeException e) {
                System.out.println("Требуется вводить целые числа и знак вычисления через пробел");
            }
        } while (!option.equals("no"));
        System.out.println("Расчёты завершены.");
    }

    public static void print(double result) {
        System.out.print("Результат вычислений = ");
        System.out.printf((result % 1 != 0 ? "%.3f" : "%.0f") + "\n", result);
    }
}