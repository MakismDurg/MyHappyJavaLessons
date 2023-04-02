package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

import static com.startjava.lesson_2_3_4.calculator.Calculator.calculate;
/*TODO
        используйте новый switch expression*/
public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Давайте что-нибудь посчитаем");
        String option = "yes";
        do {
            if (option.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                String mathExpression = console.nextLine();
                System.out.print("Результат вычислений = ");
                double result = calculate(mathExpression);
                outputResult(result);
            } else {
                System.out.println("Вариантов ответа только два");
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            option = console.nextLine();
        } while (!option.equals("no"));
        System.out.println("Расчёты завершены.");
    }

    public static void outputResult(double result) {
        System.out.printf((result % 1 == 0 ? "%d" : "%,.3f") + "\n", (int)result, result);
    }
}