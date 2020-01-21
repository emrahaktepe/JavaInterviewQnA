package JavaInterviewQnA;

public class Q1_09 {

//	1_09 Create a method to check if the passing argument is a prime number

	
	public static void main(String[] args) {
		System.out.println(isPrime(3761));
	}

	public static boolean isPrime(int num) {

//		if(num <= 1)
//			return false;
//		if(num == 2)
//			return true;
//		
//		for(int i = 2; i < num; i++) {
//		
//			if(num%i == 0)
//				return false;			
//		}
//		return true;

		if (num <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {

			if (num % i == 0)
				return false;
		}

		return true;

	}

}
