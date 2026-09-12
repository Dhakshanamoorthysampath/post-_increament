package com.seaeadClass;

public class FindLargestNumber {

    public static void main(String[] args) {

        int[] arr = {104, 25, 15};

        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
               
            }
            
        }

        System.out.println("Largest number = " + largest);
    }
}