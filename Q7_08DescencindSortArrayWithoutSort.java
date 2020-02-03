package JavaInterviewQnA;

import java.util.Arrays;

public class Q7_08DescencindSortArrayWithoutSort {

//	7_08 Create a method that can sort an array in descending order without the sort method

	public static void main(String[] args) {

		int[] arr = { 4, 15, 18, 25, 32, 11, 56, 9, 84, 6, 13 };
		System.out.println(Arrays.toString(sortDescending(arr)));

	}

	public static int[] sortDescending(int[] arr) {

		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1; i++) {
				int temp = 0;
				if (arr[i] < arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		return arr;
	}
}
