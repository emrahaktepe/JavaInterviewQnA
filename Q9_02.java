package JavaInterviewQnA;

public class Q9_02 {

//	9_02 Create a method where you find the sum of the numbers up to num

	public static void main(String[] args) {
		sumOfAllTilllNum(15);
	}
	
	public static void sumOfAllTilllNum(int num) {
		
		int sumNum = 0;		
		for(int i = 1; i <= num; i++) {
			sumNum += i;
		}
		System.out.println(sumNum);	
	}
}
