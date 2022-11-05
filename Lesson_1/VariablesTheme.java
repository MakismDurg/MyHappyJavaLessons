public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte core = 2;
        short priceSegment = 32000;
        int price = 31599;
        long memoryDiscD = 325058555904l;
        float frequence = 2.4f;
        double systemAssemble = 19044.2130d;
        char currency = 'R';
        System.out.println(
                "\nНоутбук: DEXP Aquilon" +
                "\nЦена:" + price +
                "\nЦеновая категория до: " + priceSegment + currency + "" +
                "\nКоличество ядер в процессоре: " + core +
                "\nРазрядность CPU: " + frequence + "ГГц" +
                "\nСборка ОС: " + systemAssemble +
                "\nОбъём памяти диска D: " + memoryDiscD);

        System.out.println("\n2. Расчёт стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        int discountPercent = 11;
        int sumDiscount=(pricePen + priceBook) / 100 * discountPercent;
        System.out.println("\nСумма скидки: " + sumDiscount +
                "\nОбщая стоимость товаров со скидкой: " + (pricePen + priceBook - sumDiscount));

        System.out.println("\n3. Вывод на консоль слова JAVA\n" +
                "   J    a  v     v  a   \n" +
                "   J   a a  v   v  a a  \n" +
                "J  J  aaaaa  V V  aaaaa \n" +
                " JJ  a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807l;
        System.out.println("\nТип: byte" +
                "\nПервоначальное значение:" + b +
                "\nЗначение после инкремента: "+ ++b +
                "\nЗначение после декремента: "+ --b);
        System.out.println("\nТип: short"+"" +
                "\nПервоначальное значение: " + s +
                "\nЗначение после инкремента: " + ++s +
                "\nЗначение после декремента: " + --s);
        System.out.println("\nТип: int" +
                "\nПервоначальное значение: " + i +
                "\nЗначение после инкремента: " + ++i +
                "\nЗначение после декремента: " + --i
        );
        System.out.println("\nТип: long" +
                "\nПервоначальное значение: " + l +
                "\nЗначение после инкремента: " + ++l +
                "\nЗначение после декремента: "+ --l);

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("\nI. C помощью третьей переменной");
        int temp = num2;
        num2 = num1;
        num1 = temp;
        System.out.println("\nПеременная num1 = " + num1 + "\nПеременная num2 = " + num2);

        System.out.println("\nII. C помощью арифметических операций");
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("\nПеременная num1 = " + num1 + "\nПеременная num2 = " + num2);

        System.out.println("\nIII.C помощью побитовой операции");
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("\nПеременная num1 = " + num1 + "\nПеременная num2 = " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char ch1 = '#';
        char ch2 = '&';
        char ch3 = '@';
        char ch4 = '^';
        char ch5 = '_';
        System.out.println("\n"+ (int) ch1 + " " + ch1 + 
                "\n" + (int) ch2 + " " + ch2 +
                "\n" + (int) ch3 + " " + ch3 +
                "\n" + (int) ch4 + " " + ch4 +
                "\n" + (int) ch5 + " " + ch5);

        System.out.println("\n7. Вывод количества сотен, десятков и единиц числа");
        int srcNum = 123;
        int hundreds = srcNum / 100;
        int tens = srcNum  / 10 % 10;
        int ones = srcNum % 10;
        System.out.println("\nЧисло " + srcNum  + " cодержит:" + "\n" + hundreds + " сотню" +
                "\n" + tens + " десятка" + "\n" + ones + " единицы");

        System.out.println("\n8. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char bracketOpen = '(';
        char bracketClose = ')';
        char underscore = '_';
        System.out.println( "\n    " + slash + backslash+
                "\n   " + slash +"  " + backslash +
                "\n  " + slash + underscore + bracketOpen + " " + bracketClose + backslash+
                "\n " + slash + "      " + backslash+
                "\n" + slash + underscore + underscore + underscore + underscore
                + slash + backslash + underscore + underscore + backslash);

        System.out.println("\n9. Вывод произведения и суммы цифр числа");
        srcNum =345;
        hundreds = srcNum  / 100;
        tens = srcNum  / 10 % 10;
        ones =  srcNum  % 10;
        System.out.println("сумма цифр числа 345 = " + (hundreds + tens + ones)+
                "\nих произведение = " + hundreds * tens * ones);

        System.out.println("\n10. Вывод времени в формате ЧЧ:ММ:СС");
        int timeLimit = 86399;
        int hours=timeLimit / 3600;
        int minutes=timeLimit % 3600 / 60;
        int seconds=timeLimit % 60;
        System.out.println("\n" + hours + ":" + minutes + ":" + seconds);
    }
}
