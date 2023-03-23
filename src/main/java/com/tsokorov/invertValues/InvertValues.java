package com.tsokorov.invertValues;

import java.util.Arrays;

public class InvertValues {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, -4, -5};
        System.out.println(Arrays.toString(getInvertValue(array)));
    }

    private static int[] getInvertValue(int[] array) {
        int[] invert = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invert[i] = -array[i];
        }
        return invert;
    }


}
