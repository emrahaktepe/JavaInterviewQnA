package JavaInterviewQnA;

public class Q5_01 {

//	5_01 Print true if the string "cat" and "dog" appear the same number of times in 
//		 the given string word. 

	public static void main(String[] args) {
		
		String catDogSameNum = "dog cat squirrel dog cat bunny dog cat";
		String catDogNotSameNum = "cat bunnydogcatbunnydog cat crocodile dog cat";

		System.out.println(catDogCount(catDogSameNum));
		
		System.out.println(catDogCount(catDogNotSameNum));

	}
	
	public static boolean catDogCount(String str) {
		
		int catCount = 0;
		int dogCount = 0;
		
		for(int i=0; i<str.length()-2; i++) {
			if(str.substring(i, i+3).equals("cat")) {
				catCount++;
			}
			if(str.substring(i, i+3).equals("dog")) {
				dogCount++;
			}
		}
		return (catCount == dogCount);	
	}
	
}
