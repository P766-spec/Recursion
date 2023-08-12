package com.company;

import java.util.Scanner;

// Print 1 to N numbers Without loop
public class PrintNos {
    public static void main(String[] args) {
        // taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        // taking total testcases
       int T = sc.nextInt();
       while(T-->0){
           // creating an object of class Print
           PrintNos obj = new PrintNos();
           int N;

           // input n
           System.out.println("enter the number N: ");
           N = sc.nextInt();

           // calling printNos() method
           // of class PrintNos
           obj.printNos(N);
           System.out.println();
       }
    }
    static void printNos(int N){
        if(N == 0){
            return;
        }
        printNos(N - 1);
        System.out.print(N + " ");
    }
}
