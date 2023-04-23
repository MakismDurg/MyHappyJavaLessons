package com.startjava.lesson_2_3_4.guess;

public class Player {
    private String name;
    public int[] playerNumsX;
    public Player(String name, int[] playerNumsX) {
        this.name = name;
        this.playerNumsX = playerNumsX;
    }

    public String getName() {
        return name;
    }

    public void saveNums(int guess, int i){
        playerNumsX[i] = guess;
    }
}