package JavaInterviewQnA;

import java.util.ArrayList;
import java.util.Arrays;

public class Q6_06_MakeNewArrayListOfPositivesAndAddTotal {

//	6_06 appendPosSum() returns an ArrayList<Integer> and a parameter as an 
//		 ArrayList<Integer>. This method should Create a new ArrayList of Integers.
//		 Add only the positive Integers to the new 	ArrayList. Sum the positive 
//		 Integers in the new ArrayList and add the Sum as the last element.
//		 EX: if the incoming ArrayList contains the Integers (4, -6, 3, -8, 0, 4, 3), 
//		 the ArrayList 	that gets returned should be (4,3,4,3,14), with 14 being 
//		 the sum of (4,3,4,3). The original ArrayList should remain unchanged.

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, -6, 3, -8, 0, 4, 3));
		System.out.println(list);
		
		System.out.println(appendPosSum(list));
		
	}
	
	public static ArrayList<Integer> appendPosSum (ArrayList<Integer> list){
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		int sum = 0;
		for(int each : list) {
			if(each > 0 ) {
				newList.add(each);
				sum += each;
			}
		}
		newList.add(sum);
		
		return newList;
	}
}
