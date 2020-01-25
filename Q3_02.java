package JavaInterviewQnA;

public class Q3_02 {

// 3_02 Find the second min in an Array that consists of 10 random numbers without sort method 

	public static void main(String[] args) {
		
		int[] arr = { 2, 11, 4, 45, 6, 24, 8, 1, 10, 3, };

		System.out.println("Min number of this array is: " + minNum(arr));
		
		System.out.println("Second min number of this array is: " + secondMinNum(arr));
	}

	public static int minNum(int[] arr) {

		int ref = Integer.MAX_VALUE;

		for (int num : arr) {
			if (num < ref) {
				ref = num;
			}
		}
		return ref;
	}

	public static int secondMinNum(int[] arr) {

		int ref = Integer.MAX_VALUE;

		for (int num : arr) {
			if (num == minNum(arr))
					continue;
			if (num < ref) {
				ref = num;
			}
		}
		return ref;
	}
}
