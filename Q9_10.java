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
		
		
	}
	
	public static void reverseString(ArrayList<String> list) {
		
		for (int i = list.size()-1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
			
		}

	}
}
