package com.codewars.vowelsCount;

public class vowelsCount {
    public static void main(String[] args) {
        String  word = "avadakeadvra";

        System.out.println(vowelsCount(word));

    }
    private static int vowelsCount(String str) {
        int vowelCounter = 0;
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (c == 'a' ||
                    c == 'e' ||
                    c == 'i' ||
                    c == 'o' ||
                    c == 'u') {
                vowelCounter++;
            }
        }
        return vowelCounter;
    }
}