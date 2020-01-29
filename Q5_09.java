package JavaInterviewQnA;

public class Q5_09 {

//	5_09 Using for loops (you may need more than one), write a code that will 
//		 create a triangle of asterisks of size n to be output to the screen.
//		 EX:
//		 input: 3
//		 output: *
//		 output: **
//		 output: ***

	public static void main(String[] args) {

		int n = 7;
		triangleMaker(n);
	}

	public static void triangleMaker(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		for (int i = n; i > 0; i--) {
//			for (int j = i; j > 0; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
}
