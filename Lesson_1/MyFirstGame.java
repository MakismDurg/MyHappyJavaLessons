public class MyFirstGame {
    public static void main(String[] args) {
        int secretNum = 100;
        int guessNum = 10;
        while (guessNum != secretNum) {
            guessNum += 1;
            if (guessNum > 100) {
                guessNum -= 100;
            }
            if (guessNum < secretNum) {
                System.out.printf("Число %d меньше загаданного,\n", guessNum);
            } else if (guessNum > secretNum) {
                System.out.printf("Число %d больше загаданного\n", guessNum);
            }
        }
        System.out.printf("It's God damned right, %d!", guessNum);
    }
}