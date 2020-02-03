package JavaInterviewQnA;

import java.util.Arrays;

public class Q2_10_ReverseAnArray {

//	2_10 Reverse an array with two different ways 

	public static void main(String[] args) {

		String[] str = { "Easy", "Peezy", "Lemon", "Squeezy" };

		reverseArray(str);
	}

	public static void reverseArray(String[] str) {
		
		String[] strNew = new String[str.length];

		for (int i = str.length - 1; i >= 0; i--) {
			strNew[str.length - 1 - i] = str[i];
		}
		System.out.println(Arrays.toString(strNew));
	}
	
	
	
}
