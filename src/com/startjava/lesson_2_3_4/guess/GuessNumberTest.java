package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public final static int LIMIT_OF_GUESSES = 10;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Первый игрок, введите имя:");
        int [] player1nums = new int[LIMIT_OF_GUESSES];
        Player player1 = new Player(console.nextLine(),player1nums);

        System.out.println("Второй игрок, введите имя:");
        int [] player2nums = new int[LIMIT_OF_GUESSES];
        Player player2 = new Player(console.nextLine(), player2nums);


        GuessNumber game = new GuessNumber(player1, player2);
        String option = "yes";

        do {
            if (option.equals("yes")) {
                game.launch();
            } else if (!option.equals("no")) {
                System.out.println("Введите yes или no");
            }
            System.out.println("\nХотите сыграть повторно? [yes/no]");
            option = console.nextLine();
        } while (!option.equals("no"));

        System.out.println("Всем спасибо, до новых встреч.\nБерегите себя и своих близких.");
    }
}