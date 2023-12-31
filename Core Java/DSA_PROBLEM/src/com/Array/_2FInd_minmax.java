package com.Array;
/*this program to find the min and max value from array.
 * There are 3 way of doing this
 * 1)Using 2 for loop with if condition and sorting array and print first
 *  and last value
 *  2)using linear search
 *  3)u can use Collection class predefine methods but you need to use wrapper
 *  class variable not regular like int u need to use Integer.
 *  
 *  
 */

public class _2FInd_minmax {

	/* Class Pair is used to return two values from getMinMax() */
	static class Pair {

		int min;
		int max;
	}

	static Pair getMinMax(int arr[], int n) {
		Pair minmax = new Pair();
		int i;

		/* If there is only one element then return it as min and max both */
		if (n == 1) {
			minmax.max = arr[0];
			minmax.min = arr[0];
			return minmax;
		}

		/*
		 * If there are more than one elements, then initialize min and max
		 */
		if (arr[0] > arr[1]) {
			minmax.max = arr[0];
			minmax.min = arr[1];
		} else {
			minmax.max = arr[1];
			minmax.min = arr[0];
		}

		for (i = 2; i < n; i++) {
			if (arr[i] > minmax.max) {
				minmax.max = arr[i];
			} else if (arr[i] < minmax.min) {
				minmax.min = arr[i];
			}
		}

		return minmax;
	}

	public static void main(String[] args) {
		int arr[] = { 1000, 11, 445, 1, 330, 3000 };
		int arr_size = 6;
		Pair minmax = getMinMax(arr, arr_size);
		System.out.printf("\nMinimum element is %d", minmax.min);
		System.out.printf("\nMaximum element is %d", minmax.max);

	}
	/*collection class methods
	Integer[] arr={57,12,45,7,15,194};
	S.o.p(Collection.min(Arrays.asList(arr)));
	S.O.P(Collection.max(Arrays.asList(arr)));

    */
}
