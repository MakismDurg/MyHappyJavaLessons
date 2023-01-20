package com.startjava.lesson_1.base; 

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");
        int age = 29;
        if(age > 20) {
            System.out.println("Тебе более 20 лет");
        } else {
            System.out.println("Тебе меньше 20 лет");
        }
        boolean maleGender = true;
        if(!maleGender) {
            System.out.println("Женщина или кто-то из остальных 49 гендеров.");
        } else {
            System.out.println("Мужчина");
        }
        float height = 1.74f;
        if(height < 1.80) {
            System.out.println("Рост менее 1м 80см");
        } else {
            System.out.println("Рост более 1м 80см");
        }
        char capitalLetter = "Maksim".charAt(0);
        if(capitalLetter == 'M') {
            System.out.println("имя начинается на букву «М»");
        }  else if(capitalLetter == 'I') {
            System.out.println("имя начинается на букву «I»");
        } else {
            System.out.println("Допустимы имена, начинающиеся на «М» или «I». "
                    + "Ведённое имя не подходит");
        }

        System.out.println("\n2. Поиск max и min числа\n");
        int num1 = 18;
        int num2 = 3;
        if(num1 > num2) {
            System.out.println("Число num1 больше, чем число num2");
        } else if(num1 < num2) {
            System.out.println("Число num2 больше, чем число num1 ");
        } else {
            System.out.println("Число num1 равно числу num2");
        }

        System.out.println("\n3. Проверка числа\n");
        int numN = 228;
        if (numN != 0) {
            System.out.println("У нас есть число, равное " + numN + ". Оно:");
            if (numN > 0) {
                System.out.println("    - положительное");
            } else {
                System.out.println("    - отрицательное");
            }
            if (numN % 2 == 0) {
                System.out.println("    - чётное");
            } else {
                System.out.println("    - нечётное");
            }
        } else {
            System.out.println("У нас есть число, равное 0");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        num1 = 228;
        num2 = 311;
        int ones1 = num1 % 10;
        int tens1 = num1 / 10 % 10;
        int hunds1 = num1 / 100;
        int ones2 = num2 % 10;
        int tens2 = num2 / 10 % 10;
        int hunds2 = num2 / 100;
        if (ones1 == ones2) {
            System.out.println("Совпадают цифры " + ones1 + " и " + ones2 + " стоящие в первом разряде.");
        }
        if (tens1 == tens2) {
            System.out.println("Совпадают цифры " + tens1 + " и " + tens2 + " стоящие во втором разряде.");
        }
        if (hunds1 == hunds2) {
            System.out.println("Совпадают цифры " + hunds1 + " и " + hunds2 + " стоящие в третьем разряде.");
        }
        if (ones1 != ones2 && tens1 != tens2 && hunds1 != hunds2) {
            System.out.println("Цифры ни одного из разрядов не совпадают.");
        }

        System.out.println("\n5. Определение символа по его коду.\n");
        char symbol = '\u0057';
        if (symbol >= '0' && symbol <= '9') {
            System.out.println("Символ " + symbol + " является цифрой.");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Символ " + symbol + " является заглавной буквой.");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Символ " + symbol + " является строчной буквой.");
        } else {
            System.out.println("Символ " + symbol + " не является буквой или числом.");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %\n");
        float deposit = 300000.00f;
        float percent = deposit * 0.1f;
        if (deposit < 100000) {
            percent = deposit * 0.05f;
        } else if (deposit >= 100000 && deposit >= 300000) {
            percent = deposit * 0.07f;
        }
        System.out.println("Сумма вклада: " + deposit +
                "\nНачисленный %: " + percent +
                "\nCумма с %: " + deposit + percent);

        System.out.println("\n7. Определение оценки по предметам.\n");
        int percentProg = 91;
        int markProg = 5;
        if (percentProg <= 60) {
            markProg = 2;
        } else if (percentProg > 60 && percentProg <= 73) {
            markProg = 3;
        } else if (percentProg > 73 && percentProg <= 91) {
            markProg = 4;
        }
        int percentHist = 59;
        int markHist = 5;
        if (percentHist <= 60) {
            markHist = 2;
        } else if (percentHist > 60 && percentHist <= 73) {
            markHist = 3;
        } else if (percentHist > 73 && percentHist <= 91) {
            markHist = 4;
        }
        int avgMark = (markHist + markProg) / 2;
        int avgPercent = (percentHist + percentProg) / 2;
        System.out.println(markHist + " — балл по истории\n" + markProg +
                " — балл по программированию\n" +
                "Cредний балл оценок по предметам: " + avgMark +
                "\nCредний % по предметам: " + avgPercent + "%");

        System.out.println("\n8. Расчет прибыли за год.\n");
        int rent = 5000;
        int proceeds = 13000;
        int cost = 9000;
        int yearProfit = (proceeds - rent - cost) * 12;
        if (yearProfit > 0) {
            System.out.println("Прибыль за год: " + '+' + yearProfit);
        } else {
            System.out.println("Прибыль за год: " + yearProfit);
        }

        System.out.println("\n9. Подсчет количества банкнот.\n");
        int withdrawal = 567;
        int onesInStock = 50;
        int tensInStock = 5;
        int hundsInStock = 10;
        int needOnes = withdrawal % 10;
        int needTens = withdrawal % 100 / 10;
        int needHunds = withdrawal / 100;
        System.out.println("Сумма к выдаче: " + withdrawal);
        if (needHunds > hundsInStock) {
            needTens = needTens + (needHunds - hundsInStock) * 10;
            needHunds = hundsInStock;
        }
        if (needTens > tensInStock) {
            needOnes = needOnes + (needTens - tensInStock) * 10;
            needTens = tensInStock;
        }
        if (needOnes <= onesInStock) {
            System.out.println("\nCумма будет выдана в количестве купюр номиналом:\n" +
                    needHunds + " — 100$\n" +
                    needTens + " — 10$\n" +
                    needOnes + " — 1$\n");
        } else {
            System.out.println("Запрошенная сумма не может быть выдана.\n" +
                    "Денег нет, но вы держитесь. Хорошего вам настроения и здоровья.");
        }
    }
}