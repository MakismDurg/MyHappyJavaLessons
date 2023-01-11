import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Первый игрок, введите имя:");
        Player player1 = new Player(console.nextLine());

        System.out.println("Второй игрок, введите имя:");
        Player player2 = new Player(console.nextLine());

        GuessNumber game = new GuessNumber(player1, player2);
        String option;

        do {
            game.launch();
            System.out.println("\nХотите сыграть повторно? [yes/no]");
            option = console.nextLine();
            while (!option.equals("yes")) {
                if (option.equals("no")) {
                    break;
                } else {
                    System.out.println("Введите yes или no");
                    option = console.nextLine();
                }
            }
        } while (option.equals("yes"));
        System.out.println("Всем спасибо, до новых встреч.\nБерегите себя и своих близких.");
    }
}