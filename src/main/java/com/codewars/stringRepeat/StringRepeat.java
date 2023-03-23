package com.codewars.stringRepeat;

public class StringRepeat {
    public static void main(String[] args) {
        String baby = "baby";
        System.out.println(repeatStr(3, baby));
    }

    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }
}