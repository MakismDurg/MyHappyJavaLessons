package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("Давайте что-нибудь посчитаем");
        Scanner console = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String option;
        do {
            System.out.println("Введите первое число: ");
            calculator.setA(console.nextInt());
            System.out.println("Введите знак вычисления: ");
            calculator.setSign(console.next().charAt(0));
            System.out.println("Введите второе число: ");
            calculator.setB(console.nextInt());

            calculator.calculate();

            System.out.println("Результат вычислений =");
            double result = calculator.getResult();
            if (result % 1 == 0) {
                System.out.println((int) result);
            } else {
                System.out.println(result);
            }
            
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            option = console.next();
            while (!option.equals("yes")) {
                if (option.equals("no")) {
                    break;
                }
                System.out.print("Некорректный ответ. Хотите продолжить вычисления? [yes/no]\n");
                option = console.next();
            }
        } while (option.equals("yes"));
        System.out.println("Расчёты завершены.");
    }
}