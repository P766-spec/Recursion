package com.company;
// https://leetcode.com/problems/k-th-symbol-in-grammar/

import java.util.*;
public class KthGrammar {
    public static void main(String[] args) {
            int n = 4, k = 3;
        System.out.println(kthGrammar(n,k));
    }
    static int kthGrammar(int n,  int k){
        if(n == 1 && k == 1)
            return 0;
        int mid = (int)(Math.pow(2, n -1)) / 2;

        if( k <= mid)
            return kthGrammar(n-1,k);
        else {
            int  result = kthGrammar(n-1,k - mid);
            if(result == 0) return 1;
            else return 0;
        }
    }
}
