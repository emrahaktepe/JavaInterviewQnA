package JavaInterviewQnA;

public class Q4_01 {

//	4_01 Write a method that will swap first and last characters in the string.
//		 Print out result into the console. The method will accept a String argument

	public static void main(String[] args) {
		
		String text = "deneme";
		
		swapFirstAndLast(text);
		
	}
	
	public static void swapFirstAndLast(String str) {
		
		char first= str.charAt(0);
		char last = str.charAt(str.length()-1);
		
		str = "" + last + str.substring(1, str.length()-1) + first;
		
		System.out.println(str);
	}
}
