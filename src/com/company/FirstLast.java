package com.company;
// Find the occurrence of first and last occurrence of an element using recursion.
public class FirstLast {
    public static void main(String[] args) {
        String str = "tabcdfghijakkk";
        char el = 'a';
        getIndices(str, el, 0);
        System.out.println("First occurrence is: " + first ) ;
        System.out.println("Last occurrence is: " + last) ;
    }
    static int first = -1;
    static int last = -1;
    static void getIndices(String str, char el, int index){
        if(index == str.length()){
            return;
        }
        if(str.charAt(index) == el){
            if(first == -1){
                first = index;
            } else{
                last = index;
            }
        }
        getIndices(str, el, index + 1);
    }
}
