package JavaInterviewQnA;

import java.util.Arrays;

public class Q2_01 {

//	2_01 Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}. 
//	You may modify and print the given array, or print a new array.

	public static void main(String[] args) {
		
		int[] arr = {6, 2, 5, 3};	
		int temp = arr[0];	
		for(int i = 0; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = temp;
		System.out.println(Arrays.toString(arr));	
	}
	
}
