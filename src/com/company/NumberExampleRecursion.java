package com.company;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n ){
        if(n == 5){   // Base condition for Recursion
            System.out.println(5);
            return;
        }
        System.out.println(n);
        // recursive call
        // if you are calling  a function again and again, you csn treat it as a seperate cell in the stack

        // this is called tail recursion
        // this is the last function call 
        print(n + 1);
    }

}
