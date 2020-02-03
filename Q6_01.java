package JavaInterviewQnA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q6_01 {

//	6_01 Complete a void method printOnce() that will print all integers only 
//		 once without repeating them from an array of ints.
//		 EX : [1,1,2,3,4,5,4,5] ---> 1,2,3,4,5

	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 1, 4, 2, 5, 3, 6, 4, 8, 5, 9, 6, 3, 7};
		
		printOnce(arr);
		
		Arrays.sort(arr);
		
		printOnce(arr);
		
	Arrays.stream(arr).distinct().forEach(s->System.out.print(s+" "));

	}
	
	public static void printOnce(int[] arr) {
		
		Set<Integer> set = new HashSet<>();
		for(int num : arr) {
			set.add(num);
		}
		System.out.println(set);
	}
	
}
