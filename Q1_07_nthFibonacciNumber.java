package JavaInterviewQnA;

import java.util.ArrayList;
import java.util.List;

public class Q1_07_nthFibonacciNumber {

//	 1_07 In fibonacci series, next number is the sum of previous two numbers 
//	 	  for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……... 
//		  The first two numbers of fibonacci series are 0 and 1. 	
//		  Given a number num, print n-th Fibonacci Number.

	public static void main(String[] args) {
		int num =8;
		
		nthFibonacci(num);
	}
	public static void nthFibonacci(int num) {
		
		List<Integer> fibonacci = new ArrayList<>();
		fibonacci.set(0, 0);
		fibonacci.set(1, 1);
		for(int i = 2; i < num; i++) {
			fibonacci.set(i, (fibonacci.get(i-1) + fibonacci.get(i-2)));
		}
		System.out.println(fibonacci.get(num));
	}
}
