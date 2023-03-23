package com.tsokorov.sumOfPositive;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(sum(array));

    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            if (number > 0) {
                sum += number;
            }
        }
        return sum;
    }

}
