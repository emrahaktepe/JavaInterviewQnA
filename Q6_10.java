package JavaInterviewQnA;

import java.util.ArrayList;

public class Q6_10 {

//	6_10 Given two positive integers m and n, find their greatest common divisor,
//		 that is, the largest positive integer that evenly divides both m and n.
//		 EX : if m = 15 and n = 25, then result greatest common divisor is = 5.

	public static void main(String[] args) {
		int m = 15;
		int n = 18;
		
		System.out.println(commonDiviser(m, n));
		
		for (int i = n; i > 0; i--) {
			if(n%i == 0 && m%i == 0) {
				System.out.println("Common divisor for " + m + " and " + n + " is " + i);
				break;
			}
		}	
	}
	
	
	public static int commonDiviser(int m, int n) {
		int commonDivisor = 0;
		
		ArrayList<Integer> listM = new ArrayList<>();
		ArrayList<Integer> listN = new ArrayList<>();

		
		for (int i = 1; i <= m; i++) {
			if(m%i == 0) {
				listM.add(i);
			}
		}
		
		for (int i = 1; i <= n; i++) {
			if(n%i == 0) {
				listN.add(i);
			}
		}
		
		System.out.println("" + listM +" " + listN );
		
		int ref = 0;
		
		for (int i = listN.size()-1; i > 0 ; i--) {
			if(listM.contains(listN.get(i))) {
				ref = listN.get(i);
				if(ref > commonDivisor) {
					commonDivisor = ref;
				}
			}
		}
		
		return commonDivisor;
	}
}
