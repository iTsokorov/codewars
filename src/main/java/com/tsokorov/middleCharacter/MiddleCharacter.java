package com.tsokorov.middleCharacter;

public class MiddleCharacter {
    public static void main(String[] args) {

        System.out.println(getTheMiddleCharacter("pussy"));
        System.out.println(getTheMiddleCharacter("test"));
    }

    private static String getTheMiddleCharacter(String word) {
        String str = "";
        int length = word.length();
        int middle = word.length() / 2;

        if (length % 2 == 0) {
            str = word.substring(middle - 1, middle + 1);
        } else {
            str = word.substring(middle, middle + 1);
        }
        return str;
    }
}
