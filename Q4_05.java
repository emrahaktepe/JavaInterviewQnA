package JavaInterviewQnA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q4_05 {

//	4_05 Given two strings, word and a separator sep, return a big string 
//		 made of count occurrences of the word, separated by the separator string. 
//	 	 All the variables in the questions will be passed into the method. 
//		 -word, separator, count-

	public static void main(String[] args) {
		String word = "java python java sql java sql api cucumber js html java html";
		String sep = "-";
		
		wordCount(word, sep);
		
	}
	
	public static void wordCount(String word, String sep) {
		
		String[] words = word.split(" ");
		System.out.println(Arrays.toString(words));
		
		Set<String> wordSet = new HashSet<>();
		for(String str : words) {
			wordSet.add(str);
		}
		System.out.println(wordSet);
		
		for(String strList : wordSet) {
			int count = 0;
			for(String strArr : words) {
				if(strList.equals(strArr)) {
				count ++;
				}
			}
			System.out.print(strList + sep + count + " ");
		}
	}
	
}
