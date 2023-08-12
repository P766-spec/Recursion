package com.company;
// Find number of ways to fill an `N x 4` matrix with `1 x 4` tiles.
public class PlaceTile {
    public static void main(String[] args) {
                int n =5, m = 4;
        System.out.println(placeTile(n, m));
    }
    static int placeTile(int n, int m){
        if(n < m){
            return 1;
        } else if(n == m){
            return 2;
        }
        return placeTile(n-1, m) + placeTile(n-2, m); // placing tile horizontally and vertically, here we have use recursive formula
    }
}
