package JavaInterviewQnA;

public class Q9_03 {

//	9_03 Create a method where you find the sum of the divisors of the passing parameter

	public static void main(String[] args) {
		
		sumOfDivisers(50);
		
	}
	
	public static void sumOfDivisers(int num) {
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
