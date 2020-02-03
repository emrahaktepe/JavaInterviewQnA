package JavaInterviewQnA;

public class Q7_04 {

//	7_04 Write a method that prints out the numbers from 1 to 30, 
//		 but for numbers which are multiple of 3 prints FIN instead of number, 
//		 and for numbers multiple by 5 prints RA instead of number, and for 
//		 numbers multiple both by 3 and 5 prints FINRA

	public static void main(String[] args) {
		finra();
	}
	
	public static void finra() {
	
		for(int i = 1; i<= 30; i++) {
			if(i%3==0 && i%5==0) {
				System.out.print("FINRA ");
			}		
			else if(i%3==0) {
				System.out.print("FIN ");
			}
			else if(i%5==0) {
				System.out.print("RA ");
			}
			else {
				System.out.print(i +" ");
			}
		}
	}
}
