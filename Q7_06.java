package JavaInterviewQnA;

public class Q7_06 {

//	7_06 Create a method that can find the unique characters from the String 
//		 EX : unique("AAABBBCCCDEF") ==> "DEF";

	public static void main(String[] args) {

		String str = "AAABBBCCCDEF";
		findUniques(str);
		
	}
	
	public static void findUniques(String str) {
		String newStr = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.indexOf(str.substring(i, i+1)) == str.lastIndexOf(str.substring(i, i+1))) {
				newStr += str.substring(i, i+1);
			}
		}
		System.out.println(newStr);
	}
}
