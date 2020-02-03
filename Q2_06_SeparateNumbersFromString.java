package JavaInterviewQnA;

public class Q2_06_SeparateNumbersFromString {

//	2_06 Write a method that gets any number from a string and returns the number string.
//		 EX :extractNum("aa2aa3") ==> 23

	public static void main(String[] args) {
		
		String str = "a-b2nd4hdj6fk9";

		System.out.println(numExtracter(str));
	}
	
	public static String numExtracter(String str) {
		
		str = str.replaceAll("[^0-9]", "");
		return str;
		
	}

}
