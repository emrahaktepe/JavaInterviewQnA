package JavaInterviewQnA;

import java.util.Arrays;

//	1_08 Write a method that takes an array of integers between 1 and 10 (excluding one number)
// 		 and returns the missing number.EX: missingNumber([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5

public class Q1_08_FindNumNotRepeated {

	public static void main(String[] args) {
		System.out.println(findMissingNumber(new int[] { 10, 2, 3, 8, 1, 6, 5, 9, 4 }));
	}

	public static int findMissingNumber(int[] arr) {
		
		Arrays.sort(arr);
		int missingNum = 0;
		for(int i = 0; i<arr.length-1; i++) {
			if(arr[i] != i+1) {
				missingNum = i+1;
				break;
			}
		}
		return missingNum;
	}

}
