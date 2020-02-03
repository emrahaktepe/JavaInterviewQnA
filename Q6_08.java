package JavaInterviewQnA;

import java.util.ArrayList;
import java.util.Arrays;

public class Q6_08 {

//	6_08 Write a removeInst() method gets an Arraylist of Integers and a number(Integer)
//		 It removes any instance of the number it gets from the Arraylist.
//		 EX : removeInst([1,1,2,3,1,4],1) --> [2,3,4]

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,3,1,4));
		int num = 1;
		
		System.out.println(removeInst(list, num));
	}
	
	public static ArrayList<Integer> removeInst(ArrayList<Integer> list, int num){
		
		ArrayList<Integer> listNew = new ArrayList<>();
		
		for(int each : list) {
			if(each == num) {
				continue;
			}
			listNew.add(each);
		}
		return listNew;	
	}
}
