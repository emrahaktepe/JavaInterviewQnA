package JavaInterviewQnA;

public class Q1_01 {

//	1_01 Swap two variables' values without using temp variable

	public static void main(String[] args) {
		
		int a = 17;
		int b = 33;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a= " + a + " b= " + b);
		
		
	}
}
