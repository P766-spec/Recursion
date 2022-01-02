package com.company;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n =4;
        towerOfHanoi(n, "A", "B", "C");
    }
    static void towerOfHanoi(int n, String src, String helper, String destination){
        if(n == 1){
            System.out.println("transfer disk" + n + " from " + destination);
            return;
        }
        // transfer top  n - 1 from src to helper using destination as a 'helper'
        towerOfHanoi(n-1, src, destination, helper);

        // transfer nth from src to destination
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);

        // transfer n -1  from helper to destination using src as 'helper'
        towerOfHanoi(n-1, helper, src, destination);
    }

}
