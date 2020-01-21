package JavaInterviewQnA;

import java.util.Scanner;

public class Q9_04 {

//	9_04 Ask user for a  number, print the cube of the number, 
//		 do this repeatedly until user enters a negative number

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		do{
			System.out.println("Please enter a number");
			num = scan.nextInt();
			System.out.println(Math.pow(num, 3));
		} while (num > 0 );
	}
}
