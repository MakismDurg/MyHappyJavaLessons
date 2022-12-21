public class Calculator {
    public static void main(String[] args) {
        int a = 390;
        int b =  50;
        char sign = '%';
        double result = 0;
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = (double) a / b;
        } else if (sign == '^') {
            result = a;
            int exponent = b;
            while (exponent > 1) {
                result *= a;
                exponent--;
            }
        }
        if (sign == '%') {
            result = (double) a / 100 * b;
        }
        System.out.printf("%d %c %d = ", a, sign, b);
        if (result % 1 == 0) {
            System.out.println((int) result);
        } else {
            System.out.println(result);
        }
    }
}