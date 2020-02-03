package JavaInterviewQnA;

import java.util.HashMap;
import java.util.Map;

public class Q1_05_FrequencyOfEachCharInString {

//	1_05 Write a method which returns how many times each letter is repeated?

	public static void main(String[] args) {
		
		System.out.println(countLetters("methodayasfdsalkjfasfjlk;asjfla;sjfl;ajfta"));
				
	}

	public static String countLetters(String str) {

		Map<Character, Integer> freq = new HashMap<>();

		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!freq.containsKey(ch)) {
				freq.put(ch, 1);
			} else {
				freq.put(ch, freq.get(ch) + 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
			result += "" + entry.getKey() + entry.getValue() + " ";
		}
		return result;
	}
}
