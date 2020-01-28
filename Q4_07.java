package JavaInterviewQnA;

import java.util.Arrays;

public class Q4_07 {

//	4_07 Given an int array of nums with 7 integers every element is repeated twice - 
//		 except one. Find that element and print it to console.

	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 8, 4, 2, 8};
		Arrays.sort(arr);
		String str = Arrays.toString(arr).replace("[", "").replace("]", "");
		for(int i = 0; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}
		}
	}
	
	
}
