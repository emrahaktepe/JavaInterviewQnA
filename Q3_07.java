package JavaInterviewQnA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q3_07 {

//	3_07 Write a method to remove duplicate numbers from an array.

	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 2, 4, 3, 5, 7, 4, 1, 8, 5, 6};
		System.out.println(Arrays.toString(removeDupsFromArray(arr)));
		
		System.out.println(Arrays.toString(removeDupsFromArrayLongWay(arr)));
	}
	
	public static int[] removeDupsFromArray(int[] arr) {
		return Arrays.stream(arr).distinct().toArray();
	}
 
	
	public static int[] removeDupsFromArrayLongWay(int[] arr) {
		Set<Integer> uniqs = new HashSet<>();
		for(int num : arr) {
			uniqs.add(num);
		}
		int[] arrNew = new int[uniqs.size()];
		int indexer = 0;
		for(int num : uniqs) {
			arrNew[indexer] = num;
			indexer++;
		}
		return arrNew;
	}
	
}
