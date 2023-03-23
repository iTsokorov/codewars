package com.tsokorov.squareSum;

import java.util.Arrays;

public class squareSum {
    public static void main(String[] args) {
        int[] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        System.out.println(Arrays.toString(array));

        System.out.println(squareSum(array));
    }
        public static int squareSum (int[] array){
            int sum = 0;
            int multiplication = 0;

            for (int i = 0; i < array.length; i++) {
                multiplication = array[i] * array[i];
                sum += multiplication;
            }
            return sum;
        }
    }

