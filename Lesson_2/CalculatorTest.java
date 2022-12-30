import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String option = "yes";
        while (option.equals("yes")) {
            System.out.println("Введите первое число: ");
            calculator.setA(console.nextInt());
            System.out.println("Введите знак вычисления: ");
            calculator.setSign(console.next().charAt(0));
            System.out.println("Введите второе число: ");
            calculator.setB(console.nextInt());
            calculator.operate();
            System.out.println("Результат вычисления = ");
            if (calculator.getResult() % 1 == 0) {
                System.out.println((int)calculator.getResult());
            } else {
                System.out.println(calculator.getResult());
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            option = console.next();
            while (!option.equals("no")) {
                if (option.equals("yes")) {
                    break;
                } else {
                    System.out.print("Некорректный ответ. Хотите продолжить вычисления? [yes/no]\n");
                    option = console.next();
                }
            }
        }
        System.out.println("Расчёты завершены.");
    }
}