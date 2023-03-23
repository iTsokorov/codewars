package com.codewars.sheepCounter;

public class SheepCounter {
    public static void main(String[] args) {

        System.out.println(sheepCounter(3));
    }

    private static String sheepCounter(int num) {
        StringBuilder str = new StringBuilder();

        for (int i = 1; i <= num; i++) {
            str.append(i).append(" sheep...");
        }
        return str.toString();
    }
}
