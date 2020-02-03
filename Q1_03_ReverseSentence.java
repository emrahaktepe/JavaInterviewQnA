package JavaInterviewQnA;

public class Q1_03_ReverseSentence {

//	1_03 Write a method where you reverse a sentence

	public static void main(String[] args) {

		String sentence = "This is a sentence to be reversed";
		
		sentenceReverser(sentence);
	}

	public static void sentenceReverser(String str) {
		
		String reversedStr = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			reversedStr += str.charAt(i);
		}
		System.out.println(reversedStr);
	}
}
