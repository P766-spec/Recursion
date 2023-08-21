package com.company;
// https://www.codingninjas.com/studio/problems/delete-middle-element-from-stack_985246?leftPanelTab=0

import java.util.*;
public class DeleteMiddleStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        int N = s.size();
        deleteMMiddle(s,N);

        while(!s.isEmpty()){
            System.out.println(s.pop() + " ");
        }


    }
    static void solve(Stack<Integer> s, int N, int count){
        if(count == N / 2){
            s.pop();
            return;
        }
        int temp = s.peek();
        s.pop();
        solve(s, N, count + 1);
        s.push(temp);
    }

    static void deleteMMiddle(Stack<Integer> s, int N){
        int count  = 0;
        solve(s, N, count);
    }
}
