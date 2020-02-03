package JavaInterviewQnA;

public class Q9_06_Print1stAndLastCharsOfStringsInArray {

//	9_06 Given a String array words, iterate through each word and print 
//		 first and last letter of each element in separate lines.

	public static void main(String[] args) {
		
		String[] arr = {"one", "two",  "three",  "four",  "five",  "six"};

		firstAndLastLetters(arr);
		
	}
	
	public static void firstAndLastLetters(String[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("" + arr[i].charAt(0) + arr[i].charAt(arr[i].length()-1));
		}	
	}
}
