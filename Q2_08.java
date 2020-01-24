package JavaInterviewQnA;

import java.util.Arrays;

public class Q2_08 {

// 2_08 Populate method accepts an empty int array and populates it with numbers counting up.
//		EX : populate(new int[3])  ---> returns:[1,2,3]

	public static void main(String[] args) {
		System.out.println(Arrays.toString(populate(5)));
	}
	
	public static int[] populate(int n) {
		
		int[] nums = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = i+1;
		}
		return nums;
	}
}
