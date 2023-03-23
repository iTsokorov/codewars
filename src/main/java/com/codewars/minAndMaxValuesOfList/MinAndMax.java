package com.codewars.minAndMaxValuesOfList;

import java.util.Arrays;
import java.util.Collections;

public class MinAndMax {
    public static void main(String[] args) {
        Integer[] array1 = new Integer[7];
        int[] array2 = new int[7];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 101);
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 101);
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(getMin(array1));
        System.out.println(getMax(array1));
        System.out.println();
        System.out.println(Arrays.toString(array2));
        System.out.println(getMin(array2));
        System.out.println(getMax(array2));
    }

//    FOR INTEGER
    private static int getMax(Integer[] list) {
        Arrays.sort(list, Collections.reverseOrder());
        return list[0];
    }

    private static int getMin(Integer[] list) {
        Arrays.sort(list);
        return list[0];
    }

//    FOR INT
    private static int getMax(int[] list) {
    int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
    return max;
    }

    private static int getMin(int[] list) {
        int min = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
            }
        }
        return min;
    }
}
