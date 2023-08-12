package com.company;

public class PrintPermutation {
    public static void main(String[] args) {
        String str = "abc";
        printPermutation(str, 0, "");

    }
    static void printPermutation(String str, int index, String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length() ; i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newStr, index + 1, permutation + currChar);


        }
    }
}
