package JavaInterviewQnA;

public class Q4_08 {

//	4_08 Given the array of words, it will print the word with the largest length. 
//		 Assume that there are no 2 words with longest length
//		 EX: words -> String[] arr = {"aaa","bbbbb","whasstupppp","longg","jaaaaavvaaaaaa"};

	public static void main(String[] args) {
		String[] arr = {"aaa","bbbbb","whasstupppp","longg","jaaaaavvaaaaaa"};
		printLongestWordInArray(arr);
	}
	
	public static void printLongestWordInArray(String[] arr) {
		String longest = "";
		for(String str : arr) {
			if(str.length() > longest.length()) {
				longest = str;
			}
		}
		System.out.println(longest);
	}
}
