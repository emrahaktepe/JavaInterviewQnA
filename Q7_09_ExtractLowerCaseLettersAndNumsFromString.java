package JavaInterviewQnA;

public class Q7_09_ExtractLowerCaseLettersAndNumsFromString {

//	7_09 Write a method that extracts the lowercase letters and numbers 
//		 then prints them separately from given String 
//		 EX:a1b2c3 --> abc and ---> 123

	public static void main(String[] args) {
		String str = "Ahd4K4ySb1Q9kdRy4n3u";
		separator(str);
	}
	
	public static void separator(String str) {
		
		String lowerCase = "";
		String nums = "";
		
		for( int i = 0; i < str.length(); i++) {
			if(str.charAt(i) > 96 && str.charAt(i) < 123) {
				lowerCase += str.charAt(i);
			}
			if(str.charAt(i) > 47 && str.charAt(i) < 58) {
				nums += str.charAt(i);
			}
		}
		System.out.println(lowerCase);
		System.out.println(nums);
	}
}
