package JavaInterviewQnA;

import java.util.HashSet;
import java.util.Set;

public class Q2_02 {

//	2_02 Complete a void method printUniqueNumbers() that will print 
//		 all unique integers(non repeated ones) from an array of ints. 
//		 Every single unique int should be printed from the new line. 

	public static void main(String[] args) {
		int[] arr = {2, 5, 4, 5, 2, 3, 6, 3, 7, 3, 4, 2, 5, 7, 8, 5};
		printUniqueNumbers(arr);
	}
	
	public static void printUniqueNumbers(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		for ( int num : arr) {
			set.add(num);
		}
		for(Integer num : set) {
		System.out.println(num);
		}
	}
}
