package JavaInterviewQnA;

import java.util.Scanner;

public class Q6_02 {

//	6_02 Write a method to enter numbers until the total is 40

	public static void main(String[] args) {
		
		stopAtForty();
		
	}
	
	public static void  stopAtForty() {
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		try {
		while(sum <= 40) {
		
			System.out.println("Enter numbers to sum up to 40");
		
			int num = scan.nextInt();
		
			sum += num;
		if(sum>40) {
			sum-=num;
		}
		
		if(sum == 40) {
			System.out.println("The total is 40");
			break;
		}
		
		}
		} finally {
			scan.close();
		}
	}
}
