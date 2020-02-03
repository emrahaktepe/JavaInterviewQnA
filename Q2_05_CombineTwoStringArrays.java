package JavaInterviewQnA;

import java.util.ArrayList;
import java.util.List;

public class Q2_05_CombineTwoStringArrays {

//	2_05 Combine two String arrays into one arraylist and return it as a string.
//		 EX: combineRs(["f","o","o"],[" b","a","r"]) --->  "foo bar"

	public static void main(String[] args) {

		String[] arr1 = {"A", "B", "C", "D"};
		String[] arr2 = {"E", "F", "G"};

		System.out.println(combineR(arr1, arr2));
	}
	
	public static String combineR(String[] arr1, String[] arr2) {
		String str = "";
		
		List<String> list = new ArrayList<>();
		
		for(int i = 0; i < arr1.length; i++) {
			list.add(arr1[i]);
		}
		list.add(" ");
		
		for(int i = 0; i < arr2.length; i++) {
			list.add(arr2[i]);
		}
		
		str = list.toString().replaceAll(", |\\[|\\]", "");
		
		return str;
	}

}
