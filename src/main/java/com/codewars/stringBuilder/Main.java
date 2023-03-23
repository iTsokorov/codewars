package com.codewars.stringBuilder;

public class Main {
    static String name = "Pavlo";

    public static void main(String[] args) {
        System.out.println(reverseWords("I think that you very beautiful!"));

        StringBuilder stringBuilder = new StringBuilder(name);

//        String result = stringBuilder
//                .append(true)
//                .append("developer")
//                .append('\t')
//                .append(22).toString();
//                .reverse().toString();

        StringBuilder result = stringBuilder
                .append(true)
                .append("developer")
                .append('\t')
                .append(22);


    }

    // Reverse words method
    public static String reverseWords(final String original) {
        String[] array = original.split(" ");
        if(array.length == 0)
            return original;

        int i = 0;
        for(String string : array){
            array[i] = new StringBuilder(string).reverse().toString();
            i++;
        }
        return String.join(" ",array);
    }
}