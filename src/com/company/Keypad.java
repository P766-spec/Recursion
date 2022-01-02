package com.company;
// Print keypad combination
public class Keypad {
    public static void main(String[] args) {
        String number  = "23";
        keypadCombination(number, 0, "");

    }
    static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    static void keypadCombination(String str, int index, String combination){
        if(index == str.length()){
            System.out.println(combination);
            return;
        }
      char currChar = str.charAt(index);
        String mapping = keypad[currChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            keypadCombination(str, index + 1, combination + mapping.charAt(i));

        }


        }
    }

