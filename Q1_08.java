package JavaInterviewQnA;

import java.util.Arrays;

//	1_08 Write a method that takes an array of integers between 1 and 10 (excluding one number)
// 		 and returns the missing number.EX: missingNumber([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5

public class Q1_08 {

	public static void main(String[] args) {
		System.out.println(findMissingNumber(new int[] { 1, 2, 4, 5, 6, 7, 8, 9, 10 }));
	}

	// 8
	public static int findMissingNumber(int[] arr) {
		// missingNumber([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5

		Arrays.sort(arr);

		if (arr[arr.length - 1] != 10)
			return 10;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] + 1 != arr[i + 1])
				return arr[i] + 1;
		}
		return 1;
	}

}
