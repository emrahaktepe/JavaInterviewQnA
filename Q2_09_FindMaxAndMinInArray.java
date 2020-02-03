package JavaInterviewQnA;

import java.util.Arrays;
import java.util.Random;

public class Q2_09_FindMaxAndMinInArray {

//	2_09 Store 10 random numbers into an Array then find the max and min

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		Random random = new Random();
		for(int i = 0; i < 10; i++) {
			arr[i] = random.nextInt(100);
		}
		
		minNmax(arr);
	}
	
	public static void minNmax(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Min: " + arr[0] + " Max: " + arr[arr.length-1]);
	}
}
