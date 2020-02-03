package JavaInterviewQnA;

import java.util.HashMap;
import java.util.Map;

public class Q7_07 {

//	7_07 Create a method that can find the frequencies of the String
//		 EX: frequencies("AAABBCCCCDDD") ==>  A3B2C4D3			

	public static void main(String[] args) {
		String str = "AAABBCCCCDDD";
		printFreqs(str);
	}
	
	public static void printFreqs(String str) {
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < str.length(); i++) {
			if(!map.containsKey((str.substring(i, i+1)))){
				map.put(str.substring(i, i+1), 1);
			}
			else {
				map.put(str.substring(i, i+1), map.get(str.substring(i, i+1))+1);
			}
		}
		System.out.println(map);
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.print(entry + " ");
			}
		System.out.println();
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			
			System.out.print(entry.getKey() + entry.getValue() + " ");
		}
	}
}
