package com.company;


import java.util.HashSet;

// Print all the unique subsequence of a string
public class UniqueSubseq {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "aaa";
        HashSet<String> allSubseq = new HashSet<>();
        uniqueSubseq(str2, 0, "", allSubseq);

    }
    static void uniqueSubseq(String str, int index, String res, HashSet<String> allSubseq){

        if (index == str.length()) {

            if(allSubseq.contains(res)){
                return;
            }
            allSubseq.add(res);
            System.out.println(res);
            return;
        }
        //choose
        uniqueSubseq(str, index + 1, res + str.charAt(index), allSubseq);

        // don't  choose
        uniqueSubseq(str, index + 1, res, allSubseq);
    }
}
