package com.arrayCoding;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Find the Largest number why we are use the largest number becase find the
 * largest salarey and largest transction, find employee largest salarey
 */
public class FindLargestNumber {

	public void findLargestNumber() {
		int[] arr = { 10, 50, 20, 80, 30 };

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) { // 10>50,50>20,50>80,80>30
			if (arr[i] > max) { // finally 80 is executed
				max = arr[i];
			}
		}
		System.out.println("max value = " + max);
	}

	/*
	 * find largest number useing sorting method
	 */
	public void sorting() {
		int[] arr = { 10, 50, 20, 80, 30 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		System.out.println(temp);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);         //time complecity O(n2)
												//space complecityO(n2)  this is bad becase all the index also change
		}
	}

	public static void main(String[] args) {
		FindLargestNumber findLargestNumber = new FindLargestNumber();
		 findLargestNumber.findLargestNumber();
	//	findLargestNumber.sorting();
		 
		 int[] arr = { 10, 50, 20, 80, 30 };
		 Arrays.sort(arr);
		 System.out.println(Arrays.toString(arr));
	}
}
/*
 * time complecity is O(n)
 * 
 * and space complecity O(1) this way we cannot sorthig the value only we are
 * chick the index only
 */
