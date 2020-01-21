package JavaInterviewQnA;

public class Q1_10 {

//	1_10. Write a method which finds remainder of 2 numbers without using the % operator?

	public static void main(String[] args) {

		System.out.println(findRemainder1(11, 5));

		System.out.println(findRemainder1(13, 7));

	}
	
	//	First solution method
	public static int findRemainder1(int dividend, int divisor) {

		int remainder = 0;
		remainder = (dividend - divisor * (dividend / divisor));
		return remainder;
	}

	//	Second solution method
	public static int findRemainder2(int dividend, int divisor) {

		while (dividend >= divisor) {
			dividend -= divisor;
		}
		return dividend;
	}

}
