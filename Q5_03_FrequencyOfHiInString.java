package JavaInterviewQnA;

public class Q5_03_FrequencyOfHiInString {

//	5_03 Print out the number of times that the string "hi" 
//		 appears anywhere in the given string.

	public static void main(String[] args) {
		
		String hi = "hide behind hike shine whine hi";
		int count = 0;
		
		for(int i = 0; i < hi.length()-1; i++){
			if(hi.substring(i, i+2).equalsIgnoreCase("hi")) {
				count++;
			}
		}
		System.out.println(count);
	}
}
