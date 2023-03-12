package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        /*TODO
         *  вывод значений массива дублируется - вынеси его в отдельный метод
         */
        System.out.println("1. Реверс значений массива");
        int[] reversedNums = {4, 6, 1, 5, 2, 7, 3};
        int len = reversedNums.length;
        for (int num : reversedNums) {
            System.out.print(num + " ");
        }

        System.out.println("\nРеверсивный массив:");
        int arrayMiddle = len / 2;
        for (int i = 0; i < arrayMiddle; i++) {
            int numSaver = reversedNums[i];
            reversedNums[i] = reversedNums[len - (i + 1)];
            reversedNums[len - (i + 1)] = numSaver;
        }

        for (int num : reversedNums) {
            System.out.print(num + " ");
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
            System.out.print(i);
            System.out.print(multipliers[i] < len - 2 ? " * " : " = " + result);
        }
        System.out.printf("\n0 и 9 элементы массива: %d, %d", multipliers[0], multipliers[9]);

        System.out.println("\n\n3. Удаление элементов массива");
        double[] randomNums = new double[15];
        len = randomNums.length;

        for (int i = 0; i < len; i++) {
            randomNums[i] = Math.random();
            System.out.printf("% .3f", randomNums[i]);
            if (i == arrayMiddle) {
                System.out.println();
            }
        }
        System.out.println("\n");

        int zeroedElements = 0;
        for (int i = 0; i < len; i++) {
            if (randomNums[i] > randomNums[arrayMiddle]) {
                randomNums[i] = 0;
                zeroedElements++;
            }
            System.out.printf("% .3f", randomNums[i]);
            if (i == arrayMiddle) {
                System.out.println();
            }
        }
        System.out.println("\nКоличество обнулённых ячеек: " + zeroedElements);

        System.out.println("\n\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        len = alphabet.length;
        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) (i + 'A');
        }

        String stringSaver = "";
        for (int i = len - 1; i >= 0; i--) {
            System.out.println(stringSaver += alphabet[i]);
        }

        System.out.println("\n5. Генерация уникальных чисел");
        int[] uniqueNums = new int[30];
        len = uniqueNums.length;
        for (int i = 0; i < len; i++) {
            int generatedNum = (int) (Math.random() * 40 + 60);
            boolean numEqual = false;
            for (int j = 0; j < i; j++) {
                if (uniqueNums[j] == generatedNum) {
                    numEqual = true;
                    break;
                }
            }
            uniqueNums[i] = generatedNum;
            if (numEqual) {
                i--;
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
        String[] strings = {"   ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        len = strings.length;
        int lenCopy = 0;
        for (int i = 0; i < len; i++) {
            if (!strings[i].isBlank()) {
                lenCopy++;
            }
        }

        String[] copyStrings = new String[lenCopy];
        int srcPos = 0;
        for (int i = 0; i < len; i++) {
            if (!strings[i].isBlank()) {
                if (i == 0 || strings[i - 1].isBlank()) {
                    srcPos = i;
                }
                if (i == len - 1 || strings[i + 1].isBlank()) {
                    int length = i - srcPos + 1;
                    for (int j = 0; j < lenCopy; j++) {
                        if (copyStrings[j] == null) {
                            int destPos = j;
                            System.arraycopy(strings, srcPos, copyStrings, destPos, length);
                            break;
                        }
                    }
                }
            }
        }

        System.out.println("Изначальный массив:");
        for (String string : strings) {
            System.out.print(string + " ");
        }

        System.out.println("\nМассив с копированным строками:");
        for (String string : copyStrings) {
            System.out.print(string + " ");
        }
    }
}
