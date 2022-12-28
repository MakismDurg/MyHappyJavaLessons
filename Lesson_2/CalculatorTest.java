import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner numInsert = new Scanner(System.in);
        Scanner symbolInsert = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean stop = false;
        while (!stop) {
            System.out.println("Введите первое число: ");
            calculator.setA(numInsert.nextInt());
            System.out.println("Введите знак вычисления: ");
            calculator.setSign(symbolInsert.nextLine().charAt(0));
            System.out.println("Введите второе число: ");
            calculator.setB(numInsert.nextInt());
            calculator.operation();
            System.out.print("Результат вычисления = ");
            if (calculator.getResult() % 1 == 0) {
                System.out.println((int)calculator.getResult());
            } else {
                System.out.println(calculator.getResult());
            }
            while (true) {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                String askToStop = symbolInsert.nextLine();
                if (askToStop.equals("yes")) {
                    break;
                } else if (askToStop.equals("no")) {
                    stop = true;
                    break;
                } else {
                    System.out.print("Некорректный ответ. ");
                }
            }
        }
        System.out.println("Расчёты завершены.");
    }
}
