package com.company;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "abcadbcefghabi";
        boolean present[] = new boolean[str.length()];
        System.out.println(removeDuplicates(str, 0, present));
    }
    static String removeDuplicates(String str, int index, boolean present[]){
         if(index == str.length()){
             return "";
         }
         char curr = str.charAt(index);
         if(present[curr-'a']){
             return removeDuplicates(str, index + 1, present);
         } else{
             present[curr - 'a'] = true;
             return curr + removeDuplicates(str, index + 1, present);

         }
    }
}
