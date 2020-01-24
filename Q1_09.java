package JavaInterviewQnA;

public class Q1_09 {

//	1_09 Create a method to check if the passing argument is a prime number

	
	public static void main(String[] args) {
		System.out.println(isPrime(3761));
	}

	public static boolean isPrime(int num) {
		
		for(int i = 2; i <= num/2; i++) {
			if( num %i == 0 ) {
				return false;
			}
		}
		return true;
	}
}
