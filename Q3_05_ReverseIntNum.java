package JavaInterviewQnA;

public class Q3_05_ReverseIntNum {

//	3_05 Write a method to reverse an int number

	public static void main(String[] args) {		
		int num = 2345678;		
		System.out.println(reverseNum(num));		
	}
	
	public static int reverseNum(int num) {
		String newNum = "";
		int numX = 0;
		while(num>0) {
			newNum += num % 10;
			num /= 10;
		}
		numX = Integer.parseInt(newNum);		
		return numX;
	}
}
