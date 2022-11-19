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
            System.out.println("Женщина или кто-то из остальныех 49 гендеров.");
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

        System.out.println("\n3. Проверка числа N\n");
        int numN = 228;
        if (numN !=0 ) {
            System.out.println("Число N равно " + numN);
            if (numN > 0) {
                System.out.println("Число N является положительным");
            } else {
                System.out.println("Число N является отрицательным");
            }
            if (numN % 2 == 0) {
                System.out.println("Число N является чётным");
            } else {
                System.out.println("Число N является нечётным");
            }
        } else {
            System.out.println("Число N равно 0");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        num1 = 318;
        num2 = 311;
        int ones1 = num1 % 10;
        int tens1 = num1 / 10 % 10;
        int hunds1 = num1 / 100;
        int ones2 = num2 % 10;
        int tens2 = num2 / 10 % 10;
        int hunds2 = num2 / 100;
        if (ones1 == ones2) {
            System.out.println("Совпадают цифры " + ones1 + " и " + ones2 + " стоящие в первом разряде.");
        } else if (tens1 == tens2) {
            System.out.println("Совпадают цифры " + tens1 + " и " + tens2 + " стоящие во втором разряде.");
        } else if (hunds1 == hunds2) {
            System.out.println("Совпадают цифры " + hunds1 + " и " + hunds2 + " стоящие в третьем разряде.");
        } else {
            System.out.println("Цифры ни одного из разрядов не совпадают.");
        }

         System.out.println("\n5. Определение символа по его коду.\n");
          /*
        Я не нашёл способа сделать 5 задание без вложенных проверок, не прибегая к оператору &&.
        Прибегнув к нему, мне кажется, что я забежал вперёд.
        */
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
        float depositPercentMin = deposit * 0.05f;
        float depositPercentMid = deposit * 0.07f;
        float depositPercentMax = deposit * 0.1f;
        if (deposit < 100000) {
            System.out.println("Сумма вклада: " + deposit +
                    "\nНачисленный процент: " + depositPercentMin +
                    "\nIтоговая сумма: " + (deposit + depositPercentMin));
        } else if (deposit >= 100000 && deposit >= 300000) {
            System.out.println("Сумма вклада: " + deposit +
                    "\nНачисленный процент: " + depositPercentMid +
                    "\nIтоговая сумма: " + (deposit + depositPercentMid));
        } else  if (deposit < 100000) {
            System.out.println("Сумма вклада: " + deposit +
                    "\nНачисленный процент: " + depositPercentMax +
                    "\nIтоговая сумма: " + (deposit + depositPercentMax));
        }

        System.out.println("\n7. Определение оценки по предметам.\n");
        int percentProg = 91;
        int markProg = 0;
        if(percentProg <= 60) {
            markProg = 2;
        } else if(percentProg > 60) {
            if(percentProg <= 73) {
                markProg = 3;
            } else if(percentProg > 73) {
                if(percentProg <= 91){
                    markProg = 4;
                } else {
                    markProg = 5;
                }
            }
        }
        int percentHist = 59;
        int markHist = 0;
        if(percentHist <= 60) {
            markHist = 2;
        } else if(percentHist > 60) {
            if(percentHist <= 73) {
                markHist = 3;
            } else if(percentHist > 73) {
                if(percentHist <= 91){
                    markHist = 4;
                } else {
                    markHist = 5;
                }
            }
        }
        int midMark = (markHist + markProg)/2;
        int midPercent = (percentHist + percentProg)/2;
        System.out.println(markHist + " — балл по истории\n" + markProg +
                " — балл по программированию\n" +
                "Cредний балл оценок по предметам: " + midMark +
                "\nCредний % по предметам: " + midPercent + "%");

        System.out.println("\n8. Расчет прибыли за год.\n");
        int rent = 5000;
        int proceeds = 13000;
        int cost = 9000;
        int profit = proceeds - rent - cost;
        int yearProfit = profit * 12;
        if (yearProfit > 0) {
            System.out.println("Прибыль за год: " + '+' + yearProfit);
        } else {
            System.out.println("Прибыль за год: " + yearProfit);
        }
        System.out.println("\n9. Подсчет количества банкнот.\n");
        int withdrawal = 567;
        int notesInStockOnes = 40;
        int notesInStockTens = 5;
        int notesInStockHunds = 10;
        int howManyOnesNeed = withdrawal % 10;
        int howManyTensNeed = withdrawal % 100 / 10;
        int howManyHundsNeed = withdrawal / 100;
        int withdrawnOnes = 0;
        int withdrawnTens = 0;
        int withdrawnHunds = 0;
        if(howManyHundsNeed - notesInStockHunds > 0) {
            withdrawnHunds = notesInStockHunds;
            int missingNotes = howManyHundsNeed - notesInStockHunds;
            int changeTens = missingNotes * 10;
            if(changeTens - notesInStockTens > 0) {
                withdrawnTens = notesInStockTens;
                missingNotes = changeTens - notesInStockTens;
                int changeOnes = missingNotes * 10;
                if(changeOnes - notesInStockOnes > 0){
                    System.out.println("Данной суммы нет в наличии. Пожалуйста, выберите сумму меньше");
                } else {
                    withdrawnOnes = changeOnes;
                    if(howManyTensNeed > 0){
                        System.out.println("Данной суммы нет в наличии. Пожалуйста, выберите сумму меньше");
                    } else {
                        notesInStockOnes = notesInStockOnes - changeOnes;
                        if(howManyOnesNeed - notesInStockOnes > 0){
                            System.out.println("Данной суммы нет в наличии. Пожалуйста, выберите сумму меньше");
                        } else {
                            withdrawnOnes = withdrawnOnes + howManyOnesNeed;
                            System.out.println("\nСумма к выдаче: " + withdrawal +
                                    "\nВыдача будет произведена в банкнотах номиналом: 1$, 10$, 100$" +
                                    "\nТребуемое количество банкнот:\n" +
                                    withdrawnOnes + " - 1$" + "\n" +
                                    withdrawnTens + " - 10$" + "\n" +
                                    withdrawnHunds + " - 100$");
                        }
                    }
                }
            } else {
                notesInStockTens = notesInStockTens - changeTens;
                withdrawnTens = changeTens;
                if (howManyTensNeed - notesInStockTens > 0) {
                    missingNotes = howManyTensNeed - notesInStockTens;
                    int changeOnes = missingNotes * 10;
                    if(howManyOnesNeed - notesInStockOnes > 0) {
                        System.out.println("Данной суммы нет в наличии. Пожалуйста, выберите сумму меньше");
                    } else {
                        notesInStockOnes = notesInStockOnes - changeOnes;
                        if (howManyOnesNeed - notesInStockOnes > 0){
                            System.out.println("Данной суммы нет в наличии. Пожалуйста, выберите сумму меньше");
                        } else {

                        }
                    }
                } else {
                    withdrawnTens = withdrawnTens + howManyTensNeed;
                    if(howManyOnesNeed - notesInStockOnes > 0) {
                        System.out.println("Данной суммы нет в наличии. Пожалуйста, выберите сумму меньше");
                    } else {
                            withdrawnOnes = notesInStockOnes - howManyOnesNeed;
                            notesInStockOnes = notesInStockOnes - withdrawnOnes;
                        System.out.println("\nСумма к выдаче: " + withdrawal +
                                "\nВыдача будет произведена в банкнотах номиналом: 1$, 10$, 100$" +
                                "\nТребуемое количество банкнот:\n" +
                                withdrawnOnes + " - 1$" + "\n" +
                                withdrawnTens + " - 10$" + "\n" +
                                withdrawnHunds + " - 100$");
                    }
                }
            }
        } else {
            withdrawnHunds = howManyHundsNeed;
            if(howManyTensNeed - notesInStockTens > 0){
                withdrawnTens = notesInStockTens;
                int missingNotes = howManyTensNeed - notesInStockTens;
                int changeOnes = missingNotes * 10;
                notesInStockOnes = notesInStockOnes - withdrawnOnes;
                if(howManyOnesNeed - notesInStockOnes > 0) {
                    System.out.println("Данной суммы нет в наличии. Пожалуйста, выберите сумму меньше");
                } else {
                    withdrawnOnes = changeOnes;
                    if (howManyOnesNeed - notesInStockOnes > 0){
                        System.out.println("Данной суммы нет в наличии. Пожалуйста, выберите сумму меньше");
                    } else {
                        withdrawnOnes = withdrawnOnes + howManyOnesNeed;
                        notesInStockOnes = notesInStockOnes - withdrawnOnes;
                        System.out.println("\nСумма к выдаче: " + withdrawal +
                                "\nВыдача будет произведена в банкнотах номиналом: 1$, 10$, 100$" +
                                "\nТребуемое количество банкнот:\n" +
                                withdrawnOnes + " - 1$" + "\n" +
                                withdrawnTens + " - 10$" + "\n" +
                                withdrawnHunds + " - 100$");
                    }
                }
            } else {
                withdrawnTens = howManyTensNeed;
                if (howManyOnesNeed - notesInStockOnes > 0) {
                    System.out.println("Данной суммы нет в наличии. Пожалуйста, выберите сумму меньше");
                } else {
                    withdrawnOnes = howManyOnesNeed;
                    System.out.println("\nСумма к выдаче: " + withdrawal +
                            "\nВыдача будет произведена в банкнотах номиналом: 1$, 10$, 100$" +
                            "\nТребуемое количество банкнот:\n" +
                            withdrawnOnes + " - 1$" + "\n" +
                            withdrawnTens + " - 10$" + "\n" +
                            withdrawnHunds + " - 100$");
                }
            }
        }
    }
}
