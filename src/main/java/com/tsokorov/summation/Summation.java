package com.tsokorov.summation;

public class Summation {
    /*
    Write a program that finds the summation of every number from 1 to num.
    The number will always be a positive integer greater than 0.
     */
    public static void main(String[] args) {
        System.out.println(summation(8));
        System.out.println(summationEasy(8));

    }
    public static int summation(int n) {
        int sum = 0;

        for (int i = 0; i <= n; i++ ) {
            sum += i;
        }

        return sum;
    }

    public static int summationEasy(int n) {

        return  n*(n+1)/2;
    }
}
