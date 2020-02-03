package JavaInterviewQnA;

import java.util.Arrays;

public class Q9_05_FindNotRepeatedElementInArray {

//	9_05 Given an array nums with 7 integers every element is repeated twice
//		 except one. Find that element and print it to the console.

	public static void main(String[] args) {
		
		
		
		int[] arr = {1,1,2,2,3,3,4};	
		
		printTheSingleOne(arr);
	}
	
	public static void printTheSingleOne(int[] arr) {
		
		Arrays.sort(arr);
		
		int x = 0;
		
		for(int i = 0; i < arr.length-1; i+=2) {
			if(arr[i] != arr[i+1]) {
				x = arr[i];
				break;
			}
		}
		if (x == 0) {
			x = arr[arr.length-1];
		}
		System.out.println(x);
	}
}
