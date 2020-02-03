package JavaInterviewQnA;

public class Q3_04isArmstrongNumber {

//	3_04 Write a method that verifies the number whether is arm-strong number or not?
//		 (It is a number that is equal to the sum of cubes of its digits) 

	public static void main(String[] args) {
		
		int num = 154;
		
		System.out.println(isArmstrong(num));
		
	}
	
	public static boolean isArmstrong (int num) {
		int sum = 0;
		int ref = num;
		while(num >0) {
			sum += Math.pow(num%10, 3);
			num /= 10;
		}
		if(sum == ref)
		return true;
		return false;
	}
}
