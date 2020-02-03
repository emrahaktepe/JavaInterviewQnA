package JavaInterviewQnA;

import java.util.Scanner;

public class Q6_04 {

//	6_04 Write a method where u return the total until user enters a negative.

	public static void main(String[] args) {

		cannotSumNegatives();

	}

	public static void cannotSumNegatives() {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		int sum = 0;
		try {
			while (n >= 0) {
				System.out.println("Enter a positive a number");
				n = scan.nextInt();
				if (n < 0)
					break;
				sum += n;
				System.out.println("Sum is " + sum);
			}
		} finally {
			scan.close();
		}
	}
}
