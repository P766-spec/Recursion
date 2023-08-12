package com.company;
// First Uppercase letter in a string(Iterative and Recursive)
public class FirstUppercase {
    public static void main(String[] args) {
        String str = "geeksforGeeKs";
//        char res = firstUpper(str);
        char res = firstUppercase(str, 0);
        if(res == 0){
            System.out.println("No Uppercase Letter");
        }else{
            System.out.println(res);
        }
    }
    static char firstUpper(String str){ // using linear search
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))){
                return str.charAt(i);
            }

        }
        return 0;

    }

    static char firstUppercase(String str, int i ){   // using Recursion
        if(str.charAt(i) == '\0'){
            return 0;
        }
        if(Character.isUpperCase(str.charAt(i))){
            return str.charAt(i);
        }
        return firstUppercase(str, i + 1);
    }

}
