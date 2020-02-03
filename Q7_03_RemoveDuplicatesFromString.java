package JavaInterviewQnA;

public class Q7_03_RemoveDuplicatesFromString {

//	7_03 Write a method that removes all duplicates from String. 
//		 EX : ayata --> ayt

	public static void main(String[] args) {
		
		String str = "oneonone";
		removeDuplicates(str);
	}
	
	public static void removeDuplicates(String str) {
		String newStr = "";
		for(int i = 0; i<str.length(); i++) {
			if(!newStr.contains(""+str.charAt(i))) {
				newStr += str.charAt(i);
			}
		}
		System.out.println(newStr);
	}
}
