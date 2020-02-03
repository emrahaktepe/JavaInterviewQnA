package JavaInterviewQnA;

public class Q5_10_PrintShortestWordInString {

//	5_10 Write a program that will print the shortest word in a String array  

	public static void main(String[] args) {
		String[] arr = {"one", "twotwo", "threethreethree", "s"};
		
		printShortestWord(arr);
	}
	
	public static void printShortestWord(String[] arr) {
		int min = 999;
		String strShort = "";
		for(String str : arr) {
			if(str.length() < min) {
				min = str.length();
				strShort = str;
			}
		}
		System.out.println(strShort);
	}
}
