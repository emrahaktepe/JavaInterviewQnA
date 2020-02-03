package JavaInterviewQnA;

public class Q4_06_FrequencyOfWordInString {

//	4_06 Write a method that Return the number of times that the string "java" 
//		 appears anywhere in the given string word.

	public static void main(String[] args) {
		String words = "java python java sql java sql api cucumber js html java html";
		String keyword = "java";
		
		javaCount(words, keyword);
		
	}
	
	public static void javaCount(String word, String keyword) {
		int count = 0;
		for(int i = 0; i<word.length()-keyword.length()-1; i++) {
			if(word.substring(i, i+keyword.length()).equals(keyword)) {
				count++;
			}
		}
		System.out.println(keyword +" "+ count);
	}
}
