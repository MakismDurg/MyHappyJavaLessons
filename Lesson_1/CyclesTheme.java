public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int i = -10;
        int even = 0;
        int uneven = 0;
        do {
            if (i % 2 == 0) {
                even += i;
            } else {
                uneven += i;
            }
            i++;
        } while (i <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + even + ", а нечетных = " + uneven);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = 0;
        int min = 0;
        if (num1 > num2 && num1 > num3) {
            max = num1;
            if (num2 < num3) {
                min = num2;
            } else {
                min = num3;
            }
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
            if (num1 < num3) {
                min = num1;
            } else {
                min = num3;
            }
        } else {
            max = num3;
            if (num2 < num1) {
                min = num2;
            } else {
                min = num1;
            }
        }
        for (int j = max - 1; j > min; j--) {
            System.out.print(j + " ");
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int needNum = 0;
        int summOfNum = 0;
        System.out.print("Реверсивное число: ");
        while (num > 0) {
            needNum = num % 10;
            System.out.print(needNum);
            num /= 10;
            summOfNum += needNum;
        }
        System.out.println("\nСумма цифр этого числа: " + summOfNum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int counter = 0;
        for (i = 1; i < 24; i += 2) {
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

        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        num = 3242592;
        int numSaver = num;
        counter = 0;
        while (num != 0) {
            int seekerOfNum = num % 10;
            if (seekerOfNum == 2) {
                counter++;
            }
            num /= 10;
        }
        System.out.printf("Число %d содержит %d", numSaver, counter);
        if (counter / 2 == 0) {
            System.out.printf(" (чётное) количество двоек\n");
        } else {
            System.out.printf(" (нечётное) количество двоек\n");
        }
        System.out.println("\n6. Отображение фигур в консоли");
        System.out.println("Квадрат\n");
        for (i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("Прямоугольный треугольник\n");
        while (i > 0) {
            int j = i;
            while (j > 0) {
                System.out.print('#');
                j--;
            }
            System.out.println();
            i--;
        }
        System.out.println("Равнобедренный треугольник\n");
        int limit = 5;
        int centralLine = limit / 2;
        do {
            int j = 0;
            if (i > centralLine) {
                j = limit - i;
                do {
                    System.out.print("$");
                    j--;
                } while (j > 0);
            } else {
                do {
                    System.out.print("$");
                    j++;
                } while (j <= i);
            }
            System.out.println();
            i++;
        } while (i < limit);

        System.out.println("\n7. Отображение ASCII-символов.");
        System.out.printf("%5s%5s\n", "Dec", "Char");
        for (char ch = 0; ch < 123; ch++) {
            if (ch < 48 && ch % 2 != 0) {
                System.out.printf("%5d%5c\n", (int)ch, ch);
            }
            if (ch > 96 && ch % 2 == 0) {
                System.out.printf("%5d%5c\n", (int)ch, ch);
            }
        }
        System.out.println("\n8. Проверка, является ли число палиндромом.");
        num = 1234321;
        int copyOfNum = num;
        int reverseNum = 0;
        while (copyOfNum > 0) {
            int temp = copyOfNum % 10;
            reverseNum = reverseNum * 10 + temp;
            copyOfNum /= 10;
        }
        if (num == reverseNum) {
            System.out.printf("Число %d является палиндром", num);
        } else {
            System.out.printf("Число %d не палиндром", num);
        }

        System.out.println("\n\n9. Определение, является ли число счастливым");
        num = 123606;
        copyOfNum = num;
        int firstSum = 0;
        int secondSum = 0;
        int firstHalfOfNum = num % 1000;
        int secondHalfOfNum = num / 1000;
        for (int k = 0; k < 6; k++) {
            int temp = copyOfNum % 10;
            copyOfNum /= 10;
            if (k < 3) {
                firstSum = firstSum + temp;
            }
            if (k >= 3) {
                secondSum = secondSum + temp;
            }
        }
        System.out.printf("Сумма цифр %d = %d\nСумма цифр %d = %d\n",
                firstHalfOfNum, firstSum, secondHalfOfNum, secondSum);
        if (firstSum == secondSum) {
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
            for (int j = 2; j < 10; j++ ) {
                int result = i * j;
                System.out.printf("%3d", result);
                if (i == 1 && j == 9) {
                    System.out.print("\n———┼————————————————————————");
                }
            }
            System.out.println();
        }
    }
}