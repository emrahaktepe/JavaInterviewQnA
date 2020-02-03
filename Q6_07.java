package JavaInterviewQnA;

import java.util.Arrays;

public class Q6_07 {

//	6_07 addElements() accepts 2 int arrays and adds each element value of
//		 two arrays and returns a new array. You can assume that each array has 5 elements.
//		 EX : addElements(new int[][10,40,50,3], new int[][11,0,500,44]); --> [21,40,550,47]

	public static void main(String[] args) {
		int[] arr1 = { 5, 7, 9, 11, 13 };
		int[] arr2 = { 10, 9, 8, 7, 6 };
		
		System.out.println("Array 1 is = " + Arrays.toString(arr1) + "\n");
		System.out.println("Array 2 is = " + Arrays.toString(arr2) + "\n");
		System.out.println("Array 3 is = " + Arrays.toString(addElements(arr1, arr2)));
	}

	public static int[] addElements(int[] arr1, int[] arr2) {

		int[] arrNew = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arrNew[i] = arr1[i] + arr2[i]; 
		}

		return arrNew;
	}
}
