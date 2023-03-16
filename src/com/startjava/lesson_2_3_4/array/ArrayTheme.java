package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] numsForReverse = {4, 6, 1, 5, 2, 7, 3};
        int len = numsForReverse.length;
        showInts(numsForReverse);

        System.out.println("\nРеверсивный массив:");
        int arrayMiddle = len / 2;
        for (int i = 0; i < arrayMiddle; i++) {
            len--;
            int temp = numsForReverse[i];
            numsForReverse[i] = numsForReverse[len];
            numsForReverse[len] = temp;
        }
        showInts(numsForReverse);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        int[] multipliers = new int[10];
        len = multipliers.length;
        for (int i = 0; i < len; i++) {
            multipliers[i] = i;
        }

        int result = 1;
        for (int i = 1; i < len - 1; i++) {
            result *= i;
            String showResult = multipliers[i] < len - 2 ? " * " : " = " + result;
            System.out.print(i + showResult);
        }
        System.out.printf("\n0 и 9 элементы массива: %d, %d", multipliers[0], multipliers[9]);

        System.out.println("\n\n3. Удаление элементов массива");
        double[] randomNums = new double[15];
        len = randomNums.length;
        arrayMiddle = len / 2;
        for (int i = 0; i < len; i++) {
            randomNums[i] = Math.random();
            rangeBreak(randomNums, i, arrayMiddle);
        }
        System.out.println("\n");

        int zeroedElements = 0;
        for (int i = 0; i < len; i++) {
            if (randomNums[i] > randomNums[arrayMiddle]) {
                randomNums[i] = 0;
                zeroedElements++;
            }
            rangeBreak(randomNums, i, arrayMiddle);
        }
        System.out.println("\nКоличество обнулённых ячеек: " + zeroedElements);

        System.out.println("\n\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        len = alphabet.length;
        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) (i + 'A');
        }

        String reverseAlphabet = "";
        for (int i = len - 1; i >= 0; i--) {
            System.out.println(reverseAlphabet += alphabet[i]);
        }

        System.out.println("\n5. Генерация уникальных чисел");
        int[] uniqueNums = new int[30];
        len = uniqueNums.length;
        for (int i = 0; i < len; i++) {
            int generatedNum = (int) (Math.random() * 40 + 60);
            boolean isUniqueNum = false;
            for (int j = 0; j < i; j++) {
                if (uniqueNums[j] == generatedNum) {
                    isUniqueNum = true;
                    break;
                }
            }
            uniqueNums[i] = generatedNum;
            if (isUniqueNum) {
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
        String[] srcStrings = {"   ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        len = srcStrings.length;
        int countNonBlankStrings = 0;
        for (String string : srcStrings) {
            if (!string.isBlank()) {
                countNonBlankStrings++;
            }
        }
        String[] destStrings = new String[countNonBlankStrings];
        int srcPos = 0;
        int length = 0;
        for (int i = 0; i < len; i++) {
            if (!srcStrings[i].isBlank()) {
                if (length == 0) {
                    srcPos = i;
                }
                length++;
            } else {
                for (int j = 0; j < countNonBlankStrings; j++) {
                    if (destStrings[j] == null) {
                        int destPos = j;
                        System.arraycopy(srcStrings, srcPos, destStrings, destPos, length);
                        break;
                    }
                }
                srcPos = 0;
                length = 0;
            }
        }

        System.out.println("\nИзначальный массив:");
        showStrings(srcStrings);
        System.out.println("\nМассив с копированным строками:");
        showStrings(destStrings);
    }

    private static void showInts(int[] ints) {
        for (int num : ints) {
            System.out.print(num + " ");
        }
    }

    private static void showStrings(String[] strings) {
        for (String string : strings) {
            System.out.print(string + " ");
        }
    }

    private static void rangeBreak(double[] randomNums, int i, int arrayMiddle) {
        System.out.printf("% .3f", randomNums[i]);
        if (i == arrayMiddle) {
            System.out.println();
        }
    }
}
