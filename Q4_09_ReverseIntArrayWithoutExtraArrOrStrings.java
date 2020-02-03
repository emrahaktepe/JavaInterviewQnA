package JavaInterviewQnA;

import java.util.Arrays;

public class Q4_09_ReverseIntArrayWithoutExtraArrOrStrings {

//	4_09 Given an array nums with 7 integers already assigned, write a code to reverse it.
//		 Do not use any additional arrays or Strings.
//		 EX: num -> [4,3,2,44,1,100,55] -> num -> [55,100,1,44,2,3,4]

	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 44, 33, 1, 100, 55};
		
		int temp;
		for(int i = 0; i<arr.length/2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
