public class Calculator {
    public static void main(String[] args) {
        int a = 370;
        int b = 40;
        char sign = '%';
        double result = 0;
        if (sign == 43) {
            result = a + b;
        }
        if (sign == 45) {
            result = a - b;
        }
        if (sign == 42) {
            result = a * b;
        }
        if (sign == 47) {
            result = (double) a / b;
        }
        if (sign == 94) {
            result = a;
            int exponent = b;
            while (exponent > 1) {
                result *= a;
                exponent--;
            }
        }
        if (sign == 37) {
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