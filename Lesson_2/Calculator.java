public class Calculator {
    private int a;
    private int b;
    private char sign;
    private double result;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public double getResult() {
        return result;
    }

    public void calculate() {
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
                /* Не очень понял, почему нужно убрать эту проверку по ОС от 30 декабря. 
                Тут прописан случай, когда любое число a возводится в степень b = 0.
                Будет однозначно result = 1 и тогда заходить в цикл не нужно.
                Программа на этом этапе срабатывает корректно.
                */ 
                if (b == 0) {
                    result = 1;
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
        }
    }
}