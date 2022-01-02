package com.company;

public class MoveAllX {
    public static void main(String[] args) {
        String str = "abcdefxghxixjxxxk";
        int count = 0;

        String newStr = moveAllX(str, 0, count);
        System.out.println(newStr);


    }
    static String addX(int count){ // to add all 'x' at the end of the string
        String newStr = "x";
        for (int i = 1; i <count ; i++) {
            newStr  += 'x';

        }
        return newStr;
    }
    static String moveAllX(String str, int index, int count){
        if(index == str.length()){
            return addX(count);
        }
        if(str.charAt(index) == 'x'){
            return moveAllX(str, index + 1, count + 1);
        }else{
            String nextStr = moveAllX(str, index + 1, count);
            return str.charAt(index) + nextStr;
        }

    }
}
