package JavaInterviewQnA;

public class Q5_07_SumOfNumsInString {

//	5-07 Given a String str, print out the sum of the digits 0-9 that 
//		 appear in the string, ignoring all other characters. 


	public static void main(String[] args) {
		
		String str = "1aB3J5D9I7g4q2";
		
		str = str.replaceAll("[^0-9]", "");
		
		int num = Integer.parseInt(str);
		int sum = 0;
		
		System.out.println(num);
		
		while( num > 0) {
			sum += num%10;
			num = num/10;
		}
		
		System.out.println(sum);
	} 
	
}
