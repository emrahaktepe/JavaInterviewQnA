package JavaInterviewQnA;

public class Q3_01_Find2ndMaxInArray {

// 3_01 Find the second max in an Array that consists of 10 random numbers without sort method 

	public static void main(String[] args) {

		int[] arr = { 2, 11, 4, 45, 6, 24, 8, 1, 10, 3, };

		System.out.println("Max number of this array is: " + maxNum(arr));
		
		System.out.println("Second max number of this array is: " + secondMaxNum(arr));
	}

	public static int maxNum(int[] arr) {

		int ref = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > ref) {
				ref = num;
			}
		}
		return ref;
	}

	public static int secondMaxNum(int[] arr) {

		int ref = 0;

		for (int num : arr) {
			if (num == maxNum(arr))
					continue;
			if (num > ref) {
				ref = num;
			}
		}
		return ref;
	}

}
