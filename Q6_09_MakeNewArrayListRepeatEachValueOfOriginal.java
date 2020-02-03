package JavaInterviewQnA;

import java.util.ArrayList;
import java.util.Arrays;


public class Q6_09_MakeNewArrayListRepeatEachValueOfOriginal {

//	6_09 Write a method is called twoTimes(). This method should create a new ArrayList 
//		 of Integers that contains every value of the ArrayList parameter repeated twice.
//		 EX: ArrayList<Integer> (List.of(1,5,3,7)) ---> (1,1,5,5,3,3,7,7)

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 3, 7));
		System.out.println(list);
		
		System.out.println(twoTimes(list));
	}
	
	public static ArrayList<Integer> twoTimes(ArrayList<Integer> list) {
		
		ArrayList<Integer> listNew = new ArrayList<>();
		for(int each : list) {
			listNew.add(each);
			listNew.add(each);
		}
		return listNew;
	}
}
