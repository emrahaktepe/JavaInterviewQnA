package JavaInterviewQnA;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2_07 {

//	2_07 Write a removeAll() method that takes two parameters: 
//		 an ArrayList of Strings called wordList, and a String called targetWord.
//		 So remove the targetWord from ArrayList.
//		 EX :ArrayList("hi","hey","hi","yo")); -> removeAll(wordList,"hi"); -> ["hey","yo"]

	public static void main(String[] args) {
		
		ArrayList<String> wordList = new ArrayList<>(Arrays.asList("hi", "hey", "hi", "yo"));
		String targetWord = "hi";
		
		System.out.println(removeAll(wordList, targetWord));
	}
	
	public static ArrayList<String> removeAll(ArrayList<String> list, String str){
		ArrayList<String> newList = new ArrayList<>();
		
		for(String setere : list) {
			if(setere != str) {
				newList.add(setere);
			}
		}
		return newList;
	}
	
}
