package JavaInterviewQnA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Q7_01_RemoveDuplicatesFromIntegerArrayList {

//	7_01 Write a method that can remove duplicate values from an Integer ArrayList.
//	 	 EX : ArrayList<Integer>(List.of(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5) -> [1,2,3,4,5]

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
		
		removeDuplicates(list);
		
	}
	
	public static void removeDuplicates(ArrayList<Integer> list){
		//	using stream method with forEach it goes through each item and prints the distinct ones 
		System.out.print("first option: ");
		list.stream().distinct().forEach(System.out::print);
		System.out.println("\n");
		
		//	stream method with distinct and collect method creates a new list with distinct items
		System.out.print("second option : ");
		System.out.println(list.stream().distinct().collect(Collectors.toList()));

	}
}
