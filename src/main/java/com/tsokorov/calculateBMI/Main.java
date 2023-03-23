package com.tsokorov.calculateBMI;

public class Main {
    public static void main(String[] args) {
        System.out.println(bmi(1, 1));
    }

    public static String bmi(double weight, double height) {
        if (weight / (height * height) <= 18.5) {
            System.out.println(weight / (height * height));
            return "Underweight";
        }
        if (weight / (height * height) <= 25.0) {
            System.out.println(weight / (height * height));
            return "Normal";
        }
        if (weight / (height * height) <= 30.0) {
            System.out.println(weight / (height * height));
            return "Overweight";
        }
        return "Obese";
    }
}

