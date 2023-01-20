package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int evenNum = 0;
        int oddNum = 0;
        do {
            if (counter % 2 == 0) {
                evenNum += counter;
            } else {
                oddNum += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + evenNum + ", а нечетных = " + oddNum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = -10;
        int num2 = -5;
        int num3 = -1;
        int max = num1;
        int min = num3;
        if (num2 > num1) {
            max = num2;
        }
        if (num3 > num2) {
            max = num3;
        }
        if (num2 < num3) {
            min = num2;
        }
        if (num1 < num2) {
            min = num1;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sumOfDigits = 0;
        System.out.print("Реверсивное число: ");
        while (num > 0) {
            int digit = num % 10;
            System.out.print(digit);
            num /= 10;
            sumOfDigits += digit;
        }
        System.out.println("\nСумма цифр этого числа: " + sumOfDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        counter = 0;
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%4d",i);
            counter++;
            if (counter == 5) {
                System.out.println();
                counter = 0;
            }
        }
        while (counter != 5) {
            System.out.printf("%4d", 0);
            counter++;
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        num = 3242592;
        int copyNum = num;
        int countTwos = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit == 2) {
                countTwos++;
            }
            num /= 10;
        }
        System.out.printf("Число %d содержит %d", copyNum, countTwos);
        if (countTwos / 2 == 0) {
            System.out.println(" (чётное) количество двоек\n");
        } else {
            System.out.println(" (нечётное) количество двоек\n");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        System.out.println("\nКвадрат\n");
        int i = 0;
        for (i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("\nПрямоугольный треугольник\n");
        while (i > 0) {
            int j = i;
            while (j > 0) {
                System.out.print('#');
                j--;
            }
            System.out.println();
            i--;
        }

        System.out.println("\nРавнобедренный треугольник\n");
        int j = 0;
        int triangleBase = 5;
        int baseCenter = triangleBase / 2;
        int reducer = 1;
        System.out.println("\nРавнобедренный треугольник\n");
        do {
            if (i > baseCenter) {
                j = baseCenter - reducer;
                reducer++;
            } else {
                j = i;
            }
            do {
                System.out.print('#');
                j--;
            } while (j >= 0);

            System.out.println();
            i++;
        } while (i < triangleBase);

        System.out.println("\n7. Отображение ASCII-символов.");
        System.out.printf("%5s%5s\n", "Dec", "Char");
        for (char ch = 0; ch < 123; ch++) {
            int decCode = ch;
            if (ch < 48 && ch % 2 != 0) {
                System.out.printf("%5d%5c\n", decCode, ch);
            }
            if (ch > 96 && ch % 2 == 0) {
                System.out.printf("%5d%5c\n", decCode, ch);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом.");
        num = 1234321;
        copyNum = num;
        int reverseNum = 0;
        while (copyNum > 0) {
            int digit = copyNum % 10;
            reverseNum = reverseNum * 10 + digit;
            copyNum /= 10;
        }
        if (num == reverseNum) {
            System.out.printf("Число %d является палиндром", num);
        } else {
            System.out.printf("Число %d не палиндром", num);
        }

        System.out.println("\n\n9. Определение, является ли число счастливым");
        num = 123606;
        int sumRightPart = 0;
        int sumLeftPart = 0;
        int leftPart = num / 1000;
        int rightPart = num % 1000;
        int copyLeftPart = leftPart;
        int copyRightPart = rightPart;
        for (i = 0; i < 3; i++) {
            int digit = leftPart % 10;
            sumLeftPart += digit;
            leftPart /= 10;
            digit = rightPart % 10;
            sumRightPart += digit;
            rightPart /= 10;
        }
        System.out.printf("Сумма цифр %d = %d\nСумма цифр %d = %d\n",
                copyRightPart, sumRightPart, copyLeftPart, sumLeftPart);
        if (sumRightPart == sumLeftPart) {
            System.out.println("Число является счастливым");
        } else {
            System.out.println("Это несчастливое число. ¯\\_(ツ)_/¯");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");
        for (i = 1; i < 10; i++) {
            if (i == 1) {
                System.out.printf("%3c│", ' ');
            } else {
                System.out.printf("%3d│", i);
            }
            for (j = 2; j < 10; j++ ) {
                System.out.printf("%3d",  i * j);
                if (i == 1 && j == 9) {
                    System.out.print("\n———┼————————————————————————");
                }
            }
            System.out.println();
        }
    }
}