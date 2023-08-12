package com.company;
// Find the number of ways in which you can invite n people to your party, single or in pairs,
public class PairFriends {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(callGuests(n));

    }
    static int callGuests(int n){
         if( n <= 1){
             return 1;
         }
         // single
        int ways1 = callGuests(n - 1);

        // pair
        int ways2 =  (n - 1) * callGuests(n - 2);

        return ways1 + ways2;
    }

}
