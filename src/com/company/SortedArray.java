package com.company;

public class SortedArray {
    public static void main(String[] args) {
//        int arr1[] = {1, 2, 3, 4, 5};
//        int arr2[] = {1, 6, 3, 4, 5};
//
//        if(!checkIfIncreasing(arr2, 0)){
//            System.out.println("Strictly Increasing");
//        }else{
//            System.out.println("NOT Strictly Increasing");
//        }
        int[] arr = {1, 3, 5};
        System.out.println(isSorted(arr, 0));

    }
    static boolean checkIfIncreasing(int[] arr, int index ){
        if(index == arr.length - 1){
            return true;
        }
        if(!checkIfIncreasing(arr, index + 1)){
            return false;
        }
        return arr[index] < arr[index + 1];
    }
    static boolean isSorted(int[] arr, int index){
        if(index == arr.length -1){
            return true;
        }
        if(arr[index] < arr[index +1]){
            // array is sorted till now
            return isSorted(arr, index + 1);
        }else{
            return false;
        }
    }
}
