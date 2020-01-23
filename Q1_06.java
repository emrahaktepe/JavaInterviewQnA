package JavaInterviewQnA;

public class Q1_06 {
	
//	1_06 A palindrome is a word, number, phrase, or other sequence of characters 
//		 which reads the same backward as forward, such as madam or racecar or
//		 the number 10801. Write a program that will verify if word is palindrome

	public static void main(String[] args) {		
		String str = "madam";		
		boolean result = isPalindrome(str);			
		System.out.println(result);
	}

	public static boolean isPalindrome (String str) {	
		String reverseStr = "";		
		for (int i = str.length()-1; i >= 0; i--) {
			reverseStr += str.charAt(i);
		}
		if(!str.toLowerCase().equals(reverseStr.toLowerCase())) {
		return false;
		}
		return true;
	}
}
