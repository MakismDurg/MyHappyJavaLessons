public class MyFirstGame {
    public static void main(String[] args) {
        int numberToBeFound = 69;
        int guessNum = 0;
        while (guessNum != numberToBeFound) {
            guessNum += 17;
            if (guessNum >= 100) {
                guessNum -= 83;
            }
            if (guessNum < numberToBeFound) {
                System.out.printf("Число %d меньше загаданного,\n", guessNum);
            }
            if (guessNum > numberToBeFound) {
                System.out.printf("Число %d больше загаданного\n", guessNum);
            }
        }
        System.out.printf("It's God damned right, %d!", guessNum);
    }
}