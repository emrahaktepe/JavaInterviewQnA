package JavaInterviewQnA;

public class Q5_04 {

//	5_04 Write a program that will print out letters in the alphabetic order 
//		 from A to Z and do it for 5 times

	public static void main(String[] args) {
		
		printAlpahbetXfive();
	}
	
	public static void printAlpahbetXfive() {
		for(int i = 1; i <= 5; i++) {
			for(char j = 65; j <= 65+25; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
