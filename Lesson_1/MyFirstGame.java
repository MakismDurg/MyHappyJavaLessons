public class MyFirstGame {
    public static void main(String[] args) {
        int secretNum = 94;
        int guessNum = 1;
        while (guessNum != secretNum) {
            if (guessNum < secretNum) {
                System.out.printf("Число %d меньше загаданного,\n", guessNum);
            } else if (guessNum > secretNum) {
                System.out.printf("Число %d больше загаданного\n", guessNum);
            }
            guessNum++;
             if (guessNum > 100) {
                guessNum = 1;
            }
        }
        System.out.printf("It's God damned right, %d!", guessNum);
    }
}