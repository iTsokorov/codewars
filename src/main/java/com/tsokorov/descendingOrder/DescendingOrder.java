package com.tsokorov.descendingOrder;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        int num = 4627238;
        System.out.println(sortDesc(num));
    }

    private static int sortDesc(final int num) {
        String strNum = Integer.toString(num);
        char[] charNum = strNum.toCharArray();
        Arrays.sort(charNum);
        String reversedNum = new StringBuilder(new String(charNum)).reverse().toString();
        return Integer.parseInt(reversedNum);
    }
}
