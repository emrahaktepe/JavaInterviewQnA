package JavaInterviewQnA;

import java.util.Arrays;

public class Q0_1_BubbleSort {
	
//	Sort an array by using bubble sort algorithm, but skip the iterations that are unnecessary.

	public static void main(String[] args) {

		int[] arr = { 3, 5, 1, 7, 2, 8, 6, 9, 4, 0 };
		int j = 0;
		for ( j = 0; j < arr.length - 1; j++) {
			if(isSorted(arr))
			break;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(j);	// this is to see how many times loop runs
	}
	
	public static boolean isSorted(int[] arr) {
		
		for (int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > arr[i+1]) {
				return false;
			}
		}
		return true;
	}
}
