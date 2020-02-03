package JavaInterviewQnA;

public class Q7_02_Divide2NumsWithoutDivisonOperator {

//	7_02 Create a method that can divide two positive numbers without using
//		 division operators and Math class. 

	public static void main(String[] args) {
		
		int x = 28;
		int y = 5;
		
		divideWithoutOperator(x, y);
	}
	
	public static void divideWithoutOperator(int x, int y) {
		int result = 0;	
		while (x > y-1) {
			x -= y;
			result++;
		}
		System.out.println(result);
	}
}
