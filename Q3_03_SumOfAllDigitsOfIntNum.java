package JavaInterviewQnA;

public class Q3_03_SumOfAllDigitsOfIntNum {

//	3_03 Write a method that returns the sum of all the digits of given number.

	public static void main(String[] args) {
		
		int num = 433759;
		
		System.out.println(sumOfDigits(num));
		
	}
	
	public static int sumOfDigits(int num) {
		
		int sum = 0; 
		while (num > 0) {
			sum += num%10;
			num /= 10;
		}
		return sum;
	}
}
