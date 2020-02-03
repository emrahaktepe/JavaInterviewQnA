package JavaInterviewQnA;

public class Q4_04_Factorial {
	
//	4_04 In mathematics, the factorial of a positive integer n, denoted by n!, 
//		 is the product of all positive integers less than or equal to n.  
//		 Write a method that Calculate factorial and output result to the console. 

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	
	public static int factorial(int num) {
		int result = 1;
		for(int i=1; i<=num; i++) {
			result *= i;
		}
		return result;
	}
}
