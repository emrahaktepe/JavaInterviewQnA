package JavaInterviewQnA;

import java.util.HashSet;
import java.util.Set;

public class Q2_03 {

//	2_03 uniqueChars is a method that you will code, should be able to accept 
//		 any string and return unique characters from the parameter.
//		 Examples:uniqueChars("java") ==> "jav"
	
	public static void main(String[] args) {
		
		String str = "this is a question to use Set interface";
		
		uniqueChars(str);
	}
	
	public static void uniqueChars(String str) {
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.toLowerCase().charAt(i));
		}		
		System.out.println(set.toString().replaceAll(" |,|\\[|\\]", ""));
	}
}
