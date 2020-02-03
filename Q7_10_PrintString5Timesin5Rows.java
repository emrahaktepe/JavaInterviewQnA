package JavaInterviewQnA;

public class Q7_10_PrintString5Timesin5Rows {

//	7_10 Print a String 5 times in one row. print total of 5 rows of same message.

	public static void main(String[] args) {
		String str = "deneme ";
		int n = 5;

		printNTimes(str, n);
	}

	public static void printNTimes(String str, int n) {
		for (int j = 1; j <= n; j++) {
			for (int i = 1; i <= n; i++) {
				System.out.print(str);
			}
			System.out.println();
		}
	}
}
