package JavaInterviewQnA;

import java.util.ArrayList;
import java.util.Arrays;


public class Q9_10 {

//	9_10 Create a string ArrayList with days of the week then print the days 
//		 of the week backwards
	
	public static void main(String[] args) {

		ArrayList<String> daysOfWeek = new ArrayList<>(Arrays.asList
				("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
		
		reverseString(daysOfWeek);
		System.out.println(" ");
		System.out.println(reverseString(daysOfWeek.get(1)));
		System.out.println(reverseList(daysOfWeek));
	}
	
	public static void reverseString(ArrayList<String> list) {
		
		for (int i = list.size()-1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");			
		}
	}
	
	public static String reverseString(String str){
			String newStr = "";	
		for(int i = str.length()-1; i >= 0; i--) {		
			newStr += str.charAt(i);		
		}	
		return newStr;
	}
	
	public static ArrayList<String> reverseList(ArrayList<String> list){
		
		ArrayList<String> reverseList = new ArrayList<>();
		
		for (String each : list) {
			each = reverseString(each);
			reverseList.add(each);
		}
		return reverseList;
	}
}
