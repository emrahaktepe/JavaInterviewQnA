package JavaInterviewQnA;

import java.util.Scanner;

public class Q6_03_YesNoRepeatUntilYes {

//	6_03 Write a method where ask a yes or no question and keep asking until you get a yes 

	public static void main(String[] args) {

		sayYes();

	}

	public static void sayYes() {
		
		Scanner scan = new Scanner(System.in);
		String answer = "";
		
		try {
		while (!answer.equalsIgnoreCase("yes")) {
			System.out.println("Would you like another cup of tea?");
			answer = scan.nextLine();
		}
		System.out.println("That's what I wanted to hear!");
		}	finally {
			scan.close();
		}
	}

}
