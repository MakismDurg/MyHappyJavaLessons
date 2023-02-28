package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] nums = {4, 6, 1, 5, 2, 7, 3};
        int len = nums.length;
        for (int num : nums) {
            System.out.print(num + " ");
        }
        int[] reverseNums = new int[len];

        System.out.println("\nРеверсированный массив:");
        for (int i = 0; i < len; i++) {
            reverseNums[i] = nums[len - (i + 1)];
            System.out.print(reverseNums[i] + " ");
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");
        int[] multipliers = new int[10];
        len = multipliers.length;

        for (int i = 0; i < len; i++) {
            multipliers[i] = i;
        }

        int result = 1;
        for (int i = 1; i < len - 1; i++) {
            result *= i;
            String showResult = multipliers[i] < len - 2 ? i + " * " : i + " = " + result;
            System.out.print(showResult);
        }
        System.out.printf("\n0 и 9 элементы массива: %d, %d", multipliers[0], multipliers [9]);

        System.out.println("\n\n3. Удаление элементов массива");
        double[] deletedNums = new double[15];
        len = deletedNums.length;

        for (int i = 0; i < len; i++) {
            deletedNums[i] = Math.random();
            System.out.printf("% .3f", deletedNums[i]);
            if (i == len / 2) {
                System.out.println();
            }
        }
        System.out.println("\n");

        int zeroedElements = 0;
        for (int i = 0; i < len; i++) {
            if (deletedNums[i] > deletedNums[len / 2]) {
                deletedNums[i] = 0;
                zeroedElements++;
            }
            System.out.printf("% .3f", deletedNums[i]);
            if (i == len / 2) {
                System.out.println();
            }
        }
        System.out.println("\nКоличество обнулённых ячеек: " + zeroedElements);

        System.out.println("\n\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] letters = new char[26];
        len = letters.length;
        for (int i = 0; i < len; i++) {
            letters[i] = (char) (i + 'A');
        }

        String letter = "";
        for (int i = len - 1; i >= 0; i--) {
            letter += letters[i];
            System.out.println(letter);
        }

        System.out.println("\n5. Генерация уникальных чисел");
        int[] uniqueNums = new int[30];
        len = uniqueNums.length;
        for (int i = 0; i < len; i++) {
            uniqueNums[i] = (int) (Math.random() * 40 + 60);
            for (int j = 0; j < i; j++) {
                if (uniqueNums[j] == uniqueNums[i]) {
                    uniqueNums[i] = (int) (Math.random() * 40 + 60);
                    j = -1;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (uniqueNums[i] > uniqueNums[j]) {
                int temp = uniqueNums[j];
                uniqueNums[j] = uniqueNums[i];
                uniqueNums[i] = temp;
                }
            }
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.printf("%3d", uniqueNums[i]);
        }

        System.out.println("\n\n6. Сдвиг элементов массива");
        String[] strings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        len = 0;

        for (int i = 0; i < strings.length; i++) {
            if (!strings[i].isBlank()) {
               len++;
            }
        }
        String[] copyStrings = new String[len];
        System.arraycopy(strings,1, copyStrings, 0, 1);
        System.arraycopy(strings,3, copyStrings, 1, 3);
        System.arraycopy(strings,7, copyStrings, 4, 3);

        System.out.println("Изначальный массив:\n");
        for (String string: strings) {
            System.out.print(string + " ");
        }

        System.out.println("Массив с копированным строками:\n");
        for (String string: copyStrings) {
            System.out.print(string + " ");
        }
    }
}
