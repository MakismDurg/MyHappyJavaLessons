public class Calculator {

    private int a;
    private int b;
    private char sign;
    double result = 1;

    public void operation() {
        switch (sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = (double) a / b;
                break;
            case '^':
                if (b == 0) {
                    break;
                }
                result = a;
                for (int exponent = b; exponent > 1; exponent--) {
                    result *= a;
                }
                break;
            case '%':
                result = a % b;
                break;
            default:
                System.out.println("Введён неверный знак. " +
                        "Возможны только вычисления со знаками +, -, *, /, ^, %.");
                break;
        }
    }
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public double getResult () {
        return result;
    }
}