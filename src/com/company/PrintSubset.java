package com.company;

import java.util.ArrayList;

// Print all the subsets of a set of first n natural numbers
public class PrintSubset {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);

    }
    static void printSubset(ArrayList<Integer> subset){
        for (int i = 0; i < subset.size() ; i++) {
            System.out.print(subset.get(i) + " ");

        }
        System.out.println();
    }
    static void findSubset(int n, ArrayList<Integer> subset){

        if( n== 0){
            printSubset(subset);
            return;
        }
        // if it adds
        subset.add(n);
       findSubset(n - 1, subset);

       // if doesn't  add
        subset.remove(subset.size()-1);
        findSubset(n - 1, subset);

        }
    }

