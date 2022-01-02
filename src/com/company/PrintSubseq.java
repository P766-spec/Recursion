package com.company;
// Print all the subsequences of a string
public class PrintSubseq {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "aaa";
        printSubseq(str1, 0, "");


    }
    static void printSubseq(String str, int index, String res){
        if (index == str.length()) {
            System.out.println(res);
            return;
        }
        // choose
        printSubseq(str, index + 1, res + str.charAt(index));

        // don't choose
        printSubseq(str, index + 1, res);
    }
}
