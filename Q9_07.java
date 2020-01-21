package JavaInterviewQnA;

public class Q9_07 {

//	9_07 Given the array words, it will print the word with the largest length.
//		 Assume that there are no 2 words with longest length

	public static void main(String[] args) {
		
		String[] arr = {"one", "two",  "three",  "four",  "five",  "six"};
		
		String longestWord = "";
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].length() > longestWord.length()) {
				longestWord = arr[i];
			}
		}
		System.out.println(longestWord);
	}
}
