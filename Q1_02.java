package JavaInterviewQnA;

import java.util.Arrays;

public class Q1_02 {

//	1_02 Write a method to check if the two given Strings are Anagram

	public static void main(String[] args) {
		String one = "car race";
		String two = "racecar";
		
		System.out.println(isAnagram(one, two));
		
		System.out.println(isAnagramAlternative(one, two));
	}
	
	public static boolean isAnagram(String one, String two) {
		
		one = one.toLowerCase().replace(" ", "");
		two = two.toLowerCase().replace(" ", "");
		
		char[] ch1 = one.toCharArray();
		char[] ch2 = two.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		one = new String(ch1);
		two = new String(ch2);
		
		System.out.println(one);
		System.out.println(two);
		
		return (one.equals(two));

	}
	//	this method doesn't work if there are spaces
	public static boolean isAnagramAlternative(String one, String two) {

	char[] ch1 = one.toCharArray();
	Arrays.sort(ch1);
		
	char[] ch2 = two.toCharArray();
	Arrays.sort(ch2);
	
	return Arrays.equals(ch1,ch2);
	}	
}
