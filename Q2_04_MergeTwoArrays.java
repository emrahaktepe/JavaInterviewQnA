package JavaInterviewQnA;

import java.util.Arrays;

public class Q2_04_MergeTwoArrays {

//	2_04 mergR merges two arrays into one. it gets two int arrays and 
//		 returns a combined array
//		 EX: mergR([1,2,3],[4,5,6]) --> returns [1,2,3,4,5,6]

	public static void main(String[] args) {
		int[] arr1 = {2, 4, 6, 8};
		int[] arr2 = {10, 12, 14, 16};
		
		System.out.println(Arrays.toString(mergR(arr1, arr2)));
	}
	
	public static int[] mergR (int[] arr1, int[] arr2) {
		
		int[] arrNew = new int[arr1.length+arr2.length];
		
		for(int i = 0; i < arr1.length; i++ ) {
			arrNew[i] = arr1[i];
		}
		for(int i = 0; i < arr2.length; i++ ) {
			arrNew[i+arr1.length] = arr2[i];
		}
		return arrNew;
	}
	
}
